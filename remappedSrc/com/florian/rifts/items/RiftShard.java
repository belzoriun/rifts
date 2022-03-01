package com.florian.rifts.items;

import com.florian.rifts.Rifts;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.List;

public class RiftShard extends Item {

    public RiftShard() {
        super(new Item.Settings());
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        tooltip.add(new LiteralText("A strange gem from another world."));
        tooltip.add(new LiteralText("Did you just hear cries ?"));
    }
}
