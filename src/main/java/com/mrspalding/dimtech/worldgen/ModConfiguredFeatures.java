package com.mrspalding.dimtech.worldgen;

import java.util.List;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.custom.ModBlocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ModConfiguredFeatures {
	
	 public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_INDIRIUM_ORE = registerKey("indirium_ore");
	
	 public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_VENDAR_ORE = registerKey("vendar_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_VENDAR_ORE_DENSE = registerKey("vendar_ore_dense");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_VENDAR_ORE_DENSE_DS = registerKey("vendar_ore_dense_ds");
	 
	 public static final ResourceKey<ConfiguredFeature<?, ?>> SHALE_STONE_BLOB = registerKey("shale_stone");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> SHAR_STONE_BLOB = registerKey("shar_stone");
	 
	 public static final ResourceKey<ConfiguredFeature<?, ?>> MARCASITE_STONE_BLOB = registerKey("marcasite_stone");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> APATITE_STONE_BLOB = registerKey("apatite_stone"); 
	 public static final ResourceKey<ConfiguredFeature<?, ?>> ALUNITE_STONE_BLOB = registerKey("alunite_stone"); 
	 public static final ResourceKey<ConfiguredFeature<?, ?>> CORMALITE_STONE_BLOB = registerKey("cormalite_stone"); 
	 public static final ResourceKey<ConfiguredFeature<?, ?>> UMBER_STONE_BLOB = registerKey("umber_stone"); 
	 
	 public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PRISMARINE_ORE = registerKey("prismarine_ore");
	 
	 public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
		  TagMatchTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
		  TagMatchTest deepslateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
		  
		  BlockMatchTest netherReplaceable = new BlockMatchTest(Blocks.NETHERRACK);
		  BlockMatchTest endReplaceable = new BlockMatchTest(Blocks.END_STONE);
		  
		  BlockMatchTest shalereplaceable = new BlockMatchTest(ModBlocks.SHALE.get());
		  
		  BlockMatchTest vendarDenseReplaceable = new BlockMatchTest(ModBlocks.VENDAR_ORE.get());
		  BlockMatchTest vendarDenseReplaceableDS = new BlockMatchTest(ModBlocks.DEEPSLATE_VENDAR_ORE.get());
		  
		  
		  
		  BlockMatchTest coalOreReplaceables = new BlockMatchTest(Blocks.COAL_ORE);
		  BlockMatchTest deepcoalOreReplaceables = new BlockMatchTest(Blocks.DEEPSLATE_COAL_ORE);
		  
		
		  
		  
		  
	  List<OreConfiguration.TargetBlockState> overworld_indirium_ores = List.of(OreConfiguration.target(stoneReplaceable,
              ModBlocks.INDIRIUM_ORE.get().defaultBlockState()),
              OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_INDIRIUM_ORE.get().defaultBlockState()));
	  			
	  List<OreConfiguration.TargetBlockState> overworld_vendar_ores = List.of(OreConfiguration.target(stoneReplaceable,
              ModBlocks.VENDAR_ORE.get().defaultBlockState()),
              OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_VENDAR_ORE.get().defaultBlockState()));
	  
	  List<OreConfiguration.TargetBlockState> overworld_vendar_ores_dense_stone = List.of(OreConfiguration.target(vendarDenseReplaceable,
              ModBlocks.VENDAR_ORE_DENSE.get().defaultBlockState()));
	  
	  List<OreConfiguration.TargetBlockState> overworld_vendar_ores_dense_deepslate = List.of(OreConfiguration.target(vendarDenseReplaceableDS,
              ModBlocks.DEEPSLATE_VENDAR_ORE_DENSE.get().defaultBlockState()));
	  
	  List<OreConfiguration.TargetBlockState> overworld_shale = List.of(OreConfiguration.target(stoneReplaceable,
              ModBlocks.SHALE.get().defaultBlockState()));
	  
	  List<OreConfiguration.TargetBlockState> overworld_shar = List.of(OreConfiguration.target(deepslateReplaceable,
              ModBlocks.SHAR.get().defaultBlockState()));
	  
	  List<OreConfiguration.TargetBlockState> prismarine = List.of(OreConfiguration.target(shalereplaceable,
              ModBlocks.PRISMARINE_ORE.get().defaultBlockState()));
	  
	  register(context, OVERWORLD_INDIRIUM_ORE, Feature.ORE, new OreConfiguration(overworld_indirium_ores, 5));
	  
	  register(context, OVERWORLD_VENDAR_ORE, Feature.ORE, new OreConfiguration(overworld_vendar_ores, 4));
	  register(context, OVERWORLD_VENDAR_ORE_DENSE, Feature.ORE, new OreConfiguration(overworld_vendar_ores_dense_stone, 2));
	  register(context, OVERWORLD_VENDAR_ORE_DENSE_DS, Feature.ORE, new OreConfiguration(overworld_vendar_ores_dense_deepslate, 2));
	  
	  register(context, SHALE_STONE_BLOB, Feature.ORE, new OreConfiguration(overworld_shale, 55));
	  register(context, SHAR_STONE_BLOB, Feature.ORE, new OreConfiguration(overworld_shar, 35));
	  
	  register(context, OVERWORLD_PRISMARINE_ORE, Feature.ORE, new OreConfiguration(prismarine, 15));
	  
	  register(context, MARCASITE_STONE_BLOB, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneReplaceable,
              ModBlocks.MARCASITE.get().defaultBlockState())), 33));
	  
	  register(context, APATITE_STONE_BLOB, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneReplaceable,
              ModBlocks.APATITE.get().defaultBlockState())), 33));
	  
	  register(context, ALUNITE_STONE_BLOB, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(netherReplaceable,
              ModBlocks.ALUNITE.get().defaultBlockState())), 33));
	  
	  register(context, UMBER_STONE_BLOB, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(netherReplaceable,
              ModBlocks.UMBER.get().defaultBlockState())), 33));
	  
	  register(context, CORMALITE_STONE_BLOB, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(netherReplaceable,
              ModBlocks.CORMALITE.get().defaultBlockState())), 33));
	  
	  
	
	  }
	
	private static final ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		return	ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation( Dimtech.MODID, name));
	}
	
	private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
            ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
context.register(key, new ConfiguredFeature<>(feature, configuration));
}
	
}
