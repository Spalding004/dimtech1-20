package com.mrspalding.dimtech.custom.blocks;

import com.mrspalding.dimtech.custom.ModBlocks;

import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class ModStoneStairs extends StairBlock{

	private String basename;
	
	@SuppressWarnings("deprecation")
	public ModStoneStairs(BlockState block, String basename) {
		super(block, BlockBehaviour.Properties
				.of()
				.strength(1.5F, 6F)
				.requiresCorrectToolForDrops()
				);
				
		this.basename = basename;
		
		ModBlocks.pickaxe.add(this);
		ModBlocks.stones.add(this);
		
		ModBlocks.stairs.add(this);
	}
	
	public String getBasename() {
		return this.basename;
	}
}
