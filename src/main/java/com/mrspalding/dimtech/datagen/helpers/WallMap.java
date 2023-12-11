package com.mrspalding.dimtech.datagen.helpers;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.custom.ModBlocks;

import net.neoforged.neoforge.registries.DeferredBlock;

public class WallMap {

	
	
	public static WallMap MARCASITE = new WallMap(ModBlocks.POLISHED_MARCASITE_WALL, ModBlocks.MARCASITE_SMOOTH);
	public static WallMap SHALE = new WallMap(ModBlocks.POLISHED_SHALE_WALL, ModBlocks.SHALE_SMOOTH);
	public static WallMap APATITE = new WallMap(ModBlocks.POLISHED_APATITE_WALL, ModBlocks.APATITE_SMOOTH);
	
	public static WallMap UMBER = new WallMap(ModBlocks.POLISHED_UMBER_WALL, ModBlocks.UMBER_SMOOTH);
	public static WallMap CORMALITE = new WallMap(ModBlocks.POLISHED_CORMALITE_WALL, ModBlocks.CORMALITE_SMOOTH);
	public static WallMap ALUNITE = new WallMap(ModBlocks.POLISHED_ALUNITE_WALL, ModBlocks.ALUNITE_SMOOTH);
	
	public static WallMap MIXED_STONE = new WallMap(ModBlocks.MIXED_STONE_WALL, ModBlocks.MIXED_STONE);
	
	
	
	private static DeferredBlock wall;
	private static DeferredBlock base;
	
	public WallMap(DeferredBlock wall, DeferredBlock base) {
		
		this.wall = wall;
		this.base = base;
	
		Dimtech.WALLMAPS.add(this);
		
	}
	
	public static DeferredBlock getWall(WallMap map) {
		return wall;
	}
	public static DeferredBlock getBase(WallMap map) {
		return base;
	}
	
}
