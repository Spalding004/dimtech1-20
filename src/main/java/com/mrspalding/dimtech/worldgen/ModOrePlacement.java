package com.mrspalding.dimtech.worldgen;

import java.util.List;

import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModOrePlacement {

	    public static List<PlacementModifier> orePlacement(PlacementModifier placement1, PlacementModifier placement2) {
	        return List.of(placement1, InSquarePlacement.spread(), placement2, BiomeFilter.biome());
	    }

	    public static List<PlacementModifier> commonOrePlacement(int pCount, PlacementModifier pHeightRange) {
	        return orePlacement(CountPlacement.of(pCount), pHeightRange);
	    }

	    public static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier pHeightRange) {
	        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), pHeightRange);
	    }
	
}
