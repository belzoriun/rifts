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
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.listener.PacketListener;
import net.minecraft.network.packet.c2s.play.UpdateStructureBlockC2SPacket;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.server.MinecraftServer;
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
            if (entity.getItemAge() > 3 * 20 && !world.isClient()) {
                entity.discard();
                BlockPos pos = entity.getBlockPos();
                pos = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ());
                BlockState oldBlock = world.getBlockState(pos);
                if(oldBlock.getBlock().equals(Rifts.Blocks.CORRUPTED_BLOCK)) {
                    world.setBlockState(pos, Rifts.Blocks.CORRUPTED_BLOCK.getDefaultState(), Block.NOTIFY_ALL);
                    BlockEntity bentity = world.getBlockEntity(pos);
                    if (bentity instanceof CorruptedBlockEntity) {
                        CorruptedBlockEntity centity = ((CorruptedBlockEntity) bentity);
                        centity.setOldBlock(Registry.BLOCK.getId(oldBlock.getBlock()));
                        centity.markDirty();
                    }
                    Rifts.Blocks.CORRUPTED_BLOCK.onPlaced(world, pos,
                            Rifts.Blocks.CORRUPTED_BLOCK.getDefaultState(), null, new ItemStack(Rifts.Items.CORRUPTED_BLOCK));
                }
            }
            return ActionResult.PASS;
        });
    }
}
