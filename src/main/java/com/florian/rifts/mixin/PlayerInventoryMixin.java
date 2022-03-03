package com.florian.rifts.mixin;

import com.florian.rifts.Rifts;
import com.florian.rifts.items.RiftEye;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerInventory.class)
public class PlayerInventoryMixin {
    @Inject(at=@At(value="HEAD"),
            method="insertStack(Lnet/minecraft/item/ItemStack;)V")
    public void onPlayerCollisionInject(ItemStack stack, CallbackInfoReturnable<Boolean> info)
    {
        if(stack.getItem().equals(Rifts.Items.RIFT_EYE))
        {
            stack.getOrCreateNbt().remove("has_absorb");
        }
    }
}
