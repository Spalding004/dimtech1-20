package com.mrspalding.dimtech.worldgen;

import com.mrspalding.dimtech.Dimtech;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {

	 public static final ResourceKey<BiomeModifier> ADD_INDIRIUM_ORE = registerKey("add_indirium_ore");
	
	 
	 public static void bootstrap(BootstapContext<BiomeModifier> context) {
	        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
	        var biomes = context.lookup(Registries.BIOME);

	        context.register(ADD_INDIRIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
	                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
	                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.INDIRIUM_ORE_PLACED_KEY)),
	                GenerationStep.Decoration.UNDERGROUND_ORES));
	
	 }
	private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(Dimtech.MODID, name));
    }
	
}
