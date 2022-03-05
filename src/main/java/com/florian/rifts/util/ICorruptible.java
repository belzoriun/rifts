package com.florian.rifts.util;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface ICorruptible {

    BlockState getState();
    Block backwardReplacementMap(Block old);
    boolean doesReplace(World world, BlockPos pos);
    void replaceWithOld(World world, BlockPos pos);

    void scheduleTick(World world, BlockPos pos, int delay);
}
