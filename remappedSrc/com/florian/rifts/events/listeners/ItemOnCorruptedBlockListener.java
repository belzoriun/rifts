package com.florian.rifts.events.listeners;

import com.florian.rifts.Rifts;
import com.florian.rifts.events.callbacks.DropRiftEye;
import com.florian.rifts.events.callbacks.ItemOnCorruptedBlock;
import com.florian.rifts.util.CorruptBlockManager;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.EnderEyeItem;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class ItemOnCorruptedBlockListener {

    public static Event<ItemOnCorruptedBlock> EVENT = EventFactory.createArrayBacked(ItemOnCorruptedBlock.class,
        (listeners) -> (entity, state, pos) -> {
            for (ItemOnCorruptedBlock listener : listeners) {
                ActionResult result = listener.interact(entity, state, pos);

                if(result != ActionResult.PASS) {
                    return result;
                }
            }

            return ActionResult.PASS;
        });

    public static void registerEvent() {
        EVENT.register((entity, state, pos) -> {
            World world = entity.world;
            if(!world.isClient())
            {
                if(entity.getStack().getItem().equals(Items.ENDER_EYE))
                {
                    CorruptBlockManager.discardAll(world, pos, entity.getId());
                }
                else {
                    BlockState newState = state.with(Rifts.Blocks.CORRUPTED_BLOCK.ITEMS_EATEN, state.get(Rifts.Blocks.CORRUPTED_BLOCK.ITEMS_EATEN) + 1);
                    world.setBlockState(pos, state, Block.NOTIFY_ALL);
                    entity.discard();
                    Rifts.Blocks.CORRUPTED_BLOCK.tryMakeChild(world, newState);
                }
            }
            return ActionResult.PASS;
        });
    }
}
