package com.florian.rifts;

import com.florian.rifts.blocks.*;
import com.florian.rifts.entity.block.CorruptedBlockEntity;
import com.florian.rifts.events.listeners.DropRiftEyeListener;
import com.florian.rifts.events.listeners.EyeDestroyedCorruptionListener;
import com.florian.rifts.items.*;
import com.florian.rifts.util.Corruptor;
import com.florian.rifts.util.CorruptedDamageSource;
import com.florian.rifts.util.GroupManager;
import com.florian.rifts.util.registerer.block.BlockRegisterer;
import com.florian.rifts.util.registerer.item.ItemRegisterer;
import com.florian.rifts.util.registerer.ore.OrePlacementType;
import com.florian.rifts.util.registerer.ore.OreRegisterer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rifts implements ModInitializer {

    public static String MOD_ID="rifts";
    public static final Logger logger = LoggerFactory.getLogger(MOD_ID);

    //damage sources
    public static class DamageSources{
        public static CorruptedDamageSource CORRUPTED = new CorruptedDamageSource();
    }

    //blocks
    public static class Blocks {
        public static RiftOre RIFT_ORE = new RiftOre();
        public static RiftBlock RIFT_BLOCK = new RiftBlock();
        public static CorruptedBlock CORRUPTED_BLOCK = new CorruptedBlock();
        public static BurnedLeaves BURNED_LEAVES = new BurnedLeaves();
        public static CorruptedLeaveBlock CORRUPTED_LEAVES = new CorruptedLeaveBlock();
        public static CorruptedCatalyst CORRUPTED_CATALYST = new CorruptedCatalyst();
    }

    //entities
    public static class Entities{
        public static BlockEntityType<? extends BlockEntity> CORRUPTED_BLOCK;
    }

    //items
    public static class Items {
        public static RiftShard RIFT_SHARD = new RiftShard();
        public static RiftEye RIFT_EYE = new RiftEye();
        public static RiftBlockItem RIFT_BLOCK = new RiftBlockItem();
        public static RiftOreItem RIFT_ORE = new RiftOreItem();
        public static CorruptedBlockItem CORRUPTED_BLOCK = new CorruptedBlockItem();
        public static CorruptedLeavesItem CORRUPTED_LEAVES = new CorruptedLeavesItem();
        public static BurnedLeavesItem BURNED_LEAVES = new BurnedLeavesItem();
    }

    @Override
    public void onInitialize() {

        GroupManager modGroup = new GroupManager("rifts", Items.RIFT_SHARD);

        //register blocks
        Blocks.RIFT_BLOCK = (RiftBlock) new BlockRegisterer("rift_block", Blocks.RIFT_BLOCK)
            .withItem(Items.RIFT_BLOCK)
            .addToGroup(modGroup)
            .extractBlockItem(item->Items.RIFT_BLOCK= (RiftBlockItem) item)
            .register();

        Blocks.BURNED_LEAVES = (BurnedLeaves) new BlockRegisterer("burned_leaves", Blocks.BURNED_LEAVES)
                .withItem(Items.BURNED_LEAVES)
                .extractBlockItem(item->Items.BURNED_LEAVES = (BurnedLeavesItem) item)
                .addToGroup(modGroup)
                .register();

        Blocks.CORRUPTED_LEAVES = (CorruptedLeaveBlock) new BlockRegisterer("corrupted_leaves", Blocks.CORRUPTED_LEAVES)
                .withItem(Items.CORRUPTED_LEAVES)
                .extractBlockItem(item->Items.CORRUPTED_LEAVES= (CorruptedLeavesItem) item)
                .withEntity(()->CorruptedBlockEntity::new)
                .addToGroup(modGroup)
                .register();

        Blocks.RIFT_ORE = (RiftOre) new OreRegisterer("overworld_rift_ore", Blocks.RIFT_ORE)
            .setBlockProperties(block->block
                    .addToGroup(modGroup)
                    .withItem(Items.RIFT_ORE)
                    .extractBlockItem(item->Items.RIFT_ORE= (RiftOreItem) item)
            )
            .setBaseConfiguration(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES)
            .setPlacement(OrePlacementType.UNIFORM, YOffset.getBottom(), YOffset.aboveBottom(20))
            .setVeinSize(3)
            .setVeinsPerChunk(1)
            .register();

       Blocks.CORRUPTED_BLOCK = (CorruptedBlock) new BlockRegisterer("corrupted_block",Blocks.CORRUPTED_BLOCK)
            .withItem(Items.CORRUPTED_BLOCK)
               .extractBlockItem(item->Items.CORRUPTED_BLOCK= (CorruptedBlockItem) item)
            .withEntity(()-> CorruptedBlockEntity::new)
               .extractBlockEntityType(type->Entities.CORRUPTED_BLOCK = type)
            .addToGroup(modGroup)
            .register();

        Blocks.CORRUPTED_CATALYST = (CorruptedCatalyst) new BlockRegisterer("corrupted_catalyst",Blocks.CORRUPTED_CATALYST)
                //.withItem(Items.CORRUPTED_BLOCK)
                //.extractBlockItem(item->Items.CORRUPTED_BLOCK= (CorruptedBlockItem) item)
                .withEntity(()-> CorruptedBlockEntity::new)
                .extractBlockEntityType(type->Entities.CORRUPTED_BLOCK = type)
                .addToGroup(modGroup)
                .register();

        //register items
        Items.RIFT_EYE = (RiftEye) new ItemRegisterer("rift_eye")
            .useItem(Items.RIFT_EYE)
            .addToGroup(modGroup)
            .register();
        Items.RIFT_SHARD = (RiftShard) new ItemRegisterer("rift_shard")
            .useItem(Items.RIFT_SHARD)
            .addToGroup(modGroup)
            .register();

        modGroup.createGroup();

        //register events
        DropRiftEyeListener.registerEvent();
        EyeDestroyedCorruptionListener.registerEvent();

        Corruptor.addToMapping(Blocks.CORRUPTED_LEAVES);
    }
}
