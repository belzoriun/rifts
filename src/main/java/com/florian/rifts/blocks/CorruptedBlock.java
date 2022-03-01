package com.florian.rifts.blocks;

import com.florian.rifts.Rifts;
import com.florian.rifts.util.AbstractCorruptedBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CorruptedBlock extends AbstractCorruptedBlock {

    private final Map<Block, Block> backwardTransformingMap = new HashMap<>();

    public CorruptedBlock() {
        super(FabricBlockSettings.of(Material.AGGREGATE)
                .strength(1000f, 18000000f)
                .luminance(1));
        this.setDefaultState(this.getDefaultState()
                .with(SPREAD_WIDTH, MAX_SPREAD_WIDTH)
                .with(ITEMS_EATEN, 0)
                .with(DISCARDING, false)
                .with(DOES_DROP_ITEM, false)
        );

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

    public List<BlockPos> getNeighbors(BlockPos pos)
    {
        List<BlockPos> neighbors = new ArrayList<>();
        neighbors.add(pos.up());
        neighbors.add(pos.down());
        neighbors.add(pos.west());
        neighbors.add(pos.east());
        neighbors.add(pos.north());
        neighbors.add(pos.south());
        return neighbors;
    }

    @Override
    public Block backwardReplacementMap(World world, Block old) {
        if(backwardTransformingMap.containsKey(old))
        {
            return backwardTransformingMap.get(old);
        }
        return old;
    }

    @Override
    public AbstractCorruptedBlock replacementMap(World world, BlockPos pos) {
        Block toCorrupt = world.getBlockState(pos).getBlock();
        if(!toCorrupt.equals(Blocks.AIR)
                && toCorrupt.getDefaultState().isFullCube(world, pos)
                && !(world.getBlockState(pos).getBlock() instanceof AbstractCorruptedBlock))
            return Rifts.Blocks.CORRUPTED_BLOCK;
        return null;
    }
}
