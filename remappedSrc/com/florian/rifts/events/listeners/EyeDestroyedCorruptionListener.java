package com.florian.rifts.events.listeners;

import com.florian.rifts.Rifts;
import com.florian.rifts.events.callbacks.EyeDestroyedCorruption;
import com.florian.rifts.events.callbacks.ItemOnCorruptedBlock;
import com.florian.rifts.util.CorruptBlockManager;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

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
            world.spawnEntity(new ItemEntity(world, entity.getX(), entity.getY(), entity.getZ(),
                    new ItemStack(Rifts.Items.RIFT_EYE, 1)));
            world.addFireworkParticle(entity.getX(), entity.getY(), entity.getZ(), 0, 0, 0, new NbtCompound());
            entity.discard();
            return ActionResult.PASS;
        });
    }
}
