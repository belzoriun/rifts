package com.florian.rifts.util.registerer.block;

import com.florian.rifts.Rifts;
import com.florian.rifts.util.GroupManager;
import com.florian.rifts.util.registerer.IRegisterer;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBlockRegisterer <T extends AbstractBlockOptionsRegisterer> implements IRegisterer<BlockEntityType> {

    public interface OptionSetter<V>{
        AbstractBlockOptionsRegisterer call(V options);
    }

    private String name;
    private Block block;
    private AbstractBlockOptionsRegisterer options;
    private List<GroupManager> groups;

    protected AbstractBlockRegisterer(String name)
    {
        this.name=name;
        this.groups = new ArrayList<>();
    }

    public AbstractBlockRegisterer<T> registerBlock(Block block)
    {
        System.out.println(block);
        this.block=block;
        return this;
    }

    public AbstractBlockRegisterer<T> setOptions(OptionSetter<T> setter)
    {
        options = setter.call(getOptions(name, block));
        return this;
    }

    protected abstract T getOptions(String name, Block block);

    public BlockEntityType register() {
        if(block != null)
        {
            Rifts.logger.info("Registering block : "+name);
            block = Registry.register(Registry.BLOCK, new Identifier(Rifts.MOD_ID, name), block);

            System.out.println(block);
            for(GroupManager group : groups)
            {
                Rifts.logger.info("Adding block "+name+" to group : "+group.getName());
                group.AddItem(block);
            }
            Rifts.logger.info("Are "+name+" options registered ? "+(options!=null));
            if(options != null) {
                return options.register();
            }
        }
        return null;
    }

    public AbstractBlockRegisterer<T> addToGroup(GroupManager group)
    {
        groups.add(group);
        return this;
    }
}
