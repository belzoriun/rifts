package com.florian.rifts.util;

import com.florian.rifts.Rifts;
import com.florian.rifts.entity.block.CorruptedBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.TickPriority;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class CorruptBlockManager {

    private static Map<Block, Block> backwardTransformingMap = new HashMap<>();

    public static void initManager()
    {
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

    private static List<BlockPos> accessAllLinkedBlocks(World world, BlockPos pos)
    {
        BlockState state = world.getBlockState(pos);
        List<BlockPos> data = new ArrayList<>();
        Block block = state.getBlock();
        if(!world.isClient() && block instanceof ICorruptedElement && !state.get(ICorruptedElement.DISCARDING))
        {
            world.setBlockState(pos, state.with(ICorruptedElement.DISCARDING, true), Block.NOTIFY_ALL);
            List<BlockPos> blocNeighbors = ((ICorruptedElement)block).getNeighbors(pos);
            data.add(pos);
            for(BlockPos neighbor : blocNeighbors)
            {
                data.addAll(accessAllLinkedBlocks(world, neighbor));
            }
        }
        return data;
    }

    public static void discardAll(World world, BlockPos pos, int eyeId)
    {
        List<BlockPos> data = accessAllLinkedBlocks(world, pos);
        world.setBlockState(pos, world.getBlockState(pos).with(ICorruptedElement.DOES_DROP_ITEM, true)
                .with(ICorruptedElement.EYE_ID, eyeId), Block.NOTIFY_ALL);
        double maxDistance = 0;
        for(BlockPos neighPos : data) {
            double distance = Math.sqrt(
                    Math.pow(pos.getX() - neighPos.getX(), 2) +
                            Math.pow(pos.getY() - neighPos.getY(), 2) +
                            Math.pow(pos.getZ() - neighPos.getZ(), 2)
            );
            if(distance > maxDistance)
            {
                maxDistance = distance;
            }
        }
        for(BlockPos neighPos : data)
        {
            double distance = Math.sqrt(
                    Math.pow(pos.getX()-neighPos.getX(), 2)+
                            Math.pow(pos.getY() - neighPos.getY(), 2)+
                            Math.pow(pos.getZ()-neighPos.getZ(), 2)
            );
            int delay = getDelay(maxDistance, distance);
            world.createAndScheduleBlockTick(neighPos, world.getBlockState(neighPos).getBlock(),
                    delay, TickPriority.EXTREMELY_HIGH);
        }
    }

    private static int getDelay(double max, double distance)
    {
        int maxSpread = ICorruptedElement.MAX_SPREAD_WIDTH;
        int result =  (int)(Math.log(-distance+max+3.8f)*maxSpread*1.5-maxSpread*2);
        if(result < 0)
        {
            return 0;
        }
        return result;
    }

    public static boolean corrupt(World world, int stage, BlockPos pos)
    {
        Block block = world.getBlockState(pos).getBlock();
        Block corrupted = CorruptBlockManager.replacementMap(world, pos);
        if(corrupted == null)
        {
            return false;
        }
        Identifier id = Registry.BLOCK.getId(CorruptBlockManager.backwardReplacementMap(block));
        BlockState newState = corrupted.getDefaultState().with(ICorruptedElement.SPREAD_WIDTH,  stage- 1);

        world.setBlockState(pos, newState, Block.NOTIFY_ALL);
        BlockEntity bentity = world.getBlockEntity(pos);
        if(bentity instanceof CorruptedBlockEntity) {
            CorruptedBlockEntity entity = ((CorruptedBlockEntity) bentity);
            entity.setOldBlock(id);
            entity.markDirty();
            return true;
        }
        return false;
    }

    public static Block backwardReplacementMap(Block old)
    {
        if(backwardTransformingMap.containsKey(old))
        {
            return backwardTransformingMap.get(old);
        }
        return old;
    }

    public static Block replacementMap(World world, BlockPos pos)
    {
        Block toCorrupt = world.getBlockState(pos).getBlock();
        if(!toCorrupt.equals(Blocks.AIR)
                && toCorrupt.getDefaultState().isFullCube(world, pos)
                && !(world.getBlockState(pos).getBlock() instanceof ICorruptedElement))
            return Rifts.Blocks.CORRUPTED_BLOCK;
        return null;
    }

    public static boolean canCorrupt(ServerWorld world, BlockPos pos) {
        Block block = world.getBlockState(pos).getBlock();
        if(!(block instanceof ICorruptedElement))
        {
            return false;
        }
        for(BlockPos bpos : ((ICorruptedElement)block).getNeighbors(pos))
        {
            if(replacementMap(world, bpos) != null)
            {
                return true;
            }
        }
        return false;
    }
}
