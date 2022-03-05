package com.florian.rifts.mixin;

import com.florian.rifts.Rifts;
import com.florian.rifts.events.listeners.DropRiftEyeListener;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Entity.class)
public class ItemEntityMixin {

    @Inject(at=@At(value="TAIL"), method="fall")
    public void onFallInject(double heightDifference, boolean onGround, BlockState landedState, BlockPos landedPosition, CallbackInfo info)
    {
        Entity self = (Entity)(Object)this;
        if(self instanceof ItemEntity) {
            ItemEntity entity = (ItemEntity) self;
            if (entity.getStack().getItem().equals(Rifts.Items.RIFT_EYE) && onGround) {
                DropRiftEyeListener.EVENT.invoker().interact(entity);
            }
        }
    }
}