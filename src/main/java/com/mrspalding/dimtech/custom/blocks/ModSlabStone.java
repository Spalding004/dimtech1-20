package com.mrspalding.dimtech.custom.blocks;

import com.mrspalding.dimtech.custom.ModBlocks;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModSlabStone extends SlabBlock{

	public ModSlabStone() {
		super(BlockBehaviour.Properties
				.of()
				.strength(1.5F, 6F)
				.requiresCorrectToolForDrops()
				);
				
		
		ModBlocks.pickaxe.add(this);
		ModBlocks.stones.add(this);
		
		ModBlocks.slabs.add(this);
	}
}
