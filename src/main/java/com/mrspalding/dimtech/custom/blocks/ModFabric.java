package com.mrspalding.dimtech.custom.blocks;

import com.mrspalding.dimtech.custom.ModBlocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;


public class ModFabric extends Block{

	public ModFabric() {
		super(BlockBehaviour.Properties
				.of().sound(SoundType.WOOL)
				.strength(0.8F, 0.8F)
				
				);
				
		
		
		ModBlocks.stones.add(this);
	}

}
