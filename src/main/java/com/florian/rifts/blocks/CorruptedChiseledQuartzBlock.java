package com.florian.rifts.blocks;

import com.florian.rifts.Rifts;
import com.florian.rifts.util.AbstractCorruptedBlock;
import com.florian.rifts.util.Corruptor;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class CorruptedChiseledQuartzBlock extends AbstractCorruptedBlock {
    public CorruptedChiseledQuartzBlock() {
        super(FabricBlockSettings.of(Material.AGGREGATE)
                .strength(1f, 5f));
    }

    @Override
    public Block backwardReplacementMap(Block old) {
        return Rifts.Blocks.BURNED_CHISELED_QUARTZ_BLOCK;
    }

    @Override
    public boolean doesReplace(World world, BlockPos pos) {
        return world.getBlockState(pos).isOf(CHISELED_QUARTZ_BLOCK);
    }
}
