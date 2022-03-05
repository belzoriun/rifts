package com.florian.rifts.mixin;

import com.florian.rifts.util.IInvulnerableToCorruption;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.ZombieEntity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(LivingEntity.class)
public class InvulnerableToCorruptionMixin implements IInvulnerableToCorruption {
    private boolean isInvincibleToCorruption = false;

    public void setInvincibleToCorruption()
    {
        this.isInvincibleToCorruption = true;
    }

    public boolean isInvincibleToCorruption()
    {
        return this.isInvincibleToCorruption;
    }
}
