package com.mrspalding.dimtech.datagen;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.worldgen.ModBiomeModifiers;
import com.mrspalding.dimtech.worldgen.ModConfiguredFeatures;
import com.mrspalding.dimtech.worldgen.ModPlacedFeatures;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.RegistrySetBuilder.PatchedRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider{

	 public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
			 	.add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
	            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
	            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);

	 
	 
	    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
	        super(output, registries, BUILDER, Set.of(Dimtech.MODID));
	    }
}
