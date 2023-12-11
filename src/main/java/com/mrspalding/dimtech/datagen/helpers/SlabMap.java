package com.mrspalding.dimtech.datagen.helpers;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.custom.ModBlocks;

import net.neoforged.neoforge.registries.DeferredBlock;

public class SlabMap {

	
	
	public static SlabMap MARCASITE = new SlabMap(ModBlocks.POLISHED_MARCASITE_SLAB, ModBlocks.MARCASITE_SMOOTH);
	public static SlabMap SHALE = new SlabMap(ModBlocks.POLISHED_SHALE_SLAB, ModBlocks.SHALE_SMOOTH);
	public static SlabMap APATITE = new SlabMap(ModBlocks.POLISHED_APATITE_SLAB, ModBlocks.APATITE_SMOOTH);
	
	public static SlabMap UMBER = new SlabMap(ModBlocks.POLISHED_UMBER_SLAB, ModBlocks.UMBER_SMOOTH);
	public static SlabMap CORMALITE = new SlabMap(ModBlocks.POLISHED_CORMALITE_SLAB, ModBlocks.CORMALITE_SMOOTH);
	public static SlabMap ALUNITE = new SlabMap(ModBlocks.POLISHED_ALUNITE_SLAB, ModBlocks.ALUNITE_SMOOTH);
	
	public static SlabMap MIXED_STONE = new SlabMap(ModBlocks.MIXED_STONE_SLAB, ModBlocks.MIXED_STONE);
	
	
	
	
	private static DeferredBlock wall;
	private static DeferredBlock base;
	
	public SlabMap(DeferredBlock wall, DeferredBlock base) {
		
		this.wall = wall;
		this.base = base;
	
		Dimtech.SLABMAPS.add(this);
		
	}
	
	public static DeferredBlock getSlab(SlabMap map) {
		return wall;
	}
	public static DeferredBlock getBase(SlabMap map) {
		return base;
	}
	
}
