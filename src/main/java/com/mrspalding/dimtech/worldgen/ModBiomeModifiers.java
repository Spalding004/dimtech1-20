package com.mrspalding.dimtech.worldgen;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.custom.ModTags;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {

	 public static final ResourceKey<BiomeModifier> ADD_INDIRIUM_ORE = registerKey("add_indirium_ore");
	 
	 public static final ResourceKey<BiomeModifier> ADD_VENDAR_ORE = registerKey("add_vendar_ore");
	 public static final ResourceKey<BiomeModifier> ADD_VENDAR_ORE_DENSE = registerKey("add_vendar_ore_dense");
	 public static final ResourceKey<BiomeModifier> ADD_VENDAR_ORE_DENSE_DS = registerKey("add_vendar_ore_dense_ds");
	 
	 public static final ResourceKey<BiomeModifier> ADD_SHALE_STONE = registerKey("add_shale_stone");
	 public static final ResourceKey<BiomeModifier> ADD_SHAR_STONE = registerKey("add_shar_stone");

	 public static final ResourceKey<BiomeModifier> ADD_MARCASITE_STONE = registerKey("add_marcasite_stone");
	 public static final ResourceKey<BiomeModifier> ADD_APATITE_STONE = registerKey("add_apatite_stone");
	 public static final ResourceKey<BiomeModifier> ADD_ALUNITE_STONE = registerKey("add_alunite_stone");
	 public static final ResourceKey<BiomeModifier> ADD_CORMALITE_STONE = registerKey("add_cormalite_stone");
	 public static final ResourceKey<BiomeModifier> ADD_UMBER_STONE = registerKey("add_umber_stone");
	 
	 public static final ResourceKey<BiomeModifier> ADD_PRISMARINE = registerKey("add_prismarine");
	
	 
	 public static void bootstrap(BootstapContext<BiomeModifier> context) {
	        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
	        var biomes = context.lookup(Registries.BIOME);

	        context.register(ADD_INDIRIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
	                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
	                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.INDIRIUM_ORE_PLACED_KEY)),
	                GenerationStep.Decoration.UNDERGROUND_ORES));
	        
	        context.register(ADD_VENDAR_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
	                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
	                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.VENDAR_ORE_PLACED_KEY)),
	                GenerationStep.Decoration.UNDERGROUND_ORES));
	        
	        context.register(ADD_VENDAR_ORE_DENSE, new BiomeModifiers.AddFeaturesBiomeModifier(
	                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
	                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.VENDAR_ORE_DENSE_PLACED_KEY)),
	                GenerationStep.Decoration.UNDERGROUND_ORES));
	        
	        context.register(ADD_VENDAR_ORE_DENSE_DS, new BiomeModifiers.AddFeaturesBiomeModifier(
	                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
	                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.VENDAR_ORE_DENSE_DS_PLACED_KEY)),
	                GenerationStep.Decoration.UNDERGROUND_ORES));
	        
	        context.register(ADD_SHAR_STONE, new BiomeModifiers.AddFeaturesBiomeModifier(
	                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
	                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SHAR_PLACED_KEY)),
	                GenerationStep.Decoration.UNDERGROUND_ORES));
	        
	        context.register(ADD_MARCASITE_STONE, new BiomeModifiers.AddFeaturesBiomeModifier(
	                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
	                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MARCASITE_PLACED_KEY)),
	                GenerationStep.Decoration.UNDERGROUND_ORES));
	        
	        context.register(ADD_APATITE_STONE, new BiomeModifiers.AddFeaturesBiomeModifier(
	                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
	                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.APATITE_PLACED_KEY)),
	                GenerationStep.Decoration.UNDERGROUND_ORES));
	        
	        context.register(ADD_ALUNITE_STONE, new BiomeModifiers.AddFeaturesBiomeModifier(
	                biomes.getOrThrow(BiomeTags.IS_NETHER),
	                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ALUNITE_PLACED_KEY)),
	                GenerationStep.Decoration.UNDERGROUND_ORES));
	        
	        context.register(ADD_CORMALITE_STONE, new BiomeModifiers.AddFeaturesBiomeModifier(
	                biomes.getOrThrow(BiomeTags.IS_NETHER),
	                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CORMALITE_PLACED_KEY)),
	                GenerationStep.Decoration.UNDERGROUND_ORES));
	        
	        context.register(ADD_UMBER_STONE, new BiomeModifiers.AddFeaturesBiomeModifier(
	                biomes.getOrThrow(BiomeTags.IS_NETHER),
	                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.UMBER_PLACED_KEY)),
	                GenerationStep.Decoration.UNDERGROUND_ORES));
	
	        
	      
	        
	        context.register(ADD_SHALE_STONE, new BiomeModifiers.AddFeaturesBiomeModifier(
	                biomes.getOrThrow(ModTags.Biomes.IS_WATER),
	                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SHALE_PLACED_KEY)),
	                GenerationStep.Decoration.UNDERGROUND_ORES));
	        
	        context.register(ADD_PRISMARINE, new BiomeModifiers.AddFeaturesBiomeModifier(
	                biomes.getOrThrow(ModTags.Biomes.IS_WATER),
	                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PRISMARINE_PLACED_KEY)),
	                GenerationStep.Decoration.UNDERGROUND_ORES));
	        
	 }
	private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(Dimtech.MODID, name));
    }
	
}
