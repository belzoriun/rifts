package com.florian.rifts.util;

import com.florian.rifts.entity.block.CorruptedBlockEntity;
import com.florian.rifts.events.listeners.EyeDestroyedCorruptionListener;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
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

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AbstractCorruptedBlock extends Block implements BlockEntityProvider {

    public static final int MAX_SPREAD_WIDTH = 20;
    public static final double SPREAD_VELOCITY = 5;

    public static final IntProperty SPREAD_WIDTH = IntProperty.of("spread_width", 0, MAX_SPREAD_WIDTH);
    public static final IntProperty ITEMS_EATEN = IntProperty.of("items_eaten", 0, MAX_SPREAD_WIDTH);
    public static final BooleanProperty DISCARDING = BooleanProperty.of("discarding");
    public static final BooleanProperty DOES_DROP_ITEM = BooleanProperty.of("drop_eye");

    protected AbstractCorruptedBlock(Settings settings) {
        super(settings);
    }

    public abstract List<BlockPos> getNeighbors(BlockPos pos);

    public abstract Block backwardReplacementMap(World world, Block old);

    public abstract AbstractCorruptedBlock replacementMap(World world, BlockPos pos);

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CorruptedBlockEntity(pos, state);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(SPREAD_WIDTH, ITEMS_EATEN, DISCARDING, DOES_DROP_ITEM);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        world.createAndScheduleBlockTick(pos, this, 0, TickPriority.HIGH);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random)
    {
        doTick(world, state, pos, this);
    }
    public static List<BlockPos> accessAllLinkedBlocks(World world, BlockPos pos)
    {
        List<BlockPos> data = new ArrayList<>();
        List<BlockPos> iterator = new ArrayList<>();
        iterator.add(pos);
        if(!world.isClient())
        {
            int index = 0;
            while(index < iterator.size()) {
                BlockState state = world.getBlockState(iterator.get(index));
                Block block = state.getBlock();
                if(block instanceof AbstractCorruptedBlock corruptedBlock) {
                    data.add(iterator.get(index));
                    world.setBlockState(iterator.get(index), state.with(DISCARDING, true), Block.NOTIFY_ALL);
                    for (BlockPos neigh : corruptedBlock.getNeighbors(iterator.get(index))) {
                        BlockState neighState = world.getBlockState(neigh);
                        if(neighState.getBlock() instanceof AbstractCorruptedBlock && !iterator.contains(neigh))
                        {
                            iterator.add(neigh);
                        }
                    }
                }
                index++;
            }
        }
        System.out.println("data "+data.size());
        return data;
    }

    private void doTick(ServerWorld world, BlockState state, BlockPos pos, AbstractCorruptedBlock element)
    {
        if(!world.isClient() )
        {
            if(state.get(DISCARDING)) {
                BlockEntity bentity = world.getBlockEntity(pos);
                if(bentity instanceof CorruptedBlockEntity entity) {
                    Identifier id = entity.getOldBlock();
                    Block block;
                    if(id != null) {
                        block = element.backwardReplacementMap(world, Registry.BLOCK.get(id));
                    }
                    else
                    {
                        block = Blocks.AIR;
                    }
                    world.setBlockState(pos, block.getDefaultState(), Block.NOTIFY_ALL);
                    if(state.get(DOES_DROP_ITEM))
                    {
                        EyeDestroyedCorruptionListener.EVENT.invoker().interact(world, entity.getEye());
                    }
                }
            }
            else {
                List<BlockPos> neighbors = element.getNeighbors(pos);
                int stage = state.get(SPREAD_WIDTH);
                boolean canCorrupt = false;
                for (BlockPos neight : neighbors) {
                    double chanceBound = SPREAD_VELOCITY*Math.exp(-stage*(1/-(double)(MAX_SPREAD_WIDTH/2)));
                    if (new Random().nextInt(100) < chanceBound && stage>0) {
                        if(corrupt(world, stage, neight, pos))
                            world.createAndScheduleBlockTick(neight, world.getBlockState(neight).getBlock(), 5, TickPriority.HIGH);
                    }
                }
                if(canCorrupt(world, pos))
                    world.createAndScheduleBlockTick(pos, element, 5, TickPriority.HIGH);
            }
        }
    }

    public static void discardAll(World world, BlockPos pos, int eyeId)
    {
        List<BlockPos> data = accessAllLinkedBlocks(world, pos);
        world.setBlockState(pos, world.getBlockState(pos).with(DOES_DROP_ITEM, true), Block.NOTIFY_ALL);
        BlockEntity bentity = world.getBlockEntity(pos);
        if(bentity instanceof CorruptedBlockEntity entity) {
            entity.setEyeId(eyeId);
            entity.markDirty();
        }
        double maxDistance = 0;
        for(BlockPos neighPos : data) {
            double distance = Math.sqrt(
                    Math.pow(pos.getX() - neighPos.getX(), 2) +
                            Math.pow(pos.getY() - neighPos.getY(), 2) +
                            Math.pow(pos.getZ() - neighPos.getZ(), 2)
            );
            if(distance > maxDistance)
            {
                maxDistance = distance;
            }
        }
        for(BlockPos neighPos : data)
        {
            double distance = Math.sqrt(
                    Math.pow(pos.getX()-neighPos.getX(), 2)+
                            Math.pow(pos.getY() - neighPos.getY(), 2)+
                            Math.pow(pos.getZ()-neighPos.getZ(), 2)
            );
            int delay = getDelay(maxDistance, distance);
            world.createAndScheduleBlockTick(neighPos, world.getBlockState(neighPos).getBlock(),
                    delay, TickPriority.EXTREMELY_HIGH);
        }
    }

    private static int getDelay(double max, double distance)
    {
        int maxSpread = MAX_SPREAD_WIDTH;
        int result =  (int)(Math.log(-distance+max+3.8f)*maxSpread*1.5-maxSpread*2);
        return Math.max(result, 0);
    }

    private boolean corrupt(World world, int stage, BlockPos pos, BlockPos from)
    {
        Block block = world.getBlockState(pos).getBlock();
        Block fromBlock = world.getBlockState(from).getBlock();
        if(!(fromBlock instanceof AbstractCorruptedBlock))
        {
            return false;
        }
        AbstractCorruptedBlock corrupted = ((AbstractCorruptedBlock) fromBlock).replacementMap(world, pos);
        if(corrupted == null)
        {
            return false;
        }
        Identifier id = Registry.BLOCK.getId(corrupted.backwardReplacementMap(world, block));
        BlockState newState = this.getDefaultState().with(SPREAD_WIDTH,  stage- 1);

        world.setBlockState(pos, newState, Block.NOTIFY_ALL);
        BlockEntity bentity = world.getBlockEntity(pos);
        if(bentity instanceof CorruptedBlockEntity entity) {
            entity.setOldBlock(id);
            entity.markDirty();
            return true;
        }
        return false;
    }

    private boolean canCorrupt(ServerWorld world, BlockPos pos) {
        Block block = world.getBlockState(pos).getBlock();
        if(!(block instanceof AbstractCorruptedBlock))
        {
            return false;
        }
        for(BlockPos bpos : ((AbstractCorruptedBlock)block).getNeighbors(pos))
        {
            if(((AbstractCorruptedBlock)block).replacementMap(world, bpos) != null)
            {
                return true;
            }
        }
        return false;
    }
}
