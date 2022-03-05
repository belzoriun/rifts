package com.florian.rifts.events.listeners;

import com.florian.rifts.Rifts;
import com.florian.rifts.entity.block.CorruptedBlockEntity;
import com.florian.rifts.events.callbacks.DropRiftEye;
import com.florian.rifts.items.RiftEye;
import io.netty.buffer.Unpooled;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.network.ClientSidePacketRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.listener.PacketListener;
import net.minecraft.network.packet.c2s.play.UpdateStructureBlockC2SPacket;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.MinecraftServer;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.TickDurationMonitor;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class DropRiftEyeListener {

    public static Event<DropRiftEye> EVENT = EventFactory.createArrayBacked(DropRiftEye.class,
        (listeners) -> (entity) -> {
            for (DropRiftEye listener : listeners) {
                ActionResult result = listener.interact(entity);

                if(result != ActionResult.PASS) {
                    return result;
                }
            }

            return ActionResult.PASS;
        });

    public static void registerEvent() {
        EVENT.register((entity) -> {
            World world = entity.world;
            int effectAmplifier = (int)(Math.log(entity.getItemAge()*1.2+5)*3-3);
            for(int i = 0; i<effectAmplifier; i++) {
                Random r = new Random();
                double x =  r.nextDouble(-effectAmplifier, effectAmplifier);
                double y =  r.nextDouble(-effectAmplifier, effectAmplifier);
                double z =  r.nextDouble(-effectAmplifier, effectAmplifier);
                world.addParticle(ParticleTypes.SOUL,
                        entity.getX()+entity.getWidth()/2+x,
                        entity.getY()+entity.getHeight()/2+y,
                        entity.getZ()+entity.getWidth()/2+z,
                        -x*0.1, -y*0.1, -z*0.1f
                );
            }
            if(entity.getItemAge() > 3*20) {
                Random r = new Random();
                world.addParticle(ParticleTypes.ANGRY_VILLAGER,
                        entity.getX() - entity.getWidth() / 2,
                        entity.getY() - entity.getHeight() / 2,
                        entity.getZ() - entity.getWidth() / 2,
                        r.nextFloat(0.1f), r.nextFloat(0.1f), r.nextFloat(0.1f)
                );
                world.playSound(entity.getX(), entity.getY(), entity.getZ()
                        , SoundEvents.ENTITY_LIGHTNING_BOLT_IMPACT,
                        SoundCategory.WEATHER, 30f, r.nextFloat(30), true);
                if (!world.isClient()) {
                    BlockPos pos = entity.getBlockPos();
                    BlockState oldBlock = world.getBlockState(pos);
                    if (!oldBlock.getBlock().equals(Rifts.Blocks.CORRUPTED_BLOCK)
                            && !entity.getStack().getOrCreateNbt().getBoolean("has_absorb")) {
                        entity.discard();
                        Rifts.Blocks.CORRUPTED_CATALYST.startSpreading(world, pos);
                    }
                }
            }
            return ActionResult.PASS;
        });
    }
}
