package com.mrspalding.dimtech.datagen.helpers;

import java.util.ArrayList;

import com.mrspalding.dimtech.custom.ModBlocks;

import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;

public class WallMap {

	
	
	public static WallMap MARCASITE = new WallMap(ModBlocks.POLISHED_MARCASITE_WALL, ModBlocks.MARCASITE_SMOOTH);
	
	private static DeferredBlock wall;
	private static DeferredBlock base;
	
	public WallMap(DeferredBlock wall, DeferredBlock base) {
		
		this.wall = wall;
		this.base = base;
	
		
		
	}
	
	public static DeferredBlock getWall(WallMap map) {
		return wall;
	}
	public static DeferredBlock getBase(WallMap map) {
		return base;
	}
	
}
