package com.florian.rifts.util;

import com.florian.rifts.Rifts;
import com.florian.rifts.entity.block.CorruptedBlockEntity;
import com.florian.rifts.events.listeners.EyeDestroyedCorruptionListener;
import net.minecraft.block.*;
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

import java.util.*;

public class Corruptor {
    public static final int SPREAD_VELOCITY = 15;
    public static final int ITEM_EATEN_FOR_SPECIAL_EVENT = 20;
    public static final int UPDATE_DELAY = 10;

    public static final IntProperty ITEMS_EATEN = IntProperty.of("items_eaten", 0, ITEM_EATEN_FOR_SPECIAL_EVENT);
    public static final BooleanProperty DISCARDING = BooleanProperty.of("discarding");
    public static final BooleanProperty DOES_DROP_ITEM = BooleanProperty.of("drop_eye");

    private static List<ICorruptible> mappings = new ArrayList<>();

    private boolean dependsOnHardness = true;
    private int spreadVelocity = SPREAD_VELOCITY;

    public BlockState getConfiguredDefaultState(BlockState state)
    {
        return state
                .with(ITEMS_EATEN, 0)
                .with(DISCARDING, false)
                .with(DOES_DROP_ITEM, false);
    }

    public Corruptor(){}

    public Corruptor(int ticksBeforeSpreadTry, boolean dependsOnHardness)
    {
        this.spreadVelocity = ticksBeforeSpreadTry;
        this.dependsOnHardness = dependsOnHardness;
    }

    public static void appendProperties(StateManager.Builder<?, ?> builder) {
        builder.add(ITEMS_EATEN, DISCARDING, DOES_DROP_ITEM);
    }

    public static void addToMapping(ICorruptible block)
    {
        mappings.add(block);
    }

    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CorruptedBlockEntity(pos, state);
    }

    public void startSpreading(World world, BlockPos pos, ICorruptible actor) {
        actor.scheduleTick(world, pos, 5);
    }

    protected void doTick(World world, BlockState state, BlockPos pos, ICorruptible actor) {
        if(!world.isClient() )
        {
            if(state.get(DISCARDING)) {
                actor.replaceWithOld(world, pos);
            }
            else if(canCorrupt(world, pos)){
                BlockPos parent = ((CorruptedBlockEntity)world.getBlockEntity(pos)).getParent();
                if(world.getBlockState(parent).isOf(Rifts.Blocks.CORRUPTED_CATALYST)) {
                    BlockEntity blockEntity = world.getBlockEntity(parent);
                    if (blockEntity != null && blockEntity instanceof CorruptedBlockEntity entity) {
                        if (entity.canHasMoreChilds()) {
                            BlockPos neight = getNextSpread(world, pos, state);
                            if (neight != null) {
                                int hardness = (int) world.getBlockState(neight).getHardness(world, neight);
                                hardness = (int) (Math.log(Math.pow(hardness, 3) + 5) * 1.8 - 1.5);
                                if (new Random().nextInt(0, dependsOnHardness ? hardness : spreadVelocity) == 0)
                                    if (corrupt(world, neight, pos, parent)) {
                                        entity.addChild(neight);
                                        entity.markDirty();
                                        world.createAndScheduleBlockTick(neight, world.getBlockState(neight).getBlock(), UPDATE_DELAY);
                                    }
                            }
                        }
                    }
                }
                else
                {
                    world.setBlockState(pos, state.with(DISCARDING, true), Block.NOTIFY_ALL);
                }
                world.createAndScheduleBlockTick(pos, state.getBlock(), UPDATE_DELAY);
            }
        }
    }

    public BlockPos getNextSpread(World world, BlockPos pos, BlockState state)
    {
        List<BlockPos> chose = new ArrayList<>();
        for(BlockPos forChoose : this.allAround(pos))
        {
            BlockState choseState = world.getBlockState(forChoose);
            if(!(choseState.getBlock() instanceof ICorruptible) && !choseState.isAir())
            {
                boolean touchAir = false;
                for(BlockPos isTouchAir : this.allAround(forChoose))
                {
                    if(world.getBlockState(isTouchAir).isAir())
                    {
                        touchAir = true;
                        break;
                    }
                }
                if(touchAir)
                {
                    chose.add(forChoose);
                }
            }
        }
        if(chose.isEmpty())
        {
            return null;
        }
        int randomNeighbor = new Random().nextInt(0, chose.size());
        return chose.get(randomNeighbor);
    }

    private ICorruptible getFromMappings(World world, BlockPos pos)
    {
        if(world.getBlockState(pos).getBlock() instanceof ICorruptible)
        {
            return null;
        }
        for(ICorruptible corrupted : mappings)
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

    protected boolean corrupt(World world, BlockPos pos, BlockPos from, BlockPos parent)
    {
        if(!world.getBlockState(parent).getBlock().equals(Rifts.Blocks.CORRUPTED_CATALYST))
        {
            return false;
        }
        Block block = world.getBlockState(pos).getBlock();
        Block fromBlock = world.getBlockState(from).getBlock();
        if(!(fromBlock instanceof ICorruptible))
        {
            return false;
        }
        ICorruptible corrupted = getFromMappings(world, pos);
        if(corrupted == null)
        {
            return false;
        }
        Identifier id = Registry.BLOCK.getId(block);
        BlockState newState = corrupted.getState();

        world.setBlockState(pos, newState, Block.NOTIFY_ALL);
        BlockEntity bentity = world.getBlockEntity(pos);
        if(bentity instanceof CorruptedBlockEntity entity) {
            entity.setOldBlock(id);
            entity.setParent(parent);
            entity.markDirty();
            return true;
        }
        return false;
    }

    protected boolean canCorrupt(World world, BlockPos pos) {

        if(getNextSpread(world, pos, world.getBlockState(pos)) == null)
        {
            return false;
        }
        for(BlockPos bpos : this.allAround(pos))
        {
            if(getFromMappings(world, bpos) != null)
            {
                return true;
            }
        }
        return false;
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
