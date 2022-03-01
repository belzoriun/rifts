package com.florian.rifts.util;

import net.minecraft.entity.damage.DamageSource;

public class CorruptedDamageSource extends DamageSource {
    public CorruptedDamageSource() {
        super("corrupted");
        this.bypassesArmor();
        this.isMagic();
    }
}
