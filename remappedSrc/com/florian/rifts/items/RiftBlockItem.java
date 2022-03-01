package com.florian.rifts.items;

import com.florian.rifts.Rifts;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class RiftBlockItem extends BlockItem {
    public RiftBlockItem() {
        super(Rifts.Blocks.RIFT_BLOCK, new Item.Settings());
    }
}
