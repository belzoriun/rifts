package com.florian.rifts.events.listeners;

import com.florian.rifts.Rifts;
import com.florian.rifts.events.callbacks.ItemOnCorruptedBlock;
import com.florian.rifts.util.AbstractCorruptedBlock;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
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
                    AbstractCorruptedBlock.discardAll(world, pos, entity.getId());
                }
                else if(!entity.getStack().getItem().equals(Rifts.Items.RIFT_EYE)){
                    BlockState newState = state.with(AbstractCorruptedBlock.ITEMS_EATEN, state.get(AbstractCorruptedBlock.ITEMS_EATEN) + 1);
                    world.setBlockState(pos, state, Block.NOTIFY_ALL);
                    entity.discard();
                }
            }
            return ActionResult.PASS;
        });
    }
}
