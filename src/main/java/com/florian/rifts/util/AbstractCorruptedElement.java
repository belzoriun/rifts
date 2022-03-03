package com.florian.rifts.util;

import com.florian.rifts.Rifts;
import com.florian.rifts.blocks.CorruptedLeaveBlock;
import com.florian.rifts.entity.block.CorruptedBlockEntity;
import com.florian.rifts.events.listeners.EyeDestroyedCorruptionListener;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.TickPriority;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public abstract class AbstractCorruptedElement extends Block implements BlockEntityProvider {
    public static final int MAX_SPREAD_WIDTH = 20;
    public static final int MAX_REMOVE_CORRUTPION = 2;
    public static final double SPREAD_VELOCITY = 5;

    public static final IntProperty SPREAD_WIDTH = IntProperty.of("spread_width", 0, MAX_SPREAD_WIDTH);
    public static final IntProperty ITEMS_EATEN = IntProperty.of("items_eaten", 0, MAX_SPREAD_WIDTH);
    public static final BooleanProperty DISCARDING = BooleanProperty.of("discarding");
    public static final BooleanProperty DOES_DROP_ITEM = BooleanProperty.of("drop_eye");

    private static List<AbstractCorruptedElement> mappings = new ArrayList<>();
    private static Map<Integer, List<BlockPos>> blockReferencer = new HashMap<>();

    public AbstractCorruptedElement(Settings settings) {

        super(settings);

        this.setDefaultState(this.getDefaultState()
                .with(SPREAD_WIDTH, MAX_SPREAD_WIDTH)
                .with(ITEMS_EATEN, 0)
                .with(DISCARDING, false)
                .with(DOES_DROP_ITEM, false)
        );
    }

    public abstract Block backwardReplacementMap(Block old);

    public abstract boolean doesReplace(World world, BlockPos pos);

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(SPREAD_WIDTH, ITEMS_EATEN, DISCARDING, DOES_DROP_ITEM);
    }

    public static void referenceBlock(int id, BlockPos pos)
    {
        if(blockReferencer.containsKey(id)) {
            blockReferencer.get(id).add(pos);
        }
        else
        {
            List<BlockPos> list = new ArrayList<>();
            list.add(pos);
            blockReferencer.put(id, list);
        }
    }

    public static void removeGroupReference(int id)
    {
        CorruptedBlockEntity.freeId(id);
        blockReferencer.remove(id);
    }

    public static Map<BlockPos, Double> getBlocksReferencedWithDistance(int id, BlockPos from)
    {
        Map<BlockPos, Double> res = new HashMap<>();
        if(!blockReferencer.containsKey(id))
        {
            return res;
        }
        for(BlockPos pos : blockReferencer.get(id))
        {
            double distance = Math.sqrt(
                    Math.pow(from.getX()-pos.getX(), 2)+
                            Math.pow(from.getY() - pos.getY(), 2)+
                            Math.pow(from.getZ()-pos.getZ(), 2)
            );
            res.put(pos, distance);
        }
        return res;
    }

    public static void addToMapping(AbstractCorruptedElement block)
    {
        mappings.add(block);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CorruptedBlockEntity(pos, state);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        CorruptedBlockEntity entity = ((CorruptedBlockEntity)world.getBlockEntity(pos));
        int id = entity.generateGroupId();
        entity.markDirty();
        referenceBlock(id, pos);
        world.createAndScheduleBlockTick(pos, this, 0, TickPriority.HIGH);
    }

    protected void doTick(ServerWorld world, BlockState state, BlockPos pos) {
        if(!world.isClient() )
        {
            if(state.get(DISCARDING)) {
                int eyeId=((CorruptedBlockEntity) world.getBlockEntity(pos)).getEye();

                if(state.get(DOES_DROP_ITEM))
                {
                    EyeDestroyedCorruptionListener.EVENT.invoker().interact(world, eyeId);
                }
                Block old = Registry.BLOCK.get(((CorruptedBlockEntity)world.getBlockEntity(pos)).getOldBlock());
                world.setBlockState(pos, backwardReplacementMap(old).getDefaultState());
            }
            else {
                List<BlockPos> neighbors = this.allAround(pos);
                int stage = state.get(SPREAD_WIDTH);
                int id=((CorruptedBlockEntity)world.getBlockEntity(pos)).getGroupId();
                for (BlockPos neight : neighbors) {
                    double chanceBound = SPREAD_VELOCITY*Math.exp(-stage*(1/-(double)(MAX_SPREAD_WIDTH/2)));
                    if (new Random().nextInt(100) < chanceBound && canCorrupt(world, pos)) {
                        if(corrupt(world, stage, neight, pos, id))
                            world.createAndScheduleBlockTick(neight, world.getBlockState(neight).getBlock(), 5, TickPriority.HIGH);
                    }
                }
                if(canCorrupt(world, pos))
                    world.createAndScheduleBlockTick(pos, this, 5, TickPriority.HIGH);
            }
        }
    }

    private static AbstractCorruptedElement getFromMappings(World world, BlockPos pos)
    {
        for(AbstractCorruptedElement corrupted : mappings)
        {
            if(corrupted.doesReplace(world, pos))
            {
                return corrupted;
            }
        }
        if(Rifts.Blocks.CORRUPTED_BLOCK.doesReplace(world, pos))
        {
            return Rifts.Blocks.CORRUPTED_BLOCK;
        }
        return null;
    }

    protected static boolean corrupt(World world, int stage, BlockPos pos, BlockPos from, int groupId)
    {
        Block block = world.getBlockState(pos).getBlock();
        Block fromBlock = world.getBlockState(from).getBlock();
        if(!(fromBlock instanceof AbstractCorruptedElement))
        {
            return false;
        }
        AbstractCorruptedElement corrupted = getFromMappings(world, pos);
        if(corrupted == null)
        {
            return false;
        }
        Identifier id = Registry.BLOCK.getId(block);
        BlockState newState = corrupted.getDefaultState().with(SPREAD_WIDTH,  stage- 1);

        world.setBlockState(pos, newState, Block.NOTIFY_ALL);
        BlockEntity bentity = world.getBlockEntity(pos);
        referenceBlock(groupId, pos);
        if(bentity instanceof CorruptedBlockEntity entity) {
            entity.setOldBlock(id);
            entity.setGroupId(groupId);
            entity.markDirty();
            return true;
        }
        return false;
    }

    protected boolean canCorrupt(ServerWorld world, BlockPos pos) {
        Block block = world.getBlockState(pos).getBlock();
        if(!(block instanceof AbstractCorruptedElement))
        {
            return false;
        }
        if(world.getBlockState(pos).get(SPREAD_WIDTH) == 0)
        {
            return false;
        }
        for(BlockPos bpos : ((AbstractCorruptedElement)block).allAround(pos))
        {
            if(getFromMappings(world, bpos) != null)
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random)
    {
        doTick(world, state, pos);
    }


    public void discardAll(World world, BlockPos pos, int eyeId)
    {
        if(world.getBlockState(pos).get(DISCARDING))
        {
            return;
        }
        world.setBlockState(pos, world.getBlockState(pos).with(DOES_DROP_ITEM, true), Block.NOTIFY_ALL);
        BlockEntity bentity = world.getBlockEntity(pos);
        int id = -1;
        if(bentity instanceof CorruptedBlockEntity entity) {
            entity.setEyeId(eyeId);
            entity.markDirty();
            id = entity.getGroupId();
        }
        if(!world.isClient() && id != -1)
        {
            for(Map.Entry<BlockPos, Double> entry : getBlocksReferencedWithDistance(id, pos).entrySet()) {
                BlockState state = world.getBlockState(entry.getKey());
                if(state.getBlock() instanceof AbstractCorruptedElement) {
                    int delay = getDelay(entry.getValue());
                    world.setBlockState(entry.getKey(),state.with(DISCARDING, true), Block.NOTIFY_ALL);

                    if(state.getBlock() instanceof CorruptedLeaveBlock)
                    {
                        System.out.println(delay);
                    }
                    world.createAndScheduleBlockTick(entry.getKey(), state.getBlock(), delay, TickPriority.HIGH);
                }
            }
            removeGroupReference(id);
        }
    }

    private int getDelay(double distance)
    {
        return (int)(MAX_SPREAD_WIDTH*2*Math.exp(-distance/10));
    }

    protected List<BlockPos> allAround(BlockPos pos)
    {
        List<BlockPos> neighbors = new ArrayList<>();

        neighbors.add(pos.up());
        neighbors.add(pos.down());
        neighbors.add(pos.west());
        neighbors.add(pos.east());
        neighbors.add(pos.north());
        neighbors.add(pos.south());
        neighbors.add(pos.north().east());
        neighbors.add(pos.north().west());
        neighbors.add(pos.north().up());
        neighbors.add(pos.north().down());
        neighbors.add(pos.south().east());
        neighbors.add(pos.south().west());
        neighbors.add(pos.south().up());
        neighbors.add(pos.south().down());
        neighbors.add(pos.west().up());
        neighbors.add(pos.west().down());
        neighbors.add(pos.east().up());
        neighbors.add(pos.east().down());
        neighbors.add(pos.south().up().east());
        neighbors.add(pos.south().down().east());
        neighbors.add(pos.south().up().west());
        neighbors.add(pos.south().down().west());
        neighbors.add(pos.north().up().east());
        neighbors.add(pos.north().down().east());
        neighbors.add(pos.north().up().west());
        neighbors.add(pos.north().down().west());
        return neighbors;
    }

    protected List<BlockPos> onSides(BlockPos pos)
    {
        List<BlockPos> neighbors = new ArrayList<>();

        neighbors.add(pos.up());
        neighbors.add(pos.down());
        neighbors.add(pos.west());
        neighbors.add(pos.east());
        neighbors.add(pos.north());
        neighbors.add(pos.south());
        return neighbors;
    }
}
