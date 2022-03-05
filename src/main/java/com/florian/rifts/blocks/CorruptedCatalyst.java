package com.florian.rifts.blocks;

import com.florian.rifts.Rifts;
import com.florian.rifts.entity.block.CorruptedBlockEntity;
import com.florian.rifts.events.listeners.EyeDestroyedCorruptionListener;
import com.florian.rifts.util.AbstractCorruptedBlock;
import com.florian.rifts.util.Corruptor;
import com.florian.rifts.util.ICorruptible;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Vibration;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class CorruptedCatalyst extends AbstractCorruptedBlock {
    public CorruptedCatalyst() {
        super(FabricBlockSettings.of(Material.AGGREGATE)
                .strength(1000f, 18000000f)
                .luminance(1));
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player)
    {
        discardAll(world, pos);
        super.onBreak(world, pos, state, player);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        manager.startSpreading(world, pos, this);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity)
    {
        if(entity instanceof ItemEntity item)
        {
            if(item.getStack().getItem().equals(Items.ENDER_EYE))
            {
                ((CorruptedBlockEntity) world.getBlockEntity(pos)).setEye(entity.getId());
                world.addParticle(
                        ParticleTypes.PORTAL,
                        pos.getX()+0.5,
                        pos.getY()+0.5,
                        pos.getZ()+0.5,
                        0.5, 0.5, 0.5
                );
                discardAll(world, pos);
                world.setBlockState(pos, world.getBlockState(pos).with(Corruptor.DISCARDING, true), Block.NOTIFY_ALL);
                ((ICorruptible)world.getBlockState(pos).getBlock()).scheduleTick(world, pos, getDelay(0));
            }
        }
    }

    @Override
    public void replaceWithOld(World world, BlockPos pos)
    {
        int eyeId=((CorruptedBlockEntity) world.getBlockEntity(pos)).getEye();
        EyeDestroyedCorruptionListener.EVENT.invoker().interact(world, eyeId);
        super.replaceWithOld(world, pos);
    }

    public void startSpreading(World world, BlockPos pos)
    {
        world.setBlockState(pos, this.getDefaultState(), Block.NOTIFY_ALL);
        ((CorruptedBlockEntity)world.getBlockEntity(pos)).setParent(pos);
        world.getBlockEntity(pos).markDirty();
        manager.startSpreading(world, pos, this);
    }

    @Override
    public Block backwardReplacementMap(Block old) {
        return Blocks.AIR;
    }

    @Override
    public boolean doesReplace(World world, BlockPos pos) {
        return false;
    }

    public void discardAll(World world, BlockPos pos)
    {
        if (!world.isClient()) {
            if(world.getBlockState(pos).isOf(Rifts.Blocks.CORRUPTED_CATALYST)) {
                BlockEntity bentity = world.getBlockEntity(pos);
                if (bentity instanceof CorruptedBlockEntity entity) {
                    for (BlockPos block : entity.getChildren()) {
                        double distance = Math.sqrt(
                            Math.pow(pos.getX()-block.getX(), 2)+
                            Math.pow(pos.getY()-block.getY(), 2)+
                            Math.pow(pos.getZ()-block.getZ(), 2)
                        );
                        if(world.getBlockState(block).getBlock() instanceof ICorruptible)
                        {
                            world.setBlockState(block, world.getBlockState(block).with(Corruptor.DISCARDING, true), Block.NOTIFY_ALL);
                            ((ICorruptible)world.getBlockState(block).getBlock()).scheduleTick(world, block, getDelay(distance));
                        }
                    }
                }
            }
        }
    }

    private int getDelay(double distance)
    {
        return (int)(20*2*Math.exp(-distance/10));
    }
}
