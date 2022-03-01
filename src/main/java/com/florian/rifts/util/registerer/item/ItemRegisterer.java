package com.florian.rifts.util.registerer.item;

import com.florian.rifts.Rifts;
import com.florian.rifts.util.GroupManager;
import com.florian.rifts.util.registerer.IRegisterer;
import com.florian.rifts.util.registerer.block.AbstractBlockRegisterer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class ItemRegisterer implements IRegisterer<Item> {

    private String name;
    private Item item;
    private List<GroupManager> groups;

    public ItemRegisterer(String name)
    {
        this.name=name;
        this.groups = new ArrayList<>();
    }

    public ItemRegisterer useItem(Item item)
    {
        this.item=item;
        return this;
    }

    @Override
    public Item register() {
        Rifts.logger.info("Registering item : "+name);
        Item registered = Registry.register(Registry.ITEM, new Identifier(Rifts.MOD_ID, name), item);
        for(GroupManager group : groups)
        {
            Rifts.logger.info("Adding item "+name+" to group : "+group.getName());
            group.AddItem(item);
        }
        return registered;
    }

    public ItemRegisterer addToGroup(GroupManager group)
    {
        groups.add(group);
        return this;
    }
}
