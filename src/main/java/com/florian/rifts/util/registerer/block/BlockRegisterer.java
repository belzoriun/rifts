package com.florian.rifts.util.registerer.block;

import com.florian.rifts.Rifts;
import com.florian.rifts.util.GroupManager;
import com.florian.rifts.util.registerer.AbstractRegisterer;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

public class BlockRegisterer extends AbstractRegisterer<BlockRegisterer, Block> {

    public interface BlockItemExtractor
    {
        void extract(BlockItem block);
    }

    public BlockRegisterer withEntity(IBlockEntityProvider provider)
    {
        this.entity=provider.provide();
        return this;
    }

    private BlockItem item;

    private Block block;

    private BlockItemExtractor itemExtractor;
    private BlockEntityTypeExtractor entityTypeExtractor;

    public BlockRegisterer(String name, Block block)
    {
        super(name);
        this.groups = new ArrayList<>();
        this.block = block;
    }

    public BlockRegisterer withItem(BlockItem item)
    {
        this.item=item;
        return this;
    }

    public Block register() {
        if(block != null)
        {
            Rifts.logger.info("Registering block : "+name);
            block = Registry.register(Registry.BLOCK, new Identifier(Rifts.MOD_ID, name), block);
            if(item != null)
            {
                Rifts.logger.info("Registering block item : "+name);
                itemExtractor.extract(Registry.register(Registry.ITEM, new Identifier(Rifts.MOD_ID, name), item));
            }
            if(entity != null)
            {
                Rifts.logger.info("Registering block entity : "+name+"_entity");
                BlockEntityType type = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Rifts.MOD_ID, name+"_entity"), FabricBlockEntityTypeBuilder
                                .create(entity, block).build(null));
                if(entityTypeExtractor != null) {
                    entityTypeExtractor.extract(type);
                }
            }
            for(GroupManager group : groups)
            {
                Rifts.logger.info("Adding item "+name+" to group : "+group.getName());
                group.AddItem(item);
            }
        }
        return block;
    }

    public BlockRegisterer extractBlockEntityType(BlockEntityTypeExtractor e)
    {
        this.entityTypeExtractor = e;
        return this;
    }

    public BlockRegisterer extractBlockItem(BlockItemExtractor e)
    {
        this.itemExtractor =e;
        return this;
    }

    public BlockRegisterer addToGroup(GroupManager group)
    {
        groups.add(group);
        return this;
    }
}
