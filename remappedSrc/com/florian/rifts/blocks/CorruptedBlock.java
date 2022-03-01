package com.florian.rifts.blocks;

import com.florian.rifts.Rifts;
import com.florian.rifts.entity.block.CorruptedBlockEntity;
import com.florian.rifts.events.callbacks.ItemOnCorruptedBlock;
import com.florian.rifts.events.listeners.EyeDestroyedCorruptionListener;
import com.florian.rifts.events.listeners.ItemOnCorruptedBlockListener;
import com.florian.rifts.util.CorruptBlockManager;
import com.florian.rifts.util.ICorruptedElement;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Property;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.TickPriority;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class CorruptedBlock extends Block implements BlockEntityProvider, ICorruptedElement {

    public CorruptedBlock() {
        super(FabricBlockSettings.of(Material.AGGREGATE)
                .strength(1000f, 18000000f)
                .luminance(1));
        this.setDefaultState(this.getDefaultState()
                .with(SPREAD_WIDTH, MAX_SPREAD_WIDTH)
                .with(ITEMS_EATEN, 0)
                .with(DISCARDING, false)
                .with(DOES_DROP_ITEM, false)
        );

    }
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CorruptedBlockEntity(pos, state);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{SPREAD_WIDTH, ITEMS_EATEN, DISCARDING, DOES_DROP_ITEM, EYE_ID});
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        world.createAndScheduleBlockTick(pos, this, 0, TickPriority.HIGH);
        BlockEntity bentity = world.getBlockEntity(pos);
        if(bentity instanceof CorruptedBlockEntity) {
            CorruptedBlockEntity entity = ((CorruptedBlockEntity) bentity);
            entity.setOldBlock(Registry.BLOCK.getId(state.getBlock()));
            entity.markDirty();
        }
    }

    public List<BlockPos> getNeighbors(BlockPos pos)
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

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random)
    {
        if(!world.isClient() )
        {
            if(state.get(DISCARDING)) {
                BlockEntity bentity = world.getBlockEntity(pos);
                if(bentity instanceof CorruptedBlockEntity) {
                    CorruptedBlockEntity entity = ((CorruptedBlockEntity) bentity);
                    Identifier id = entity.getOldBlock();
                    if(id != null) {
                        Block block = Registry.BLOCK.get(id);
                        if(state.get(DOES_DROP_ITEM))
                        {
                            EyeDestroyedCorruptionListener.EVENT.invoker().interact(world, world.getBlockState(pos).get(EYE_ID));
                            world.setBlockState(pos, world.getBlockState(pos).with(DOES_DROP_ITEM, false), Block.NOTIFY_ALL);
                        }
                        world.setBlockState(pos, block.getDefaultState(), Block.NOTIFY_ALL);
                    }
                }
            }
            else {
                List<BlockPos> neighbors = getNeighbors(pos);
                int stage = state.get(SPREAD_WIDTH);
                boolean canCorrupt = false;
                for (BlockPos neight : neighbors) {
                    double chanceBound = SPREAD_VELOCITY*Math.exp(-stage*(1/-(MAX_SPREAD_WIDTH/2)));
                    if (new Random().nextInt(100) < chanceBound && stage>0) {
                        if(CorruptBlockManager.corrupt(world, stage, neight))
                            world.createAndScheduleBlockTick(neight, world.getBlockState(neight).getBlock(), 5, TickPriority.HIGH);
                    }
                }
                if(CorruptBlockManager.canCorrupt(world, pos))
                    world.createAndScheduleBlockTick(pos, this, 5, TickPriority.HIGH);
            }
        }
    }

    public static boolean tryMakeChild(World world, BlockState state)
    {
        //make a new block spawn somewhere
        return true;
    }
}
