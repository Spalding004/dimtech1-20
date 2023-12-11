package com.mrspalding.dimtech.datagen.helpers;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.custom.ModBlocks;

import net.neoforged.neoforge.registries.DeferredBlock;

public class StairMap {

	
	
	public static StairMap MARCASITE = new StairMap(ModBlocks.POLISHED_MARCASITE_STAIRS, ModBlocks.MARCASITE_SMOOTH);
	public static StairMap SHALE = new StairMap(ModBlocks.POLISHED_SHALE_STAIRS, ModBlocks.SHALE_SMOOTH);
	public static StairMap APATITE = new StairMap(ModBlocks.POLISHED_APATITE_STAIRS, ModBlocks.APATITE_SMOOTH);
	
	public static StairMap UMBER = new StairMap(ModBlocks.POLISHED_UMBER_STAIRS, ModBlocks.UMBER_SMOOTH);
	public static StairMap CORMALITE = new StairMap(ModBlocks.POLISHED_CORMALITE_STAIRS, ModBlocks.CORMALITE_SMOOTH);
	public static StairMap ALUNITE = new StairMap(ModBlocks.POLISHED_ALUNITE_STAIRS, ModBlocks.ALUNITE_SMOOTH);
	
	public static StairMap MIXED_STONE = new StairMap(ModBlocks.MIXED_STONE_STAIRS, ModBlocks.MIXED_STONE);
	
	
	
	private static DeferredBlock stair;
	private static DeferredBlock base;
	
	public StairMap(DeferredBlock stair, DeferredBlock base) {
		
		this.stair = stair;
		this.base = base;
	
		Dimtech.STAIRMAPS.add(this);
		
	}
	
	public static DeferredBlock getStair(StairMap map) {
		return stair;
	}
	public static DeferredBlock getBase(StairMap map) {
		return base;
	}
	
}
