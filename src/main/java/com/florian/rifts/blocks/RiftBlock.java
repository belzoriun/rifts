package com.florian.rifts.blocks;

import com.florian.rifts.Rifts;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RiftBlock extends Block {

    private Identifier identifier;
    private BlockItem item;

    public RiftBlock() {
        super(FabricBlockSettings.of(Material.METAL)
                .requiresTool()
                .strength(35f, 18000000f)
                .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                .luminance(3));
    }
}
