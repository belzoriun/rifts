package com.florian.rifts.mixin;

import com.florian.rifts.Rifts;
import com.florian.rifts.events.listeners.DropRiftEyeListener;
import com.florian.rifts.items.RiftEye;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Util;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemEntity.class)
public class ItemMoveMixin {

    @Inject(at=@At("HEAD"), method="tick")
    public void itemStopMoving(CallbackInfo info)
    {
        ItemEntity entity = (ItemEntity)(Object)this;
        if (entity.getVelocity().equals(new Vec3d(0, 0, 0)))//define if entity stopped moving
        {
            System.out.println("coucou "+entity);
            //define what item it is and call the appropriate drop statement
            if (entity.getStack().getItem().equals(Rifts.Items.RIFT_EYE)) {
                DropRiftEyeListener.EVENT.invoker().interact(entity);
            }
        }
    }

}
