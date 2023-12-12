package com.mrspalding.dimtech.custom.blocks;

import com.mrspalding.dimtech.custom.ModBlocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
@SuppressWarnings("rawtypes")
public class ModStoneBricks extends Block{

	
	private DeferredBlock base;
	
	public ModStoneBricks(DeferredBlock base) {
		super(BlockBehaviour.Properties
				.of()
				.strength(1.5F, 6F)
				.requiresCorrectToolForDrops()
				);
				
		this.base = base;
		
		ModBlocks.pickaxe.add(this);
		ModBlocks.stones.add(this);
		ModBlocks.cubes.add(this);
		ModBlocks.bricks.add(this);
	}

	public DeferredBlock getInput() {
		return this.base;
	}
	
}
