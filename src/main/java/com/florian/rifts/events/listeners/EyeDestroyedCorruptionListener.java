package com.florian.rifts.events.listeners;

import com.florian.rifts.Rifts;
import com.florian.rifts.events.callbacks.EyeDestroyedCorruption;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.ActionResult;

public class EyeDestroyedCorruptionListener {
    public static Event<EyeDestroyedCorruption> EVENT = EventFactory.createArrayBacked(EyeDestroyedCorruption.class,
            (listeners) -> (world, eyeId) -> {
                for (EyeDestroyedCorruption listener : listeners) {
                    ActionResult result = listener.interact(world, eyeId);

                    if(result != ActionResult.PASS) {
                        return result;
                    }
                }

                return ActionResult.PASS;
            });

    public static void registerEvent() {
        EVENT.register((world, eyeId) -> {
            Entity entity = world.getEntityById(eyeId);
            if(entity != null) {
                world.spawnEntity(new ItemEntity(world, entity.getX(), entity.getY(), entity.getZ(),
                        new ItemStack(Rifts.Items.RIFT_EYE, 1)));
                world.addFireworkParticle(entity.getX(), entity.getY(), entity.getZ(), 0, 2, 0, new NbtCompound());
                entity.discard();
            }
            return ActionResult.PASS;
        });
    }
}
