package com.mrspalding.dimtech.custom.blocks;

import com.mrspalding.dimtech.custom.ModBlocks;
import com.mrspalding.dimtech.datagen.helpers.StairMap;
import com.mrspalding.dimtech.datagen.helpers.WallMap;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.registries.DeferredBlock;

@SuppressWarnings("unchecked")
public class ModStoneStairs extends StairBlock{

	private DeferredBlock inputBlock;
	
	
	@SuppressWarnings("deprecation")
	public ModStoneStairs(DeferredBlock block) {
		super(((Block) block.get()).defaultBlockState(), BlockBehaviour.Properties
		.of()
		.strength(1.5F, 6F)
		.requiresCorrectToolForDrops()
		);
				
		this.inputBlock = block;
		
		ModBlocks.pickaxe.add(this);
		ModBlocks.stones.add(this);
		
		ModBlocks.stairs.add(this);
	}
	
	public DeferredBlock getInput() {
		return this.inputBlock;
	}
	
}
