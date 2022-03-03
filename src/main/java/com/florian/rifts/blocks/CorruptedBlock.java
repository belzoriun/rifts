package com.florian.rifts.blocks;

import com.florian.rifts.util.AbstractCorruptedElement;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;

public class CorruptedBlock extends AbstractCorruptedElement {

    private final Map<Block, Block> backwardTransformingMap = new HashMap<>();

    public CorruptedBlock() {
        super(FabricBlockSettings.of(Material.AGGREGATE)
                .strength(1000f, 18000000f)
                .luminance(1));

        backwardTransformingMap.put(Blocks.DIRT, Blocks.COARSE_DIRT);
        backwardTransformingMap.put(Blocks.GRASS_BLOCK, Blocks.COARSE_DIRT);
        backwardTransformingMap.put(Blocks.STONE, Blocks.COBBLESTONE);
        backwardTransformingMap.put(Blocks.DEEPSLATE, Blocks.COBBLED_DEEPSLATE);
        backwardTransformingMap.put(Blocks.GLASS, Blocks.SAND);
        backwardTransformingMap.put(Blocks.ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG);
        backwardTransformingMap.put(Blocks.BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG);
        backwardTransformingMap.put(Blocks.DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG);
        backwardTransformingMap.put(Blocks.JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG);
        backwardTransformingMap.put(Blocks.OAK_LOG, Blocks.STRIPPED_OAK_LOG);
        backwardTransformingMap.put(Blocks.SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG);

    }

    @Override
    public Block backwardReplacementMap(Block old) {
        if(backwardTransformingMap.containsKey(old))
        {
            return backwardTransformingMap.get(old);
        }
        return old;
    }

    @Override
    public boolean doesReplace(World world, BlockPos pos) {
        Block toCorrupt = world.getBlockState(pos).getBlock();
        return (!toCorrupt.equals(Blocks.AIR)
                && toCorrupt.getDefaultState().isFullCube(world, pos)
                && !(toCorrupt instanceof AbstractCorruptedElement));
    }
}
