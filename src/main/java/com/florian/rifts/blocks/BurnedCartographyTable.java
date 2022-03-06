package com.florian.rifts.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class BurnedCartographyTable extends Block {
    public BurnedCartographyTable() {
        super(FabricBlockSettings.of(Material.AGGREGATE)
                .strength(0.3f, 0f));
    }
}