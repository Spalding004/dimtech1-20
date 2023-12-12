package com.mrspalding.dimtech.datagen.helpers;

import net.minecraft.world.level.ItemLike;

public class WallMap {

	
	
	
	
	
	
	private ItemLike wall;
	private ItemLike base;
	
	public WallMap(ItemLike wall, ItemLike base) {
		
		this.wall = wall;
		this.base = base;
	
		//BlockToBlock.WALLMAPS.add(this);
	}
	
	public ItemLike getWall(WallMap map) {
		return this.wall;
	}
	public  ItemLike getBase(WallMap map) {
		return this.base;
	}
	
}
