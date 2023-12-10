package com.mrspalding.dimtech.custom.blocks;

import com.mrspalding.dimtech.custom.ModBlocks;
import com.mrspalding.dimtech.datagen.helpers.WallMap;

import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModWallStone extends WallBlock{

	private static WallMap wallMap;
	
	public ModWallStone(WallMap wallMap) {
		super(BlockBehaviour.Properties
				.of()
				.strength(1.5F, 6F)
				.requiresCorrectToolForDrops()
				);
				
		ModWallStone.wallMap = wallMap;
		
		ModBlocks.pickaxe.add(this);
		ModBlocks.stones.add(this);
		
		ModBlocks.walls.add(this);
		
		
	}
	
	public DeferredBlock getWall() {
		return WallMap.getWall(wallMap);
	}
	
	public DeferredBlock getBaseBlock() {
		return WallMap.getBase(wallMap);
	}
}
