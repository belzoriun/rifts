package com.florian.rifts.util;

import com.florian.rifts.entity.block.CorruptedBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.TickPriority;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public abstract class AbstractCorruptedLiquid extends FlowableFluid implements ICorruptible, BlockEntityProvider {

    private Corruptor manager;
    public AbstractCorruptedLiquid(Item.Settings setting, int ticksBeforeSpreadTry) {
        manager = new Corruptor(ticksBeforeSpreadTry, false);
        this.setDefaultState(manager.getConfiguredDefaultState(this.getDefaultState().getBlockState()).getFluidState());
    }

    @Override
    public void scheduleTick(World world, BlockPos pos, int delay)
    {
        world.createAndScheduleFluidTick(pos, world.getFluidState(pos).getFluid(), delay, TickPriority.HIGH);
    }

    @Override
    public BlockState getState()
    {
        return this.getDefaultState().getBlockState();
    }

    @Override
    protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder)
    {
        Corruptor.appendProperties(builder);
    }

    @Override
    public void onScheduledTick(World world, BlockPos pos, FluidState state)
    {
        super.onScheduledTick(world, pos, state);
        manager.doTick(world, state.getBlockState(), pos, this);
    }

    @Override
    public void replaceWithOld(World world, BlockPos pos)
    {
        Fluid old = Registry.FLUID.get(((CorruptedBlockEntity)world.getBlockEntity(pos)).getOldBlock());
        world.setBlockState(pos, backwardReplacementMap(old).getDefaultState().getBlockState());
    }

    public abstract Fluid backwardReplacementMap(Fluid old);

    public abstract boolean doesReplace(World world, BlockPos pos);

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return manager.createBlockEntity(pos, state);
    }
}
