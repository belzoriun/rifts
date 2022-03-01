package com.florian.rifts.util;

import com.florian.rifts.Rifts;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class GroupManager {
    private FabricItemGroupBuilder builder;

    private List<ItemStack> groupItems;
    private String name;

    public String getName()
    {
        return name;
    }

    public GroupManager(String name, Item icon)
    {
        this.name=name;
        builder=FabricItemGroupBuilder.create(new Identifier(Rifts.MOD_ID, name))
                .icon(()->new ItemStack(icon));
        groupItems = new ArrayList<>();
    }

    public void AddItem(ItemConvertible item)
    {
        groupItems.add(new ItemStack(item));
    }

    public void createGroup()
    {
        System.out.println(groupItems);
        builder.appendItems((stacks)->{
            for(ItemStack stack : groupItems)
            {
                stacks.add(stack);
            }
            stacks.add(new ItemStack(Rifts.Blocks.CORRUPTED_BLOCK));
        }).build();
    }
}
