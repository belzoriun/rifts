package com.florian.rifts.util;

import com.florian.rifts.Rifts;
import com.florian.rifts.blocks.CorruptedBlock;
import com.florian.rifts.entity.block.CorruptedBlockEntity;
import net.minecraft.block.AirBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.TickPriority;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public abstract class AbstractCorruptedBlock extends Block implements BlockEntityProvider, ICorruptible {
    protected Corruptor manager;

    public AbstractCorruptedBlock(Settings settings) {
        super(settings);
        manager = new Corruptor();

        this.setDefaultState(manager.getConfiguredDefaultState(this.getDefaultState()));
    }

    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity)
    {
        if(entity instanceof ItemEntity item)
        {
            if (!item.getStack().getItem().equals(Rifts.Items.RIFT_EYE)) {
                if(state.get(Corruptor.ITEMS_EATEN) == Corruptor.ITEM_EATEN_FOR_SPECIAL_EVENT)
                {
                    ZombieEntity zombie = new ZombieEntity(EntityType.ZOMBIE, world);
                    zombie.setPosition(new Vec3d(pos.up().getX(), pos.up().getY(), pos.up().getZ()));
                    ((IInvulnerableToCorruption)zombie).setInvincibleToCorruption();
                    world.spawnEntity(zombie);
                    world.setBlockState(pos, state.with(Corruptor.ITEMS_EATEN, 0));
                }
                else {
                    BlockState newState = state.with(Corruptor.ITEMS_EATEN, state.get(Corruptor.ITEMS_EATEN) + 1);
                    world.setBlockState(pos, newState, Block.NOTIFY_ALL);
                }
                item.discard();
            }
        }
        else if(entity instanceof LivingEntity living){
            if(!((IInvulnerableToCorruption)living).isInvincibleToCorruption())
                living.damage(Rifts.DamageSources.CORRUPTED, 5f);
        }
    }

    @Override
    public BlockState getState()
    {
        return this.getDefaultState();
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        Corruptor.appendProperties(builder);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random)
    {
        manager.doTick(world, state, pos, this);
    }

    @Override
    public void scheduleTick(World world, BlockPos pos, int delay) {
        world.createAndScheduleBlockTick(pos, world.getBlockState(pos).getBlock(), delay, TickPriority.HIGH);
    }

    @Override
    public void replaceWithOld(World world, BlockPos pos)
    {
        Block old = Registry.BLOCK.get(((CorruptedBlockEntity)world.getBlockEntity(pos)).getOldBlock());
        if(old instanceof AirBlock)
        {
            world.breakBlock(pos, false);
        }
        else {
            world.setBlockState(pos, backwardReplacementMap(old).getDefaultState());
        }
    }

    public abstract Block backwardReplacementMap(Block old);

    public abstract boolean doesReplace(World world, BlockPos pos);


    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return manager.createBlockEntity(pos, state);
    }
}
