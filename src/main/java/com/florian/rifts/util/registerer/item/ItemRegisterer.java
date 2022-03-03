package com.florian.rifts.util.registerer.item;

import com.florian.rifts.Rifts;
import com.florian.rifts.util.GroupManager;
import com.florian.rifts.util.registerer.AbstractRegisterer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegisterer extends AbstractRegisterer<ItemRegisterer, Item> {

    private Item item;

    public ItemRegisterer(String name)
    {
        super(name);
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
