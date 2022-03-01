package com.florian.rifts.events.callbacks;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ActionResult;

public interface WalksOnCorruptBlock {
    public ActionResult interact(LivingEntity entity);
}
