package com.florian.rifts.util.registerer;

import com.florian.rifts.util.GroupManager;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRegisterer<R, T> {

    public interface IBlockEntityProvider {
        FabricBlockEntityTypeBuilder.Factory<? extends BlockEntity> provide();
    }

    public interface BlockEntityTypeExtractor
    {
        void extract(BlockEntityType block);
    }

    protected String name;
    protected List<GroupManager> groups;
    protected FabricBlockEntityTypeBuilder.Factory<? extends BlockEntity> entity;

    protected AbstractRegisterer(String name) {
        this.name = name;
        groups = new ArrayList<>();
    }

    public abstract T register();
}
