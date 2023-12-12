package com.mrspalding.dimtech.custom.blocks;

import com.mrspalding.dimtech.custom.ModBlocks;
import com.mrspalding.dimtech.datagen.helpers.WallMap;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModWallStone extends WallBlock{

	private DeferredBlock inputBlock;
	
	public ModWallStone(DeferredBlock input) {
		super(BlockBehaviour.Properties
				.of()
				.strength(1.5F, 6F)
				.requiresCorrectToolForDrops()
				);
				
		this.inputBlock = input;
		
		ModBlocks.pickaxe.add(this);
		ModBlocks.stones.add(this);
		ModBlocks.walls.add(this);
		
		
	}
	
	public DeferredBlock getInput() {
		return this.inputBlock;
	}
	
	
}
