package com.florian.rifts.util.registerer.block;

import com.florian.rifts.Rifts;
import com.florian.rifts.util.registerer.IRegisterer;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public abstract class AbstractBlockOptionsRegisterer<T extends AbstractBlockOptionsRegisterer>  implements IRegisterer<BlockEntityType> {

    public interface IEntityProvider{
        FabricBlockEntityTypeBuilder.Factory<? extends BlockEntity> provide();
    }

    protected BlockItem item;
    protected FabricBlockEntityTypeBuilder.Factory<? extends BlockEntity> entity;
    protected Block block;
    protected String name;
    private T optionSaver;

    protected AbstractBlockOptionsRegisterer(Block block, String name)
    {
        this.block = block;
        this.name=name;
    }

    protected void setSaver(T saver)
    {
        this.optionSaver = saver;
        this.optionSaver.block=this.block;
        this.optionSaver.name=this.name;
    }

    public T withItem(BlockItem item)
    {
        optionSaver.item=item;
        return optionSaver;
    }

    public T withEntity(IEntityProvider provider)
    {
        optionSaver.entity=provider.provide();
        return optionSaver;
    }

    public BlockEntityType register()
    {
        if(item != null)
        {
            Rifts.logger.info("Registering block item : "+name);
            Registry.register(Registry.ITEM, new Identifier(Rifts.MOD_ID, name), item);
        }
        if(entity != null)
        {
            Rifts.logger.info("Registering block entity : "+name+"_entity");
            return Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Rifts.MOD_ID, name+"_entity"), FabricBlockEntityTypeBuilder
                    .create(entity, block).build(null));
        }
        return null;
    }
}
