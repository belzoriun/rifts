package com.florian.rifts;

import com.florian.rifts.blocks.*;
import com.florian.rifts.entity.block.CorruptedBlockEntity;
import com.florian.rifts.util.Corruptor;
import com.florian.rifts.util.registerer.block.BlockRegisterer;

public class CorruptionRegister {
    public static void register()
    {
        Rifts.Blocks.CORRUPTED_ACACIA_LEAVES = (CorruptedAcaciaLeaves) new BlockRegisterer("corrupted_acacia_leaves", Rifts.Blocks.CORRUPTED_ACACIA_LEAVES)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ACACIA_LEAVES);
        Rifts.Blocks.BURNED_ACACIA_LEAVES = (BurnedAcaciaLeaves) new BlockRegisterer("burned_acacia_leaves", Rifts.Blocks.BURNED_ACACIA_LEAVES)
                .register();
        Rifts.Blocks.CORRUPTED_ACACIA_LOG = (CorruptedAcaciaLog) new BlockRegisterer("corrupted_acacia_log", Rifts.Blocks.CORRUPTED_ACACIA_LOG)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ACACIA_LOG);
        Rifts.Blocks.BURNED_ACACIA_LOG = (BurnedAcaciaLog) new BlockRegisterer("burned_acacia_log", Rifts.Blocks.BURNED_ACACIA_LOG)
                .register();
        Rifts.Blocks.CORRUPTED_ACACIA_PLANKS = (CorruptedAcaciaPlanks) new BlockRegisterer("corrupted_acacia_planks", Rifts.Blocks.CORRUPTED_ACACIA_PLANKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ACACIA_PLANKS);
        Rifts.Blocks.BURNED_ACACIA_PLANKS = (BurnedAcaciaPlanks) new BlockRegisterer("burned_acacia_planks", Rifts.Blocks.BURNED_ACACIA_PLANKS)
                .register();
        Rifts.Blocks.CORRUPTED_ACACIA_SAPLING = (CorruptedAcaciaSapling) new BlockRegisterer("corrupted_acacia_sapling", Rifts.Blocks.CORRUPTED_ACACIA_SAPLING)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ACACIA_SAPLING);
        Rifts.Blocks.BURNED_ACACIA_SAPLING = (BurnedAcaciaSapling) new BlockRegisterer("burned_acacia_sapling", Rifts.Blocks.BURNED_ACACIA_SAPLING)
                .register();
        Rifts.Blocks.CORRUPTED_ACTIVATOR_RAIL = (CorruptedActivatorRail) new BlockRegisterer("corrupted_activator_rail", Rifts.Blocks.CORRUPTED_ACTIVATOR_RAIL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ACTIVATOR_RAIL);
        Rifts.Blocks.BURNED_ACTIVATOR_RAIL = (BurnedActivatorRail) new BlockRegisterer("burned_activator_rail", Rifts.Blocks.BURNED_ACTIVATOR_RAIL)
                .register();
        Rifts.Blocks.CORRUPTED_ALLIUM = (CorruptedAllium) new BlockRegisterer("corrupted_allium", Rifts.Blocks.CORRUPTED_ALLIUM)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ALLIUM);
        Rifts.Blocks.BURNED_ALLIUM = (BurnedAllium) new BlockRegisterer("burned_allium", Rifts.Blocks.BURNED_ALLIUM)
                .register();
        Rifts.Blocks.CORRUPTED_AMETHYST_BLOCK = (CorruptedAmethystBlock) new BlockRegisterer("corrupted_amethyst_block", Rifts.Blocks.CORRUPTED_AMETHYST_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_AMETHYST_BLOCK);
        Rifts.Blocks.BURNED_AMETHYST_BLOCK = (BurnedAmethystBlock) new BlockRegisterer("burned_amethyst_block", Rifts.Blocks.BURNED_AMETHYST_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_AMETHYST_CLUSTER = (CorruptedAmethystCluster) new BlockRegisterer("corrupted_amethyst_cluster", Rifts.Blocks.CORRUPTED_AMETHYST_CLUSTER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_AMETHYST_CLUSTER);
        Rifts.Blocks.BURNED_AMETHYST_CLUSTER = (BurnedAmethystCluster) new BlockRegisterer("burned_amethyst_cluster", Rifts.Blocks.BURNED_AMETHYST_CLUSTER)
                .register();
        Rifts.Blocks.CORRUPTED_ANCIENT_DEBRIS = (CorruptedAncientDebris) new BlockRegisterer("corrupted_ancient_debris", Rifts.Blocks.CORRUPTED_ANCIENT_DEBRIS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ANCIENT_DEBRIS);
        Rifts.Blocks.BURNED_ANCIENT_DEBRIS = (BurnedAncientDebris) new BlockRegisterer("burned_ancient_debris", Rifts.Blocks.BURNED_ANCIENT_DEBRIS)
                .register();
        Rifts.Blocks.CORRUPTED_ANDESITE = (CorruptedAndesite) new BlockRegisterer("corrupted_andesite", Rifts.Blocks.CORRUPTED_ANDESITE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ANDESITE);
        Rifts.Blocks.BURNED_ANDESITE = (BurnedAndesite) new BlockRegisterer("burned_andesite", Rifts.Blocks.BURNED_ANDESITE)
                .register();
        Rifts.Blocks.CORRUPTED_ANVIL = (CorruptedAnvil) new BlockRegisterer("corrupted_anvil", Rifts.Blocks.CORRUPTED_ANVIL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ANVIL);
        Rifts.Blocks.BURNED_ANVIL = (BurnedAnvil) new BlockRegisterer("burned_anvil", Rifts.Blocks.BURNED_ANVIL)
                .register();
        Rifts.Blocks.CORRUPTED_ATTACHED_MELON_STEM = (CorruptedAttachedMelonStem) new BlockRegisterer("corrupted_attached_melon_stem", Rifts.Blocks.CORRUPTED_ATTACHED_MELON_STEM)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ATTACHED_MELON_STEM);
        Rifts.Blocks.BURNED_ATTACHED_MELON_STEM = (BurnedAttachedMelonStem) new BlockRegisterer("burned_attached_melon_stem", Rifts.Blocks.BURNED_ATTACHED_MELON_STEM)
                .register();
        Rifts.Blocks.CORRUPTED_ATTACHED_PUMPKIN_STEM = (CorruptedAttachedPumpkinStem) new BlockRegisterer("corrupted_attached_pumpkin_stem", Rifts.Blocks.CORRUPTED_ATTACHED_PUMPKIN_STEM)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ATTACHED_PUMPKIN_STEM);
        Rifts.Blocks.BURNED_ATTACHED_PUMPKIN_STEM = (BurnedAttachedPumpkinStem) new BlockRegisterer("burned_attached_pumpkin_stem", Rifts.Blocks.BURNED_ATTACHED_PUMPKIN_STEM)
                .register();
        Rifts.Blocks.CORRUPTED_AZALEA = (CorruptedAzalea) new BlockRegisterer("corrupted_azalea", Rifts.Blocks.CORRUPTED_AZALEA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_AZALEA);
        Rifts.Blocks.BURNED_AZALEA = (BurnedAzalea) new BlockRegisterer("burned_azalea", Rifts.Blocks.BURNED_AZALEA)
                .register();
        Rifts.Blocks.CORRUPTED_AZALEA_LEAVES = (CorruptedAzaleaLeaves) new BlockRegisterer("corrupted_azalea_leaves", Rifts.Blocks.CORRUPTED_AZALEA_LEAVES)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_AZALEA_LEAVES);
        Rifts.Blocks.BURNED_AZALEA_LEAVES = (BurnedAzaleaLeaves) new BlockRegisterer("burned_azalea_leaves", Rifts.Blocks.BURNED_AZALEA_LEAVES)
                .register();
        Rifts.Blocks.CORRUPTED_AZURE_BLUET = (CorruptedAzureBluet) new BlockRegisterer("corrupted_azure_bluet", Rifts.Blocks.CORRUPTED_AZURE_BLUET)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_AZURE_BLUET);
        Rifts.Blocks.BURNED_AZURE_BLUET = (BurnedAzureBluet) new BlockRegisterer("burned_azure_bluet", Rifts.Blocks.BURNED_AZURE_BLUET)
                .register();
        Rifts.Blocks.CORRUPTED_BARREL = (CorruptedBarrel) new BlockRegisterer("corrupted_barrel", Rifts.Blocks.CORRUPTED_BARREL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BARREL);
        Rifts.Blocks.BURNED_BARREL = (BurnedBarrel) new BlockRegisterer("burned_barrel", Rifts.Blocks.BURNED_BARREL)
                .register();
        Rifts.Blocks.CORRUPTED_BASALT = (CorruptedBasalt) new BlockRegisterer("corrupted_basalt", Rifts.Blocks.CORRUPTED_BASALT)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BASALT);
        Rifts.Blocks.BURNED_BASALT = (BurnedBasalt) new BlockRegisterer("burned_basalt", Rifts.Blocks.BURNED_BASALT)
                .register();
        Rifts.Blocks.CORRUPTED_BEACON = (CorruptedBeacon) new BlockRegisterer("corrupted_beacon", Rifts.Blocks.CORRUPTED_BEACON)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BEACON);
        Rifts.Blocks.BURNED_BEACON = (BurnedBeacon) new BlockRegisterer("burned_beacon", Rifts.Blocks.BURNED_BEACON)
                .register();
        Rifts.Blocks.CORRUPTED_BEDROCK = (CorruptedBedrock) new BlockRegisterer("corrupted_bedrock", Rifts.Blocks.CORRUPTED_BEDROCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BEDROCK);
        Rifts.Blocks.BURNED_BEDROCK = (BurnedBedrock) new BlockRegisterer("burned_bedrock", Rifts.Blocks.BURNED_BEDROCK)
                .register();
        Rifts.Blocks.CORRUPTED_BEEHIVE = (CorruptedBeehive) new BlockRegisterer("corrupted_beehive", Rifts.Blocks.CORRUPTED_BEEHIVE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BEEHIVE);
        Rifts.Blocks.BURNED_BEEHIVE = (BurnedBeehive) new BlockRegisterer("burned_beehive", Rifts.Blocks.BURNED_BEEHIVE)
                .register();
        Rifts.Blocks.CORRUPTED_BEE_NEST = (CorruptedBeeNest) new BlockRegisterer("corrupted_bee_nest", Rifts.Blocks.CORRUPTED_BEE_NEST)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BEE_NEST);
        Rifts.Blocks.BURNED_BEE_NEST = (BurnedBeeNest) new BlockRegisterer("burned_bee_nest", Rifts.Blocks.BURNED_BEE_NEST)
                .register();
        Rifts.Blocks.CORRUPTED_BIG_DRIPLEAF = (CorruptedBigDripleaf) new BlockRegisterer("corrupted_big_dripleaf", Rifts.Blocks.CORRUPTED_BIG_DRIPLEAF)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BIG_DRIPLEAF);
        Rifts.Blocks.BURNED_BIG_DRIPLEAF = (BurnedBigDripleaf) new BlockRegisterer("burned_big_dripleaf", Rifts.Blocks.BURNED_BIG_DRIPLEAF)
                .register();
        Rifts.Blocks.CORRUPTED_BIG_DRIPLEAF_STEM = (CorruptedBigDripleafStem) new BlockRegisterer("corrupted_big_dripleaf_stem", Rifts.Blocks.CORRUPTED_BIG_DRIPLEAF_STEM)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BIG_DRIPLEAF_STEM);
        Rifts.Blocks.BURNED_BIG_DRIPLEAF_STEM = (BurnedBigDripleafStem) new BlockRegisterer("burned_big_dripleaf_stem", Rifts.Blocks.BURNED_BIG_DRIPLEAF_STEM)
                .register();
        Rifts.Blocks.CORRUPTED_BIRCH_LEAVES = (CorruptedBirchLeaves) new BlockRegisterer("corrupted_birch_leaves", Rifts.Blocks.CORRUPTED_BIRCH_LEAVES)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BIRCH_LEAVES);
        Rifts.Blocks.BURNED_BIRCH_LEAVES = (BurnedBirchLeaves) new BlockRegisterer("burned_birch_leaves", Rifts.Blocks.BURNED_BIRCH_LEAVES)
                .register();
        Rifts.Blocks.CORRUPTED_BIRCH_LOG = (CorruptedBirchLog) new BlockRegisterer("corrupted_birch_log", Rifts.Blocks.CORRUPTED_BIRCH_LOG)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BIRCH_LOG);
        Rifts.Blocks.BURNED_BIRCH_LOG = (BurnedBirchLog) new BlockRegisterer("burned_birch_log", Rifts.Blocks.BURNED_BIRCH_LOG)
                .register();
        Rifts.Blocks.CORRUPTED_BIRCH_PLANKS = (CorruptedBirchPlanks) new BlockRegisterer("corrupted_birch_planks", Rifts.Blocks.CORRUPTED_BIRCH_PLANKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BIRCH_PLANKS);
        Rifts.Blocks.BURNED_BIRCH_PLANKS = (BurnedBirchPlanks) new BlockRegisterer("burned_birch_planks", Rifts.Blocks.BURNED_BIRCH_PLANKS)
                .register();
        Rifts.Blocks.CORRUPTED_BIRCH_SAPLING = (CorruptedBirchSapling) new BlockRegisterer("corrupted_birch_sapling", Rifts.Blocks.CORRUPTED_BIRCH_SAPLING)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BIRCH_SAPLING);
        Rifts.Blocks.BURNED_BIRCH_SAPLING = (BurnedBirchSapling) new BlockRegisterer("burned_birch_sapling", Rifts.Blocks.BURNED_BIRCH_SAPLING)
                .register();
        Rifts.Blocks.CORRUPTED_BLACKSTONE = (CorruptedBlackstone) new BlockRegisterer("corrupted_blackstone", Rifts.Blocks.CORRUPTED_BLACKSTONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BLACKSTONE);
        Rifts.Blocks.BURNED_BLACKSTONE = (BurnedBlackstone) new BlockRegisterer("burned_blackstone", Rifts.Blocks.BURNED_BLACKSTONE)
                .register();
        Rifts.Blocks.CORRUPTED_BLACK_CONCRETE = (CorruptedBlackConcrete) new BlockRegisterer("corrupted_black_concrete", Rifts.Blocks.CORRUPTED_BLACK_CONCRETE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BLACK_CONCRETE);
        Rifts.Blocks.BURNED_BLACK_CONCRETE = (BurnedBlackConcrete) new BlockRegisterer("burned_black_concrete", Rifts.Blocks.BURNED_BLACK_CONCRETE)
                .register();
        Rifts.Blocks.CORRUPTED_BLACK_CONCRETE_POWDER = (CorruptedBlackConcretePowder) new BlockRegisterer("corrupted_black_concrete_powder", Rifts.Blocks.CORRUPTED_BLACK_CONCRETE_POWDER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BLACK_CONCRETE_POWDER);
        Rifts.Blocks.BURNED_BLACK_CONCRETE_POWDER = (BurnedBlackConcretePowder) new BlockRegisterer("burned_black_concrete_powder", Rifts.Blocks.BURNED_BLACK_CONCRETE_POWDER)
                .register();
        Rifts.Blocks.CORRUPTED_BLACK_GLAZED_TERRACOTTA = (CorruptedBlackGlazedTerracotta) new BlockRegisterer("corrupted_black_glazed_terracotta", Rifts.Blocks.CORRUPTED_BLACK_GLAZED_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BLACK_GLAZED_TERRACOTTA);
        Rifts.Blocks.BURNED_BLACK_GLAZED_TERRACOTTA = (BurnedBlackGlazedTerracotta) new BlockRegisterer("burned_black_glazed_terracotta", Rifts.Blocks.BURNED_BLACK_GLAZED_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_BLACK_SHULKER_BOX = (CorruptedBlackShulkerBox) new BlockRegisterer("corrupted_black_shulker_box", Rifts.Blocks.CORRUPTED_BLACK_SHULKER_BOX)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BLACK_SHULKER_BOX);
        Rifts.Blocks.BURNED_BLACK_SHULKER_BOX = (BurnedBlackShulkerBox) new BlockRegisterer("burned_black_shulker_box", Rifts.Blocks.BURNED_BLACK_SHULKER_BOX)
                .register();
        Rifts.Blocks.CORRUPTED_BLACK_STAINED_GLASS = (CorruptedBlackStainedGlass) new BlockRegisterer("corrupted_black_stained_glass", Rifts.Blocks.CORRUPTED_BLACK_STAINED_GLASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BLACK_STAINED_GLASS);
        Rifts.Blocks.BURNED_BLACK_STAINED_GLASS = (BurnedBlackStainedGlass) new BlockRegisterer("burned_black_stained_glass", Rifts.Blocks.BURNED_BLACK_STAINED_GLASS)
                .register();
        Rifts.Blocks.CORRUPTED_BLACK_TERRACOTTA = (CorruptedBlackTerracotta) new BlockRegisterer("corrupted_black_terracotta", Rifts.Blocks.CORRUPTED_BLACK_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BLACK_TERRACOTTA);
        Rifts.Blocks.BURNED_BLACK_TERRACOTTA = (BurnedBlackTerracotta) new BlockRegisterer("burned_black_terracotta", Rifts.Blocks.BURNED_BLACK_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_BLACK_WOOL = (CorruptedBlackWool) new BlockRegisterer("corrupted_black_wool", Rifts.Blocks.CORRUPTED_BLACK_WOOL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BLACK_WOOL);
        Rifts.Blocks.BURNED_BLACK_WOOL = (BurnedBlackWool) new BlockRegisterer("burned_black_wool", Rifts.Blocks.BURNED_BLACK_WOOL)
                .register();
        Rifts.Blocks.CORRUPTED_BLAST_FURNACE = (CorruptedBlastFurnace) new BlockRegisterer("corrupted_blast_furnace", Rifts.Blocks.CORRUPTED_BLAST_FURNACE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BLAST_FURNACE);
        Rifts.Blocks.BURNED_BLAST_FURNACE = (BurnedBlastFurnace) new BlockRegisterer("burned_blast_furnace", Rifts.Blocks.BURNED_BLAST_FURNACE)
                .register();
        Rifts.Blocks.CORRUPTED_BLUE_CONCRETE = (CorruptedBlueConcrete) new BlockRegisterer("corrupted_blue_concrete", Rifts.Blocks.CORRUPTED_BLUE_CONCRETE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BLUE_CONCRETE);
        Rifts.Blocks.BURNED_BLUE_CONCRETE = (BurnedBlueConcrete) new BlockRegisterer("burned_blue_concrete", Rifts.Blocks.BURNED_BLUE_CONCRETE)
                .register();
        Rifts.Blocks.CORRUPTED_BLUE_CONCRETE_POWDER = (CorruptedBlueConcretePowder) new BlockRegisterer("corrupted_blue_concrete_powder", Rifts.Blocks.CORRUPTED_BLUE_CONCRETE_POWDER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BLUE_CONCRETE_POWDER);
        Rifts.Blocks.BURNED_BLUE_CONCRETE_POWDER = (BurnedBlueConcretePowder) new BlockRegisterer("burned_blue_concrete_powder", Rifts.Blocks.BURNED_BLUE_CONCRETE_POWDER)
                .register();
        Rifts.Blocks.CORRUPTED_BLUE_GLAZED_TERRACOTTA = (CorruptedBlueGlazedTerracotta) new BlockRegisterer("corrupted_blue_glazed_terracotta", Rifts.Blocks.CORRUPTED_BLUE_GLAZED_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BLUE_GLAZED_TERRACOTTA);
        Rifts.Blocks.BURNED_BLUE_GLAZED_TERRACOTTA = (BurnedBlueGlazedTerracotta) new BlockRegisterer("burned_blue_glazed_terracotta", Rifts.Blocks.BURNED_BLUE_GLAZED_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_BLUE_ICE = (CorruptedBlueIce) new BlockRegisterer("corrupted_blue_ice", Rifts.Blocks.CORRUPTED_BLUE_ICE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BLUE_ICE);
        Rifts.Blocks.BURNED_BLUE_ICE = (BurnedBlueIce) new BlockRegisterer("burned_blue_ice", Rifts.Blocks.BURNED_BLUE_ICE)
                .register();
        Rifts.Blocks.CORRUPTED_BLUE_ORCHID = (CorruptedBlueOrchid) new BlockRegisterer("corrupted_blue_orchid", Rifts.Blocks.CORRUPTED_BLUE_ORCHID)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BLUE_ORCHID);
        Rifts.Blocks.BURNED_BLUE_ORCHID = (BurnedBlueOrchid) new BlockRegisterer("burned_blue_orchid", Rifts.Blocks.BURNED_BLUE_ORCHID)
                .register();
        Rifts.Blocks.CORRUPTED_BLUE_SHULKER_BOX = (CorruptedBlueShulkerBox) new BlockRegisterer("corrupted_blue_shulker_box", Rifts.Blocks.CORRUPTED_BLUE_SHULKER_BOX)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BLUE_SHULKER_BOX);
        Rifts.Blocks.BURNED_BLUE_SHULKER_BOX = (BurnedBlueShulkerBox) new BlockRegisterer("burned_blue_shulker_box", Rifts.Blocks.BURNED_BLUE_SHULKER_BOX)
                .register();
        Rifts.Blocks.CORRUPTED_BLUE_STAINED_GLASS = (CorruptedBlueStainedGlass) new BlockRegisterer("corrupted_blue_stained_glass", Rifts.Blocks.CORRUPTED_BLUE_STAINED_GLASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BLUE_STAINED_GLASS);
        Rifts.Blocks.BURNED_BLUE_STAINED_GLASS = (BurnedBlueStainedGlass) new BlockRegisterer("burned_blue_stained_glass", Rifts.Blocks.BURNED_BLUE_STAINED_GLASS)
                .register();
        Rifts.Blocks.CORRUPTED_BLUE_TERRACOTTA = (CorruptedBlueTerracotta) new BlockRegisterer("corrupted_blue_terracotta", Rifts.Blocks.CORRUPTED_BLUE_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BLUE_TERRACOTTA);
        Rifts.Blocks.BURNED_BLUE_TERRACOTTA = (BurnedBlueTerracotta) new BlockRegisterer("burned_blue_terracotta", Rifts.Blocks.BURNED_BLUE_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_BLUE_WOOL = (CorruptedBlueWool) new BlockRegisterer("corrupted_blue_wool", Rifts.Blocks.CORRUPTED_BLUE_WOOL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BLUE_WOOL);
        Rifts.Blocks.BURNED_BLUE_WOOL = (BurnedBlueWool) new BlockRegisterer("burned_blue_wool", Rifts.Blocks.BURNED_BLUE_WOOL)
                .register();
        Rifts.Blocks.CORRUPTED_BONE_BLOCK = (CorruptedBoneBlock) new BlockRegisterer("corrupted_bone_block", Rifts.Blocks.CORRUPTED_BONE_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BONE_BLOCK);
        Rifts.Blocks.BURNED_BONE_BLOCK = (BurnedBoneBlock) new BlockRegisterer("burned_bone_block", Rifts.Blocks.BURNED_BONE_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_BOOKSHELF = (CorruptedBookshelf) new BlockRegisterer("corrupted_bookshelf", Rifts.Blocks.CORRUPTED_BOOKSHELF)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BOOKSHELF);
        Rifts.Blocks.BURNED_BOOKSHELF = (BurnedBookshelf) new BlockRegisterer("burned_bookshelf", Rifts.Blocks.BURNED_BOOKSHELF)
                .register();
        Rifts.Blocks.CORRUPTED_BRAIN_CORAL = (CorruptedBrainCoral) new BlockRegisterer("corrupted_brain_coral", Rifts.Blocks.CORRUPTED_BRAIN_CORAL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BRAIN_CORAL);
        Rifts.Blocks.BURNED_BRAIN_CORAL = (BurnedBrainCoral) new BlockRegisterer("burned_brain_coral", Rifts.Blocks.BURNED_BRAIN_CORAL)
                .register();
        Rifts.Blocks.CORRUPTED_BRAIN_CORAL_BLOCK = (CorruptedBrainCoralBlock) new BlockRegisterer("corrupted_brain_coral_block", Rifts.Blocks.CORRUPTED_BRAIN_CORAL_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BRAIN_CORAL_BLOCK);
        Rifts.Blocks.BURNED_BRAIN_CORAL_BLOCK = (BurnedBrainCoralBlock) new BlockRegisterer("burned_brain_coral_block", Rifts.Blocks.BURNED_BRAIN_CORAL_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_BRAIN_CORAL_FAN = (CorruptedBrainCoralFan) new BlockRegisterer("corrupted_brain_coral_fan", Rifts.Blocks.CORRUPTED_BRAIN_CORAL_FAN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BRAIN_CORAL_FAN);
        Rifts.Blocks.BURNED_BRAIN_CORAL_FAN = (BurnedBrainCoralFan) new BlockRegisterer("burned_brain_coral_fan", Rifts.Blocks.BURNED_BRAIN_CORAL_FAN)
                .register();
        Rifts.Blocks.CORRUPTED_BREWING_STAND = (CorruptedBrewingStand) new BlockRegisterer("corrupted_brewing_stand", Rifts.Blocks.CORRUPTED_BREWING_STAND)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BREWING_STAND);
        Rifts.Blocks.BURNED_BREWING_STAND = (BurnedBrewingStand) new BlockRegisterer("burned_brewing_stand", Rifts.Blocks.BURNED_BREWING_STAND)
                .register();
        Rifts.Blocks.CORRUPTED_BRICKS = (CorruptedBricks) new BlockRegisterer("corrupted_bricks", Rifts.Blocks.CORRUPTED_BRICKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BRICKS);
        Rifts.Blocks.BURNED_BRICKS = (BurnedBricks) new BlockRegisterer("burned_bricks", Rifts.Blocks.BURNED_BRICKS)
                .register();
        Rifts.Blocks.CORRUPTED_BROWN_CONCRETE = (CorruptedBrownConcrete) new BlockRegisterer("corrupted_brown_concrete", Rifts.Blocks.CORRUPTED_BROWN_CONCRETE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BROWN_CONCRETE);
        Rifts.Blocks.BURNED_BROWN_CONCRETE = (BurnedBrownConcrete) new BlockRegisterer("burned_brown_concrete", Rifts.Blocks.BURNED_BROWN_CONCRETE)
                .register();
        Rifts.Blocks.CORRUPTED_BROWN_CONCRETE_POWDER = (CorruptedBrownConcretePowder) new BlockRegisterer("corrupted_brown_concrete_powder", Rifts.Blocks.CORRUPTED_BROWN_CONCRETE_POWDER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BROWN_CONCRETE_POWDER);
        Rifts.Blocks.BURNED_BROWN_CONCRETE_POWDER = (BurnedBrownConcretePowder) new BlockRegisterer("burned_brown_concrete_powder", Rifts.Blocks.BURNED_BROWN_CONCRETE_POWDER)
                .register();
        Rifts.Blocks.CORRUPTED_BROWN_GLAZED_TERRACOTTA = (CorruptedBrownGlazedTerracotta) new BlockRegisterer("corrupted_brown_glazed_terracotta", Rifts.Blocks.CORRUPTED_BROWN_GLAZED_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BROWN_GLAZED_TERRACOTTA);
        Rifts.Blocks.BURNED_BROWN_GLAZED_TERRACOTTA = (BurnedBrownGlazedTerracotta) new BlockRegisterer("burned_brown_glazed_terracotta", Rifts.Blocks.BURNED_BROWN_GLAZED_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_BROWN_MUSHROOM = (CorruptedBrownMushroom) new BlockRegisterer("corrupted_brown_mushroom", Rifts.Blocks.CORRUPTED_BROWN_MUSHROOM)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BROWN_MUSHROOM);
        Rifts.Blocks.BURNED_BROWN_MUSHROOM = (BurnedBrownMushroom) new BlockRegisterer("burned_brown_mushroom", Rifts.Blocks.BURNED_BROWN_MUSHROOM)
                .register();
        Rifts.Blocks.CORRUPTED_BROWN_MUSHROOM_BLOCK = (CorruptedBrownMushroomBlock) new BlockRegisterer("corrupted_brown_mushroom_block", Rifts.Blocks.CORRUPTED_BROWN_MUSHROOM_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BROWN_MUSHROOM_BLOCK);
        Rifts.Blocks.BURNED_BROWN_MUSHROOM_BLOCK = (BurnedBrownMushroomBlock) new BlockRegisterer("burned_brown_mushroom_block", Rifts.Blocks.BURNED_BROWN_MUSHROOM_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_BROWN_SHULKER_BOX = (CorruptedBrownShulkerBox) new BlockRegisterer("corrupted_brown_shulker_box", Rifts.Blocks.CORRUPTED_BROWN_SHULKER_BOX)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BROWN_SHULKER_BOX);
        Rifts.Blocks.BURNED_BROWN_SHULKER_BOX = (BurnedBrownShulkerBox) new BlockRegisterer("burned_brown_shulker_box", Rifts.Blocks.BURNED_BROWN_SHULKER_BOX)
                .register();
        Rifts.Blocks.CORRUPTED_BROWN_STAINED_GLASS = (CorruptedBrownStainedGlass) new BlockRegisterer("corrupted_brown_stained_glass", Rifts.Blocks.CORRUPTED_BROWN_STAINED_GLASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BROWN_STAINED_GLASS);
        Rifts.Blocks.BURNED_BROWN_STAINED_GLASS = (BurnedBrownStainedGlass) new BlockRegisterer("burned_brown_stained_glass", Rifts.Blocks.BURNED_BROWN_STAINED_GLASS)
                .register();
        Rifts.Blocks.CORRUPTED_BROWN_TERRACOTTA = (CorruptedBrownTerracotta) new BlockRegisterer("corrupted_brown_terracotta", Rifts.Blocks.CORRUPTED_BROWN_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BROWN_TERRACOTTA);
        Rifts.Blocks.BURNED_BROWN_TERRACOTTA = (BurnedBrownTerracotta) new BlockRegisterer("burned_brown_terracotta", Rifts.Blocks.BURNED_BROWN_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_BROWN_WOOL = (CorruptedBrownWool) new BlockRegisterer("corrupted_brown_wool", Rifts.Blocks.CORRUPTED_BROWN_WOOL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BROWN_WOOL);
        Rifts.Blocks.BURNED_BROWN_WOOL = (BurnedBrownWool) new BlockRegisterer("burned_brown_wool", Rifts.Blocks.BURNED_BROWN_WOOL)
                .register();
        Rifts.Blocks.CORRUPTED_BUBBLE_CORAL = (CorruptedBubbleCoral) new BlockRegisterer("corrupted_bubble_coral", Rifts.Blocks.CORRUPTED_BUBBLE_CORAL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BUBBLE_CORAL);
        Rifts.Blocks.BURNED_BUBBLE_CORAL = (BurnedBubbleCoral) new BlockRegisterer("burned_bubble_coral", Rifts.Blocks.BURNED_BUBBLE_CORAL)
                .register();
        Rifts.Blocks.CORRUPTED_BUBBLE_CORAL_BLOCK = (CorruptedBubbleCoralBlock) new BlockRegisterer("corrupted_bubble_coral_block", Rifts.Blocks.CORRUPTED_BUBBLE_CORAL_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BUBBLE_CORAL_BLOCK);
        Rifts.Blocks.BURNED_BUBBLE_CORAL_BLOCK = (BurnedBubbleCoralBlock) new BlockRegisterer("burned_bubble_coral_block", Rifts.Blocks.BURNED_BUBBLE_CORAL_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_BUBBLE_CORAL_FAN = (CorruptedBubbleCoralFan) new BlockRegisterer("corrupted_bubble_coral_fan", Rifts.Blocks.CORRUPTED_BUBBLE_CORAL_FAN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BUBBLE_CORAL_FAN);
        Rifts.Blocks.BURNED_BUBBLE_CORAL_FAN = (BurnedBubbleCoralFan) new BlockRegisterer("burned_bubble_coral_fan", Rifts.Blocks.BURNED_BUBBLE_CORAL_FAN)
                .register();
        Rifts.Blocks.CORRUPTED_BUDDING_AMETHYST = (CorruptedBuddingAmethyst) new BlockRegisterer("corrupted_budding_amethyst", Rifts.Blocks.CORRUPTED_BUDDING_AMETHYST)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_BUDDING_AMETHYST);
        Rifts.Blocks.BURNED_BUDDING_AMETHYST = (BurnedBuddingAmethyst) new BlockRegisterer("burned_budding_amethyst", Rifts.Blocks.BURNED_BUDDING_AMETHYST)
                .register();
        Rifts.Blocks.CORRUPTED_CACTUS = (CorruptedCactus) new BlockRegisterer("corrupted_cactus", Rifts.Blocks.CORRUPTED_CACTUS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CACTUS);
        Rifts.Blocks.BURNED_CACTUS = (BurnedCactus) new BlockRegisterer("burned_cactus", Rifts.Blocks.BURNED_CACTUS)
                .register();
        Rifts.Blocks.CORRUPTED_CAKE = (CorruptedCake) new BlockRegisterer("corrupted_cake", Rifts.Blocks.CORRUPTED_CAKE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CAKE);
        Rifts.Blocks.BURNED_CAKE = (BurnedCake) new BlockRegisterer("burned_cake", Rifts.Blocks.BURNED_CAKE)
                .register();
        Rifts.Blocks.CORRUPTED_CALCITE = (CorruptedCalcite) new BlockRegisterer("corrupted_calcite", Rifts.Blocks.CORRUPTED_CALCITE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CALCITE);
        Rifts.Blocks.BURNED_CALCITE = (BurnedCalcite) new BlockRegisterer("burned_calcite", Rifts.Blocks.BURNED_CALCITE)
                .register();
        Rifts.Blocks.CORRUPTED_CAMPFIRE = (CorruptedCampfire) new BlockRegisterer("corrupted_campfire", Rifts.Blocks.CORRUPTED_CAMPFIRE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CAMPFIRE);
        Rifts.Blocks.BURNED_CAMPFIRE = (BurnedCampfire) new BlockRegisterer("burned_campfire", Rifts.Blocks.BURNED_CAMPFIRE)
                .register();
        Rifts.Blocks.CORRUPTED_CARTOGRAPHY_TABLE = (CorruptedCartographyTable) new BlockRegisterer("corrupted_cartography_table", Rifts.Blocks.CORRUPTED_CARTOGRAPHY_TABLE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CARTOGRAPHY_TABLE);
        Rifts.Blocks.BURNED_CARTOGRAPHY_TABLE = (BurnedCartographyTable) new BlockRegisterer("burned_cartography_table", Rifts.Blocks.BURNED_CARTOGRAPHY_TABLE)
                .register();
        Rifts.Blocks.CORRUPTED_CARVED_PUMPKIN = (CorruptedCarvedPumpkin) new BlockRegisterer("corrupted_carved_pumpkin", Rifts.Blocks.CORRUPTED_CARVED_PUMPKIN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CARVED_PUMPKIN);
        Rifts.Blocks.BURNED_CARVED_PUMPKIN = (BurnedCarvedPumpkin) new BlockRegisterer("burned_carved_pumpkin", Rifts.Blocks.BURNED_CARVED_PUMPKIN)
                .register();
        Rifts.Blocks.CORRUPTED_CAULDRON = (CorruptedCauldron) new BlockRegisterer("corrupted_cauldron", Rifts.Blocks.CORRUPTED_CAULDRON)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CAULDRON);
        Rifts.Blocks.BURNED_CAULDRON = (BurnedCauldron) new BlockRegisterer("burned_cauldron", Rifts.Blocks.BURNED_CAULDRON)
                .register();
        Rifts.Blocks.CORRUPTED_CAVE_VINES = (CorruptedCaveVines) new BlockRegisterer("corrupted_cave_vines", Rifts.Blocks.CORRUPTED_CAVE_VINES)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CAVE_VINES);
        Rifts.Blocks.BURNED_CAVE_VINES = (BurnedCaveVines) new BlockRegisterer("burned_cave_vines", Rifts.Blocks.BURNED_CAVE_VINES)
                .register();
        Rifts.Blocks.CORRUPTED_CAVE_VINES_PLANT = (CorruptedCaveVinesPlant) new BlockRegisterer("corrupted_cave_vines_plant", Rifts.Blocks.CORRUPTED_CAVE_VINES_PLANT)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CAVE_VINES_PLANT);
        Rifts.Blocks.BURNED_CAVE_VINES_PLANT = (BurnedCaveVinesPlant) new BlockRegisterer("burned_cave_vines_plant", Rifts.Blocks.BURNED_CAVE_VINES_PLANT)
                .register();
        Rifts.Blocks.CORRUPTED_CHAIN = (CorruptedChain) new BlockRegisterer("corrupted_chain", Rifts.Blocks.CORRUPTED_CHAIN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CHAIN);
        Rifts.Blocks.BURNED_CHAIN = (BurnedChain) new BlockRegisterer("burned_chain", Rifts.Blocks.BURNED_CHAIN)
                .register();
        Rifts.Blocks.CORRUPTED_CHAIN_COMMAND_BLOCK = (CorruptedChainCommandBlock) new BlockRegisterer("corrupted_chain_command_block", Rifts.Blocks.CORRUPTED_CHAIN_COMMAND_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CHAIN_COMMAND_BLOCK);
        Rifts.Blocks.BURNED_CHAIN_COMMAND_BLOCK = (BurnedChainCommandBlock) new BlockRegisterer("burned_chain_command_block", Rifts.Blocks.BURNED_CHAIN_COMMAND_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_CHIPPED_ANVIL = (CorruptedChippedAnvil) new BlockRegisterer("corrupted_chipped_anvil", Rifts.Blocks.CORRUPTED_CHIPPED_ANVIL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CHIPPED_ANVIL);
        Rifts.Blocks.BURNED_CHIPPED_ANVIL = (BurnedChippedAnvil) new BlockRegisterer("burned_chipped_anvil", Rifts.Blocks.BURNED_CHIPPED_ANVIL)
                .register();
        Rifts.Blocks.CORRUPTED_CHISELED_DEEPSLATE = (CorruptedChiseledDeepslate) new BlockRegisterer("corrupted_chiseled_deepslate", Rifts.Blocks.CORRUPTED_CHISELED_DEEPSLATE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CHISELED_DEEPSLATE);
        Rifts.Blocks.BURNED_CHISELED_DEEPSLATE = (BurnedChiseledDeepslate) new BlockRegisterer("burned_chiseled_deepslate", Rifts.Blocks.BURNED_CHISELED_DEEPSLATE)
                .register();
        Rifts.Blocks.CORRUPTED_CHISELED_NETHER_BRICKS = (CorruptedChiseledNetherBricks) new BlockRegisterer("corrupted_chiseled_nether_bricks", Rifts.Blocks.CORRUPTED_CHISELED_NETHER_BRICKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CHISELED_NETHER_BRICKS);
        Rifts.Blocks.BURNED_CHISELED_NETHER_BRICKS = (BurnedChiseledNetherBricks) new BlockRegisterer("burned_chiseled_nether_bricks", Rifts.Blocks.BURNED_CHISELED_NETHER_BRICKS)
                .register();
        Rifts.Blocks.CORRUPTED_CHISELED_POLISHED_BLACKSTONE = (CorruptedChiseledPolishedBlackstone) new BlockRegisterer("corrupted_chiseled_polished_blackstone", Rifts.Blocks.CORRUPTED_CHISELED_POLISHED_BLACKSTONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CHISELED_POLISHED_BLACKSTONE);
        Rifts.Blocks.BURNED_CHISELED_POLISHED_BLACKSTONE = (BurnedChiseledPolishedBlackstone) new BlockRegisterer("burned_chiseled_polished_blackstone", Rifts.Blocks.BURNED_CHISELED_POLISHED_BLACKSTONE)
                .register();
        Rifts.Blocks.CORRUPTED_CHISELED_QUARTZ_BLOCK = (CorruptedChiseledQuartzBlock) new BlockRegisterer("corrupted_chiseled_quartz_block", Rifts.Blocks.CORRUPTED_CHISELED_QUARTZ_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CHISELED_QUARTZ_BLOCK);
        Rifts.Blocks.BURNED_CHISELED_QUARTZ_BLOCK = (BurnedChiseledQuartzBlock) new BlockRegisterer("burned_chiseled_quartz_block", Rifts.Blocks.BURNED_CHISELED_QUARTZ_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_CHISELED_RED_SANDSTONE = (CorruptedChiseledRedSandstone) new BlockRegisterer("corrupted_chiseled_red_sandstone", Rifts.Blocks.CORRUPTED_CHISELED_RED_SANDSTONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CHISELED_RED_SANDSTONE);
        Rifts.Blocks.BURNED_CHISELED_RED_SANDSTONE = (BurnedChiseledRedSandstone) new BlockRegisterer("burned_chiseled_red_sandstone", Rifts.Blocks.BURNED_CHISELED_RED_SANDSTONE)
                .register();
        Rifts.Blocks.CORRUPTED_CHISELED_SANDSTONE = (CorruptedChiseledSandstone) new BlockRegisterer("corrupted_chiseled_sandstone", Rifts.Blocks.CORRUPTED_CHISELED_SANDSTONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CHISELED_SANDSTONE);
        Rifts.Blocks.BURNED_CHISELED_SANDSTONE = (BurnedChiseledSandstone) new BlockRegisterer("burned_chiseled_sandstone", Rifts.Blocks.BURNED_CHISELED_SANDSTONE)
                .register();
        Rifts.Blocks.CORRUPTED_CHISELED_STONE_BRICKS = (CorruptedChiseledStoneBricks) new BlockRegisterer("corrupted_chiseled_stone_bricks", Rifts.Blocks.CORRUPTED_CHISELED_STONE_BRICKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CHISELED_STONE_BRICKS);
        Rifts.Blocks.BURNED_CHISELED_STONE_BRICKS = (BurnedChiseledStoneBricks) new BlockRegisterer("burned_chiseled_stone_bricks", Rifts.Blocks.BURNED_CHISELED_STONE_BRICKS)
                .register();
        Rifts.Blocks.CORRUPTED_CHORUS_FLOWER = (CorruptedChorusFlower) new BlockRegisterer("corrupted_chorus_flower", Rifts.Blocks.CORRUPTED_CHORUS_FLOWER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CHORUS_FLOWER);
        Rifts.Blocks.BURNED_CHORUS_FLOWER = (BurnedChorusFlower) new BlockRegisterer("burned_chorus_flower", Rifts.Blocks.BURNED_CHORUS_FLOWER)
                .register();
        Rifts.Blocks.CORRUPTED_CHORUS_PLANT = (CorruptedChorusPlant) new BlockRegisterer("corrupted_chorus_plant", Rifts.Blocks.CORRUPTED_CHORUS_PLANT)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CHORUS_PLANT);
        Rifts.Blocks.BURNED_CHORUS_PLANT = (BurnedChorusPlant) new BlockRegisterer("burned_chorus_plant", Rifts.Blocks.BURNED_CHORUS_PLANT)
                .register();
        Rifts.Blocks.CORRUPTED_CLAY = (CorruptedClay) new BlockRegisterer("corrupted_clay", Rifts.Blocks.CORRUPTED_CLAY)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CLAY);
        Rifts.Blocks.BURNED_CLAY = (BurnedClay) new BlockRegisterer("burned_clay", Rifts.Blocks.BURNED_CLAY)
                .register();
        Rifts.Blocks.CORRUPTED_COAL_BLOCK = (CorruptedCoalBlock) new BlockRegisterer("corrupted_coal_block", Rifts.Blocks.CORRUPTED_COAL_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_COAL_BLOCK);
        Rifts.Blocks.BURNED_COAL_BLOCK = (BurnedCoalBlock) new BlockRegisterer("burned_coal_block", Rifts.Blocks.BURNED_COAL_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_COAL_ORE = (CorruptedCoalOre) new BlockRegisterer("corrupted_coal_ore", Rifts.Blocks.CORRUPTED_COAL_ORE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_COAL_ORE);
        Rifts.Blocks.BURNED_COAL_ORE = (BurnedCoalOre) new BlockRegisterer("burned_coal_ore", Rifts.Blocks.BURNED_COAL_ORE)
                .register();
        Rifts.Blocks.CORRUPTED_COARSE_DIRT = (CorruptedCoarseDirt) new BlockRegisterer("corrupted_coarse_dirt", Rifts.Blocks.CORRUPTED_COARSE_DIRT)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_COARSE_DIRT);
        Rifts.Blocks.BURNED_COARSE_DIRT = (BurnedCoarseDirt) new BlockRegisterer("burned_coarse_dirt", Rifts.Blocks.BURNED_COARSE_DIRT)
                .register();
        Rifts.Blocks.CORRUPTED_COBBLED_DEEPSLATE = (CorruptedCobbledDeepslate) new BlockRegisterer("corrupted_cobbled_deepslate", Rifts.Blocks.CORRUPTED_COBBLED_DEEPSLATE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_COBBLED_DEEPSLATE);
        Rifts.Blocks.BURNED_COBBLED_DEEPSLATE = (BurnedCobbledDeepslate) new BlockRegisterer("burned_cobbled_deepslate", Rifts.Blocks.BURNED_COBBLED_DEEPSLATE)
                .register();
        Rifts.Blocks.CORRUPTED_COBBLESTONE = (CorruptedCobblestone) new BlockRegisterer("corrupted_cobblestone", Rifts.Blocks.CORRUPTED_COBBLESTONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_COBBLESTONE);
        Rifts.Blocks.BURNED_COBBLESTONE = (BurnedCobblestone) new BlockRegisterer("burned_cobblestone", Rifts.Blocks.BURNED_COBBLESTONE)
                .register();
        Rifts.Blocks.CORRUPTED_COBWEB = (CorruptedCobweb) new BlockRegisterer("corrupted_cobweb", Rifts.Blocks.CORRUPTED_COBWEB)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_COBWEB);
        Rifts.Blocks.BURNED_COBWEB = (BurnedCobweb) new BlockRegisterer("burned_cobweb", Rifts.Blocks.BURNED_COBWEB)
                .register();
        Rifts.Blocks.CORRUPTED_COMMAND_BLOCK = (CorruptedCommandBlock) new BlockRegisterer("corrupted_command_block", Rifts.Blocks.CORRUPTED_COMMAND_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_COMMAND_BLOCK);
        Rifts.Blocks.BURNED_COMMAND_BLOCK = (BurnedCommandBlock) new BlockRegisterer("burned_command_block", Rifts.Blocks.BURNED_COMMAND_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_COMPARATOR = (CorruptedComparator) new BlockRegisterer("corrupted_comparator", Rifts.Blocks.CORRUPTED_COMPARATOR)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_COMPARATOR);
        Rifts.Blocks.BURNED_COMPARATOR = (BurnedComparator) new BlockRegisterer("burned_comparator", Rifts.Blocks.BURNED_COMPARATOR)
                .register();
        Rifts.Blocks.CORRUPTED_COMPOSTER = (CorruptedComposter) new BlockRegisterer("corrupted_composter", Rifts.Blocks.CORRUPTED_COMPOSTER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_COMPOSTER);
        Rifts.Blocks.BURNED_COMPOSTER = (BurnedComposter) new BlockRegisterer("burned_composter", Rifts.Blocks.BURNED_COMPOSTER)
                .register();
        Rifts.Blocks.CORRUPTED_CONDUIT = (CorruptedConduit) new BlockRegisterer("corrupted_conduit", Rifts.Blocks.CORRUPTED_CONDUIT)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CONDUIT);
        Rifts.Blocks.BURNED_CONDUIT = (BurnedConduit) new BlockRegisterer("burned_conduit", Rifts.Blocks.BURNED_CONDUIT)
                .register();
        Rifts.Blocks.CORRUPTED_COPPER_BLOCK = (CorruptedCopperBlock) new BlockRegisterer("corrupted_copper_block", Rifts.Blocks.CORRUPTED_COPPER_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_COPPER_BLOCK);
        Rifts.Blocks.BURNED_COPPER_BLOCK = (BurnedCopperBlock) new BlockRegisterer("burned_copper_block", Rifts.Blocks.BURNED_COPPER_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_COPPER_ORE = (CorruptedCopperOre) new BlockRegisterer("corrupted_copper_ore", Rifts.Blocks.CORRUPTED_COPPER_ORE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_COPPER_ORE);
        Rifts.Blocks.BURNED_COPPER_ORE = (BurnedCopperOre) new BlockRegisterer("burned_copper_ore", Rifts.Blocks.BURNED_COPPER_ORE)
                .register();
        Rifts.Blocks.CORRUPTED_CORNFLOWER = (CorruptedCornflower) new BlockRegisterer("corrupted_cornflower", Rifts.Blocks.CORRUPTED_CORNFLOWER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CORNFLOWER);
        Rifts.Blocks.BURNED_CORNFLOWER = (BurnedCornflower) new BlockRegisterer("burned_cornflower", Rifts.Blocks.BURNED_CORNFLOWER)
                .register();
        Rifts.Blocks.CORRUPTED_CRACKED_DEEPSLATE_BRICKS = (CorruptedCrackedDeepslateBricks) new BlockRegisterer("corrupted_cracked_deepslate_bricks", Rifts.Blocks.CORRUPTED_CRACKED_DEEPSLATE_BRICKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CRACKED_DEEPSLATE_BRICKS);
        Rifts.Blocks.BURNED_CRACKED_DEEPSLATE_BRICKS = (BurnedCrackedDeepslateBricks) new BlockRegisterer("burned_cracked_deepslate_bricks", Rifts.Blocks.BURNED_CRACKED_DEEPSLATE_BRICKS)
                .register();
        Rifts.Blocks.CORRUPTED_CRACKED_DEEPSLATE_TILES = (CorruptedCrackedDeepslateTiles) new BlockRegisterer("corrupted_cracked_deepslate_tiles", Rifts.Blocks.CORRUPTED_CRACKED_DEEPSLATE_TILES)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CRACKED_DEEPSLATE_TILES);
        Rifts.Blocks.BURNED_CRACKED_DEEPSLATE_TILES = (BurnedCrackedDeepslateTiles) new BlockRegisterer("burned_cracked_deepslate_tiles", Rifts.Blocks.BURNED_CRACKED_DEEPSLATE_TILES)
                .register();
        Rifts.Blocks.CORRUPTED_CRACKED_NETHER_BRICKS = (CorruptedCrackedNetherBricks) new BlockRegisterer("corrupted_cracked_nether_bricks", Rifts.Blocks.CORRUPTED_CRACKED_NETHER_BRICKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CRACKED_NETHER_BRICKS);
        Rifts.Blocks.BURNED_CRACKED_NETHER_BRICKS = (BurnedCrackedNetherBricks) new BlockRegisterer("burned_cracked_nether_bricks", Rifts.Blocks.BURNED_CRACKED_NETHER_BRICKS)
                .register();
        Rifts.Blocks.CORRUPTED_CRACKED_POLISHED_BLACKSTONE_BRICKS = (CorruptedCrackedPolishedBlackstoneBricks) new BlockRegisterer("corrupted_cracked_polished_blackstone_bricks", Rifts.Blocks.CORRUPTED_CRACKED_POLISHED_BLACKSTONE_BRICKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CRACKED_POLISHED_BLACKSTONE_BRICKS);
        Rifts.Blocks.BURNED_CRACKED_POLISHED_BLACKSTONE_BRICKS = (BurnedCrackedPolishedBlackstoneBricks) new BlockRegisterer("burned_cracked_polished_blackstone_bricks", Rifts.Blocks.BURNED_CRACKED_POLISHED_BLACKSTONE_BRICKS)
                .register();
        Rifts.Blocks.CORRUPTED_CRACKED_STONE_BRICKS = (CorruptedCrackedStoneBricks) new BlockRegisterer("corrupted_cracked_stone_bricks", Rifts.Blocks.CORRUPTED_CRACKED_STONE_BRICKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CRACKED_STONE_BRICKS);
        Rifts.Blocks.BURNED_CRACKED_STONE_BRICKS = (BurnedCrackedStoneBricks) new BlockRegisterer("burned_cracked_stone_bricks", Rifts.Blocks.BURNED_CRACKED_STONE_BRICKS)
                .register();
        Rifts.Blocks.CORRUPTED_CRAFTING_TABLE = (CorruptedCraftingTable) new BlockRegisterer("corrupted_crafting_table", Rifts.Blocks.CORRUPTED_CRAFTING_TABLE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CRAFTING_TABLE);
        Rifts.Blocks.BURNED_CRAFTING_TABLE = (BurnedCraftingTable) new BlockRegisterer("burned_crafting_table", Rifts.Blocks.BURNED_CRAFTING_TABLE)
                .register();
        Rifts.Blocks.CORRUPTED_CRIMSON_FUNGUS = (CorruptedCrimsonFungus) new BlockRegisterer("corrupted_crimson_fungus", Rifts.Blocks.CORRUPTED_CRIMSON_FUNGUS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CRIMSON_FUNGUS);
        Rifts.Blocks.BURNED_CRIMSON_FUNGUS = (BurnedCrimsonFungus) new BlockRegisterer("burned_crimson_fungus", Rifts.Blocks.BURNED_CRIMSON_FUNGUS)
                .register();
        Rifts.Blocks.CORRUPTED_CRIMSON_NYLIUM = (CorruptedCrimsonNylium) new BlockRegisterer("corrupted_crimson_nylium", Rifts.Blocks.CORRUPTED_CRIMSON_NYLIUM)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CRIMSON_NYLIUM);
        Rifts.Blocks.BURNED_CRIMSON_NYLIUM = (BurnedCrimsonNylium) new BlockRegisterer("burned_crimson_nylium", Rifts.Blocks.BURNED_CRIMSON_NYLIUM)
                .register();
        Rifts.Blocks.CORRUPTED_CRIMSON_PLANKS = (CorruptedCrimsonPlanks) new BlockRegisterer("corrupted_crimson_planks", Rifts.Blocks.CORRUPTED_CRIMSON_PLANKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CRIMSON_PLANKS);
        Rifts.Blocks.BURNED_CRIMSON_PLANKS = (BurnedCrimsonPlanks) new BlockRegisterer("burned_crimson_planks", Rifts.Blocks.BURNED_CRIMSON_PLANKS)
                .register();
        Rifts.Blocks.CORRUPTED_CRIMSON_ROOTS = (CorruptedCrimsonRoots) new BlockRegisterer("corrupted_crimson_roots", Rifts.Blocks.CORRUPTED_CRIMSON_ROOTS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CRIMSON_ROOTS);
        Rifts.Blocks.BURNED_CRIMSON_ROOTS = (BurnedCrimsonRoots) new BlockRegisterer("burned_crimson_roots", Rifts.Blocks.BURNED_CRIMSON_ROOTS)
                .register();
        Rifts.Blocks.CORRUPTED_CRIMSON_STEM = (CorruptedCrimsonStem) new BlockRegisterer("corrupted_crimson_stem", Rifts.Blocks.CORRUPTED_CRIMSON_STEM)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CRIMSON_STEM);
        Rifts.Blocks.BURNED_CRIMSON_STEM = (BurnedCrimsonStem) new BlockRegisterer("burned_crimson_stem", Rifts.Blocks.BURNED_CRIMSON_STEM)
                .register();
        Rifts.Blocks.CORRUPTED_CRYING_OBSIDIAN = (CorruptedCryingObsidian) new BlockRegisterer("corrupted_crying_obsidian", Rifts.Blocks.CORRUPTED_CRYING_OBSIDIAN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CRYING_OBSIDIAN);
        Rifts.Blocks.BURNED_CRYING_OBSIDIAN = (BurnedCryingObsidian) new BlockRegisterer("burned_crying_obsidian", Rifts.Blocks.BURNED_CRYING_OBSIDIAN)
                .register();
        Rifts.Blocks.CORRUPTED_CUT_COPPER = (CorruptedCutCopper) new BlockRegisterer("corrupted_cut_copper", Rifts.Blocks.CORRUPTED_CUT_COPPER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CUT_COPPER);
        Rifts.Blocks.BURNED_CUT_COPPER = (BurnedCutCopper) new BlockRegisterer("burned_cut_copper", Rifts.Blocks.BURNED_CUT_COPPER)
                .register();
        Rifts.Blocks.CORRUPTED_CUT_RED_SANDSTONE = (CorruptedCutRedSandstone) new BlockRegisterer("corrupted_cut_red_sandstone", Rifts.Blocks.CORRUPTED_CUT_RED_SANDSTONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CUT_RED_SANDSTONE);
        Rifts.Blocks.BURNED_CUT_RED_SANDSTONE = (BurnedCutRedSandstone) new BlockRegisterer("burned_cut_red_sandstone", Rifts.Blocks.BURNED_CUT_RED_SANDSTONE)
                .register();
        Rifts.Blocks.CORRUPTED_CUT_SANDSTONE = (CorruptedCutSandstone) new BlockRegisterer("corrupted_cut_sandstone", Rifts.Blocks.CORRUPTED_CUT_SANDSTONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CUT_SANDSTONE);
        Rifts.Blocks.BURNED_CUT_SANDSTONE = (BurnedCutSandstone) new BlockRegisterer("burned_cut_sandstone", Rifts.Blocks.BURNED_CUT_SANDSTONE)
                .register();
        Rifts.Blocks.CORRUPTED_CYAN_CONCRETE = (CorruptedCyanConcrete) new BlockRegisterer("corrupted_cyan_concrete", Rifts.Blocks.CORRUPTED_CYAN_CONCRETE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CYAN_CONCRETE);
        Rifts.Blocks.BURNED_CYAN_CONCRETE = (BurnedCyanConcrete) new BlockRegisterer("burned_cyan_concrete", Rifts.Blocks.BURNED_CYAN_CONCRETE)
                .register();
        Rifts.Blocks.CORRUPTED_CYAN_CONCRETE_POWDER = (CorruptedCyanConcretePowder) new BlockRegisterer("corrupted_cyan_concrete_powder", Rifts.Blocks.CORRUPTED_CYAN_CONCRETE_POWDER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CYAN_CONCRETE_POWDER);
        Rifts.Blocks.BURNED_CYAN_CONCRETE_POWDER = (BurnedCyanConcretePowder) new BlockRegisterer("burned_cyan_concrete_powder", Rifts.Blocks.BURNED_CYAN_CONCRETE_POWDER)
                .register();
        Rifts.Blocks.CORRUPTED_CYAN_GLAZED_TERRACOTTA = (CorruptedCyanGlazedTerracotta) new BlockRegisterer("corrupted_cyan_glazed_terracotta", Rifts.Blocks.CORRUPTED_CYAN_GLAZED_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CYAN_GLAZED_TERRACOTTA);
        Rifts.Blocks.BURNED_CYAN_GLAZED_TERRACOTTA = (BurnedCyanGlazedTerracotta) new BlockRegisterer("burned_cyan_glazed_terracotta", Rifts.Blocks.BURNED_CYAN_GLAZED_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_CYAN_SHULKER_BOX = (CorruptedCyanShulkerBox) new BlockRegisterer("corrupted_cyan_shulker_box", Rifts.Blocks.CORRUPTED_CYAN_SHULKER_BOX)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CYAN_SHULKER_BOX);
        Rifts.Blocks.BURNED_CYAN_SHULKER_BOX = (BurnedCyanShulkerBox) new BlockRegisterer("burned_cyan_shulker_box", Rifts.Blocks.BURNED_CYAN_SHULKER_BOX)
                .register();
        Rifts.Blocks.CORRUPTED_CYAN_STAINED_GLASS = (CorruptedCyanStainedGlass) new BlockRegisterer("corrupted_cyan_stained_glass", Rifts.Blocks.CORRUPTED_CYAN_STAINED_GLASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CYAN_STAINED_GLASS);
        Rifts.Blocks.BURNED_CYAN_STAINED_GLASS = (BurnedCyanStainedGlass) new BlockRegisterer("burned_cyan_stained_glass", Rifts.Blocks.BURNED_CYAN_STAINED_GLASS)
                .register();
        Rifts.Blocks.CORRUPTED_CYAN_TERRACOTTA = (CorruptedCyanTerracotta) new BlockRegisterer("corrupted_cyan_terracotta", Rifts.Blocks.CORRUPTED_CYAN_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CYAN_TERRACOTTA);
        Rifts.Blocks.BURNED_CYAN_TERRACOTTA = (BurnedCyanTerracotta) new BlockRegisterer("burned_cyan_terracotta", Rifts.Blocks.BURNED_CYAN_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_CYAN_WOOL = (CorruptedCyanWool) new BlockRegisterer("corrupted_cyan_wool", Rifts.Blocks.CORRUPTED_CYAN_WOOL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_CYAN_WOOL);
        Rifts.Blocks.BURNED_CYAN_WOOL = (BurnedCyanWool) new BlockRegisterer("burned_cyan_wool", Rifts.Blocks.BURNED_CYAN_WOOL)
                .register();
        Rifts.Blocks.CORRUPTED_DAMAGED_ANVIL = (CorruptedDamagedAnvil) new BlockRegisterer("corrupted_damaged_anvil", Rifts.Blocks.CORRUPTED_DAMAGED_ANVIL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DAMAGED_ANVIL);
        Rifts.Blocks.BURNED_DAMAGED_ANVIL = (BurnedDamagedAnvil) new BlockRegisterer("burned_damaged_anvil", Rifts.Blocks.BURNED_DAMAGED_ANVIL)
                .register();
        Rifts.Blocks.CORRUPTED_DANDELION = (CorruptedDandelion) new BlockRegisterer("corrupted_dandelion", Rifts.Blocks.CORRUPTED_DANDELION)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DANDELION);
        Rifts.Blocks.BURNED_DANDELION = (BurnedDandelion) new BlockRegisterer("burned_dandelion", Rifts.Blocks.BURNED_DANDELION)
                .register();
        Rifts.Blocks.CORRUPTED_DARK_OAK_LEAVES = (CorruptedDarkOakLeaves) new BlockRegisterer("corrupted_dark_oak_leaves", Rifts.Blocks.CORRUPTED_DARK_OAK_LEAVES)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DARK_OAK_LEAVES);
        Rifts.Blocks.BURNED_DARK_OAK_LEAVES = (BurnedDarkOakLeaves) new BlockRegisterer("burned_dark_oak_leaves", Rifts.Blocks.BURNED_DARK_OAK_LEAVES)
                .register();
        Rifts.Blocks.CORRUPTED_DARK_OAK_LOG = (CorruptedDarkOakLog) new BlockRegisterer("corrupted_dark_oak_log", Rifts.Blocks.CORRUPTED_DARK_OAK_LOG)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DARK_OAK_LOG);
        Rifts.Blocks.BURNED_DARK_OAK_LOG = (BurnedDarkOakLog) new BlockRegisterer("burned_dark_oak_log", Rifts.Blocks.BURNED_DARK_OAK_LOG)
                .register();
        Rifts.Blocks.CORRUPTED_DARK_OAK_PLANKS = (CorruptedDarkOakPlanks) new BlockRegisterer("corrupted_dark_oak_planks", Rifts.Blocks.CORRUPTED_DARK_OAK_PLANKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DARK_OAK_PLANKS);
        Rifts.Blocks.BURNED_DARK_OAK_PLANKS = (BurnedDarkOakPlanks) new BlockRegisterer("burned_dark_oak_planks", Rifts.Blocks.BURNED_DARK_OAK_PLANKS)
                .register();
        Rifts.Blocks.CORRUPTED_DARK_OAK_SAPLING = (CorruptedDarkOakSapling) new BlockRegisterer("corrupted_dark_oak_sapling", Rifts.Blocks.CORRUPTED_DARK_OAK_SAPLING)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DARK_OAK_SAPLING);
        Rifts.Blocks.BURNED_DARK_OAK_SAPLING = (BurnedDarkOakSapling) new BlockRegisterer("burned_dark_oak_sapling", Rifts.Blocks.BURNED_DARK_OAK_SAPLING)
                .register();
        Rifts.Blocks.CORRUPTED_DARK_PRISMARINE = (CorruptedDarkPrismarine) new BlockRegisterer("corrupted_dark_prismarine", Rifts.Blocks.CORRUPTED_DARK_PRISMARINE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DARK_PRISMARINE);
        Rifts.Blocks.BURNED_DARK_PRISMARINE = (BurnedDarkPrismarine) new BlockRegisterer("burned_dark_prismarine", Rifts.Blocks.BURNED_DARK_PRISMARINE)
                .register();
        Rifts.Blocks.CORRUPTED_DAYLIGHT_DETECTOR = (CorruptedDaylightDetector) new BlockRegisterer("corrupted_daylight_detector", Rifts.Blocks.CORRUPTED_DAYLIGHT_DETECTOR)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DAYLIGHT_DETECTOR);
        Rifts.Blocks.BURNED_DAYLIGHT_DETECTOR = (BurnedDaylightDetector) new BlockRegisterer("burned_daylight_detector", Rifts.Blocks.BURNED_DAYLIGHT_DETECTOR)
                .register();
        Rifts.Blocks.CORRUPTED_DEAD_BRAIN_CORAL = (CorruptedDeadBrainCoral) new BlockRegisterer("corrupted_dead_brain_coral", Rifts.Blocks.CORRUPTED_DEAD_BRAIN_CORAL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEAD_BRAIN_CORAL);
        Rifts.Blocks.BURNED_DEAD_BRAIN_CORAL = (BurnedDeadBrainCoral) new BlockRegisterer("burned_dead_brain_coral", Rifts.Blocks.BURNED_DEAD_BRAIN_CORAL)
                .register();
        Rifts.Blocks.CORRUPTED_DEAD_BRAIN_CORAL_BLOCK = (CorruptedDeadBrainCoralBlock) new BlockRegisterer("corrupted_dead_brain_coral_block", Rifts.Blocks.CORRUPTED_DEAD_BRAIN_CORAL_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEAD_BRAIN_CORAL_BLOCK);
        Rifts.Blocks.BURNED_DEAD_BRAIN_CORAL_BLOCK = (BurnedDeadBrainCoralBlock) new BlockRegisterer("burned_dead_brain_coral_block", Rifts.Blocks.BURNED_DEAD_BRAIN_CORAL_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_DEAD_BRAIN_CORAL_FAN = (CorruptedDeadBrainCoralFan) new BlockRegisterer("corrupted_dead_brain_coral_fan", Rifts.Blocks.CORRUPTED_DEAD_BRAIN_CORAL_FAN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEAD_BRAIN_CORAL_FAN);
        Rifts.Blocks.BURNED_DEAD_BRAIN_CORAL_FAN = (BurnedDeadBrainCoralFan) new BlockRegisterer("burned_dead_brain_coral_fan", Rifts.Blocks.BURNED_DEAD_BRAIN_CORAL_FAN)
                .register();
        Rifts.Blocks.CORRUPTED_DEAD_BUBBLE_CORAL = (CorruptedDeadBubbleCoral) new BlockRegisterer("corrupted_dead_bubble_coral", Rifts.Blocks.CORRUPTED_DEAD_BUBBLE_CORAL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEAD_BUBBLE_CORAL);
        Rifts.Blocks.BURNED_DEAD_BUBBLE_CORAL = (BurnedDeadBubbleCoral) new BlockRegisterer("burned_dead_bubble_coral", Rifts.Blocks.BURNED_DEAD_BUBBLE_CORAL)
                .register();
        Rifts.Blocks.CORRUPTED_DEAD_BUBBLE_CORAL_BLOCK = (CorruptedDeadBubbleCoralBlock) new BlockRegisterer("corrupted_dead_bubble_coral_block", Rifts.Blocks.CORRUPTED_DEAD_BUBBLE_CORAL_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEAD_BUBBLE_CORAL_BLOCK);
        Rifts.Blocks.BURNED_DEAD_BUBBLE_CORAL_BLOCK = (BurnedDeadBubbleCoralBlock) new BlockRegisterer("burned_dead_bubble_coral_block", Rifts.Blocks.BURNED_DEAD_BUBBLE_CORAL_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_DEAD_BUBBLE_CORAL_FAN = (CorruptedDeadBubbleCoralFan) new BlockRegisterer("corrupted_dead_bubble_coral_fan", Rifts.Blocks.CORRUPTED_DEAD_BUBBLE_CORAL_FAN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEAD_BUBBLE_CORAL_FAN);
        Rifts.Blocks.BURNED_DEAD_BUBBLE_CORAL_FAN = (BurnedDeadBubbleCoralFan) new BlockRegisterer("burned_dead_bubble_coral_fan", Rifts.Blocks.BURNED_DEAD_BUBBLE_CORAL_FAN)
                .register();
        Rifts.Blocks.CORRUPTED_DEAD_BUSH = (CorruptedDeadBush) new BlockRegisterer("corrupted_dead_bush", Rifts.Blocks.CORRUPTED_DEAD_BUSH)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEAD_BUSH);
        Rifts.Blocks.BURNED_DEAD_BUSH = (BurnedDeadBush) new BlockRegisterer("burned_dead_bush", Rifts.Blocks.BURNED_DEAD_BUSH)
                .register();
        Rifts.Blocks.CORRUPTED_DEAD_FIRE_CORAL = (CorruptedDeadFireCoral) new BlockRegisterer("corrupted_dead_fire_coral", Rifts.Blocks.CORRUPTED_DEAD_FIRE_CORAL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEAD_FIRE_CORAL);
        Rifts.Blocks.BURNED_DEAD_FIRE_CORAL = (BurnedDeadFireCoral) new BlockRegisterer("burned_dead_fire_coral", Rifts.Blocks.BURNED_DEAD_FIRE_CORAL)
                .register();
        Rifts.Blocks.CORRUPTED_DEAD_FIRE_CORAL_BLOCK = (CorruptedDeadFireCoralBlock) new BlockRegisterer("corrupted_dead_fire_coral_block", Rifts.Blocks.CORRUPTED_DEAD_FIRE_CORAL_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEAD_FIRE_CORAL_BLOCK);
        Rifts.Blocks.BURNED_DEAD_FIRE_CORAL_BLOCK = (BurnedDeadFireCoralBlock) new BlockRegisterer("burned_dead_fire_coral_block", Rifts.Blocks.BURNED_DEAD_FIRE_CORAL_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_DEAD_FIRE_CORAL_FAN = (CorruptedDeadFireCoralFan) new BlockRegisterer("corrupted_dead_fire_coral_fan", Rifts.Blocks.CORRUPTED_DEAD_FIRE_CORAL_FAN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEAD_FIRE_CORAL_FAN);
        Rifts.Blocks.BURNED_DEAD_FIRE_CORAL_FAN = (BurnedDeadFireCoralFan) new BlockRegisterer("burned_dead_fire_coral_fan", Rifts.Blocks.BURNED_DEAD_FIRE_CORAL_FAN)
                .register();
        Rifts.Blocks.CORRUPTED_DEAD_HORN_CORAL = (CorruptedDeadHornCoral) new BlockRegisterer("corrupted_dead_horn_coral", Rifts.Blocks.CORRUPTED_DEAD_HORN_CORAL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEAD_HORN_CORAL);
        Rifts.Blocks.BURNED_DEAD_HORN_CORAL = (BurnedDeadHornCoral) new BlockRegisterer("burned_dead_horn_coral", Rifts.Blocks.BURNED_DEAD_HORN_CORAL)
                .register();
        Rifts.Blocks.CORRUPTED_DEAD_HORN_CORAL_BLOCK = (CorruptedDeadHornCoralBlock) new BlockRegisterer("corrupted_dead_horn_coral_block", Rifts.Blocks.CORRUPTED_DEAD_HORN_CORAL_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEAD_HORN_CORAL_BLOCK);
        Rifts.Blocks.BURNED_DEAD_HORN_CORAL_BLOCK = (BurnedDeadHornCoralBlock) new BlockRegisterer("burned_dead_horn_coral_block", Rifts.Blocks.BURNED_DEAD_HORN_CORAL_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_DEAD_HORN_CORAL_FAN = (CorruptedDeadHornCoralFan) new BlockRegisterer("corrupted_dead_horn_coral_fan", Rifts.Blocks.CORRUPTED_DEAD_HORN_CORAL_FAN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEAD_HORN_CORAL_FAN);
        Rifts.Blocks.BURNED_DEAD_HORN_CORAL_FAN = (BurnedDeadHornCoralFan) new BlockRegisterer("burned_dead_horn_coral_fan", Rifts.Blocks.BURNED_DEAD_HORN_CORAL_FAN)
                .register();
        Rifts.Blocks.CORRUPTED_DEAD_TUBE_CORAL = (CorruptedDeadTubeCoral) new BlockRegisterer("corrupted_dead_tube_coral", Rifts.Blocks.CORRUPTED_DEAD_TUBE_CORAL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEAD_TUBE_CORAL);
        Rifts.Blocks.BURNED_DEAD_TUBE_CORAL = (BurnedDeadTubeCoral) new BlockRegisterer("burned_dead_tube_coral", Rifts.Blocks.BURNED_DEAD_TUBE_CORAL)
                .register();
        Rifts.Blocks.CORRUPTED_DEAD_TUBE_CORAL_BLOCK = (CorruptedDeadTubeCoralBlock) new BlockRegisterer("corrupted_dead_tube_coral_block", Rifts.Blocks.CORRUPTED_DEAD_TUBE_CORAL_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEAD_TUBE_CORAL_BLOCK);
        Rifts.Blocks.BURNED_DEAD_TUBE_CORAL_BLOCK = (BurnedDeadTubeCoralBlock) new BlockRegisterer("burned_dead_tube_coral_block", Rifts.Blocks.BURNED_DEAD_TUBE_CORAL_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_DEAD_TUBE_CORAL_FAN = (CorruptedDeadTubeCoralFan) new BlockRegisterer("corrupted_dead_tube_coral_fan", Rifts.Blocks.CORRUPTED_DEAD_TUBE_CORAL_FAN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEAD_TUBE_CORAL_FAN);
        Rifts.Blocks.BURNED_DEAD_TUBE_CORAL_FAN = (BurnedDeadTubeCoralFan) new BlockRegisterer("burned_dead_tube_coral_fan", Rifts.Blocks.BURNED_DEAD_TUBE_CORAL_FAN)
                .register();
        Rifts.Blocks.CORRUPTED_DEEPSLATE = (CorruptedDeepslate) new BlockRegisterer("corrupted_deepslate", Rifts.Blocks.CORRUPTED_DEEPSLATE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEEPSLATE);
        Rifts.Blocks.BURNED_DEEPSLATE = (BurnedDeepslate) new BlockRegisterer("burned_deepslate", Rifts.Blocks.BURNED_DEEPSLATE)
                .register();
        Rifts.Blocks.CORRUPTED_DEEPSLATE_BRICKS = (CorruptedDeepslateBricks) new BlockRegisterer("corrupted_deepslate_bricks", Rifts.Blocks.CORRUPTED_DEEPSLATE_BRICKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEEPSLATE_BRICKS);
        Rifts.Blocks.BURNED_DEEPSLATE_BRICKS = (BurnedDeepslateBricks) new BlockRegisterer("burned_deepslate_bricks", Rifts.Blocks.BURNED_DEEPSLATE_BRICKS)
                .register();
        Rifts.Blocks.CORRUPTED_DEEPSLATE_COAL_ORE = (CorruptedDeepslateCoalOre) new BlockRegisterer("corrupted_deepslate_coal_ore", Rifts.Blocks.CORRUPTED_DEEPSLATE_COAL_ORE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEEPSLATE_COAL_ORE);
        Rifts.Blocks.BURNED_DEEPSLATE_COAL_ORE = (BurnedDeepslateCoalOre) new BlockRegisterer("burned_deepslate_coal_ore", Rifts.Blocks.BURNED_DEEPSLATE_COAL_ORE)
                .register();
        Rifts.Blocks.CORRUPTED_DEEPSLATE_COPPER_ORE = (CorruptedDeepslateCopperOre) new BlockRegisterer("corrupted_deepslate_copper_ore", Rifts.Blocks.CORRUPTED_DEEPSLATE_COPPER_ORE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEEPSLATE_COPPER_ORE);
        Rifts.Blocks.BURNED_DEEPSLATE_COPPER_ORE = (BurnedDeepslateCopperOre) new BlockRegisterer("burned_deepslate_copper_ore", Rifts.Blocks.BURNED_DEEPSLATE_COPPER_ORE)
                .register();
        Rifts.Blocks.CORRUPTED_DEEPSLATE_DIAMOND_ORE = (CorruptedDeepslateDiamondOre) new BlockRegisterer("corrupted_deepslate_diamond_ore", Rifts.Blocks.CORRUPTED_DEEPSLATE_DIAMOND_ORE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEEPSLATE_DIAMOND_ORE);
        Rifts.Blocks.BURNED_DEEPSLATE_DIAMOND_ORE = (BurnedDeepslateDiamondOre) new BlockRegisterer("burned_deepslate_diamond_ore", Rifts.Blocks.BURNED_DEEPSLATE_DIAMOND_ORE)
                .register();
        Rifts.Blocks.CORRUPTED_DEEPSLATE_EMERALD_ORE = (CorruptedDeepslateEmeraldOre) new BlockRegisterer("corrupted_deepslate_emerald_ore", Rifts.Blocks.CORRUPTED_DEEPSLATE_EMERALD_ORE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEEPSLATE_EMERALD_ORE);
        Rifts.Blocks.BURNED_DEEPSLATE_EMERALD_ORE = (BurnedDeepslateEmeraldOre) new BlockRegisterer("burned_deepslate_emerald_ore", Rifts.Blocks.BURNED_DEEPSLATE_EMERALD_ORE)
                .register();
        Rifts.Blocks.CORRUPTED_DEEPSLATE_GOLD_ORE = (CorruptedDeepslateGoldOre) new BlockRegisterer("corrupted_deepslate_gold_ore", Rifts.Blocks.CORRUPTED_DEEPSLATE_GOLD_ORE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEEPSLATE_GOLD_ORE);
        Rifts.Blocks.BURNED_DEEPSLATE_GOLD_ORE = (BurnedDeepslateGoldOre) new BlockRegisterer("burned_deepslate_gold_ore", Rifts.Blocks.BURNED_DEEPSLATE_GOLD_ORE)
                .register();
        Rifts.Blocks.CORRUPTED_DEEPSLATE_IRON_ORE = (CorruptedDeepslateIronOre) new BlockRegisterer("corrupted_deepslate_iron_ore", Rifts.Blocks.CORRUPTED_DEEPSLATE_IRON_ORE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEEPSLATE_IRON_ORE);
        Rifts.Blocks.BURNED_DEEPSLATE_IRON_ORE = (BurnedDeepslateIronOre) new BlockRegisterer("burned_deepslate_iron_ore", Rifts.Blocks.BURNED_DEEPSLATE_IRON_ORE)
                .register();
        Rifts.Blocks.CORRUPTED_DEEPSLATE_LAPIS_ORE = (CorruptedDeepslateLapisOre) new BlockRegisterer("corrupted_deepslate_lapis_ore", Rifts.Blocks.CORRUPTED_DEEPSLATE_LAPIS_ORE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEEPSLATE_LAPIS_ORE);
        Rifts.Blocks.BURNED_DEEPSLATE_LAPIS_ORE = (BurnedDeepslateLapisOre) new BlockRegisterer("burned_deepslate_lapis_ore", Rifts.Blocks.BURNED_DEEPSLATE_LAPIS_ORE)
                .register();
        Rifts.Blocks.CORRUPTED_DEEPSLATE_REDSTONE_ORE = (CorruptedDeepslateRedstoneOre) new BlockRegisterer("corrupted_deepslate_redstone_ore", Rifts.Blocks.CORRUPTED_DEEPSLATE_REDSTONE_ORE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEEPSLATE_REDSTONE_ORE);
        Rifts.Blocks.BURNED_DEEPSLATE_REDSTONE_ORE = (BurnedDeepslateRedstoneOre) new BlockRegisterer("burned_deepslate_redstone_ore", Rifts.Blocks.BURNED_DEEPSLATE_REDSTONE_ORE)
                .register();
        Rifts.Blocks.CORRUPTED_DEEPSLATE_TILES = (CorruptedDeepslateTiles) new BlockRegisterer("corrupted_deepslate_tiles", Rifts.Blocks.CORRUPTED_DEEPSLATE_TILES)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DEEPSLATE_TILES);
        Rifts.Blocks.BURNED_DEEPSLATE_TILES = (BurnedDeepslateTiles) new BlockRegisterer("burned_deepslate_tiles", Rifts.Blocks.BURNED_DEEPSLATE_TILES)
                .register();
        Rifts.Blocks.CORRUPTED_DETECTOR_RAIL = (CorruptedDetectorRail) new BlockRegisterer("corrupted_detector_rail", Rifts.Blocks.CORRUPTED_DETECTOR_RAIL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DETECTOR_RAIL);
        Rifts.Blocks.BURNED_DETECTOR_RAIL = (BurnedDetectorRail) new BlockRegisterer("burned_detector_rail", Rifts.Blocks.BURNED_DETECTOR_RAIL)
                .register();
        Rifts.Blocks.CORRUPTED_DIAMOND_BLOCK = (CorruptedDiamondBlock) new BlockRegisterer("corrupted_diamond_block", Rifts.Blocks.CORRUPTED_DIAMOND_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DIAMOND_BLOCK);
        Rifts.Blocks.BURNED_DIAMOND_BLOCK = (BurnedDiamondBlock) new BlockRegisterer("burned_diamond_block", Rifts.Blocks.BURNED_DIAMOND_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_DIAMOND_ORE = (CorruptedDiamondOre) new BlockRegisterer("corrupted_diamond_ore", Rifts.Blocks.CORRUPTED_DIAMOND_ORE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DIAMOND_ORE);
        Rifts.Blocks.BURNED_DIAMOND_ORE = (BurnedDiamondOre) new BlockRegisterer("burned_diamond_ore", Rifts.Blocks.BURNED_DIAMOND_ORE)
                .register();
        Rifts.Blocks.CORRUPTED_DIORITE = (CorruptedDiorite) new BlockRegisterer("corrupted_diorite", Rifts.Blocks.CORRUPTED_DIORITE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DIORITE);
        Rifts.Blocks.BURNED_DIORITE = (BurnedDiorite) new BlockRegisterer("burned_diorite", Rifts.Blocks.BURNED_DIORITE)
                .register();
        Rifts.Blocks.CORRUPTED_DIRT = (CorruptedDirt) new BlockRegisterer("corrupted_dirt", Rifts.Blocks.CORRUPTED_DIRT)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DIRT);
        Rifts.Blocks.BURNED_DIRT = (BurnedDirt) new BlockRegisterer("burned_dirt", Rifts.Blocks.BURNED_DIRT)
                .register();
        Rifts.Blocks.CORRUPTED_DIRT_PATH = (CorruptedDirtPath) new BlockRegisterer("corrupted_dirt_path", Rifts.Blocks.CORRUPTED_DIRT_PATH)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DIRT_PATH);
        Rifts.Blocks.BURNED_DIRT_PATH = (BurnedDirtPath) new BlockRegisterer("burned_dirt_path", Rifts.Blocks.BURNED_DIRT_PATH)
                .register();
        Rifts.Blocks.CORRUPTED_DISPENSER = (CorruptedDispenser) new BlockRegisterer("corrupted_dispenser", Rifts.Blocks.CORRUPTED_DISPENSER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DISPENSER);
        Rifts.Blocks.BURNED_DISPENSER = (BurnedDispenser) new BlockRegisterer("burned_dispenser", Rifts.Blocks.BURNED_DISPENSER)
                .register();
        Rifts.Blocks.CORRUPTED_DRAGON_EGG = (CorruptedDragonEgg) new BlockRegisterer("corrupted_dragon_egg", Rifts.Blocks.CORRUPTED_DRAGON_EGG)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DRAGON_EGG);
        Rifts.Blocks.BURNED_DRAGON_EGG = (BurnedDragonEgg) new BlockRegisterer("burned_dragon_egg", Rifts.Blocks.BURNED_DRAGON_EGG)
                .register();
        Rifts.Blocks.CORRUPTED_DRIPSTONE_BLOCK = (CorruptedDripstoneBlock) new BlockRegisterer("corrupted_dripstone_block", Rifts.Blocks.CORRUPTED_DRIPSTONE_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DRIPSTONE_BLOCK);
        Rifts.Blocks.BURNED_DRIPSTONE_BLOCK = (BurnedDripstoneBlock) new BlockRegisterer("burned_dripstone_block", Rifts.Blocks.BURNED_DRIPSTONE_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_DROPPER = (CorruptedDropper) new BlockRegisterer("corrupted_dropper", Rifts.Blocks.CORRUPTED_DROPPER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_DROPPER);
        Rifts.Blocks.BURNED_DROPPER = (BurnedDropper) new BlockRegisterer("burned_dropper", Rifts.Blocks.BURNED_DROPPER)
                .register();
        Rifts.Blocks.CORRUPTED_EMERALD_BLOCK = (CorruptedEmeraldBlock) new BlockRegisterer("corrupted_emerald_block", Rifts.Blocks.CORRUPTED_EMERALD_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_EMERALD_BLOCK);
        Rifts.Blocks.BURNED_EMERALD_BLOCK = (BurnedEmeraldBlock) new BlockRegisterer("burned_emerald_block", Rifts.Blocks.BURNED_EMERALD_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_EMERALD_ORE = (CorruptedEmeraldOre) new BlockRegisterer("corrupted_emerald_ore", Rifts.Blocks.CORRUPTED_EMERALD_ORE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_EMERALD_ORE);
        Rifts.Blocks.BURNED_EMERALD_ORE = (BurnedEmeraldOre) new BlockRegisterer("burned_emerald_ore", Rifts.Blocks.BURNED_EMERALD_ORE)
                .register();
        Rifts.Blocks.CORRUPTED_ENCHANTING_TABLE = (CorruptedEnchantingTable) new BlockRegisterer("corrupted_enchanting_table", Rifts.Blocks.CORRUPTED_ENCHANTING_TABLE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ENCHANTING_TABLE);
        Rifts.Blocks.BURNED_ENCHANTING_TABLE = (BurnedEnchantingTable) new BlockRegisterer("burned_enchanting_table", Rifts.Blocks.BURNED_ENCHANTING_TABLE)
                .register();
        Rifts.Blocks.CORRUPTED_END_PORTAL = (CorruptedEndPortal) new BlockRegisterer("corrupted_end_portal", Rifts.Blocks.CORRUPTED_END_PORTAL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_END_PORTAL);
        Rifts.Blocks.BURNED_END_PORTAL = (BurnedEndPortal) new BlockRegisterer("burned_end_portal", Rifts.Blocks.BURNED_END_PORTAL)
                .register();
        Rifts.Blocks.CORRUPTED_END_PORTAL_FRAME = (CorruptedEndPortalFrame) new BlockRegisterer("corrupted_end_portal_frame", Rifts.Blocks.CORRUPTED_END_PORTAL_FRAME)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_END_PORTAL_FRAME);
        Rifts.Blocks.BURNED_END_PORTAL_FRAME = (BurnedEndPortalFrame) new BlockRegisterer("burned_end_portal_frame", Rifts.Blocks.BURNED_END_PORTAL_FRAME)
                .register();
        Rifts.Blocks.CORRUPTED_END_ROD = (CorruptedEndRod) new BlockRegisterer("corrupted_end_rod", Rifts.Blocks.CORRUPTED_END_ROD)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_END_ROD);
        Rifts.Blocks.BURNED_END_ROD = (BurnedEndRod) new BlockRegisterer("burned_end_rod", Rifts.Blocks.BURNED_END_ROD)
                .register();
        Rifts.Blocks.CORRUPTED_END_STONE = (CorruptedEndStone) new BlockRegisterer("corrupted_end_stone", Rifts.Blocks.CORRUPTED_END_STONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_END_STONE);
        Rifts.Blocks.BURNED_END_STONE = (BurnedEndStone) new BlockRegisterer("burned_end_stone", Rifts.Blocks.BURNED_END_STONE)
                .register();
        Rifts.Blocks.CORRUPTED_END_STONE_BRICKS = (CorruptedEndStoneBricks) new BlockRegisterer("corrupted_end_stone_bricks", Rifts.Blocks.CORRUPTED_END_STONE_BRICKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_END_STONE_BRICKS);
        Rifts.Blocks.BURNED_END_STONE_BRICKS = (BurnedEndStoneBricks) new BlockRegisterer("burned_end_stone_bricks", Rifts.Blocks.BURNED_END_STONE_BRICKS)
                .register();
        Rifts.Blocks.CORRUPTED_EXPOSED_COPPER = (CorruptedExposedCopper) new BlockRegisterer("corrupted_exposed_copper", Rifts.Blocks.CORRUPTED_EXPOSED_COPPER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_EXPOSED_COPPER);
        Rifts.Blocks.BURNED_EXPOSED_COPPER = (BurnedExposedCopper) new BlockRegisterer("burned_exposed_copper", Rifts.Blocks.BURNED_EXPOSED_COPPER)
                .register();
        Rifts.Blocks.CORRUPTED_EXPOSED_CUT_COPPER = (CorruptedExposedCutCopper) new BlockRegisterer("corrupted_exposed_cut_copper", Rifts.Blocks.CORRUPTED_EXPOSED_CUT_COPPER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_EXPOSED_CUT_COPPER);
        Rifts.Blocks.BURNED_EXPOSED_CUT_COPPER = (BurnedExposedCutCopper) new BlockRegisterer("burned_exposed_cut_copper", Rifts.Blocks.BURNED_EXPOSED_CUT_COPPER)
                .register();
        Rifts.Blocks.CORRUPTED_FARMLAND = (CorruptedFarmland) new BlockRegisterer("corrupted_farmland", Rifts.Blocks.CORRUPTED_FARMLAND)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_FARMLAND);
        Rifts.Blocks.BURNED_FARMLAND = (BurnedFarmland) new BlockRegisterer("burned_farmland", Rifts.Blocks.BURNED_FARMLAND)
                .register();
        Rifts.Blocks.CORRUPTED_FERN = (CorruptedFern) new BlockRegisterer("corrupted_fern", Rifts.Blocks.CORRUPTED_FERN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_FERN);
        Rifts.Blocks.BURNED_FERN = (BurnedFern) new BlockRegisterer("burned_fern", Rifts.Blocks.BURNED_FERN)
                .register();
        Rifts.Blocks.CORRUPTED_FIRE_CORAL = (CorruptedFireCoral) new BlockRegisterer("corrupted_fire_coral", Rifts.Blocks.CORRUPTED_FIRE_CORAL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_FIRE_CORAL);
        Rifts.Blocks.BURNED_FIRE_CORAL = (BurnedFireCoral) new BlockRegisterer("burned_fire_coral", Rifts.Blocks.BURNED_FIRE_CORAL)
                .register();
        Rifts.Blocks.CORRUPTED_FIRE_CORAL_BLOCK = (CorruptedFireCoralBlock) new BlockRegisterer("corrupted_fire_coral_block", Rifts.Blocks.CORRUPTED_FIRE_CORAL_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_FIRE_CORAL_BLOCK);
        Rifts.Blocks.BURNED_FIRE_CORAL_BLOCK = (BurnedFireCoralBlock) new BlockRegisterer("burned_fire_coral_block", Rifts.Blocks.BURNED_FIRE_CORAL_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_FIRE_CORAL_FAN = (CorruptedFireCoralFan) new BlockRegisterer("corrupted_fire_coral_fan", Rifts.Blocks.CORRUPTED_FIRE_CORAL_FAN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_FIRE_CORAL_FAN);
        Rifts.Blocks.BURNED_FIRE_CORAL_FAN = (BurnedFireCoralFan) new BlockRegisterer("burned_fire_coral_fan", Rifts.Blocks.BURNED_FIRE_CORAL_FAN)
                .register();
        Rifts.Blocks.CORRUPTED_FLETCHING_TABLE = (CorruptedFletchingTable) new BlockRegisterer("corrupted_fletching_table", Rifts.Blocks.CORRUPTED_FLETCHING_TABLE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_FLETCHING_TABLE);
        Rifts.Blocks.BURNED_FLETCHING_TABLE = (BurnedFletchingTable) new BlockRegisterer("burned_fletching_table", Rifts.Blocks.BURNED_FLETCHING_TABLE)
                .register();
        Rifts.Blocks.CORRUPTED_FLOWERING_AZALEA = (CorruptedFloweringAzalea) new BlockRegisterer("corrupted_flowering_azalea", Rifts.Blocks.CORRUPTED_FLOWERING_AZALEA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_FLOWERING_AZALEA);
        Rifts.Blocks.BURNED_FLOWERING_AZALEA = (BurnedFloweringAzalea) new BlockRegisterer("burned_flowering_azalea", Rifts.Blocks.BURNED_FLOWERING_AZALEA)
                .register();
        Rifts.Blocks.CORRUPTED_FLOWERING_AZALEA_LEAVES = (CorruptedFloweringAzaleaLeaves) new BlockRegisterer("corrupted_flowering_azalea_leaves", Rifts.Blocks.CORRUPTED_FLOWERING_AZALEA_LEAVES)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_FLOWERING_AZALEA_LEAVES);
        Rifts.Blocks.BURNED_FLOWERING_AZALEA_LEAVES = (BurnedFloweringAzaleaLeaves) new BlockRegisterer("burned_flowering_azalea_leaves", Rifts.Blocks.BURNED_FLOWERING_AZALEA_LEAVES)
                .register();
        Rifts.Blocks.CORRUPTED_FLOWER_POT = (CorruptedFlowerPot) new BlockRegisterer("corrupted_flower_pot", Rifts.Blocks.CORRUPTED_FLOWER_POT)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_FLOWER_POT);
        Rifts.Blocks.BURNED_FLOWER_POT = (BurnedFlowerPot) new BlockRegisterer("burned_flower_pot", Rifts.Blocks.BURNED_FLOWER_POT)
                .register();
        Rifts.Blocks.CORRUPTED_FURNACE = (CorruptedFurnace) new BlockRegisterer("corrupted_furnace", Rifts.Blocks.CORRUPTED_FURNACE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_FURNACE);
        Rifts.Blocks.BURNED_FURNACE = (BurnedFurnace) new BlockRegisterer("burned_furnace", Rifts.Blocks.BURNED_FURNACE)
                .register();
        Rifts.Blocks.CORRUPTED_GILDED_BLACKSTONE = (CorruptedGildedBlackstone) new BlockRegisterer("corrupted_gilded_blackstone", Rifts.Blocks.CORRUPTED_GILDED_BLACKSTONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GILDED_BLACKSTONE);
        Rifts.Blocks.BURNED_GILDED_BLACKSTONE = (BurnedGildedBlackstone) new BlockRegisterer("burned_gilded_blackstone", Rifts.Blocks.BURNED_GILDED_BLACKSTONE)
                .register();
        Rifts.Blocks.CORRUPTED_GLASS = (CorruptedGlass) new BlockRegisterer("corrupted_glass", Rifts.Blocks.CORRUPTED_GLASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GLASS);
        Rifts.Blocks.BURNED_GLASS = (BurnedGlass) new BlockRegisterer("burned_glass", Rifts.Blocks.BURNED_GLASS)
                .register();
        Rifts.Blocks.CORRUPTED_GLOWSTONE = (CorruptedGlowstone) new BlockRegisterer("corrupted_glowstone", Rifts.Blocks.CORRUPTED_GLOWSTONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GLOWSTONE);
        Rifts.Blocks.BURNED_GLOWSTONE = (BurnedGlowstone) new BlockRegisterer("burned_glowstone", Rifts.Blocks.BURNED_GLOWSTONE)
                .register();
        Rifts.Blocks.CORRUPTED_GLOW_ITEM_FRAME = (CorruptedGlowItemFrame) new BlockRegisterer("corrupted_glow_item_frame", Rifts.Blocks.CORRUPTED_GLOW_ITEM_FRAME)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GLOW_ITEM_FRAME);
        Rifts.Blocks.BURNED_GLOW_ITEM_FRAME = (BurnedGlowItemFrame) new BlockRegisterer("burned_glow_item_frame", Rifts.Blocks.BURNED_GLOW_ITEM_FRAME)
                .register();
        Rifts.Blocks.CORRUPTED_GLOW_LICHEN = (CorruptedGlowLichen) new BlockRegisterer("corrupted_glow_lichen", Rifts.Blocks.CORRUPTED_GLOW_LICHEN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GLOW_LICHEN);
        Rifts.Blocks.BURNED_GLOW_LICHEN = (BurnedGlowLichen) new BlockRegisterer("burned_glow_lichen", Rifts.Blocks.BURNED_GLOW_LICHEN)
                .register();
        Rifts.Blocks.CORRUPTED_GOLD_BLOCK = (CorruptedGoldBlock) new BlockRegisterer("corrupted_gold_block", Rifts.Blocks.CORRUPTED_GOLD_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GOLD_BLOCK);
        Rifts.Blocks.BURNED_GOLD_BLOCK = (BurnedGoldBlock) new BlockRegisterer("burned_gold_block", Rifts.Blocks.BURNED_GOLD_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_GOLD_ORE = (CorruptedGoldOre) new BlockRegisterer("corrupted_gold_ore", Rifts.Blocks.CORRUPTED_GOLD_ORE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GOLD_ORE);
        Rifts.Blocks.BURNED_GOLD_ORE = (BurnedGoldOre) new BlockRegisterer("burned_gold_ore", Rifts.Blocks.BURNED_GOLD_ORE)
                .register();
        Rifts.Blocks.CORRUPTED_GRANITE = (CorruptedGranite) new BlockRegisterer("corrupted_granite", Rifts.Blocks.CORRUPTED_GRANITE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GRANITE);
        Rifts.Blocks.BURNED_GRANITE = (BurnedGranite) new BlockRegisterer("burned_granite", Rifts.Blocks.BURNED_GRANITE)
                .register();
        Rifts.Blocks.CORRUPTED_GRASS = (CorruptedGrass) new BlockRegisterer("corrupted_grass", Rifts.Blocks.CORRUPTED_GRASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GRASS);
        Rifts.Blocks.BURNED_GRASS = (BurnedGrass) new BlockRegisterer("burned_grass", Rifts.Blocks.BURNED_GRASS)
                .register();
        Rifts.Blocks.CORRUPTED_GRASS_BLOCK = (CorruptedGrassBlock) new BlockRegisterer("corrupted_grass_block", Rifts.Blocks.CORRUPTED_GRASS_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GRASS_BLOCK);
        Rifts.Blocks.BURNED_GRASS_BLOCK = (BurnedGrassBlock) new BlockRegisterer("burned_grass_block", Rifts.Blocks.BURNED_GRASS_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_GRAVEL = (CorruptedGravel) new BlockRegisterer("corrupted_gravel", Rifts.Blocks.CORRUPTED_GRAVEL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GRAVEL);
        Rifts.Blocks.BURNED_GRAVEL = (BurnedGravel) new BlockRegisterer("burned_gravel", Rifts.Blocks.BURNED_GRAVEL)
                .register();
        Rifts.Blocks.CORRUPTED_GRAY_CONCRETE = (CorruptedGrayConcrete) new BlockRegisterer("corrupted_gray_concrete", Rifts.Blocks.CORRUPTED_GRAY_CONCRETE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GRAY_CONCRETE);
        Rifts.Blocks.BURNED_GRAY_CONCRETE = (BurnedGrayConcrete) new BlockRegisterer("burned_gray_concrete", Rifts.Blocks.BURNED_GRAY_CONCRETE)
                .register();
        Rifts.Blocks.CORRUPTED_GRAY_CONCRETE_POWDER = (CorruptedGrayConcretePowder) new BlockRegisterer("corrupted_gray_concrete_powder", Rifts.Blocks.CORRUPTED_GRAY_CONCRETE_POWDER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GRAY_CONCRETE_POWDER);
        Rifts.Blocks.BURNED_GRAY_CONCRETE_POWDER = (BurnedGrayConcretePowder) new BlockRegisterer("burned_gray_concrete_powder", Rifts.Blocks.BURNED_GRAY_CONCRETE_POWDER)
                .register();
        Rifts.Blocks.CORRUPTED_GRAY_GLAZED_TERRACOTTA = (CorruptedGrayGlazedTerracotta) new BlockRegisterer("corrupted_gray_glazed_terracotta", Rifts.Blocks.CORRUPTED_GRAY_GLAZED_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GRAY_GLAZED_TERRACOTTA);
        Rifts.Blocks.BURNED_GRAY_GLAZED_TERRACOTTA = (BurnedGrayGlazedTerracotta) new BlockRegisterer("burned_gray_glazed_terracotta", Rifts.Blocks.BURNED_GRAY_GLAZED_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_GRAY_SHULKER_BOX = (CorruptedGrayShulkerBox) new BlockRegisterer("corrupted_gray_shulker_box", Rifts.Blocks.CORRUPTED_GRAY_SHULKER_BOX)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GRAY_SHULKER_BOX);
        Rifts.Blocks.BURNED_GRAY_SHULKER_BOX = (BurnedGrayShulkerBox) new BlockRegisterer("burned_gray_shulker_box", Rifts.Blocks.BURNED_GRAY_SHULKER_BOX)
                .register();
        Rifts.Blocks.CORRUPTED_GRAY_STAINED_GLASS = (CorruptedGrayStainedGlass) new BlockRegisterer("corrupted_gray_stained_glass", Rifts.Blocks.CORRUPTED_GRAY_STAINED_GLASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GRAY_STAINED_GLASS);
        Rifts.Blocks.BURNED_GRAY_STAINED_GLASS = (BurnedGrayStainedGlass) new BlockRegisterer("burned_gray_stained_glass", Rifts.Blocks.BURNED_GRAY_STAINED_GLASS)
                .register();
        Rifts.Blocks.CORRUPTED_GRAY_TERRACOTTA = (CorruptedGrayTerracotta) new BlockRegisterer("corrupted_gray_terracotta", Rifts.Blocks.CORRUPTED_GRAY_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GRAY_TERRACOTTA);
        Rifts.Blocks.BURNED_GRAY_TERRACOTTA = (BurnedGrayTerracotta) new BlockRegisterer("burned_gray_terracotta", Rifts.Blocks.BURNED_GRAY_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_GRAY_WOOL = (CorruptedGrayWool) new BlockRegisterer("corrupted_gray_wool", Rifts.Blocks.CORRUPTED_GRAY_WOOL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GRAY_WOOL);
        Rifts.Blocks.BURNED_GRAY_WOOL = (BurnedGrayWool) new BlockRegisterer("burned_gray_wool", Rifts.Blocks.BURNED_GRAY_WOOL)
                .register();
        Rifts.Blocks.CORRUPTED_GREEN_CONCRETE = (CorruptedGreenConcrete) new BlockRegisterer("corrupted_green_concrete", Rifts.Blocks.CORRUPTED_GREEN_CONCRETE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GREEN_CONCRETE);
        Rifts.Blocks.BURNED_GREEN_CONCRETE = (BurnedGreenConcrete) new BlockRegisterer("burned_green_concrete", Rifts.Blocks.BURNED_GREEN_CONCRETE)
                .register();
        Rifts.Blocks.CORRUPTED_GREEN_CONCRETE_POWDER = (CorruptedGreenConcretePowder) new BlockRegisterer("corrupted_green_concrete_powder", Rifts.Blocks.CORRUPTED_GREEN_CONCRETE_POWDER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GREEN_CONCRETE_POWDER);
        Rifts.Blocks.BURNED_GREEN_CONCRETE_POWDER = (BurnedGreenConcretePowder) new BlockRegisterer("burned_green_concrete_powder", Rifts.Blocks.BURNED_GREEN_CONCRETE_POWDER)
                .register();
        Rifts.Blocks.CORRUPTED_GREEN_GLAZED_TERRACOTTA = (CorruptedGreenGlazedTerracotta) new BlockRegisterer("corrupted_green_glazed_terracotta", Rifts.Blocks.CORRUPTED_GREEN_GLAZED_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GREEN_GLAZED_TERRACOTTA);
        Rifts.Blocks.BURNED_GREEN_GLAZED_TERRACOTTA = (BurnedGreenGlazedTerracotta) new BlockRegisterer("burned_green_glazed_terracotta", Rifts.Blocks.BURNED_GREEN_GLAZED_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_GREEN_SHULKER_BOX = (CorruptedGreenShulkerBox) new BlockRegisterer("corrupted_green_shulker_box", Rifts.Blocks.CORRUPTED_GREEN_SHULKER_BOX)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GREEN_SHULKER_BOX);
        Rifts.Blocks.BURNED_GREEN_SHULKER_BOX = (BurnedGreenShulkerBox) new BlockRegisterer("burned_green_shulker_box", Rifts.Blocks.BURNED_GREEN_SHULKER_BOX)
                .register();
        Rifts.Blocks.CORRUPTED_GREEN_STAINED_GLASS = (CorruptedGreenStainedGlass) new BlockRegisterer("corrupted_green_stained_glass", Rifts.Blocks.CORRUPTED_GREEN_STAINED_GLASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GREEN_STAINED_GLASS);
        Rifts.Blocks.BURNED_GREEN_STAINED_GLASS = (BurnedGreenStainedGlass) new BlockRegisterer("burned_green_stained_glass", Rifts.Blocks.BURNED_GREEN_STAINED_GLASS)
                .register();
        Rifts.Blocks.CORRUPTED_GREEN_TERRACOTTA = (CorruptedGreenTerracotta) new BlockRegisterer("corrupted_green_terracotta", Rifts.Blocks.CORRUPTED_GREEN_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GREEN_TERRACOTTA);
        Rifts.Blocks.BURNED_GREEN_TERRACOTTA = (BurnedGreenTerracotta) new BlockRegisterer("burned_green_terracotta", Rifts.Blocks.BURNED_GREEN_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_GREEN_WOOL = (CorruptedGreenWool) new BlockRegisterer("corrupted_green_wool", Rifts.Blocks.CORRUPTED_GREEN_WOOL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GREEN_WOOL);
        Rifts.Blocks.BURNED_GREEN_WOOL = (BurnedGreenWool) new BlockRegisterer("burned_green_wool", Rifts.Blocks.BURNED_GREEN_WOOL)
                .register();
        Rifts.Blocks.CORRUPTED_GRINDSTONE = (CorruptedGrindstone) new BlockRegisterer("corrupted_grindstone", Rifts.Blocks.CORRUPTED_GRINDSTONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_GRINDSTONE);
        Rifts.Blocks.BURNED_GRINDSTONE = (BurnedGrindstone) new BlockRegisterer("burned_grindstone", Rifts.Blocks.BURNED_GRINDSTONE)
                .register();
        Rifts.Blocks.CORRUPTED_HANGING_ROOTS = (CorruptedHangingRoots) new BlockRegisterer("corrupted_hanging_roots", Rifts.Blocks.CORRUPTED_HANGING_ROOTS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_HANGING_ROOTS);
        Rifts.Blocks.BURNED_HANGING_ROOTS = (BurnedHangingRoots) new BlockRegisterer("burned_hanging_roots", Rifts.Blocks.BURNED_HANGING_ROOTS)
                .register();
        Rifts.Blocks.CORRUPTED_HAY_BLOCK = (CorruptedHayBlock) new BlockRegisterer("corrupted_hay_block", Rifts.Blocks.CORRUPTED_HAY_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_HAY_BLOCK);
        Rifts.Blocks.BURNED_HAY_BLOCK = (BurnedHayBlock) new BlockRegisterer("burned_hay_block", Rifts.Blocks.BURNED_HAY_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_HONEYCOMB_BLOCK = (CorruptedHoneycombBlock) new BlockRegisterer("corrupted_honeycomb_block", Rifts.Blocks.CORRUPTED_HONEYCOMB_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_HONEYCOMB_BLOCK);
        Rifts.Blocks.BURNED_HONEYCOMB_BLOCK = (BurnedHoneycombBlock) new BlockRegisterer("burned_honeycomb_block", Rifts.Blocks.BURNED_HONEYCOMB_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_HONEY_BLOCK = (CorruptedHoneyBlock) new BlockRegisterer("corrupted_honey_block", Rifts.Blocks.CORRUPTED_HONEY_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_HONEY_BLOCK);
        Rifts.Blocks.BURNED_HONEY_BLOCK = (BurnedHoneyBlock) new BlockRegisterer("burned_honey_block", Rifts.Blocks.BURNED_HONEY_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_HOPPER = (CorruptedHopper) new BlockRegisterer("corrupted_hopper", Rifts.Blocks.CORRUPTED_HOPPER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_HOPPER);
        Rifts.Blocks.BURNED_HOPPER = (BurnedHopper) new BlockRegisterer("burned_hopper", Rifts.Blocks.BURNED_HOPPER)
                .register();
        Rifts.Blocks.CORRUPTED_HORN_CORAL = (CorruptedHornCoral) new BlockRegisterer("corrupted_horn_coral", Rifts.Blocks.CORRUPTED_HORN_CORAL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_HORN_CORAL);
        Rifts.Blocks.BURNED_HORN_CORAL = (BurnedHornCoral) new BlockRegisterer("burned_horn_coral", Rifts.Blocks.BURNED_HORN_CORAL)
                .register();
        Rifts.Blocks.CORRUPTED_HORN_CORAL_BLOCK = (CorruptedHornCoralBlock) new BlockRegisterer("corrupted_horn_coral_block", Rifts.Blocks.CORRUPTED_HORN_CORAL_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_HORN_CORAL_BLOCK);
        Rifts.Blocks.BURNED_HORN_CORAL_BLOCK = (BurnedHornCoralBlock) new BlockRegisterer("burned_horn_coral_block", Rifts.Blocks.BURNED_HORN_CORAL_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_HORN_CORAL_FAN = (CorruptedHornCoralFan) new BlockRegisterer("corrupted_horn_coral_fan", Rifts.Blocks.CORRUPTED_HORN_CORAL_FAN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_HORN_CORAL_FAN);
        Rifts.Blocks.BURNED_HORN_CORAL_FAN = (BurnedHornCoralFan) new BlockRegisterer("burned_horn_coral_fan", Rifts.Blocks.BURNED_HORN_CORAL_FAN)
                .register();
        Rifts.Blocks.CORRUPTED_ICE = (CorruptedIce) new BlockRegisterer("corrupted_ice", Rifts.Blocks.CORRUPTED_ICE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ICE);
        Rifts.Blocks.BURNED_ICE = (BurnedIce) new BlockRegisterer("burned_ice", Rifts.Blocks.BURNED_ICE)
                .register();
        Rifts.Blocks.CORRUPTED_IRON_BLOCK = (CorruptedIronBlock) new BlockRegisterer("corrupted_iron_block", Rifts.Blocks.CORRUPTED_IRON_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_IRON_BLOCK);
        Rifts.Blocks.BURNED_IRON_BLOCK = (BurnedIronBlock) new BlockRegisterer("burned_iron_block", Rifts.Blocks.BURNED_IRON_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_IRON_ORE = (CorruptedIronOre) new BlockRegisterer("corrupted_iron_ore", Rifts.Blocks.CORRUPTED_IRON_ORE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_IRON_ORE);
        Rifts.Blocks.BURNED_IRON_ORE = (BurnedIronOre) new BlockRegisterer("burned_iron_ore", Rifts.Blocks.BURNED_IRON_ORE)
                .register();
        Rifts.Blocks.CORRUPTED_ITEM_FRAME = (CorruptedItemFrame) new BlockRegisterer("corrupted_item_frame", Rifts.Blocks.CORRUPTED_ITEM_FRAME)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ITEM_FRAME);
        Rifts.Blocks.BURNED_ITEM_FRAME = (BurnedItemFrame) new BlockRegisterer("burned_item_frame", Rifts.Blocks.BURNED_ITEM_FRAME)
                .register();
        Rifts.Blocks.CORRUPTED_JACK_O_LANTERN = (CorruptedJackOLantern) new BlockRegisterer("corrupted_jack_o_lantern", Rifts.Blocks.CORRUPTED_JACK_O_LANTERN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_JACK_O_LANTERN);
        Rifts.Blocks.BURNED_JACK_O_LANTERN = (BurnedJackOLantern) new BlockRegisterer("burned_jack_o_lantern", Rifts.Blocks.BURNED_JACK_O_LANTERN)
                .register();
        Rifts.Blocks.CORRUPTED_JIGSAW = (CorruptedJigsaw) new BlockRegisterer("corrupted_jigsaw", Rifts.Blocks.CORRUPTED_JIGSAW)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_JIGSAW);
        Rifts.Blocks.BURNED_JIGSAW = (BurnedJigsaw) new BlockRegisterer("burned_jigsaw", Rifts.Blocks.BURNED_JIGSAW)
                .register();
        Rifts.Blocks.CORRUPTED_JUKEBOX = (CorruptedJukebox) new BlockRegisterer("corrupted_jukebox", Rifts.Blocks.CORRUPTED_JUKEBOX)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_JUKEBOX);
        Rifts.Blocks.BURNED_JUKEBOX = (BurnedJukebox) new BlockRegisterer("burned_jukebox", Rifts.Blocks.BURNED_JUKEBOX)
                .register();
        Rifts.Blocks.CORRUPTED_JUNGLE_LEAVES = (CorruptedJungleLeaves) new BlockRegisterer("corrupted_jungle_leaves", Rifts.Blocks.CORRUPTED_JUNGLE_LEAVES)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_JUNGLE_LEAVES);
        Rifts.Blocks.BURNED_JUNGLE_LEAVES = (BurnedJungleLeaves) new BlockRegisterer("burned_jungle_leaves", Rifts.Blocks.BURNED_JUNGLE_LEAVES)
                .register();
        Rifts.Blocks.CORRUPTED_JUNGLE_LOG = (CorruptedJungleLog) new BlockRegisterer("corrupted_jungle_log", Rifts.Blocks.CORRUPTED_JUNGLE_LOG)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_JUNGLE_LOG);
        Rifts.Blocks.BURNED_JUNGLE_LOG = (BurnedJungleLog) new BlockRegisterer("burned_jungle_log", Rifts.Blocks.BURNED_JUNGLE_LOG)
                .register();
        Rifts.Blocks.CORRUPTED_JUNGLE_PLANKS = (CorruptedJunglePlanks) new BlockRegisterer("corrupted_jungle_planks", Rifts.Blocks.CORRUPTED_JUNGLE_PLANKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_JUNGLE_PLANKS);
        Rifts.Blocks.BURNED_JUNGLE_PLANKS = (BurnedJunglePlanks) new BlockRegisterer("burned_jungle_planks", Rifts.Blocks.BURNED_JUNGLE_PLANKS)
                .register();
        Rifts.Blocks.CORRUPTED_JUNGLE_SAPLING = (CorruptedJungleSapling) new BlockRegisterer("corrupted_jungle_sapling", Rifts.Blocks.CORRUPTED_JUNGLE_SAPLING)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_JUNGLE_SAPLING);
        Rifts.Blocks.BURNED_JUNGLE_SAPLING = (BurnedJungleSapling) new BlockRegisterer("burned_jungle_sapling", Rifts.Blocks.BURNED_JUNGLE_SAPLING)
                .register();
        Rifts.Blocks.CORRUPTED_KELP = (CorruptedKelp) new BlockRegisterer("corrupted_kelp", Rifts.Blocks.CORRUPTED_KELP)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_KELP);
        Rifts.Blocks.BURNED_KELP = (BurnedKelp) new BlockRegisterer("burned_kelp", Rifts.Blocks.BURNED_KELP)
                .register();
        Rifts.Blocks.CORRUPTED_KELP_PLANT = (CorruptedKelpPlant) new BlockRegisterer("corrupted_kelp_plant", Rifts.Blocks.CORRUPTED_KELP_PLANT)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_KELP_PLANT);
        Rifts.Blocks.BURNED_KELP_PLANT = (BurnedKelpPlant) new BlockRegisterer("burned_kelp_plant", Rifts.Blocks.BURNED_KELP_PLANT)
                .register();
        Rifts.Blocks.CORRUPTED_LADDER = (CorruptedLadder) new BlockRegisterer("corrupted_ladder", Rifts.Blocks.CORRUPTED_LADDER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LADDER);
        Rifts.Blocks.BURNED_LADDER = (BurnedLadder) new BlockRegisterer("burned_ladder", Rifts.Blocks.BURNED_LADDER)
                .register();
        Rifts.Blocks.CORRUPTED_LANTERN = (CorruptedLantern) new BlockRegisterer("corrupted_lantern", Rifts.Blocks.CORRUPTED_LANTERN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LANTERN);
        Rifts.Blocks.BURNED_LANTERN = (BurnedLantern) new BlockRegisterer("burned_lantern", Rifts.Blocks.BURNED_LANTERN)
                .register();
        Rifts.Blocks.CORRUPTED_LAPIS_BLOCK = (CorruptedLapisBlock) new BlockRegisterer("corrupted_lapis_block", Rifts.Blocks.CORRUPTED_LAPIS_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LAPIS_BLOCK);
        Rifts.Blocks.BURNED_LAPIS_BLOCK = (BurnedLapisBlock) new BlockRegisterer("burned_lapis_block", Rifts.Blocks.BURNED_LAPIS_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_LAPIS_ORE = (CorruptedLapisOre) new BlockRegisterer("corrupted_lapis_ore", Rifts.Blocks.CORRUPTED_LAPIS_ORE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LAPIS_ORE);
        Rifts.Blocks.BURNED_LAPIS_ORE = (BurnedLapisOre) new BlockRegisterer("burned_lapis_ore", Rifts.Blocks.BURNED_LAPIS_ORE)
                .register();
        Rifts.Blocks.CORRUPTED_LARGE_AMETHYST_BUD = (CorruptedLargeAmethystBud) new BlockRegisterer("corrupted_large_amethyst_bud", Rifts.Blocks.CORRUPTED_LARGE_AMETHYST_BUD)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LARGE_AMETHYST_BUD);
        Rifts.Blocks.BURNED_LARGE_AMETHYST_BUD = (BurnedLargeAmethystBud) new BlockRegisterer("burned_large_amethyst_bud", Rifts.Blocks.BURNED_LARGE_AMETHYST_BUD)
                .register();
        Rifts.Blocks.CORRUPTED_LAVA = (CorruptedLava) new BlockRegisterer("corrupted_lava", Rifts.Blocks.CORRUPTED_LAVA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LAVA);
        Rifts.Blocks.BURNED_LAVA = (BurnedLava) new BlockRegisterer("burned_lava", Rifts.Blocks.BURNED_LAVA)
                .register();
        Rifts.Blocks.CORRUPTED_LECTERN = (CorruptedLectern) new BlockRegisterer("corrupted_lectern", Rifts.Blocks.CORRUPTED_LECTERN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LECTERN);
        Rifts.Blocks.BURNED_LECTERN = (BurnedLectern) new BlockRegisterer("burned_lectern", Rifts.Blocks.BURNED_LECTERN)
                .register();
        Rifts.Blocks.CORRUPTED_LEVER = (CorruptedLever) new BlockRegisterer("corrupted_lever", Rifts.Blocks.CORRUPTED_LEVER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LEVER);
        Rifts.Blocks.BURNED_LEVER = (BurnedLever) new BlockRegisterer("burned_lever", Rifts.Blocks.BURNED_LEVER)
                .register();
        Rifts.Blocks.CORRUPTED_LIGHTNING_ROD = (CorruptedLightningRod) new BlockRegisterer("corrupted_lightning_rod", Rifts.Blocks.CORRUPTED_LIGHTNING_ROD)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIGHTNING_ROD);
        Rifts.Blocks.BURNED_LIGHTNING_ROD = (BurnedLightningRod) new BlockRegisterer("burned_lightning_rod", Rifts.Blocks.BURNED_LIGHTNING_ROD)
                .register();
        Rifts.Blocks.CORRUPTED_LIGHT_BLUE_CONCRETE = (CorruptedLightBlueConcrete) new BlockRegisterer("corrupted_light_blue_concrete", Rifts.Blocks.CORRUPTED_LIGHT_BLUE_CONCRETE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIGHT_BLUE_CONCRETE);
        Rifts.Blocks.BURNED_LIGHT_BLUE_CONCRETE = (BurnedLightBlueConcrete) new BlockRegisterer("burned_light_blue_concrete", Rifts.Blocks.BURNED_LIGHT_BLUE_CONCRETE)
                .register();
        Rifts.Blocks.CORRUPTED_LIGHT_BLUE_CONCRETE_POWDER = (CorruptedLightBlueConcretePowder) new BlockRegisterer("corrupted_light_blue_concrete_powder", Rifts.Blocks.CORRUPTED_LIGHT_BLUE_CONCRETE_POWDER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIGHT_BLUE_CONCRETE_POWDER);
        Rifts.Blocks.BURNED_LIGHT_BLUE_CONCRETE_POWDER = (BurnedLightBlueConcretePowder) new BlockRegisterer("burned_light_blue_concrete_powder", Rifts.Blocks.BURNED_LIGHT_BLUE_CONCRETE_POWDER)
                .register();
        Rifts.Blocks.CORRUPTED_LIGHT_BLUE_GLAZED_TERRACOTTA = (CorruptedLightBlueGlazedTerracotta) new BlockRegisterer("corrupted_light_blue_glazed_terracotta", Rifts.Blocks.CORRUPTED_LIGHT_BLUE_GLAZED_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIGHT_BLUE_GLAZED_TERRACOTTA);
        Rifts.Blocks.BURNED_LIGHT_BLUE_GLAZED_TERRACOTTA = (BurnedLightBlueGlazedTerracotta) new BlockRegisterer("burned_light_blue_glazed_terracotta", Rifts.Blocks.BURNED_LIGHT_BLUE_GLAZED_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_LIGHT_BLUE_SHULKER_BOX = (CorruptedLightBlueShulkerBox) new BlockRegisterer("corrupted_light_blue_shulker_box", Rifts.Blocks.CORRUPTED_LIGHT_BLUE_SHULKER_BOX)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIGHT_BLUE_SHULKER_BOX);
        Rifts.Blocks.BURNED_LIGHT_BLUE_SHULKER_BOX = (BurnedLightBlueShulkerBox) new BlockRegisterer("burned_light_blue_shulker_box", Rifts.Blocks.BURNED_LIGHT_BLUE_SHULKER_BOX)
                .register();
        Rifts.Blocks.CORRUPTED_LIGHT_BLUE_STAINED_GLASS = (CorruptedLightBlueStainedGlass) new BlockRegisterer("corrupted_light_blue_stained_glass", Rifts.Blocks.CORRUPTED_LIGHT_BLUE_STAINED_GLASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIGHT_BLUE_STAINED_GLASS);
        Rifts.Blocks.BURNED_LIGHT_BLUE_STAINED_GLASS = (BurnedLightBlueStainedGlass) new BlockRegisterer("burned_light_blue_stained_glass", Rifts.Blocks.BURNED_LIGHT_BLUE_STAINED_GLASS)
                .register();
        Rifts.Blocks.CORRUPTED_LIGHT_BLUE_TERRACOTTA = (CorruptedLightBlueTerracotta) new BlockRegisterer("corrupted_light_blue_terracotta", Rifts.Blocks.CORRUPTED_LIGHT_BLUE_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIGHT_BLUE_TERRACOTTA);
        Rifts.Blocks.BURNED_LIGHT_BLUE_TERRACOTTA = (BurnedLightBlueTerracotta) new BlockRegisterer("burned_light_blue_terracotta", Rifts.Blocks.BURNED_LIGHT_BLUE_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_LIGHT_BLUE_WOOL = (CorruptedLightBlueWool) new BlockRegisterer("corrupted_light_blue_wool", Rifts.Blocks.CORRUPTED_LIGHT_BLUE_WOOL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIGHT_BLUE_WOOL);
        Rifts.Blocks.BURNED_LIGHT_BLUE_WOOL = (BurnedLightBlueWool) new BlockRegisterer("burned_light_blue_wool", Rifts.Blocks.BURNED_LIGHT_BLUE_WOOL)
                .register();
        Rifts.Blocks.CORRUPTED_LIGHT_GRAY_CONCRETE = (CorruptedLightGrayConcrete) new BlockRegisterer("corrupted_light_gray_concrete", Rifts.Blocks.CORRUPTED_LIGHT_GRAY_CONCRETE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIGHT_GRAY_CONCRETE);
        Rifts.Blocks.BURNED_LIGHT_GRAY_CONCRETE = (BurnedLightGrayConcrete) new BlockRegisterer("burned_light_gray_concrete", Rifts.Blocks.BURNED_LIGHT_GRAY_CONCRETE)
                .register();
        Rifts.Blocks.CORRUPTED_LIGHT_GRAY_CONCRETE_POWDER = (CorruptedLightGrayConcretePowder) new BlockRegisterer("corrupted_light_gray_concrete_powder", Rifts.Blocks.CORRUPTED_LIGHT_GRAY_CONCRETE_POWDER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIGHT_GRAY_CONCRETE_POWDER);
        Rifts.Blocks.BURNED_LIGHT_GRAY_CONCRETE_POWDER = (BurnedLightGrayConcretePowder) new BlockRegisterer("burned_light_gray_concrete_powder", Rifts.Blocks.BURNED_LIGHT_GRAY_CONCRETE_POWDER)
                .register();
        Rifts.Blocks.CORRUPTED_LIGHT_GRAY_GLAZED_TERRACOTTA = (CorruptedLightGrayGlazedTerracotta) new BlockRegisterer("corrupted_light_gray_glazed_terracotta", Rifts.Blocks.CORRUPTED_LIGHT_GRAY_GLAZED_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIGHT_GRAY_GLAZED_TERRACOTTA);
        Rifts.Blocks.BURNED_LIGHT_GRAY_GLAZED_TERRACOTTA = (BurnedLightGrayGlazedTerracotta) new BlockRegisterer("burned_light_gray_glazed_terracotta", Rifts.Blocks.BURNED_LIGHT_GRAY_GLAZED_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_LIGHT_GRAY_SHULKER_BOX = (CorruptedLightGrayShulkerBox) new BlockRegisterer("corrupted_light_gray_shulker_box", Rifts.Blocks.CORRUPTED_LIGHT_GRAY_SHULKER_BOX)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIGHT_GRAY_SHULKER_BOX);
        Rifts.Blocks.BURNED_LIGHT_GRAY_SHULKER_BOX = (BurnedLightGrayShulkerBox) new BlockRegisterer("burned_light_gray_shulker_box", Rifts.Blocks.BURNED_LIGHT_GRAY_SHULKER_BOX)
                .register();
        Rifts.Blocks.CORRUPTED_LIGHT_GRAY_STAINED_GLASS = (CorruptedLightGrayStainedGlass) new BlockRegisterer("corrupted_light_gray_stained_glass", Rifts.Blocks.CORRUPTED_LIGHT_GRAY_STAINED_GLASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIGHT_GRAY_STAINED_GLASS);
        Rifts.Blocks.BURNED_LIGHT_GRAY_STAINED_GLASS = (BurnedLightGrayStainedGlass) new BlockRegisterer("burned_light_gray_stained_glass", Rifts.Blocks.BURNED_LIGHT_GRAY_STAINED_GLASS)
                .register();
        Rifts.Blocks.CORRUPTED_LIGHT_GRAY_TERRACOTTA = (CorruptedLightGrayTerracotta) new BlockRegisterer("corrupted_light_gray_terracotta", Rifts.Blocks.CORRUPTED_LIGHT_GRAY_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIGHT_GRAY_TERRACOTTA);
        Rifts.Blocks.BURNED_LIGHT_GRAY_TERRACOTTA = (BurnedLightGrayTerracotta) new BlockRegisterer("burned_light_gray_terracotta", Rifts.Blocks.BURNED_LIGHT_GRAY_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_LIGHT_GRAY_WOOL = (CorruptedLightGrayWool) new BlockRegisterer("corrupted_light_gray_wool", Rifts.Blocks.CORRUPTED_LIGHT_GRAY_WOOL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIGHT_GRAY_WOOL);
        Rifts.Blocks.BURNED_LIGHT_GRAY_WOOL = (BurnedLightGrayWool) new BlockRegisterer("burned_light_gray_wool", Rifts.Blocks.BURNED_LIGHT_GRAY_WOOL)
                .register();
        Rifts.Blocks.CORRUPTED_LILY_OF_THE_VALLEY = (CorruptedLilyOfTheValley) new BlockRegisterer("corrupted_lily_of_the_valley", Rifts.Blocks.CORRUPTED_LILY_OF_THE_VALLEY)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LILY_OF_THE_VALLEY);
        Rifts.Blocks.BURNED_LILY_OF_THE_VALLEY = (BurnedLilyOfTheValley) new BlockRegisterer("burned_lily_of_the_valley", Rifts.Blocks.BURNED_LILY_OF_THE_VALLEY)
                .register();
        Rifts.Blocks.CORRUPTED_LILY_PAD = (CorruptedLilyPad) new BlockRegisterer("corrupted_lily_pad", Rifts.Blocks.CORRUPTED_LILY_PAD)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LILY_PAD);
        Rifts.Blocks.BURNED_LILY_PAD = (BurnedLilyPad) new BlockRegisterer("burned_lily_pad", Rifts.Blocks.BURNED_LILY_PAD)
                .register();
        Rifts.Blocks.CORRUPTED_LIME_CONCRETE = (CorruptedLimeConcrete) new BlockRegisterer("corrupted_lime_concrete", Rifts.Blocks.CORRUPTED_LIME_CONCRETE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIME_CONCRETE);
        Rifts.Blocks.BURNED_LIME_CONCRETE = (BurnedLimeConcrete) new BlockRegisterer("burned_lime_concrete", Rifts.Blocks.BURNED_LIME_CONCRETE)
                .register();
        Rifts.Blocks.CORRUPTED_LIME_CONCRETE_POWDER = (CorruptedLimeConcretePowder) new BlockRegisterer("corrupted_lime_concrete_powder", Rifts.Blocks.CORRUPTED_LIME_CONCRETE_POWDER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIME_CONCRETE_POWDER);
        Rifts.Blocks.BURNED_LIME_CONCRETE_POWDER = (BurnedLimeConcretePowder) new BlockRegisterer("burned_lime_concrete_powder", Rifts.Blocks.BURNED_LIME_CONCRETE_POWDER)
                .register();
        Rifts.Blocks.CORRUPTED_LIME_GLAZED_TERRACOTTA = (CorruptedLimeGlazedTerracotta) new BlockRegisterer("corrupted_lime_glazed_terracotta", Rifts.Blocks.CORRUPTED_LIME_GLAZED_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIME_GLAZED_TERRACOTTA);
        Rifts.Blocks.BURNED_LIME_GLAZED_TERRACOTTA = (BurnedLimeGlazedTerracotta) new BlockRegisterer("burned_lime_glazed_terracotta", Rifts.Blocks.BURNED_LIME_GLAZED_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_LIME_SHULKER_BOX = (CorruptedLimeShulkerBox) new BlockRegisterer("corrupted_lime_shulker_box", Rifts.Blocks.CORRUPTED_LIME_SHULKER_BOX)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIME_SHULKER_BOX);
        Rifts.Blocks.BURNED_LIME_SHULKER_BOX = (BurnedLimeShulkerBox) new BlockRegisterer("burned_lime_shulker_box", Rifts.Blocks.BURNED_LIME_SHULKER_BOX)
                .register();
        Rifts.Blocks.CORRUPTED_LIME_STAINED_GLASS = (CorruptedLimeStainedGlass) new BlockRegisterer("corrupted_lime_stained_glass", Rifts.Blocks.CORRUPTED_LIME_STAINED_GLASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIME_STAINED_GLASS);
        Rifts.Blocks.BURNED_LIME_STAINED_GLASS = (BurnedLimeStainedGlass) new BlockRegisterer("burned_lime_stained_glass", Rifts.Blocks.BURNED_LIME_STAINED_GLASS)
                .register();
        Rifts.Blocks.CORRUPTED_LIME_TERRACOTTA = (CorruptedLimeTerracotta) new BlockRegisterer("corrupted_lime_terracotta", Rifts.Blocks.CORRUPTED_LIME_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIME_TERRACOTTA);
        Rifts.Blocks.BURNED_LIME_TERRACOTTA = (BurnedLimeTerracotta) new BlockRegisterer("burned_lime_terracotta", Rifts.Blocks.BURNED_LIME_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_LIME_WOOL = (CorruptedLimeWool) new BlockRegisterer("corrupted_lime_wool", Rifts.Blocks.CORRUPTED_LIME_WOOL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LIME_WOOL);
        Rifts.Blocks.BURNED_LIME_WOOL = (BurnedLimeWool) new BlockRegisterer("burned_lime_wool", Rifts.Blocks.BURNED_LIME_WOOL)
                .register();
        Rifts.Blocks.CORRUPTED_LODESTONE = (CorruptedLodestone) new BlockRegisterer("corrupted_lodestone", Rifts.Blocks.CORRUPTED_LODESTONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LODESTONE);
        Rifts.Blocks.BURNED_LODESTONE = (BurnedLodestone) new BlockRegisterer("burned_lodestone", Rifts.Blocks.BURNED_LODESTONE)
                .register();
        Rifts.Blocks.CORRUPTED_LOOM = (CorruptedLoom) new BlockRegisterer("corrupted_loom", Rifts.Blocks.CORRUPTED_LOOM)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_LOOM);
        Rifts.Blocks.BURNED_LOOM = (BurnedLoom) new BlockRegisterer("burned_loom", Rifts.Blocks.BURNED_LOOM)
                .register();
        Rifts.Blocks.CORRUPTED_MAGENTA_CONCRETE = (CorruptedMagentaConcrete) new BlockRegisterer("corrupted_magenta_concrete", Rifts.Blocks.CORRUPTED_MAGENTA_CONCRETE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_MAGENTA_CONCRETE);
        Rifts.Blocks.BURNED_MAGENTA_CONCRETE = (BurnedMagentaConcrete) new BlockRegisterer("burned_magenta_concrete", Rifts.Blocks.BURNED_MAGENTA_CONCRETE)
                .register();
        Rifts.Blocks.CORRUPTED_MAGENTA_CONCRETE_POWDER = (CorruptedMagentaConcretePowder) new BlockRegisterer("corrupted_magenta_concrete_powder", Rifts.Blocks.CORRUPTED_MAGENTA_CONCRETE_POWDER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_MAGENTA_CONCRETE_POWDER);
        Rifts.Blocks.BURNED_MAGENTA_CONCRETE_POWDER = (BurnedMagentaConcretePowder) new BlockRegisterer("burned_magenta_concrete_powder", Rifts.Blocks.BURNED_MAGENTA_CONCRETE_POWDER)
                .register();
        Rifts.Blocks.CORRUPTED_MAGENTA_GLAZED_TERRACOTTA = (CorruptedMagentaGlazedTerracotta) new BlockRegisterer("corrupted_magenta_glazed_terracotta", Rifts.Blocks.CORRUPTED_MAGENTA_GLAZED_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_MAGENTA_GLAZED_TERRACOTTA);
        Rifts.Blocks.BURNED_MAGENTA_GLAZED_TERRACOTTA = (BurnedMagentaGlazedTerracotta) new BlockRegisterer("burned_magenta_glazed_terracotta", Rifts.Blocks.BURNED_MAGENTA_GLAZED_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_MAGENTA_SHULKER_BOX = (CorruptedMagentaShulkerBox) new BlockRegisterer("corrupted_magenta_shulker_box", Rifts.Blocks.CORRUPTED_MAGENTA_SHULKER_BOX)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_MAGENTA_SHULKER_BOX);
        Rifts.Blocks.BURNED_MAGENTA_SHULKER_BOX = (BurnedMagentaShulkerBox) new BlockRegisterer("burned_magenta_shulker_box", Rifts.Blocks.BURNED_MAGENTA_SHULKER_BOX)
                .register();
        Rifts.Blocks.CORRUPTED_MAGENTA_STAINED_GLASS = (CorruptedMagentaStainedGlass) new BlockRegisterer("corrupted_magenta_stained_glass", Rifts.Blocks.CORRUPTED_MAGENTA_STAINED_GLASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_MAGENTA_STAINED_GLASS);
        Rifts.Blocks.BURNED_MAGENTA_STAINED_GLASS = (BurnedMagentaStainedGlass) new BlockRegisterer("burned_magenta_stained_glass", Rifts.Blocks.BURNED_MAGENTA_STAINED_GLASS)
                .register();
        Rifts.Blocks.CORRUPTED_MAGENTA_TERRACOTTA = (CorruptedMagentaTerracotta) new BlockRegisterer("corrupted_magenta_terracotta", Rifts.Blocks.CORRUPTED_MAGENTA_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_MAGENTA_TERRACOTTA);
        Rifts.Blocks.BURNED_MAGENTA_TERRACOTTA = (BurnedMagentaTerracotta) new BlockRegisterer("burned_magenta_terracotta", Rifts.Blocks.BURNED_MAGENTA_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_MAGENTA_WOOL = (CorruptedMagentaWool) new BlockRegisterer("corrupted_magenta_wool", Rifts.Blocks.CORRUPTED_MAGENTA_WOOL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_MAGENTA_WOOL);
        Rifts.Blocks.BURNED_MAGENTA_WOOL = (BurnedMagentaWool) new BlockRegisterer("burned_magenta_wool", Rifts.Blocks.BURNED_MAGENTA_WOOL)
                .register();
        Rifts.Blocks.CORRUPTED_MEDIUM_AMETHYST_BUD = (CorruptedMediumAmethystBud) new BlockRegisterer("corrupted_medium_amethyst_bud", Rifts.Blocks.CORRUPTED_MEDIUM_AMETHYST_BUD)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_MEDIUM_AMETHYST_BUD);
        Rifts.Blocks.BURNED_MEDIUM_AMETHYST_BUD = (BurnedMediumAmethystBud) new BlockRegisterer("burned_medium_amethyst_bud", Rifts.Blocks.BURNED_MEDIUM_AMETHYST_BUD)
                .register();
        Rifts.Blocks.CORRUPTED_MELON = (CorruptedMelon) new BlockRegisterer("corrupted_melon", Rifts.Blocks.CORRUPTED_MELON)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_MELON);
        Rifts.Blocks.BURNED_MELON = (BurnedMelon) new BlockRegisterer("burned_melon", Rifts.Blocks.BURNED_MELON)
                .register();
        Rifts.Blocks.CORRUPTED_MOSSY_COBBLESTONE = (CorruptedMossyCobblestone) new BlockRegisterer("corrupted_mossy_cobblestone", Rifts.Blocks.CORRUPTED_MOSSY_COBBLESTONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_MOSSY_COBBLESTONE);
        Rifts.Blocks.BURNED_MOSSY_COBBLESTONE = (BurnedMossyCobblestone) new BlockRegisterer("burned_mossy_cobblestone", Rifts.Blocks.BURNED_MOSSY_COBBLESTONE)
                .register();
        Rifts.Blocks.CORRUPTED_MOSSY_STONE_BRICKS = (CorruptedMossyStoneBricks) new BlockRegisterer("corrupted_mossy_stone_bricks", Rifts.Blocks.CORRUPTED_MOSSY_STONE_BRICKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_MOSSY_STONE_BRICKS);
        Rifts.Blocks.BURNED_MOSSY_STONE_BRICKS = (BurnedMossyStoneBricks) new BlockRegisterer("burned_mossy_stone_bricks", Rifts.Blocks.BURNED_MOSSY_STONE_BRICKS)
                .register();
        Rifts.Blocks.CORRUPTED_MOSS_BLOCK = (CorruptedMossBlock) new BlockRegisterer("corrupted_moss_block", Rifts.Blocks.CORRUPTED_MOSS_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_MOSS_BLOCK);
        Rifts.Blocks.BURNED_MOSS_BLOCK = (BurnedMossBlock) new BlockRegisterer("burned_moss_block", Rifts.Blocks.BURNED_MOSS_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_MUSHROOM_STEM = (CorruptedMushroomStem) new BlockRegisterer("corrupted_mushroom_stem", Rifts.Blocks.CORRUPTED_MUSHROOM_STEM)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_MUSHROOM_STEM);
        Rifts.Blocks.BURNED_MUSHROOM_STEM = (BurnedMushroomStem) new BlockRegisterer("burned_mushroom_stem", Rifts.Blocks.BURNED_MUSHROOM_STEM)
                .register();
        Rifts.Blocks.CORRUPTED_MYCELIUM = (CorruptedMycelium) new BlockRegisterer("corrupted_mycelium", Rifts.Blocks.CORRUPTED_MYCELIUM)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_MYCELIUM);
        Rifts.Blocks.BURNED_MYCELIUM = (BurnedMycelium) new BlockRegisterer("burned_mycelium", Rifts.Blocks.BURNED_MYCELIUM)
                .register();
        Rifts.Blocks.CORRUPTED_NETHERITE_BLOCK = (CorruptedNetheriteBlock) new BlockRegisterer("corrupted_netherite_block", Rifts.Blocks.CORRUPTED_NETHERITE_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_NETHERITE_BLOCK);
        Rifts.Blocks.BURNED_NETHERITE_BLOCK = (BurnedNetheriteBlock) new BlockRegisterer("burned_netherite_block", Rifts.Blocks.BURNED_NETHERITE_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_NETHERRACK = (CorruptedNetherrack) new BlockRegisterer("corrupted_netherrack", Rifts.Blocks.CORRUPTED_NETHERRACK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_NETHERRACK);
        Rifts.Blocks.BURNED_NETHERRACK = (BurnedNetherrack) new BlockRegisterer("burned_netherrack", Rifts.Blocks.BURNED_NETHERRACK)
                .register();
        Rifts.Blocks.CORRUPTED_NETHER_BRICKS = (CorruptedNetherBricks) new BlockRegisterer("corrupted_nether_bricks", Rifts.Blocks.CORRUPTED_NETHER_BRICKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_NETHER_BRICKS);
        Rifts.Blocks.BURNED_NETHER_BRICKS = (BurnedNetherBricks) new BlockRegisterer("burned_nether_bricks", Rifts.Blocks.BURNED_NETHER_BRICKS)
                .register();
        Rifts.Blocks.CORRUPTED_NETHER_GOLD_ORE = (CorruptedNetherGoldOre) new BlockRegisterer("corrupted_nether_gold_ore", Rifts.Blocks.CORRUPTED_NETHER_GOLD_ORE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_NETHER_GOLD_ORE);
        Rifts.Blocks.BURNED_NETHER_GOLD_ORE = (BurnedNetherGoldOre) new BlockRegisterer("burned_nether_gold_ore", Rifts.Blocks.BURNED_NETHER_GOLD_ORE)
                .register();
        Rifts.Blocks.CORRUPTED_NETHER_QUARTZ_ORE = (CorruptedNetherQuartzOre) new BlockRegisterer("corrupted_nether_quartz_ore", Rifts.Blocks.CORRUPTED_NETHER_QUARTZ_ORE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_NETHER_QUARTZ_ORE);
        Rifts.Blocks.BURNED_NETHER_QUARTZ_ORE = (BurnedNetherQuartzOre) new BlockRegisterer("burned_nether_quartz_ore", Rifts.Blocks.BURNED_NETHER_QUARTZ_ORE)
                .register();
        Rifts.Blocks.CORRUPTED_NETHER_SPROUTS = (CorruptedNetherSprouts) new BlockRegisterer("corrupted_nether_sprouts", Rifts.Blocks.CORRUPTED_NETHER_SPROUTS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_NETHER_SPROUTS);
        Rifts.Blocks.BURNED_NETHER_SPROUTS = (BurnedNetherSprouts) new BlockRegisterer("burned_nether_sprouts", Rifts.Blocks.BURNED_NETHER_SPROUTS)
                .register();
        Rifts.Blocks.CORRUPTED_NETHER_WART_BLOCK = (CorruptedNetherWartBlock) new BlockRegisterer("corrupted_nether_wart_block", Rifts.Blocks.CORRUPTED_NETHER_WART_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_NETHER_WART_BLOCK);
        Rifts.Blocks.BURNED_NETHER_WART_BLOCK = (BurnedNetherWartBlock) new BlockRegisterer("burned_nether_wart_block", Rifts.Blocks.BURNED_NETHER_WART_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_NOTE_BLOCK = (CorruptedNoteBlock) new BlockRegisterer("corrupted_note_block", Rifts.Blocks.CORRUPTED_NOTE_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_NOTE_BLOCK);
        Rifts.Blocks.BURNED_NOTE_BLOCK = (BurnedNoteBlock) new BlockRegisterer("burned_note_block", Rifts.Blocks.BURNED_NOTE_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_OAK_LEAVES = (CorruptedOakLeaves) new BlockRegisterer("corrupted_oak_leaves", Rifts.Blocks.CORRUPTED_OAK_LEAVES)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_OAK_LEAVES);
        Rifts.Blocks.BURNED_OAK_LEAVES = (BurnedOakLeaves) new BlockRegisterer("burned_oak_leaves", Rifts.Blocks.BURNED_OAK_LEAVES)
                .register();
        Rifts.Blocks.CORRUPTED_OAK_LOG = (CorruptedOakLog) new BlockRegisterer("corrupted_oak_log", Rifts.Blocks.CORRUPTED_OAK_LOG)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_OAK_LOG);
        Rifts.Blocks.BURNED_OAK_LOG = (BurnedOakLog) new BlockRegisterer("burned_oak_log", Rifts.Blocks.BURNED_OAK_LOG)
                .register();
        Rifts.Blocks.CORRUPTED_OAK_PLANKS = (CorruptedOakPlanks) new BlockRegisterer("corrupted_oak_planks", Rifts.Blocks.CORRUPTED_OAK_PLANKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_OAK_PLANKS);
        Rifts.Blocks.BURNED_OAK_PLANKS = (BurnedOakPlanks) new BlockRegisterer("burned_oak_planks", Rifts.Blocks.BURNED_OAK_PLANKS)
                .register();
        Rifts.Blocks.CORRUPTED_OAK_SAPLING = (CorruptedOakSapling) new BlockRegisterer("corrupted_oak_sapling", Rifts.Blocks.CORRUPTED_OAK_SAPLING)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_OAK_SAPLING);
        Rifts.Blocks.BURNED_OAK_SAPLING = (BurnedOakSapling) new BlockRegisterer("burned_oak_sapling", Rifts.Blocks.BURNED_OAK_SAPLING)
                .register();
        Rifts.Blocks.CORRUPTED_OBSERVER = (CorruptedObserver) new BlockRegisterer("corrupted_observer", Rifts.Blocks.CORRUPTED_OBSERVER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_OBSERVER);
        Rifts.Blocks.BURNED_OBSERVER = (BurnedObserver) new BlockRegisterer("burned_observer", Rifts.Blocks.BURNED_OBSERVER)
                .register();
        Rifts.Blocks.CORRUPTED_OBSIDIAN = (CorruptedObsidian) new BlockRegisterer("corrupted_obsidian", Rifts.Blocks.CORRUPTED_OBSIDIAN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_OBSIDIAN);
        Rifts.Blocks.BURNED_OBSIDIAN = (BurnedObsidian) new BlockRegisterer("burned_obsidian", Rifts.Blocks.BURNED_OBSIDIAN)
                .register();
        Rifts.Blocks.CORRUPTED_ORANGE_CONCRETE = (CorruptedOrangeConcrete) new BlockRegisterer("corrupted_orange_concrete", Rifts.Blocks.CORRUPTED_ORANGE_CONCRETE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ORANGE_CONCRETE);
        Rifts.Blocks.BURNED_ORANGE_CONCRETE = (BurnedOrangeConcrete) new BlockRegisterer("burned_orange_concrete", Rifts.Blocks.BURNED_ORANGE_CONCRETE)
                .register();
        Rifts.Blocks.CORRUPTED_ORANGE_CONCRETE_POWDER = (CorruptedOrangeConcretePowder) new BlockRegisterer("corrupted_orange_concrete_powder", Rifts.Blocks.CORRUPTED_ORANGE_CONCRETE_POWDER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ORANGE_CONCRETE_POWDER);
        Rifts.Blocks.BURNED_ORANGE_CONCRETE_POWDER = (BurnedOrangeConcretePowder) new BlockRegisterer("burned_orange_concrete_powder", Rifts.Blocks.BURNED_ORANGE_CONCRETE_POWDER)
                .register();
        Rifts.Blocks.CORRUPTED_ORANGE_GLAZED_TERRACOTTA = (CorruptedOrangeGlazedTerracotta) new BlockRegisterer("corrupted_orange_glazed_terracotta", Rifts.Blocks.CORRUPTED_ORANGE_GLAZED_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ORANGE_GLAZED_TERRACOTTA);
        Rifts.Blocks.BURNED_ORANGE_GLAZED_TERRACOTTA = (BurnedOrangeGlazedTerracotta) new BlockRegisterer("burned_orange_glazed_terracotta", Rifts.Blocks.BURNED_ORANGE_GLAZED_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_ORANGE_SHULKER_BOX = (CorruptedOrangeShulkerBox) new BlockRegisterer("corrupted_orange_shulker_box", Rifts.Blocks.CORRUPTED_ORANGE_SHULKER_BOX)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ORANGE_SHULKER_BOX);
        Rifts.Blocks.BURNED_ORANGE_SHULKER_BOX = (BurnedOrangeShulkerBox) new BlockRegisterer("burned_orange_shulker_box", Rifts.Blocks.BURNED_ORANGE_SHULKER_BOX)
                .register();
        Rifts.Blocks.CORRUPTED_ORANGE_STAINED_GLASS = (CorruptedOrangeStainedGlass) new BlockRegisterer("corrupted_orange_stained_glass", Rifts.Blocks.CORRUPTED_ORANGE_STAINED_GLASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ORANGE_STAINED_GLASS);
        Rifts.Blocks.BURNED_ORANGE_STAINED_GLASS = (BurnedOrangeStainedGlass) new BlockRegisterer("burned_orange_stained_glass", Rifts.Blocks.BURNED_ORANGE_STAINED_GLASS)
                .register();
        Rifts.Blocks.CORRUPTED_ORANGE_TERRACOTTA = (CorruptedOrangeTerracotta) new BlockRegisterer("corrupted_orange_terracotta", Rifts.Blocks.CORRUPTED_ORANGE_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ORANGE_TERRACOTTA);
        Rifts.Blocks.BURNED_ORANGE_TERRACOTTA = (BurnedOrangeTerracotta) new BlockRegisterer("burned_orange_terracotta", Rifts.Blocks.BURNED_ORANGE_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_ORANGE_TULIP = (CorruptedOrangeTulip) new BlockRegisterer("corrupted_orange_tulip", Rifts.Blocks.CORRUPTED_ORANGE_TULIP)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ORANGE_TULIP);
        Rifts.Blocks.BURNED_ORANGE_TULIP = (BurnedOrangeTulip) new BlockRegisterer("burned_orange_tulip", Rifts.Blocks.BURNED_ORANGE_TULIP)
                .register();
        Rifts.Blocks.CORRUPTED_ORANGE_WOOL = (CorruptedOrangeWool) new BlockRegisterer("corrupted_orange_wool", Rifts.Blocks.CORRUPTED_ORANGE_WOOL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ORANGE_WOOL);
        Rifts.Blocks.BURNED_ORANGE_WOOL = (BurnedOrangeWool) new BlockRegisterer("burned_orange_wool", Rifts.Blocks.BURNED_ORANGE_WOOL)
                .register();
        Rifts.Blocks.CORRUPTED_OXEYE_DAISY = (CorruptedOxeyeDaisy) new BlockRegisterer("corrupted_oxeye_daisy", Rifts.Blocks.CORRUPTED_OXEYE_DAISY)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_OXEYE_DAISY);
        Rifts.Blocks.BURNED_OXEYE_DAISY = (BurnedOxeyeDaisy) new BlockRegisterer("burned_oxeye_daisy", Rifts.Blocks.BURNED_OXEYE_DAISY)
                .register();
        Rifts.Blocks.CORRUPTED_OXIDIZED_COPPER = (CorruptedOxidizedCopper) new BlockRegisterer("corrupted_oxidized_copper", Rifts.Blocks.CORRUPTED_OXIDIZED_COPPER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_OXIDIZED_COPPER);
        Rifts.Blocks.BURNED_OXIDIZED_COPPER = (BurnedOxidizedCopper) new BlockRegisterer("burned_oxidized_copper", Rifts.Blocks.BURNED_OXIDIZED_COPPER)
                .register();
        Rifts.Blocks.CORRUPTED_OXIDIZED_CUT_COPPER = (CorruptedOxidizedCutCopper) new BlockRegisterer("corrupted_oxidized_cut_copper", Rifts.Blocks.CORRUPTED_OXIDIZED_CUT_COPPER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_OXIDIZED_CUT_COPPER);
        Rifts.Blocks.BURNED_OXIDIZED_CUT_COPPER = (BurnedOxidizedCutCopper) new BlockRegisterer("burned_oxidized_cut_copper", Rifts.Blocks.BURNED_OXIDIZED_CUT_COPPER)
                .register();
        Rifts.Blocks.CORRUPTED_PACKED_ICE = (CorruptedPackedIce) new BlockRegisterer("corrupted_packed_ice", Rifts.Blocks.CORRUPTED_PACKED_ICE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PACKED_ICE);
        Rifts.Blocks.BURNED_PACKED_ICE = (BurnedPackedIce) new BlockRegisterer("burned_packed_ice", Rifts.Blocks.BURNED_PACKED_ICE)
                .register();
        Rifts.Blocks.CORRUPTED_PINK_CONCRETE = (CorruptedPinkConcrete) new BlockRegisterer("corrupted_pink_concrete", Rifts.Blocks.CORRUPTED_PINK_CONCRETE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PINK_CONCRETE);
        Rifts.Blocks.BURNED_PINK_CONCRETE = (BurnedPinkConcrete) new BlockRegisterer("burned_pink_concrete", Rifts.Blocks.BURNED_PINK_CONCRETE)
                .register();
        Rifts.Blocks.CORRUPTED_PINK_CONCRETE_POWDER = (CorruptedPinkConcretePowder) new BlockRegisterer("corrupted_pink_concrete_powder", Rifts.Blocks.CORRUPTED_PINK_CONCRETE_POWDER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PINK_CONCRETE_POWDER);
        Rifts.Blocks.BURNED_PINK_CONCRETE_POWDER = (BurnedPinkConcretePowder) new BlockRegisterer("burned_pink_concrete_powder", Rifts.Blocks.BURNED_PINK_CONCRETE_POWDER)
                .register();
        Rifts.Blocks.CORRUPTED_PINK_GLAZED_TERRACOTTA = (CorruptedPinkGlazedTerracotta) new BlockRegisterer("corrupted_pink_glazed_terracotta", Rifts.Blocks.CORRUPTED_PINK_GLAZED_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PINK_GLAZED_TERRACOTTA);
        Rifts.Blocks.BURNED_PINK_GLAZED_TERRACOTTA = (BurnedPinkGlazedTerracotta) new BlockRegisterer("burned_pink_glazed_terracotta", Rifts.Blocks.BURNED_PINK_GLAZED_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_PINK_SHULKER_BOX = (CorruptedPinkShulkerBox) new BlockRegisterer("corrupted_pink_shulker_box", Rifts.Blocks.CORRUPTED_PINK_SHULKER_BOX)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PINK_SHULKER_BOX);
        Rifts.Blocks.BURNED_PINK_SHULKER_BOX = (BurnedPinkShulkerBox) new BlockRegisterer("burned_pink_shulker_box", Rifts.Blocks.BURNED_PINK_SHULKER_BOX)
                .register();
        Rifts.Blocks.CORRUPTED_PINK_STAINED_GLASS = (CorruptedPinkStainedGlass) new BlockRegisterer("corrupted_pink_stained_glass", Rifts.Blocks.CORRUPTED_PINK_STAINED_GLASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PINK_STAINED_GLASS);
        Rifts.Blocks.BURNED_PINK_STAINED_GLASS = (BurnedPinkStainedGlass) new BlockRegisterer("burned_pink_stained_glass", Rifts.Blocks.BURNED_PINK_STAINED_GLASS)
                .register();
        Rifts.Blocks.CORRUPTED_PINK_TERRACOTTA = (CorruptedPinkTerracotta) new BlockRegisterer("corrupted_pink_terracotta", Rifts.Blocks.CORRUPTED_PINK_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PINK_TERRACOTTA);
        Rifts.Blocks.BURNED_PINK_TERRACOTTA = (BurnedPinkTerracotta) new BlockRegisterer("burned_pink_terracotta", Rifts.Blocks.BURNED_PINK_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_PINK_TULIP = (CorruptedPinkTulip) new BlockRegisterer("corrupted_pink_tulip", Rifts.Blocks.CORRUPTED_PINK_TULIP)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PINK_TULIP);
        Rifts.Blocks.BURNED_PINK_TULIP = (BurnedPinkTulip) new BlockRegisterer("burned_pink_tulip", Rifts.Blocks.BURNED_PINK_TULIP)
                .register();
        Rifts.Blocks.CORRUPTED_PINK_WOOL = (CorruptedPinkWool) new BlockRegisterer("corrupted_pink_wool", Rifts.Blocks.CORRUPTED_PINK_WOOL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PINK_WOOL);
        Rifts.Blocks.BURNED_PINK_WOOL = (BurnedPinkWool) new BlockRegisterer("burned_pink_wool", Rifts.Blocks.BURNED_PINK_WOOL)
                .register();
        Rifts.Blocks.CORRUPTED_PISTON = (CorruptedPiston) new BlockRegisterer("corrupted_piston", Rifts.Blocks.CORRUPTED_PISTON)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PISTON);
        Rifts.Blocks.BURNED_PISTON = (BurnedPiston) new BlockRegisterer("burned_piston", Rifts.Blocks.BURNED_PISTON)
                .register();
        Rifts.Blocks.CORRUPTED_PODZOL = (CorruptedPodzol) new BlockRegisterer("corrupted_podzol", Rifts.Blocks.CORRUPTED_PODZOL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PODZOL);
        Rifts.Blocks.BURNED_PODZOL = (BurnedPodzol) new BlockRegisterer("burned_podzol", Rifts.Blocks.BURNED_PODZOL)
                .register();
        Rifts.Blocks.CORRUPTED_POINTED_DRIPSTONE = (CorruptedPointedDripstone) new BlockRegisterer("corrupted_pointed_dripstone", Rifts.Blocks.CORRUPTED_POINTED_DRIPSTONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_POINTED_DRIPSTONE);
        Rifts.Blocks.BURNED_POINTED_DRIPSTONE = (BurnedPointedDripstone) new BlockRegisterer("burned_pointed_dripstone", Rifts.Blocks.BURNED_POINTED_DRIPSTONE)
                .register();
        Rifts.Blocks.CORRUPTED_POLISHED_ANDESITE = (CorruptedPolishedAndesite) new BlockRegisterer("corrupted_polished_andesite", Rifts.Blocks.CORRUPTED_POLISHED_ANDESITE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_POLISHED_ANDESITE);
        Rifts.Blocks.BURNED_POLISHED_ANDESITE = (BurnedPolishedAndesite) new BlockRegisterer("burned_polished_andesite", Rifts.Blocks.BURNED_POLISHED_ANDESITE)
                .register();
        Rifts.Blocks.CORRUPTED_POLISHED_BASALT = (CorruptedPolishedBasalt) new BlockRegisterer("corrupted_polished_basalt", Rifts.Blocks.CORRUPTED_POLISHED_BASALT)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_POLISHED_BASALT);
        Rifts.Blocks.BURNED_POLISHED_BASALT = (BurnedPolishedBasalt) new BlockRegisterer("burned_polished_basalt", Rifts.Blocks.BURNED_POLISHED_BASALT)
                .register();
        Rifts.Blocks.CORRUPTED_POLISHED_BLACKSTONE = (CorruptedPolishedBlackstone) new BlockRegisterer("corrupted_polished_blackstone", Rifts.Blocks.CORRUPTED_POLISHED_BLACKSTONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_POLISHED_BLACKSTONE);
        Rifts.Blocks.BURNED_POLISHED_BLACKSTONE = (BurnedPolishedBlackstone) new BlockRegisterer("burned_polished_blackstone", Rifts.Blocks.BURNED_POLISHED_BLACKSTONE)
                .register();
        Rifts.Blocks.CORRUPTED_POLISHED_BLACKSTONE_BRICKS = (CorruptedPolishedBlackstoneBricks) new BlockRegisterer("corrupted_polished_blackstone_bricks", Rifts.Blocks.CORRUPTED_POLISHED_BLACKSTONE_BRICKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_POLISHED_BLACKSTONE_BRICKS);
        Rifts.Blocks.BURNED_POLISHED_BLACKSTONE_BRICKS = (BurnedPolishedBlackstoneBricks) new BlockRegisterer("burned_polished_blackstone_bricks", Rifts.Blocks.BURNED_POLISHED_BLACKSTONE_BRICKS)
                .register();
        Rifts.Blocks.CORRUPTED_POLISHED_DEEPSLATE = (CorruptedPolishedDeepslate) new BlockRegisterer("corrupted_polished_deepslate", Rifts.Blocks.CORRUPTED_POLISHED_DEEPSLATE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_POLISHED_DEEPSLATE);
        Rifts.Blocks.BURNED_POLISHED_DEEPSLATE = (BurnedPolishedDeepslate) new BlockRegisterer("burned_polished_deepslate", Rifts.Blocks.BURNED_POLISHED_DEEPSLATE)
                .register();
        Rifts.Blocks.CORRUPTED_POLISHED_DIORITE = (CorruptedPolishedDiorite) new BlockRegisterer("corrupted_polished_diorite", Rifts.Blocks.CORRUPTED_POLISHED_DIORITE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_POLISHED_DIORITE);
        Rifts.Blocks.BURNED_POLISHED_DIORITE = (BurnedPolishedDiorite) new BlockRegisterer("burned_polished_diorite", Rifts.Blocks.BURNED_POLISHED_DIORITE)
                .register();
        Rifts.Blocks.CORRUPTED_POLISHED_GRANITE = (CorruptedPolishedGranite) new BlockRegisterer("corrupted_polished_granite", Rifts.Blocks.CORRUPTED_POLISHED_GRANITE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_POLISHED_GRANITE);
        Rifts.Blocks.BURNED_POLISHED_GRANITE = (BurnedPolishedGranite) new BlockRegisterer("burned_polished_granite", Rifts.Blocks.BURNED_POLISHED_GRANITE)
                .register();
        Rifts.Blocks.CORRUPTED_POPPY = (CorruptedPoppy) new BlockRegisterer("corrupted_poppy", Rifts.Blocks.CORRUPTED_POPPY)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_POPPY);
        Rifts.Blocks.BURNED_POPPY = (BurnedPoppy) new BlockRegisterer("burned_poppy", Rifts.Blocks.BURNED_POPPY)
                .register();
        Rifts.Blocks.CORRUPTED_POTTED_AZALEA_BUSH = (CorruptedPottedAzaleaBush) new BlockRegisterer("corrupted_potted_azalea_bush", Rifts.Blocks.CORRUPTED_POTTED_AZALEA_BUSH)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_POTTED_AZALEA_BUSH);
        Rifts.Blocks.BURNED_POTTED_AZALEA_BUSH = (BurnedPottedAzaleaBush) new BlockRegisterer("burned_potted_azalea_bush", Rifts.Blocks.BURNED_POTTED_AZALEA_BUSH)
                .register();
        Rifts.Blocks.CORRUPTED_POTTED_FLOWERING_AZALEA_BUSH = (CorruptedPottedFloweringAzaleaBush) new BlockRegisterer("corrupted_potted_flowering_azalea_bush", Rifts.Blocks.CORRUPTED_POTTED_FLOWERING_AZALEA_BUSH)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_POTTED_FLOWERING_AZALEA_BUSH);
        Rifts.Blocks.BURNED_POTTED_FLOWERING_AZALEA_BUSH = (BurnedPottedFloweringAzaleaBush) new BlockRegisterer("burned_potted_flowering_azalea_bush", Rifts.Blocks.BURNED_POTTED_FLOWERING_AZALEA_BUSH)
                .register();
        Rifts.Blocks.CORRUPTED_POWDER_SNOW = (CorruptedPowderSnow) new BlockRegisterer("corrupted_powder_snow", Rifts.Blocks.CORRUPTED_POWDER_SNOW)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_POWDER_SNOW);
        Rifts.Blocks.BURNED_POWDER_SNOW = (BurnedPowderSnow) new BlockRegisterer("burned_powder_snow", Rifts.Blocks.BURNED_POWDER_SNOW)
                .register();
        Rifts.Blocks.CORRUPTED_POWERED_RAIL = (CorruptedPoweredRail) new BlockRegisterer("corrupted_powered_rail", Rifts.Blocks.CORRUPTED_POWERED_RAIL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_POWERED_RAIL);
        Rifts.Blocks.BURNED_POWERED_RAIL = (BurnedPoweredRail) new BlockRegisterer("burned_powered_rail", Rifts.Blocks.BURNED_POWERED_RAIL)
                .register();
        Rifts.Blocks.CORRUPTED_PRISMARINE = (CorruptedPrismarine) new BlockRegisterer("corrupted_prismarine", Rifts.Blocks.CORRUPTED_PRISMARINE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PRISMARINE);
        Rifts.Blocks.BURNED_PRISMARINE = (BurnedPrismarine) new BlockRegisterer("burned_prismarine", Rifts.Blocks.BURNED_PRISMARINE)
                .register();
        Rifts.Blocks.CORRUPTED_PRISMARINE_BRICKS = (CorruptedPrismarineBricks) new BlockRegisterer("corrupted_prismarine_bricks", Rifts.Blocks.CORRUPTED_PRISMARINE_BRICKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PRISMARINE_BRICKS);
        Rifts.Blocks.BURNED_PRISMARINE_BRICKS = (BurnedPrismarineBricks) new BlockRegisterer("burned_prismarine_bricks", Rifts.Blocks.BURNED_PRISMARINE_BRICKS)
                .register();
        Rifts.Blocks.CORRUPTED_PUMPKIN = (CorruptedPumpkin) new BlockRegisterer("corrupted_pumpkin", Rifts.Blocks.CORRUPTED_PUMPKIN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PUMPKIN);
        Rifts.Blocks.BURNED_PUMPKIN = (BurnedPumpkin) new BlockRegisterer("burned_pumpkin", Rifts.Blocks.BURNED_PUMPKIN)
                .register();
        Rifts.Blocks.CORRUPTED_PURPLE_CONCRETE = (CorruptedPurpleConcrete) new BlockRegisterer("corrupted_purple_concrete", Rifts.Blocks.CORRUPTED_PURPLE_CONCRETE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PURPLE_CONCRETE);
        Rifts.Blocks.BURNED_PURPLE_CONCRETE = (BurnedPurpleConcrete) new BlockRegisterer("burned_purple_concrete", Rifts.Blocks.BURNED_PURPLE_CONCRETE)
                .register();
        Rifts.Blocks.CORRUPTED_PURPLE_CONCRETE_POWDER = (CorruptedPurpleConcretePowder) new BlockRegisterer("corrupted_purple_concrete_powder", Rifts.Blocks.CORRUPTED_PURPLE_CONCRETE_POWDER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PURPLE_CONCRETE_POWDER);
        Rifts.Blocks.BURNED_PURPLE_CONCRETE_POWDER = (BurnedPurpleConcretePowder) new BlockRegisterer("burned_purple_concrete_powder", Rifts.Blocks.BURNED_PURPLE_CONCRETE_POWDER)
                .register();
        Rifts.Blocks.CORRUPTED_PURPLE_GLAZED_TERRACOTTA = (CorruptedPurpleGlazedTerracotta) new BlockRegisterer("corrupted_purple_glazed_terracotta", Rifts.Blocks.CORRUPTED_PURPLE_GLAZED_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PURPLE_GLAZED_TERRACOTTA);
        Rifts.Blocks.BURNED_PURPLE_GLAZED_TERRACOTTA = (BurnedPurpleGlazedTerracotta) new BlockRegisterer("burned_purple_glazed_terracotta", Rifts.Blocks.BURNED_PURPLE_GLAZED_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_PURPLE_SHULKER_BOX = (CorruptedPurpleShulkerBox) new BlockRegisterer("corrupted_purple_shulker_box", Rifts.Blocks.CORRUPTED_PURPLE_SHULKER_BOX)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PURPLE_SHULKER_BOX);
        Rifts.Blocks.BURNED_PURPLE_SHULKER_BOX = (BurnedPurpleShulkerBox) new BlockRegisterer("burned_purple_shulker_box", Rifts.Blocks.BURNED_PURPLE_SHULKER_BOX)
                .register();
        Rifts.Blocks.CORRUPTED_PURPLE_STAINED_GLASS = (CorruptedPurpleStainedGlass) new BlockRegisterer("corrupted_purple_stained_glass", Rifts.Blocks.CORRUPTED_PURPLE_STAINED_GLASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PURPLE_STAINED_GLASS);
        Rifts.Blocks.BURNED_PURPLE_STAINED_GLASS = (BurnedPurpleStainedGlass) new BlockRegisterer("burned_purple_stained_glass", Rifts.Blocks.BURNED_PURPLE_STAINED_GLASS)
                .register();
        Rifts.Blocks.CORRUPTED_PURPLE_TERRACOTTA = (CorruptedPurpleTerracotta) new BlockRegisterer("corrupted_purple_terracotta", Rifts.Blocks.CORRUPTED_PURPLE_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PURPLE_TERRACOTTA);
        Rifts.Blocks.BURNED_PURPLE_TERRACOTTA = (BurnedPurpleTerracotta) new BlockRegisterer("burned_purple_terracotta", Rifts.Blocks.BURNED_PURPLE_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_PURPLE_WOOL = (CorruptedPurpleWool) new BlockRegisterer("corrupted_purple_wool", Rifts.Blocks.CORRUPTED_PURPLE_WOOL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PURPLE_WOOL);
        Rifts.Blocks.BURNED_PURPLE_WOOL = (BurnedPurpleWool) new BlockRegisterer("burned_purple_wool", Rifts.Blocks.BURNED_PURPLE_WOOL)
                .register();
        Rifts.Blocks.CORRUPTED_PURPUR_BLOCK = (CorruptedPurpurBlock) new BlockRegisterer("corrupted_purpur_block", Rifts.Blocks.CORRUPTED_PURPUR_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PURPUR_BLOCK);
        Rifts.Blocks.BURNED_PURPUR_BLOCK = (BurnedPurpurBlock) new BlockRegisterer("burned_purpur_block", Rifts.Blocks.BURNED_PURPUR_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_PURPUR_PILLAR = (CorruptedPurpurPillar) new BlockRegisterer("corrupted_purpur_pillar", Rifts.Blocks.CORRUPTED_PURPUR_PILLAR)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_PURPUR_PILLAR);
        Rifts.Blocks.BURNED_PURPUR_PILLAR = (BurnedPurpurPillar) new BlockRegisterer("burned_purpur_pillar", Rifts.Blocks.BURNED_PURPUR_PILLAR)
                .register();
        Rifts.Blocks.CORRUPTED_QUARTZ_BLOCK = (CorruptedQuartzBlock) new BlockRegisterer("corrupted_quartz_block", Rifts.Blocks.CORRUPTED_QUARTZ_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_QUARTZ_BLOCK);
        Rifts.Blocks.BURNED_QUARTZ_BLOCK = (BurnedQuartzBlock) new BlockRegisterer("burned_quartz_block", Rifts.Blocks.BURNED_QUARTZ_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_QUARTZ_BRICKS = (CorruptedQuartzBricks) new BlockRegisterer("corrupted_quartz_bricks", Rifts.Blocks.CORRUPTED_QUARTZ_BRICKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_QUARTZ_BRICKS);
        Rifts.Blocks.BURNED_QUARTZ_BRICKS = (BurnedQuartzBricks) new BlockRegisterer("burned_quartz_bricks", Rifts.Blocks.BURNED_QUARTZ_BRICKS)
                .register();
        Rifts.Blocks.CORRUPTED_QUARTZ_PILLAR = (CorruptedQuartzPillar) new BlockRegisterer("corrupted_quartz_pillar", Rifts.Blocks.CORRUPTED_QUARTZ_PILLAR)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_QUARTZ_PILLAR);
        Rifts.Blocks.BURNED_QUARTZ_PILLAR = (BurnedQuartzPillar) new BlockRegisterer("burned_quartz_pillar", Rifts.Blocks.BURNED_QUARTZ_PILLAR)
                .register();
        Rifts.Blocks.CORRUPTED_RAIL = (CorruptedRail) new BlockRegisterer("corrupted_rail", Rifts.Blocks.CORRUPTED_RAIL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_RAIL);
        Rifts.Blocks.BURNED_RAIL = (BurnedRail) new BlockRegisterer("burned_rail", Rifts.Blocks.BURNED_RAIL)
                .register();
        Rifts.Blocks.CORRUPTED_RAW_COPPER_BLOCK = (CorruptedRawCopperBlock) new BlockRegisterer("corrupted_raw_copper_block", Rifts.Blocks.CORRUPTED_RAW_COPPER_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_RAW_COPPER_BLOCK);
        Rifts.Blocks.BURNED_RAW_COPPER_BLOCK = (BurnedRawCopperBlock) new BlockRegisterer("burned_raw_copper_block", Rifts.Blocks.BURNED_RAW_COPPER_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_RAW_GOLD_BLOCK = (CorruptedRawGoldBlock) new BlockRegisterer("corrupted_raw_gold_block", Rifts.Blocks.CORRUPTED_RAW_GOLD_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_RAW_GOLD_BLOCK);
        Rifts.Blocks.BURNED_RAW_GOLD_BLOCK = (BurnedRawGoldBlock) new BlockRegisterer("burned_raw_gold_block", Rifts.Blocks.BURNED_RAW_GOLD_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_RAW_IRON_BLOCK = (CorruptedRawIronBlock) new BlockRegisterer("corrupted_raw_iron_block", Rifts.Blocks.CORRUPTED_RAW_IRON_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_RAW_IRON_BLOCK);
        Rifts.Blocks.BURNED_RAW_IRON_BLOCK = (BurnedRawIronBlock) new BlockRegisterer("burned_raw_iron_block", Rifts.Blocks.BURNED_RAW_IRON_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_REDSTONE_BLOCK = (CorruptedRedstoneBlock) new BlockRegisterer("corrupted_redstone_block", Rifts.Blocks.CORRUPTED_REDSTONE_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_REDSTONE_BLOCK);
        Rifts.Blocks.BURNED_REDSTONE_BLOCK = (BurnedRedstoneBlock) new BlockRegisterer("burned_redstone_block", Rifts.Blocks.BURNED_REDSTONE_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_REDSTONE_LAMP = (CorruptedRedstoneLamp) new BlockRegisterer("corrupted_redstone_lamp", Rifts.Blocks.CORRUPTED_REDSTONE_LAMP)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_REDSTONE_LAMP);
        Rifts.Blocks.BURNED_REDSTONE_LAMP = (BurnedRedstoneLamp) new BlockRegisterer("burned_redstone_lamp", Rifts.Blocks.BURNED_REDSTONE_LAMP)
                .register();
        Rifts.Blocks.CORRUPTED_REDSTONE_ORE = (CorruptedRedstoneOre) new BlockRegisterer("corrupted_redstone_ore", Rifts.Blocks.CORRUPTED_REDSTONE_ORE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_REDSTONE_ORE);
        Rifts.Blocks.BURNED_REDSTONE_ORE = (BurnedRedstoneOre) new BlockRegisterer("burned_redstone_ore", Rifts.Blocks.BURNED_REDSTONE_ORE)
                .register();
        Rifts.Blocks.CORRUPTED_REDSTONE_TORCH = (CorruptedRedstoneTorch) new BlockRegisterer("corrupted_redstone_torch", Rifts.Blocks.CORRUPTED_REDSTONE_TORCH)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_REDSTONE_TORCH);
        Rifts.Blocks.BURNED_REDSTONE_TORCH = (BurnedRedstoneTorch) new BlockRegisterer("burned_redstone_torch", Rifts.Blocks.BURNED_REDSTONE_TORCH)
                .register();
        Rifts.Blocks.CORRUPTED_RED_CONCRETE = (CorruptedRedConcrete) new BlockRegisterer("corrupted_red_concrete", Rifts.Blocks.CORRUPTED_RED_CONCRETE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_RED_CONCRETE);
        Rifts.Blocks.BURNED_RED_CONCRETE = (BurnedRedConcrete) new BlockRegisterer("burned_red_concrete", Rifts.Blocks.BURNED_RED_CONCRETE)
                .register();
        Rifts.Blocks.CORRUPTED_RED_CONCRETE_POWDER = (CorruptedRedConcretePowder) new BlockRegisterer("corrupted_red_concrete_powder", Rifts.Blocks.CORRUPTED_RED_CONCRETE_POWDER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_RED_CONCRETE_POWDER);
        Rifts.Blocks.BURNED_RED_CONCRETE_POWDER = (BurnedRedConcretePowder) new BlockRegisterer("burned_red_concrete_powder", Rifts.Blocks.BURNED_RED_CONCRETE_POWDER)
                .register();
        Rifts.Blocks.CORRUPTED_RED_GLAZED_TERRACOTTA = (CorruptedRedGlazedTerracotta) new BlockRegisterer("corrupted_red_glazed_terracotta", Rifts.Blocks.CORRUPTED_RED_GLAZED_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_RED_GLAZED_TERRACOTTA);
        Rifts.Blocks.BURNED_RED_GLAZED_TERRACOTTA = (BurnedRedGlazedTerracotta) new BlockRegisterer("burned_red_glazed_terracotta", Rifts.Blocks.BURNED_RED_GLAZED_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_RED_MUSHROOM = (CorruptedRedMushroom) new BlockRegisterer("corrupted_red_mushroom", Rifts.Blocks.CORRUPTED_RED_MUSHROOM)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_RED_MUSHROOM);
        Rifts.Blocks.BURNED_RED_MUSHROOM = (BurnedRedMushroom) new BlockRegisterer("burned_red_mushroom", Rifts.Blocks.BURNED_RED_MUSHROOM)
                .register();
        Rifts.Blocks.CORRUPTED_RED_MUSHROOM_BLOCK = (CorruptedRedMushroomBlock) new BlockRegisterer("corrupted_red_mushroom_block", Rifts.Blocks.CORRUPTED_RED_MUSHROOM_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_RED_MUSHROOM_BLOCK);
        Rifts.Blocks.BURNED_RED_MUSHROOM_BLOCK = (BurnedRedMushroomBlock) new BlockRegisterer("burned_red_mushroom_block", Rifts.Blocks.BURNED_RED_MUSHROOM_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_RED_NETHER_BRICKS = (CorruptedRedNetherBricks) new BlockRegisterer("corrupted_red_nether_bricks", Rifts.Blocks.CORRUPTED_RED_NETHER_BRICKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_RED_NETHER_BRICKS);
        Rifts.Blocks.BURNED_RED_NETHER_BRICKS = (BurnedRedNetherBricks) new BlockRegisterer("burned_red_nether_bricks", Rifts.Blocks.BURNED_RED_NETHER_BRICKS)
                .register();
        Rifts.Blocks.CORRUPTED_RED_SAND = (CorruptedRedSand) new BlockRegisterer("corrupted_red_sand", Rifts.Blocks.CORRUPTED_RED_SAND)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_RED_SAND);
        Rifts.Blocks.BURNED_RED_SAND = (BurnedRedSand) new BlockRegisterer("burned_red_sand", Rifts.Blocks.BURNED_RED_SAND)
                .register();
        Rifts.Blocks.CORRUPTED_RED_SANDSTONE = (CorruptedRedSandstone) new BlockRegisterer("corrupted_red_sandstone", Rifts.Blocks.CORRUPTED_RED_SANDSTONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_RED_SANDSTONE);
        Rifts.Blocks.BURNED_RED_SANDSTONE = (BurnedRedSandstone) new BlockRegisterer("burned_red_sandstone", Rifts.Blocks.BURNED_RED_SANDSTONE)
                .register();
        Rifts.Blocks.CORRUPTED_RED_SHULKER_BOX = (CorruptedRedShulkerBox) new BlockRegisterer("corrupted_red_shulker_box", Rifts.Blocks.CORRUPTED_RED_SHULKER_BOX)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_RED_SHULKER_BOX);
        Rifts.Blocks.BURNED_RED_SHULKER_BOX = (BurnedRedShulkerBox) new BlockRegisterer("burned_red_shulker_box", Rifts.Blocks.BURNED_RED_SHULKER_BOX)
                .register();
        Rifts.Blocks.CORRUPTED_RED_STAINED_GLASS = (CorruptedRedStainedGlass) new BlockRegisterer("corrupted_red_stained_glass", Rifts.Blocks.CORRUPTED_RED_STAINED_GLASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_RED_STAINED_GLASS);
        Rifts.Blocks.BURNED_RED_STAINED_GLASS = (BurnedRedStainedGlass) new BlockRegisterer("burned_red_stained_glass", Rifts.Blocks.BURNED_RED_STAINED_GLASS)
                .register();
        Rifts.Blocks.CORRUPTED_RED_TERRACOTTA = (CorruptedRedTerracotta) new BlockRegisterer("corrupted_red_terracotta", Rifts.Blocks.CORRUPTED_RED_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_RED_TERRACOTTA);
        Rifts.Blocks.BURNED_RED_TERRACOTTA = (BurnedRedTerracotta) new BlockRegisterer("burned_red_terracotta", Rifts.Blocks.BURNED_RED_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_RED_TULIP = (CorruptedRedTulip) new BlockRegisterer("corrupted_red_tulip", Rifts.Blocks.CORRUPTED_RED_TULIP)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_RED_TULIP);
        Rifts.Blocks.BURNED_RED_TULIP = (BurnedRedTulip) new BlockRegisterer("burned_red_tulip", Rifts.Blocks.BURNED_RED_TULIP)
                .register();
        Rifts.Blocks.CORRUPTED_RED_WOOL = (CorruptedRedWool) new BlockRegisterer("corrupted_red_wool", Rifts.Blocks.CORRUPTED_RED_WOOL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_RED_WOOL);
        Rifts.Blocks.BURNED_RED_WOOL = (BurnedRedWool) new BlockRegisterer("burned_red_wool", Rifts.Blocks.BURNED_RED_WOOL)
                .register();
        Rifts.Blocks.CORRUPTED_REPEATING_COMMAND_BLOCK = (CorruptedRepeatingCommandBlock) new BlockRegisterer("corrupted_repeating_command_block", Rifts.Blocks.CORRUPTED_REPEATING_COMMAND_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_REPEATING_COMMAND_BLOCK);
        Rifts.Blocks.BURNED_REPEATING_COMMAND_BLOCK = (BurnedRepeatingCommandBlock) new BlockRegisterer("burned_repeating_command_block", Rifts.Blocks.BURNED_REPEATING_COMMAND_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_ROOTED_DIRT = (CorruptedRootedDirt) new BlockRegisterer("corrupted_rooted_dirt", Rifts.Blocks.CORRUPTED_ROOTED_DIRT)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_ROOTED_DIRT);
        Rifts.Blocks.BURNED_ROOTED_DIRT = (BurnedRootedDirt) new BlockRegisterer("burned_rooted_dirt", Rifts.Blocks.BURNED_ROOTED_DIRT)
                .register();
        Rifts.Blocks.CORRUPTED_SAND = (CorruptedSand) new BlockRegisterer("corrupted_sand", Rifts.Blocks.CORRUPTED_SAND)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SAND);
        Rifts.Blocks.BURNED_SAND = (BurnedSand) new BlockRegisterer("burned_sand", Rifts.Blocks.BURNED_SAND)
                .register();
        Rifts.Blocks.CORRUPTED_SANDSTONE = (CorruptedSandstone) new BlockRegisterer("corrupted_sandstone", Rifts.Blocks.CORRUPTED_SANDSTONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SANDSTONE);
        Rifts.Blocks.BURNED_SANDSTONE = (BurnedSandstone) new BlockRegisterer("burned_sandstone", Rifts.Blocks.BURNED_SANDSTONE)
                .register();
        Rifts.Blocks.CORRUPTED_SCULK_SENSOR = (CorruptedSculkSensor) new BlockRegisterer("corrupted_sculk_sensor", Rifts.Blocks.CORRUPTED_SCULK_SENSOR)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SCULK_SENSOR);
        Rifts.Blocks.BURNED_SCULK_SENSOR = (BurnedSculkSensor) new BlockRegisterer("burned_sculk_sensor", Rifts.Blocks.BURNED_SCULK_SENSOR)
                .register();
        Rifts.Blocks.CORRUPTED_SEAGRASS = (CorruptedSeagrass) new BlockRegisterer("corrupted_seagrass", Rifts.Blocks.CORRUPTED_SEAGRASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SEAGRASS);
        Rifts.Blocks.BURNED_SEAGRASS = (BurnedSeagrass) new BlockRegisterer("burned_seagrass", Rifts.Blocks.BURNED_SEAGRASS)
                .register();
        Rifts.Blocks.CORRUPTED_SEA_LANTERN = (CorruptedSeaLantern) new BlockRegisterer("corrupted_sea_lantern", Rifts.Blocks.CORRUPTED_SEA_LANTERN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SEA_LANTERN);
        Rifts.Blocks.BURNED_SEA_LANTERN = (BurnedSeaLantern) new BlockRegisterer("burned_sea_lantern", Rifts.Blocks.BURNED_SEA_LANTERN)
                .register();
        Rifts.Blocks.CORRUPTED_SEA_PICKLE = (CorruptedSeaPickle) new BlockRegisterer("corrupted_sea_pickle", Rifts.Blocks.CORRUPTED_SEA_PICKLE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SEA_PICKLE);
        Rifts.Blocks.BURNED_SEA_PICKLE = (BurnedSeaPickle) new BlockRegisterer("burned_sea_pickle", Rifts.Blocks.BURNED_SEA_PICKLE)
                .register();
        Rifts.Blocks.CORRUPTED_SHROOMLIGHT = (CorruptedShroomlight) new BlockRegisterer("corrupted_shroomlight", Rifts.Blocks.CORRUPTED_SHROOMLIGHT)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SHROOMLIGHT);
        Rifts.Blocks.BURNED_SHROOMLIGHT = (BurnedShroomlight) new BlockRegisterer("burned_shroomlight", Rifts.Blocks.BURNED_SHROOMLIGHT)
                .register();
        Rifts.Blocks.CORRUPTED_SHULKER_BOX = (CorruptedShulkerBox) new BlockRegisterer("corrupted_shulker_box", Rifts.Blocks.CORRUPTED_SHULKER_BOX)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SHULKER_BOX);
        Rifts.Blocks.BURNED_SHULKER_BOX = (BurnedShulkerBox) new BlockRegisterer("burned_shulker_box", Rifts.Blocks.BURNED_SHULKER_BOX)
                .register();
        Rifts.Blocks.CORRUPTED_SLIME_BLOCK = (CorruptedSlimeBlock) new BlockRegisterer("corrupted_slime_block", Rifts.Blocks.CORRUPTED_SLIME_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SLIME_BLOCK);
        Rifts.Blocks.BURNED_SLIME_BLOCK = (BurnedSlimeBlock) new BlockRegisterer("burned_slime_block", Rifts.Blocks.BURNED_SLIME_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_SMALL_AMETHYST_BUD = (CorruptedSmallAmethystBud) new BlockRegisterer("corrupted_small_amethyst_bud", Rifts.Blocks.CORRUPTED_SMALL_AMETHYST_BUD)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SMALL_AMETHYST_BUD);
        Rifts.Blocks.BURNED_SMALL_AMETHYST_BUD = (BurnedSmallAmethystBud) new BlockRegisterer("burned_small_amethyst_bud", Rifts.Blocks.BURNED_SMALL_AMETHYST_BUD)
                .register();
        Rifts.Blocks.CORRUPTED_SMITHING_TABLE = (CorruptedSmithingTable) new BlockRegisterer("corrupted_smithing_table", Rifts.Blocks.CORRUPTED_SMITHING_TABLE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SMITHING_TABLE);
        Rifts.Blocks.BURNED_SMITHING_TABLE = (BurnedSmithingTable) new BlockRegisterer("burned_smithing_table", Rifts.Blocks.BURNED_SMITHING_TABLE)
                .register();
        Rifts.Blocks.CORRUPTED_SMOKER = (CorruptedSmoker) new BlockRegisterer("corrupted_smoker", Rifts.Blocks.CORRUPTED_SMOKER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SMOKER);
        Rifts.Blocks.BURNED_SMOKER = (BurnedSmoker) new BlockRegisterer("burned_smoker", Rifts.Blocks.BURNED_SMOKER)
                .register();
        Rifts.Blocks.CORRUPTED_SMOOTH_BASALT = (CorruptedSmoothBasalt) new BlockRegisterer("corrupted_smooth_basalt", Rifts.Blocks.CORRUPTED_SMOOTH_BASALT)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SMOOTH_BASALT);
        Rifts.Blocks.BURNED_SMOOTH_BASALT = (BurnedSmoothBasalt) new BlockRegisterer("burned_smooth_basalt", Rifts.Blocks.BURNED_SMOOTH_BASALT)
                .register();
        Rifts.Blocks.CORRUPTED_SMOOTH_STONE = (CorruptedSmoothStone) new BlockRegisterer("corrupted_smooth_stone", Rifts.Blocks.CORRUPTED_SMOOTH_STONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SMOOTH_STONE);
        Rifts.Blocks.BURNED_SMOOTH_STONE = (BurnedSmoothStone) new BlockRegisterer("burned_smooth_stone", Rifts.Blocks.BURNED_SMOOTH_STONE)
                .register();
        Rifts.Blocks.CORRUPTED_SMOOTH_STONE_SLAB = (CorruptedSmoothStoneSlab) new BlockRegisterer("corrupted_smooth_stone_slab", Rifts.Blocks.CORRUPTED_SMOOTH_STONE_SLAB)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SMOOTH_STONE_SLAB);
        Rifts.Blocks.BURNED_SMOOTH_STONE_SLAB = (BurnedSmoothStoneSlab) new BlockRegisterer("burned_smooth_stone_slab", Rifts.Blocks.BURNED_SMOOTH_STONE_SLAB)
                .register();
        Rifts.Blocks.CORRUPTED_SOUL_CAMPFIRE = (CorruptedSoulCampfire) new BlockRegisterer("corrupted_soul_campfire", Rifts.Blocks.CORRUPTED_SOUL_CAMPFIRE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SOUL_CAMPFIRE);
        Rifts.Blocks.BURNED_SOUL_CAMPFIRE = (BurnedSoulCampfire) new BlockRegisterer("burned_soul_campfire", Rifts.Blocks.BURNED_SOUL_CAMPFIRE)
                .register();
        Rifts.Blocks.CORRUPTED_SOUL_LANTERN = (CorruptedSoulLantern) new BlockRegisterer("corrupted_soul_lantern", Rifts.Blocks.CORRUPTED_SOUL_LANTERN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SOUL_LANTERN);
        Rifts.Blocks.BURNED_SOUL_LANTERN = (BurnedSoulLantern) new BlockRegisterer("burned_soul_lantern", Rifts.Blocks.BURNED_SOUL_LANTERN)
                .register();
        Rifts.Blocks.CORRUPTED_SOUL_SAND = (CorruptedSoulSand) new BlockRegisterer("corrupted_soul_sand", Rifts.Blocks.CORRUPTED_SOUL_SAND)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SOUL_SAND);
        Rifts.Blocks.BURNED_SOUL_SAND = (BurnedSoulSand) new BlockRegisterer("burned_soul_sand", Rifts.Blocks.BURNED_SOUL_SAND)
                .register();
        Rifts.Blocks.CORRUPTED_SOUL_SOIL = (CorruptedSoulSoil) new BlockRegisterer("corrupted_soul_soil", Rifts.Blocks.CORRUPTED_SOUL_SOIL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SOUL_SOIL);
        Rifts.Blocks.BURNED_SOUL_SOIL = (BurnedSoulSoil) new BlockRegisterer("burned_soul_soil", Rifts.Blocks.BURNED_SOUL_SOIL)
                .register();
        Rifts.Blocks.CORRUPTED_SOUL_TORCH = (CorruptedSoulTorch) new BlockRegisterer("corrupted_soul_torch", Rifts.Blocks.CORRUPTED_SOUL_TORCH)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SOUL_TORCH);
        Rifts.Blocks.BURNED_SOUL_TORCH = (BurnedSoulTorch) new BlockRegisterer("burned_soul_torch", Rifts.Blocks.BURNED_SOUL_TORCH)
                .register();
        Rifts.Blocks.CORRUPTED_SPAWNER = (CorruptedSpawner) new BlockRegisterer("corrupted_spawner", Rifts.Blocks.CORRUPTED_SPAWNER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SPAWNER);
        Rifts.Blocks.BURNED_SPAWNER = (BurnedSpawner) new BlockRegisterer("burned_spawner", Rifts.Blocks.BURNED_SPAWNER)
                .register();
        Rifts.Blocks.CORRUPTED_SPONGE = (CorruptedSponge) new BlockRegisterer("corrupted_sponge", Rifts.Blocks.CORRUPTED_SPONGE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SPONGE);
        Rifts.Blocks.BURNED_SPONGE = (BurnedSponge) new BlockRegisterer("burned_sponge", Rifts.Blocks.BURNED_SPONGE)
                .register();
        Rifts.Blocks.CORRUPTED_SPORE_BLOSSOM = (CorruptedSporeBlossom) new BlockRegisterer("corrupted_spore_blossom", Rifts.Blocks.CORRUPTED_SPORE_BLOSSOM)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SPORE_BLOSSOM);
        Rifts.Blocks.BURNED_SPORE_BLOSSOM = (BurnedSporeBlossom) new BlockRegisterer("burned_spore_blossom", Rifts.Blocks.BURNED_SPORE_BLOSSOM)
                .register();
        Rifts.Blocks.CORRUPTED_SPRUCE_LEAVES = (CorruptedSpruceLeaves) new BlockRegisterer("corrupted_spruce_leaves", Rifts.Blocks.CORRUPTED_SPRUCE_LEAVES)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SPRUCE_LEAVES);
        Rifts.Blocks.BURNED_SPRUCE_LEAVES = (BurnedSpruceLeaves) new BlockRegisterer("burned_spruce_leaves", Rifts.Blocks.BURNED_SPRUCE_LEAVES)
                .register();
        Rifts.Blocks.CORRUPTED_SPRUCE_LOG = (CorruptedSpruceLog) new BlockRegisterer("corrupted_spruce_log", Rifts.Blocks.CORRUPTED_SPRUCE_LOG)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SPRUCE_LOG);
        Rifts.Blocks.BURNED_SPRUCE_LOG = (BurnedSpruceLog) new BlockRegisterer("burned_spruce_log", Rifts.Blocks.BURNED_SPRUCE_LOG)
                .register();
        Rifts.Blocks.CORRUPTED_SPRUCE_PLANKS = (CorruptedSprucePlanks) new BlockRegisterer("corrupted_spruce_planks", Rifts.Blocks.CORRUPTED_SPRUCE_PLANKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SPRUCE_PLANKS);
        Rifts.Blocks.BURNED_SPRUCE_PLANKS = (BurnedSprucePlanks) new BlockRegisterer("burned_spruce_planks", Rifts.Blocks.BURNED_SPRUCE_PLANKS)
                .register();
        Rifts.Blocks.CORRUPTED_SPRUCE_SAPLING = (CorruptedSpruceSapling) new BlockRegisterer("corrupted_spruce_sapling", Rifts.Blocks.CORRUPTED_SPRUCE_SAPLING)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SPRUCE_SAPLING);
        Rifts.Blocks.BURNED_SPRUCE_SAPLING = (BurnedSpruceSapling) new BlockRegisterer("burned_spruce_sapling", Rifts.Blocks.BURNED_SPRUCE_SAPLING)
                .register();
        Rifts.Blocks.CORRUPTED_STONE = (CorruptedStone) new BlockRegisterer("corrupted_stone", Rifts.Blocks.CORRUPTED_STONE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_STONE);
        Rifts.Blocks.BURNED_STONE = (BurnedStone) new BlockRegisterer("burned_stone", Rifts.Blocks.BURNED_STONE)
                .register();
        Rifts.Blocks.CORRUPTED_STONECUTTER = (CorruptedStonecutter) new BlockRegisterer("corrupted_stonecutter", Rifts.Blocks.CORRUPTED_STONECUTTER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_STONECUTTER);
        Rifts.Blocks.BURNED_STONECUTTER = (BurnedStonecutter) new BlockRegisterer("burned_stonecutter", Rifts.Blocks.BURNED_STONECUTTER)
                .register();
        Rifts.Blocks.CORRUPTED_STONE_BRICKS = (CorruptedStoneBricks) new BlockRegisterer("corrupted_stone_bricks", Rifts.Blocks.CORRUPTED_STONE_BRICKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_STONE_BRICKS);
        Rifts.Blocks.BURNED_STONE_BRICKS = (BurnedStoneBricks) new BlockRegisterer("burned_stone_bricks", Rifts.Blocks.BURNED_STONE_BRICKS)
                .register();
        Rifts.Blocks.CORRUPTED_STONE_SLAB = (CorruptedStoneSlab) new BlockRegisterer("corrupted_stone_slab", Rifts.Blocks.CORRUPTED_STONE_SLAB)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_STONE_SLAB);
        Rifts.Blocks.BURNED_STONE_SLAB = (BurnedStoneSlab) new BlockRegisterer("burned_stone_slab", Rifts.Blocks.BURNED_STONE_SLAB)
                .register();
        Rifts.Blocks.CORRUPTED_STRIPPED_ACACIA_LOG = (CorruptedStrippedAcaciaLog) new BlockRegisterer("corrupted_stripped_acacia_log", Rifts.Blocks.CORRUPTED_STRIPPED_ACACIA_LOG)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_STRIPPED_ACACIA_LOG);
        Rifts.Blocks.BURNED_STRIPPED_ACACIA_LOG = (BurnedStrippedAcaciaLog) new BlockRegisterer("burned_stripped_acacia_log", Rifts.Blocks.BURNED_STRIPPED_ACACIA_LOG)
                .register();
        Rifts.Blocks.CORRUPTED_STRIPPED_BIRCH_LOG = (CorruptedStrippedBirchLog) new BlockRegisterer("corrupted_stripped_birch_log", Rifts.Blocks.CORRUPTED_STRIPPED_BIRCH_LOG)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_STRIPPED_BIRCH_LOG);
        Rifts.Blocks.BURNED_STRIPPED_BIRCH_LOG = (BurnedStrippedBirchLog) new BlockRegisterer("burned_stripped_birch_log", Rifts.Blocks.BURNED_STRIPPED_BIRCH_LOG)
                .register();
        Rifts.Blocks.CORRUPTED_STRIPPED_CRIMSON_STEM = (CorruptedStrippedCrimsonStem) new BlockRegisterer("corrupted_stripped_crimson_stem", Rifts.Blocks.CORRUPTED_STRIPPED_CRIMSON_STEM)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_STRIPPED_CRIMSON_STEM);
        Rifts.Blocks.BURNED_STRIPPED_CRIMSON_STEM = (BurnedStrippedCrimsonStem) new BlockRegisterer("burned_stripped_crimson_stem", Rifts.Blocks.BURNED_STRIPPED_CRIMSON_STEM)
                .register();
        Rifts.Blocks.CORRUPTED_STRIPPED_DARK_OAK_LOG = (CorruptedStrippedDarkOakLog) new BlockRegisterer("corrupted_stripped_dark_oak_log", Rifts.Blocks.CORRUPTED_STRIPPED_DARK_OAK_LOG)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_STRIPPED_DARK_OAK_LOG);
        Rifts.Blocks.BURNED_STRIPPED_DARK_OAK_LOG = (BurnedStrippedDarkOakLog) new BlockRegisterer("burned_stripped_dark_oak_log", Rifts.Blocks.BURNED_STRIPPED_DARK_OAK_LOG)
                .register();
        Rifts.Blocks.CORRUPTED_STRIPPED_JUNGLE_LOG = (CorruptedStrippedJungleLog) new BlockRegisterer("corrupted_stripped_jungle_log", Rifts.Blocks.CORRUPTED_STRIPPED_JUNGLE_LOG)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_STRIPPED_JUNGLE_LOG);
        Rifts.Blocks.BURNED_STRIPPED_JUNGLE_LOG = (BurnedStrippedJungleLog) new BlockRegisterer("burned_stripped_jungle_log", Rifts.Blocks.BURNED_STRIPPED_JUNGLE_LOG)
                .register();
        Rifts.Blocks.CORRUPTED_STRIPPED_OAK_LOG = (CorruptedStrippedOakLog) new BlockRegisterer("corrupted_stripped_oak_log", Rifts.Blocks.CORRUPTED_STRIPPED_OAK_LOG)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_STRIPPED_OAK_LOG);
        Rifts.Blocks.BURNED_STRIPPED_OAK_LOG = (BurnedStrippedOakLog) new BlockRegisterer("burned_stripped_oak_log", Rifts.Blocks.BURNED_STRIPPED_OAK_LOG)
                .register();
        Rifts.Blocks.CORRUPTED_STRIPPED_SPRUCE_LOG = (CorruptedStrippedSpruceLog) new BlockRegisterer("corrupted_stripped_spruce_log", Rifts.Blocks.CORRUPTED_STRIPPED_SPRUCE_LOG)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_STRIPPED_SPRUCE_LOG);
        Rifts.Blocks.BURNED_STRIPPED_SPRUCE_LOG = (BurnedStrippedSpruceLog) new BlockRegisterer("burned_stripped_spruce_log", Rifts.Blocks.BURNED_STRIPPED_SPRUCE_LOG)
                .register();
        Rifts.Blocks.CORRUPTED_STRIPPED_WARPED_STEM = (CorruptedStrippedWarpedStem) new BlockRegisterer("corrupted_stripped_warped_stem", Rifts.Blocks.CORRUPTED_STRIPPED_WARPED_STEM)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_STRIPPED_WARPED_STEM);
        Rifts.Blocks.BURNED_STRIPPED_WARPED_STEM = (BurnedStrippedWarpedStem) new BlockRegisterer("burned_stripped_warped_stem", Rifts.Blocks.BURNED_STRIPPED_WARPED_STEM)
                .register();
        Rifts.Blocks.CORRUPTED_STRUCTURE_BLOCK = (CorruptedStructureBlock) new BlockRegisterer("corrupted_structure_block", Rifts.Blocks.CORRUPTED_STRUCTURE_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_STRUCTURE_BLOCK);
        Rifts.Blocks.BURNED_STRUCTURE_BLOCK = (BurnedStructureBlock) new BlockRegisterer("burned_structure_block", Rifts.Blocks.BURNED_STRUCTURE_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_SUGAR_CANE = (CorruptedSugarCane) new BlockRegisterer("corrupted_sugar_cane", Rifts.Blocks.CORRUPTED_SUGAR_CANE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_SUGAR_CANE);
        Rifts.Blocks.BURNED_SUGAR_CANE = (BurnedSugarCane) new BlockRegisterer("burned_sugar_cane", Rifts.Blocks.BURNED_SUGAR_CANE)
                .register();
        Rifts.Blocks.CORRUPTED_TARGET = (CorruptedTarget) new BlockRegisterer("corrupted_target", Rifts.Blocks.CORRUPTED_TARGET)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_TARGET);
        Rifts.Blocks.BURNED_TARGET = (BurnedTarget) new BlockRegisterer("burned_target", Rifts.Blocks.BURNED_TARGET)
                .register();
        Rifts.Blocks.CORRUPTED_TERRACOTTA = (CorruptedTerracotta) new BlockRegisterer("corrupted_terracotta", Rifts.Blocks.CORRUPTED_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_TERRACOTTA);
        Rifts.Blocks.BURNED_TERRACOTTA = (BurnedTerracotta) new BlockRegisterer("burned_terracotta", Rifts.Blocks.BURNED_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_TINTED_GLASS = (CorruptedTintedGlass) new BlockRegisterer("corrupted_tinted_glass", Rifts.Blocks.CORRUPTED_TINTED_GLASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_TINTED_GLASS);
        Rifts.Blocks.BURNED_TINTED_GLASS = (BurnedTintedGlass) new BlockRegisterer("burned_tinted_glass", Rifts.Blocks.BURNED_TINTED_GLASS)
                .register();
        Rifts.Blocks.CORRUPTED_TNT = (CorruptedTnt) new BlockRegisterer("corrupted_tnt", Rifts.Blocks.CORRUPTED_TNT)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_TNT);
        Rifts.Blocks.BURNED_TNT = (BurnedTnt) new BlockRegisterer("burned_tnt", Rifts.Blocks.BURNED_TNT)
                .register();
        Rifts.Blocks.CORRUPTED_TORCH = (CorruptedTorch) new BlockRegisterer("corrupted_torch", Rifts.Blocks.CORRUPTED_TORCH)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_TORCH);
        Rifts.Blocks.BURNED_TORCH = (BurnedTorch) new BlockRegisterer("burned_torch", Rifts.Blocks.BURNED_TORCH)
                .register();
        Rifts.Blocks.CORRUPTED_TRIPWIRE_HOOK = (CorruptedTripwireHook) new BlockRegisterer("corrupted_tripwire_hook", Rifts.Blocks.CORRUPTED_TRIPWIRE_HOOK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_TRIPWIRE_HOOK);
        Rifts.Blocks.BURNED_TRIPWIRE_HOOK = (BurnedTripwireHook) new BlockRegisterer("burned_tripwire_hook", Rifts.Blocks.BURNED_TRIPWIRE_HOOK)
                .register();
        Rifts.Blocks.CORRUPTED_TUBE_CORAL = (CorruptedTubeCoral) new BlockRegisterer("corrupted_tube_coral", Rifts.Blocks.CORRUPTED_TUBE_CORAL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_TUBE_CORAL);
        Rifts.Blocks.BURNED_TUBE_CORAL = (BurnedTubeCoral) new BlockRegisterer("burned_tube_coral", Rifts.Blocks.BURNED_TUBE_CORAL)
                .register();
        Rifts.Blocks.CORRUPTED_TUBE_CORAL_BLOCK = (CorruptedTubeCoralBlock) new BlockRegisterer("corrupted_tube_coral_block", Rifts.Blocks.CORRUPTED_TUBE_CORAL_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_TUBE_CORAL_BLOCK);
        Rifts.Blocks.BURNED_TUBE_CORAL_BLOCK = (BurnedTubeCoralBlock) new BlockRegisterer("burned_tube_coral_block", Rifts.Blocks.BURNED_TUBE_CORAL_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_TUBE_CORAL_FAN = (CorruptedTubeCoralFan) new BlockRegisterer("corrupted_tube_coral_fan", Rifts.Blocks.CORRUPTED_TUBE_CORAL_FAN)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_TUBE_CORAL_FAN);
        Rifts.Blocks.BURNED_TUBE_CORAL_FAN = (BurnedTubeCoralFan) new BlockRegisterer("burned_tube_coral_fan", Rifts.Blocks.BURNED_TUBE_CORAL_FAN)
                .register();
        Rifts.Blocks.CORRUPTED_TUFF = (CorruptedTuff) new BlockRegisterer("corrupted_tuff", Rifts.Blocks.CORRUPTED_TUFF)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_TUFF);
        Rifts.Blocks.BURNED_TUFF = (BurnedTuff) new BlockRegisterer("burned_tuff", Rifts.Blocks.BURNED_TUFF)
                .register();
        Rifts.Blocks.CORRUPTED_TURTLE_EGG = (CorruptedTurtleEgg) new BlockRegisterer("corrupted_turtle_egg", Rifts.Blocks.CORRUPTED_TURTLE_EGG)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_TURTLE_EGG);
        Rifts.Blocks.BURNED_TURTLE_EGG = (BurnedTurtleEgg) new BlockRegisterer("burned_turtle_egg", Rifts.Blocks.BURNED_TURTLE_EGG)
                .register();
        Rifts.Blocks.CORRUPTED_TWISTING_VINES = (CorruptedTwistingVines) new BlockRegisterer("corrupted_twisting_vines", Rifts.Blocks.CORRUPTED_TWISTING_VINES)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_TWISTING_VINES);
        Rifts.Blocks.BURNED_TWISTING_VINES = (BurnedTwistingVines) new BlockRegisterer("burned_twisting_vines", Rifts.Blocks.BURNED_TWISTING_VINES)
                .register();
        Rifts.Blocks.CORRUPTED_TWISTING_VINES_PLANT = (CorruptedTwistingVinesPlant) new BlockRegisterer("corrupted_twisting_vines_plant", Rifts.Blocks.CORRUPTED_TWISTING_VINES_PLANT)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_TWISTING_VINES_PLANT);
        Rifts.Blocks.BURNED_TWISTING_VINES_PLANT = (BurnedTwistingVinesPlant) new BlockRegisterer("burned_twisting_vines_plant", Rifts.Blocks.BURNED_TWISTING_VINES_PLANT)
                .register();
        Rifts.Blocks.CORRUPTED_VINE = (CorruptedVine) new BlockRegisterer("corrupted_vine", Rifts.Blocks.CORRUPTED_VINE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_VINE);
        Rifts.Blocks.BURNED_VINE = (BurnedVine) new BlockRegisterer("burned_vine", Rifts.Blocks.BURNED_VINE)
                .register();
        Rifts.Blocks.CORRUPTED_WARPED_FUNGUS = (CorruptedWarpedFungus) new BlockRegisterer("corrupted_warped_fungus", Rifts.Blocks.CORRUPTED_WARPED_FUNGUS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WARPED_FUNGUS);
        Rifts.Blocks.BURNED_WARPED_FUNGUS = (BurnedWarpedFungus) new BlockRegisterer("burned_warped_fungus", Rifts.Blocks.BURNED_WARPED_FUNGUS)
                .register();
        Rifts.Blocks.CORRUPTED_WARPED_NYLIUM = (CorruptedWarpedNylium) new BlockRegisterer("corrupted_warped_nylium", Rifts.Blocks.CORRUPTED_WARPED_NYLIUM)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WARPED_NYLIUM);
        Rifts.Blocks.BURNED_WARPED_NYLIUM = (BurnedWarpedNylium) new BlockRegisterer("burned_warped_nylium", Rifts.Blocks.BURNED_WARPED_NYLIUM)
                .register();
        Rifts.Blocks.CORRUPTED_WARPED_PLANKS = (CorruptedWarpedPlanks) new BlockRegisterer("corrupted_warped_planks", Rifts.Blocks.CORRUPTED_WARPED_PLANKS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WARPED_PLANKS);
        Rifts.Blocks.BURNED_WARPED_PLANKS = (BurnedWarpedPlanks) new BlockRegisterer("burned_warped_planks", Rifts.Blocks.BURNED_WARPED_PLANKS)
                .register();
        Rifts.Blocks.CORRUPTED_WARPED_ROOTS = (CorruptedWarpedRoots) new BlockRegisterer("corrupted_warped_roots", Rifts.Blocks.CORRUPTED_WARPED_ROOTS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WARPED_ROOTS);
        Rifts.Blocks.BURNED_WARPED_ROOTS = (BurnedWarpedRoots) new BlockRegisterer("burned_warped_roots", Rifts.Blocks.BURNED_WARPED_ROOTS)
                .register();
        Rifts.Blocks.CORRUPTED_WARPED_STEM = (CorruptedWarpedStem) new BlockRegisterer("corrupted_warped_stem", Rifts.Blocks.CORRUPTED_WARPED_STEM)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WARPED_STEM);
        Rifts.Blocks.BURNED_WARPED_STEM = (BurnedWarpedStem) new BlockRegisterer("burned_warped_stem", Rifts.Blocks.BURNED_WARPED_STEM)
                .register();
        Rifts.Blocks.CORRUPTED_WARPED_WART_BLOCK = (CorruptedWarpedWartBlock) new BlockRegisterer("corrupted_warped_wart_block", Rifts.Blocks.CORRUPTED_WARPED_WART_BLOCK)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WARPED_WART_BLOCK);
        Rifts.Blocks.BURNED_WARPED_WART_BLOCK = (BurnedWarpedWartBlock) new BlockRegisterer("burned_warped_wart_block", Rifts.Blocks.BURNED_WARPED_WART_BLOCK)
                .register();
        Rifts.Blocks.CORRUPTED_WATER = (CorruptedWater) new BlockRegisterer("corrupted_water", Rifts.Blocks.CORRUPTED_WATER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WATER);
        Rifts.Blocks.BURNED_WATER = (BurnedWater) new BlockRegisterer("burned_water", Rifts.Blocks.BURNED_WATER)
                .register();
        Rifts.Blocks.CORRUPTED_WEATHERED_COPPER = (CorruptedWeatheredCopper) new BlockRegisterer("corrupted_weathered_copper", Rifts.Blocks.CORRUPTED_WEATHERED_COPPER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WEATHERED_COPPER);
        Rifts.Blocks.BURNED_WEATHERED_COPPER = (BurnedWeatheredCopper) new BlockRegisterer("burned_weathered_copper", Rifts.Blocks.BURNED_WEATHERED_COPPER)
                .register();
        Rifts.Blocks.CORRUPTED_WEATHERED_CUT_COPPER = (CorruptedWeatheredCutCopper) new BlockRegisterer("corrupted_weathered_cut_copper", Rifts.Blocks.CORRUPTED_WEATHERED_CUT_COPPER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WEATHERED_CUT_COPPER);
        Rifts.Blocks.BURNED_WEATHERED_CUT_COPPER = (BurnedWeatheredCutCopper) new BlockRegisterer("burned_weathered_cut_copper", Rifts.Blocks.BURNED_WEATHERED_CUT_COPPER)
                .register();
        Rifts.Blocks.CORRUPTED_WEEPING_VINES = (CorruptedWeepingVines) new BlockRegisterer("corrupted_weeping_vines", Rifts.Blocks.CORRUPTED_WEEPING_VINES)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WEEPING_VINES);
        Rifts.Blocks.BURNED_WEEPING_VINES = (BurnedWeepingVines) new BlockRegisterer("burned_weeping_vines", Rifts.Blocks.BURNED_WEEPING_VINES)
                .register();
        Rifts.Blocks.CORRUPTED_WEEPING_VINES_PLANT = (CorruptedWeepingVinesPlant) new BlockRegisterer("corrupted_weeping_vines_plant", Rifts.Blocks.CORRUPTED_WEEPING_VINES_PLANT)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WEEPING_VINES_PLANT);
        Rifts.Blocks.BURNED_WEEPING_VINES_PLANT = (BurnedWeepingVinesPlant) new BlockRegisterer("burned_weeping_vines_plant", Rifts.Blocks.BURNED_WEEPING_VINES_PLANT)
                .register();
        Rifts.Blocks.CORRUPTED_WET_SPONGE = (CorruptedWetSponge) new BlockRegisterer("corrupted_wet_sponge", Rifts.Blocks.CORRUPTED_WET_SPONGE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WET_SPONGE);
        Rifts.Blocks.BURNED_WET_SPONGE = (BurnedWetSponge) new BlockRegisterer("burned_wet_sponge", Rifts.Blocks.BURNED_WET_SPONGE)
                .register();
        Rifts.Blocks.CORRUPTED_WHITE_CONCRETE = (CorruptedWhiteConcrete) new BlockRegisterer("corrupted_white_concrete", Rifts.Blocks.CORRUPTED_WHITE_CONCRETE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WHITE_CONCRETE);
        Rifts.Blocks.BURNED_WHITE_CONCRETE = (BurnedWhiteConcrete) new BlockRegisterer("burned_white_concrete", Rifts.Blocks.BURNED_WHITE_CONCRETE)
                .register();
        Rifts.Blocks.CORRUPTED_WHITE_CONCRETE_POWDER = (CorruptedWhiteConcretePowder) new BlockRegisterer("corrupted_white_concrete_powder", Rifts.Blocks.CORRUPTED_WHITE_CONCRETE_POWDER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WHITE_CONCRETE_POWDER);
        Rifts.Blocks.BURNED_WHITE_CONCRETE_POWDER = (BurnedWhiteConcretePowder) new BlockRegisterer("burned_white_concrete_powder", Rifts.Blocks.BURNED_WHITE_CONCRETE_POWDER)
                .register();
        Rifts.Blocks.CORRUPTED_WHITE_GLAZED_TERRACOTTA = (CorruptedWhiteGlazedTerracotta) new BlockRegisterer("corrupted_white_glazed_terracotta", Rifts.Blocks.CORRUPTED_WHITE_GLAZED_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WHITE_GLAZED_TERRACOTTA);
        Rifts.Blocks.BURNED_WHITE_GLAZED_TERRACOTTA = (BurnedWhiteGlazedTerracotta) new BlockRegisterer("burned_white_glazed_terracotta", Rifts.Blocks.BURNED_WHITE_GLAZED_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_WHITE_SHULKER_BOX = (CorruptedWhiteShulkerBox) new BlockRegisterer("corrupted_white_shulker_box", Rifts.Blocks.CORRUPTED_WHITE_SHULKER_BOX)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WHITE_SHULKER_BOX);
        Rifts.Blocks.BURNED_WHITE_SHULKER_BOX = (BurnedWhiteShulkerBox) new BlockRegisterer("burned_white_shulker_box", Rifts.Blocks.BURNED_WHITE_SHULKER_BOX)
                .register();
        Rifts.Blocks.CORRUPTED_WHITE_STAINED_GLASS = (CorruptedWhiteStainedGlass) new BlockRegisterer("corrupted_white_stained_glass", Rifts.Blocks.CORRUPTED_WHITE_STAINED_GLASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WHITE_STAINED_GLASS);
        Rifts.Blocks.BURNED_WHITE_STAINED_GLASS = (BurnedWhiteStainedGlass) new BlockRegisterer("burned_white_stained_glass", Rifts.Blocks.BURNED_WHITE_STAINED_GLASS)
                .register();
        Rifts.Blocks.CORRUPTED_WHITE_TERRACOTTA = (CorruptedWhiteTerracotta) new BlockRegisterer("corrupted_white_terracotta", Rifts.Blocks.CORRUPTED_WHITE_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WHITE_TERRACOTTA);
        Rifts.Blocks.BURNED_WHITE_TERRACOTTA = (BurnedWhiteTerracotta) new BlockRegisterer("burned_white_terracotta", Rifts.Blocks.BURNED_WHITE_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_WHITE_TULIP = (CorruptedWhiteTulip) new BlockRegisterer("corrupted_white_tulip", Rifts.Blocks.CORRUPTED_WHITE_TULIP)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WHITE_TULIP);
        Rifts.Blocks.BURNED_WHITE_TULIP = (BurnedWhiteTulip) new BlockRegisterer("burned_white_tulip", Rifts.Blocks.BURNED_WHITE_TULIP)
                .register();
        Rifts.Blocks.CORRUPTED_WHITE_WOOL = (CorruptedWhiteWool) new BlockRegisterer("corrupted_white_wool", Rifts.Blocks.CORRUPTED_WHITE_WOOL)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WHITE_WOOL);
        Rifts.Blocks.BURNED_WHITE_WOOL = (BurnedWhiteWool) new BlockRegisterer("burned_white_wool", Rifts.Blocks.BURNED_WHITE_WOOL)
                .register();
        Rifts.Blocks.CORRUPTED_WITHER_ROSE = (CorruptedWitherRose) new BlockRegisterer("corrupted_wither_rose", Rifts.Blocks.CORRUPTED_WITHER_ROSE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_WITHER_ROSE);
        Rifts.Blocks.BURNED_WITHER_ROSE = (BurnedWitherRose) new BlockRegisterer("burned_wither_rose", Rifts.Blocks.BURNED_WITHER_ROSE)
                .register();
        Rifts.Blocks.CORRUPTED_YELLOW_CONCRETE = (CorruptedYellowConcrete) new BlockRegisterer("corrupted_yellow_concrete", Rifts.Blocks.CORRUPTED_YELLOW_CONCRETE)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_YELLOW_CONCRETE);
        Rifts.Blocks.BURNED_YELLOW_CONCRETE = (BurnedYellowConcrete) new BlockRegisterer("burned_yellow_concrete", Rifts.Blocks.BURNED_YELLOW_CONCRETE)
                .register();
        Rifts.Blocks.CORRUPTED_YELLOW_CONCRETE_POWDER = (CorruptedYellowConcretePowder) new BlockRegisterer("corrupted_yellow_concrete_powder", Rifts.Blocks.CORRUPTED_YELLOW_CONCRETE_POWDER)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_YELLOW_CONCRETE_POWDER);
        Rifts.Blocks.BURNED_YELLOW_CONCRETE_POWDER = (BurnedYellowConcretePowder) new BlockRegisterer("burned_yellow_concrete_powder", Rifts.Blocks.BURNED_YELLOW_CONCRETE_POWDER)
                .register();
        Rifts.Blocks.CORRUPTED_YELLOW_GLAZED_TERRACOTTA = (CorruptedYellowGlazedTerracotta) new BlockRegisterer("corrupted_yellow_glazed_terracotta", Rifts.Blocks.CORRUPTED_YELLOW_GLAZED_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_YELLOW_GLAZED_TERRACOTTA);
        Rifts.Blocks.BURNED_YELLOW_GLAZED_TERRACOTTA = (BurnedYellowGlazedTerracotta) new BlockRegisterer("burned_yellow_glazed_terracotta", Rifts.Blocks.BURNED_YELLOW_GLAZED_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_YELLOW_SHULKER_BOX = (CorruptedYellowShulkerBox) new BlockRegisterer("corrupted_yellow_shulker_box", Rifts.Blocks.CORRUPTED_YELLOW_SHULKER_BOX)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_YELLOW_SHULKER_BOX);
        Rifts.Blocks.BURNED_YELLOW_SHULKER_BOX = (BurnedYellowShulkerBox) new BlockRegisterer("burned_yellow_shulker_box", Rifts.Blocks.BURNED_YELLOW_SHULKER_BOX)
                .register();
        Rifts.Blocks.CORRUPTED_YELLOW_STAINED_GLASS = (CorruptedYellowStainedGlass) new BlockRegisterer("corrupted_yellow_stained_glass", Rifts.Blocks.CORRUPTED_YELLOW_STAINED_GLASS)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_YELLOW_STAINED_GLASS);
        Rifts.Blocks.BURNED_YELLOW_STAINED_GLASS = (BurnedYellowStainedGlass) new BlockRegisterer("burned_yellow_stained_glass", Rifts.Blocks.BURNED_YELLOW_STAINED_GLASS)
                .register();
        Rifts.Blocks.CORRUPTED_YELLOW_TERRACOTTA = (CorruptedYellowTerracotta) new BlockRegisterer("corrupted_yellow_terracotta", Rifts.Blocks.CORRUPTED_YELLOW_TERRACOTTA)
                .withEntity(()->CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_YELLOW_TERRACOTTA);
        Rifts.Blocks.BURNED_YELLOW_TERRACOTTA = (BurnedYellowTerracotta) new BlockRegisterer("burned_yellow_terracotta", Rifts.Blocks.BURNED_YELLOW_TERRACOTTA)
                .register();
        Rifts.Blocks.CORRUPTED_YELLOW_WOOL = (CorruptedYellowWool) new BlockRegisterer("corrupted_yellow_wool", Rifts.Blocks.CORRUPTED_YELLOW_WOOL)
                .withEntity(()-> CorruptedBlockEntity::new)
                .register();
        Corruptor.addToMapping(Rifts.Blocks.CORRUPTED_YELLOW_WOOL);
        Rifts.Blocks.BURNED_YELLOW_WOOL = (BurnedYellowWool) new BlockRegisterer("burned_yellow_wool", Rifts.Blocks.BURNED_YELLOW_WOOL)
                .register();
    }
}
