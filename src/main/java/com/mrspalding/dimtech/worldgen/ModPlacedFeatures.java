package com.mrspalding.dimtech.worldgen;

import java.util.List;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.worldgen.placements.ModOrePlacement;

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

	 public static final ResourceKey<PlacedFeature> VENDAR_ORE_PLACED_KEY = registerKey("vendar_ore_placed");
	 public static final ResourceKey<PlacedFeature> VENDAR_ORE_DENSE_PLACED_KEY = registerKey("vendar_ore_dense_placed");
	 public static final ResourceKey<PlacedFeature> VENDAR_ORE_DENSE_DS_PLACED_KEY = registerKey("vendar_ore_dense_ds_placed");
	
	 public static final ResourceKey<PlacedFeature> SHALE_PLACED_KEY = registerKey("shale_placed");
	 public static final ResourceKey<PlacedFeature> SHAR_PLACED_KEY = registerKey("shar_placed");
	 public static final ResourceKey<PlacedFeature> PRISMARINE_PLACED_KEY = registerKey("prismarine_placed");
	 
	 public static final ResourceKey<PlacedFeature> MARCASITE_PLACED_KEY = registerKey("marcasite_placed");
	 public static final ResourceKey<PlacedFeature> APATITE_PLACED_KEY = registerKey("apatite_placed");
	 public static final ResourceKey<PlacedFeature> ALUNITE_PLACED_KEY = registerKey("alunite_placed");
	 public static final ResourceKey<PlacedFeature> UMBER_PLACED_KEY = registerKey("umber_placed");
	 public static final ResourceKey<PlacedFeature> CORMALITE_PLACED_KEY = registerKey("cormalite_placed");
	 
	 
	 public static void bootstrap(BootstapContext<PlacedFeature> context) {
	        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

	        register(context, INDIRIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(
	        		ModConfiguredFeatures.OVERWORLD_INDIRIUM_ORE),
	                ModOrePlacement.commonOrePlacement(25,
	                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(80))));
	        
	        register(context, VENDAR_ORE_PLACED_KEY, configuredFeatures.getOrThrow(
	        		ModConfiguredFeatures.OVERWORLD_VENDAR_ORE),
	                ModOrePlacement.commonOrePlacement(5,
	                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(20))));
	        
	        register(context, VENDAR_ORE_DENSE_PLACED_KEY, configuredFeatures.getOrThrow(
	        		ModConfiguredFeatures.OVERWORLD_VENDAR_ORE_DENSE),
	                ModOrePlacement.commonOrePlacement(10,
	                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(20))));
	        
	        register(context, VENDAR_ORE_DENSE_DS_PLACED_KEY, configuredFeatures.getOrThrow(
	        		ModConfiguredFeatures.OVERWORLD_VENDAR_ORE_DENSE_DS),
	                ModOrePlacement.commonOrePlacement(10,
	                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(20))));
	        
	        register(context, SHALE_PLACED_KEY, configuredFeatures.getOrThrow(
	        		ModConfiguredFeatures.SHALE_STONE_BLOB),
	                ModOrePlacement.commonOrePlacement(10,
	                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(90))));
	        
	        register(context, SHAR_PLACED_KEY, configuredFeatures.getOrThrow(
	        		ModConfiguredFeatures.SHAR_STONE_BLOB),
	                ModOrePlacement.commonOrePlacement(7,
	                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-10))));
	        
	        register(context, PRISMARINE_PLACED_KEY, configuredFeatures.getOrThrow(
	        		ModConfiguredFeatures.OVERWORLD_PRISMARINE_ORE),
	                ModOrePlacement.commonOrePlacement(50,
	                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(90))));
	        
	        
	        register(context, MARCASITE_PLACED_KEY, configuredFeatures.getOrThrow(
	        		ModConfiguredFeatures.MARCASITE_STONE_BLOB),
	                ModOrePlacement.commonOrePlacement(7,
	                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(120))));
	        
	        register(context, APATITE_PLACED_KEY, configuredFeatures.getOrThrow(
	        		ModConfiguredFeatures.APATITE_STONE_BLOB),
	                ModOrePlacement.commonOrePlacement(7,
	                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(120))));
	 
	        register(context, ALUNITE_PLACED_KEY, configuredFeatures.getOrThrow(
	        		ModConfiguredFeatures.ALUNITE_STONE_BLOB),
	                ModOrePlacement.commonOrePlacement(7,
	                        HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.absolute(180))));
	        
	        register(context, CORMALITE_PLACED_KEY, configuredFeatures.getOrThrow(
	        		ModConfiguredFeatures.CORMALITE_STONE_BLOB),
	                ModOrePlacement.commonOrePlacement(7,
	                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(50), VerticalAnchor.absolute(95))));
	        
	        register(context, UMBER_PLACED_KEY, configuredFeatures.getOrThrow(
	        		ModConfiguredFeatures.UMBER_STONE_BLOB),
	                ModOrePlacement.commonOrePlacement(7,
	                        HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.TOP)));
	        
	        
	 }
	private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Dimtech.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
	
}
