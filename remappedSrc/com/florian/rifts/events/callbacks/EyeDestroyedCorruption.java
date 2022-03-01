package com.florian.rifts.events.callbacks;

import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface EyeDestroyedCorruption {
    public ActionResult interact(World world, int eyeId);
}
