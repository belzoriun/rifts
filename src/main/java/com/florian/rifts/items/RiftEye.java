package com.florian.rifts.items;

import com.florian.rifts.Rifts;
import net.minecraft.advancement.Advancement;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.Util;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.List;

public class RiftEye extends Item{

    private Identifier identifier;

    public RiftEye() {
        super(new Item.Settings().rarity(Rarity.RARE));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        tooltip.add(new TranslatableText("rifts.rift_eye.flavour_text.main"));
        if(Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("rifts.rift_eye.flavour_text.1"));
            tooltip.add(new TranslatableText("rifts.rift_eye.flavour_text.2"));
            tooltip.add(new TranslatableText("rifts.rift_eye.flavour_text.3"));
            tooltip.add(new TranslatableText("rifts.rift_eye.flavour_text.4"));
            tooltip.add(new TranslatableText("rifts.rift_eye.flavour_text.5"));
            tooltip.add(new TranslatableText("rifts.rift_eye.flavour_text.6"));
            tooltip.add(new TranslatableText("rifts.rift_eye.flavour_text.7"));
            tooltip.add(new TranslatableText("rifts.rift_eye.flavour_text.8"));
        }
        else
        {
            tooltip.add(new TranslatableText("rifts.rift_eye.flavour_text.more_info"));
        }
    }

}
