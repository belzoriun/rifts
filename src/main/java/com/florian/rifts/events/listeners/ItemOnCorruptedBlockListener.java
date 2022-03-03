package com.florian.rifts.events.listeners;

import com.florian.rifts.Rifts;
import com.florian.rifts.events.callbacks.ItemOnCorruptedBlock;
import com.florian.rifts.util.AbstractCorruptedElement;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
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
                if (entity.getStack().getItem().equals(Items.ENDER_EYE)) {
                    if(!entity.getStack().getOrCreateNbt().getBoolean("absorbing")) {
                        Block block = world.getBlockState(pos).getBlock();
                        if (block instanceof AbstractCorruptedElement element && !world.getBlockState(pos).get(AbstractCorruptedElement.DISCARDING)) {
                            entity.setPickupDelayInfinite();
                            entity.getStack().getOrCreateNbt().putBoolean("absorbing", true);
                            element.discardAll(world, pos, entity.getId());
                        }
                    }
                }
                else if (!entity.getStack().getItem().equals(Rifts.Items.RIFT_EYE)) {
                    BlockState newState = state.with(AbstractCorruptedElement.ITEMS_EATEN, state.get(AbstractCorruptedElement.ITEMS_EATEN) + 1);
                    world.setBlockState(pos, newState, Block.NOTIFY_ALL);
                    entity.discard();
                }
            }
            return ActionResult.PASS;
        });
    }
}
