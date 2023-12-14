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
	
	 public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_INDIRIUM_ORE = registerKey("vironium_ore");
	
	 public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
		  TagMatchTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
		  TagMatchTest deepslateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
		  BlockMatchTest coalOreReplaceables = new BlockMatchTest(Blocks.COAL_ORE);
		  BlockMatchTest deepcoalOreReplaceables = new BlockMatchTest(Blocks.DEEPSLATE_COAL_ORE);
		  
		
		  
		  
		  
	  List<OreConfiguration.TargetBlockState> overworld_vironium_ores = List.of(OreConfiguration.target(stoneReplaceable,
              ModBlocks.INDIRIUM_ORE.get().defaultBlockState()),
              OreConfiguration.target(deepslateReplaceable, ModBlocks.INDIRIUM_ORE.get().defaultBlockState()));
	  			//TODO add deepslate variant
	
	  
	  
	  
	  
	  register(context, OVERWORLD_INDIRIUM_ORE, Feature.ORE, new OreConfiguration(overworld_vironium_ores, 6));
	  
	  
	  
	  
	  
	  
	  
	  
	
	  }
	
	private static final ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		return	ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation( Dimtech.MODID, name));
	}
	
	private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
            ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
context.register(key, new ConfiguredFeature<>(feature, configuration));
}
	
}
