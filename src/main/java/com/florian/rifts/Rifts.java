package com.florian.rifts;

import com.florian.rifts.blocks.RiftBlock;
import com.florian.rifts.events.listeners.DropRiftEyeListener;
import com.florian.rifts.items.RiftBlockItem;
import com.florian.rifts.items.RiftEye;
import com.florian.rifts.items.RiftOreItem;
import com.florian.rifts.items.RiftShard;
import com.florian.rifts.blocks.RiftOre;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;

public class Rifts implements ModInitializer {

    public static String MOD_ID="rifts";

    //packets identifiers
    public static class PacketsIdentifiers{
        public static Identifier PACKET_PLACE_BLOCK_ID = new Identifier(MOD_ID, "place_block");
    }

    //blocks
    public static class Blocks {
        public static RiftOre RIFT_ORE = new RiftOre();
        public static RiftBlock RIFT_BLOCK = new RiftBlock();
    }

    //items
    public static class Items {
        public static RiftShard RIFT_SHARD = new RiftShard();
        public static RiftEye RIFT_EYE = new RiftEye();
        public static RiftBlockItem RIFT_BLOCK = new RiftBlockItem();
        public static RiftOreItem RIFT_ORE = new RiftOreItem();
    }

    public static final ItemGroup MOD_GROUP = FabricItemGroupBuilder.create(new Identifier(Rifts.MOD_ID, "general"))
            .icon(()->new ItemStack(Items.RIFT_SHARD.asItem()))
            .appendItems((stacks)-> {
                stacks.add(new ItemStack(Blocks.RIFT_ORE));
                stacks.add(new ItemStack(Items.RIFT_SHARD));
                stacks.add(new ItemStack(Blocks.RIFT_BLOCK));
                stacks.add(new ItemStack(Items.RIFT_EYE));
    }).build();

    @Override
    public void onInitialize() {

        //register blocks
        Registry.register(Registry.BLOCK, new Identifier(Rifts.MOD_ID, "rift_block"), Blocks.RIFT_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Rifts.MOD_ID, "rift_block"), Items.RIFT_BLOCK);

        ConfiguredFeature<?,?> riftOreFeature = Feature.ORE
                .configure(new OreFeatureConfig(
                        OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                        Blocks.RIFT_ORE.getDefaultState(),
                        3)); // vein size
        PlacedFeature riftOrePlaceFeature = riftOreFeature.withPlacement(
                CountPlacementModifier.of(2), // number of veins per chunk
                SquarePlacementModifier.of(), // spreading horizontally
                HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.aboveBottom(20))); // height
        Registry.register(Registry.BLOCK, new Identifier(Rifts.MOD_ID, "overworld_rift_ore"), Blocks.RIFT_ORE);
        Registry.register(Registry.ITEM, new Identifier(Rifts.MOD_ID, "overworld_rift_ore"), Items.RIFT_ORE);

        //register items
        Registry.register(Registry.ITEM, new Identifier(Rifts.MOD_ID, "rift_eye"), Items.RIFT_EYE);
        Registry.register(Registry.ITEM, new Identifier(Rifts.MOD_ID, "rift_shard"), Items.RIFT_SHARD);

        //register events
        DropRiftEyeListener.registerEvent();

    }
}