package com.florian.rifts.events.listeners;

import com.florian.rifts.Rifts;
import com.florian.rifts.events.callbacks.DropRiftEye;
import com.florian.rifts.events.callbacks.WalksOnCorruptBlock;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class WalksOnCorruptBlockListener {

    public static Event<WalksOnCorruptBlock> EVENT = EventFactory.createArrayBacked(WalksOnCorruptBlock.class,
        (listeners) -> (entity) -> {
            for (WalksOnCorruptBlock listener : listeners) {
                ActionResult result = listener.interact(entity);

                if(result != ActionResult.PASS) {
                    return result;
                }
            }

            return ActionResult.PASS;
        });

    public static void registerEvent() {
        EVENT.register((entity) -> {
            if(entity.canTakeDamage())
            {
                entity.damage(Rifts.DamageSources.CORRUPTED, 3f);
            }
            return ActionResult.PASS;
        });
    }
}
