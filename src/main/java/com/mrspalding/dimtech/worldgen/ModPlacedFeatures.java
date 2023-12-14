package com.mrspalding.dimtech.worldgen;

import java.util.List;

import com.mrspalding.dimtech.Dimtech;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

public class ModPlacedFeatures {

	 public static final ResourceKey<PlacedFeature> INDIRIUM_ORE_PLACED_KEY = registerKey("indirium_ore_placed");
	
	 public static void bootstrap(BootstapContext<PlacedFeature> context) {
	        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

	        register(context, INDIRIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_INDIRIUM_ORE),
	                ModOrePlacement.commonOrePlacement(35,
	                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(80))));
	 
	 }
	private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Dimtech.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
	
}
