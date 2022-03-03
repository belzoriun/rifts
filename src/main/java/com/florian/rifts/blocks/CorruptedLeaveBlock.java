package com.florian.rifts.blocks;

import com.florian.rifts.Rifts;
import com.florian.rifts.util.AbstractCorruptedElement;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class CorruptedLeaveBlock extends AbstractCorruptedElement {
    public CorruptedLeaveBlock() {
        super(FabricBlockSettings.of(Material.AGGREGATE)
                .strength(1f, 5f));
    }

    @Override
    public Block backwardReplacementMap(Block old) {
        return Rifts.Blocks.BURNED_LEAVES;
    }

    @Override
    public boolean doesReplace(World world, BlockPos pos) {
        return Registry.BLOCK.getId(world.getBlockState(pos).getBlock()).getPath().contains("leave");
    }
}
