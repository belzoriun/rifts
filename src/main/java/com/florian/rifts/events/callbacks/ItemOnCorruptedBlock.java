package com.florian.rifts.events.callbacks;

import net.minecraft.block.BlockState;
import net.minecraft.entity.ItemEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public interface ItemOnCorruptedBlock {
    public ActionResult interact(ItemEntity entity, BlockState state, BlockPos pos);
}
