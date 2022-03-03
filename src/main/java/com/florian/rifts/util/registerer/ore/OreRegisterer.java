package com.florian.rifts.util.registerer.ore;

import com.florian.rifts.Rifts;
import com.florian.rifts.util.registerer.AbstractRegisterer;
import com.florian.rifts.util.registerer.block.BlockRegisterer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
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

public class OreRegisterer extends AbstractRegisterer<OreRegisterer, Block> {

    public interface OreBlockDefiner{
        BlockRegisterer call(BlockRegisterer registerer);
    }

    BlockRegisterer register;
    private RuleTest configuration;
    int veinSize;
    List<PlacementModifier> modifiers;

    public OreRegisterer(String name, Block block) {
        super(name);
        register = new BlockRegisterer(name, block);
        veinSize = 0;
        modifiers = new ArrayList<>();
    }

    public OreRegisterer setBlockProperties(OreBlockDefiner definer)
    {
        this.register = definer.call(register);
        return this;
    }

    public OreRegisterer setBaseConfiguration(RuleTest feature)
    {
        configuration = feature;
        return this;
    }

    public OreRegisterer setPlacement(OrePlacementType type, YOffset min, YOffset max)
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

    public OreRegisterer setVeinSize(int size)
    {
        veinSize = size;
        return this;
    }

    public OreRegisterer isSpreadingHorizontally()
    {
        modifiers.add(SquarePlacementModifier.of());
        return this;
    }

    public OreRegisterer setVeinsPerChunk(int nb)
    {
        modifiers.add(CountPlacementModifier.of(nb));
        return this;
    }

    public Block register()
    {
        Block block = register.register();
        Rifts.logger.info("Registering ore "+name+" using block="+block+";veinsize="+veinSize);
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
        return block;
    }

}
