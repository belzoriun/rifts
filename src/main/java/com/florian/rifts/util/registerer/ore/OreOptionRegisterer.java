package com.florian.rifts.util.registerer.ore;

import com.florian.rifts.Rifts;
import com.florian.rifts.util.registerer.block.AbstractBlockOptionsRegisterer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.PlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;

import java.util.ArrayList;
import java.util.List;

public class OreOptionRegisterer extends AbstractBlockOptionsRegisterer<OreOptionRegisterer>
{
    public OreOptionRegisterer(Block block, String name) {
        super(block, name);
        setSaver(this);
        veinSize = 0;
        modifiers = new ArrayList<>();
        this.block=block;
    }

    private Block block;
    private RuleTest configuration;
    int veinSize;
    List<PlacementModifier> modifiers;

    @Override
    public BlockEntityType register()
    {
        BlockEntityType entity = super.register();
        Rifts.logger.info("Registering ore "+name+" using configuration="+configuration+";veinsize="+veinSize);
        ConfiguredFeature<?,?> riftOreFeature = Feature.ORE
                .configure(new OreFeatureConfig(
                        configuration,
                        block.getDefaultState(),
                        veinSize)); // vein size

        PlacedFeature riftOrePlaceFeature = riftOreFeature.withPlacement(modifiers);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Rifts.MOD_ID, name), riftOreFeature);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(Rifts.MOD_ID, name),
                riftOrePlaceFeature);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Rifts.MOD_ID, name)));
        return entity;
    }

    public OreOptionRegisterer setBaseConfiguration(RuleTest feature)
    {
        configuration = feature;
        return this;
    }

    public OreOptionRegisterer setPlacement(OrePlacementType type, YOffset min, YOffset max)
    {
        switch(type)
        {
            default:
            case UNIFORM :
                modifiers.add(HeightRangePlacementModifier.uniform(min, max));
                break;
            case TRAPEZOID:
                modifiers.add(HeightRangePlacementModifier.trapezoid(min, max));
                break;
        }
        return this;
    }

    public OreOptionRegisterer setVeinSize(int size)
    {
        veinSize = size;
        return this;
    }

    public OreOptionRegisterer isSpreadingHorizontally()
    {
        modifiers.add(SquarePlacementModifier.of());
        return this;
    }

    public OreOptionRegisterer setVeinsPerChunk(int nb)
    {
        modifiers.add(CountPlacementModifier.of(nb));
        return this;
    }
}