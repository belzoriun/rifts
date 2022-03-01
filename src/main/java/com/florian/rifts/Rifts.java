package com.florian.rifts;

import com.florian.rifts.blocks.CorruptedBlock;
import com.florian.rifts.blocks.RiftBlock;
import com.florian.rifts.blocks.RiftOre;
import com.florian.rifts.entity.block.CorruptedBlockEntity;
import com.florian.rifts.events.listeners.DropRiftEyeListener;
import com.florian.rifts.events.listeners.EyeDestroyedCorruptionListener;
import com.florian.rifts.events.listeners.ItemOnCorruptedBlockListener;
import com.florian.rifts.events.listeners.WalksOnCorruptBlockListener;
import com.florian.rifts.items.*;
import com.florian.rifts.util.CorruptedDamageSource;
import com.florian.rifts.util.GroupManager;
import com.florian.rifts.util.registerer.block.BlockRegisterer;
import com.florian.rifts.util.registerer.item.ItemRegisterer;
import com.florian.rifts.util.registerer.ore.OrePlacementType;
import com.florian.rifts.util.registerer.ore.OreRegisterer;
import net.fabricmc.api.ModInitializer;
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
    }

    //entities
    public static class Entities{
        public static BlockEntityType CORRUPTED_BLOCK;
    }

    //items
    public static class Items {
        public static RiftShard RIFT_SHARD = new RiftShard();
        public static RiftEye RIFT_EYE = new RiftEye();
        public static RiftBlockItem RIFT_BLOCK = new RiftBlockItem();
        public static RiftOreItem RIFT_ORE = new RiftOreItem();
        public static CorruptedBlockItem CORRUPTED_BLOCK = new CorruptedBlockItem();
    }

    @Override
    public void onInitialize() {

        GroupManager modGroup = new GroupManager("rifts", Items.RIFT_SHARD);

        //register blocks
        new BlockRegisterer("rift_block")
            .registerBlock(Blocks.RIFT_BLOCK)
            .setOptions(options->options.withItem(Items.RIFT_BLOCK))
            .addToGroup(modGroup)
            .register();

        new OreRegisterer("overworld_rift_ore")
            .registerBlock(Blocks.RIFT_ORE)
            .setOptions(options->
                options.isSpreadingHorizontally()
                .setBaseConfiguration(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES)
                .setPlacement(OrePlacementType.UNIFORM, YOffset.getBottom(), YOffset.aboveBottom(20))
                .setVeinSize(3)
                .setVeinsPerChunk(1)
                .withItem(Items.RIFT_ORE))
            .addToGroup(modGroup)
            .register();

        Entities.CORRUPTED_BLOCK = new BlockRegisterer("corrupted_block")
            .registerBlock(Blocks.CORRUPTED_BLOCK)
            .setOptions(options->
                options.withItem(Items.CORRUPTED_BLOCK)
                .withEntity(()-> CorruptedBlockEntity::new))
            .addToGroup(modGroup)
            .register();

        //register items
        new ItemRegisterer("rift_eye")
            .useItem(Items.RIFT_EYE)
            .addToGroup(modGroup)
            .register();
        new ItemRegisterer("rift_shard")
            .useItem(Items.RIFT_SHARD)
            .addToGroup(modGroup)
            .register();

        modGroup.createGroup();

        //register events
        DropRiftEyeListener.registerEvent();
        WalksOnCorruptBlockListener.registerEvent();
        ItemOnCorruptedBlockListener.registerEvent();
        EyeDestroyedCorruptionListener.registerEvent();
    }
}
