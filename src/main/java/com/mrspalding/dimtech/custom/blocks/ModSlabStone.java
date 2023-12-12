package com.mrspalding.dimtech.custom.blocks;

import com.mrspalding.dimtech.custom.ModBlocks;
import com.mrspalding.dimtech.datagen.helpers.SlabMap;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModSlabStone extends SlabBlock{

	private DeferredBlock input;
	
	public ModSlabStone(DeferredBlock input) {
		super(BlockBehaviour.Properties
				.of()
				.strength(1.5F, 6F)
				.requiresCorrectToolForDrops()
				);
				this.input = input;
		
		ModBlocks.pickaxe.add(this);
		ModBlocks.stones.add(this);
		
		ModBlocks.slabs.add(this);
		
		
		
	}
	
	public DeferredBlock getInput() {
		return input;
		
		
		
	}
	
}
