package com.mrspalding.dimtech.custom.blocks;

import com.mrspalding.dimtech.custom.ModBlocks;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModMetalBlock extends Block{

	ItemLike ingot;
	
	public ModMetalBlock(ItemLike item) {
		super(BlockBehaviour.Properties
				.of()
				.strength(6F, 5F)
				.requiresCorrectToolForDrops().sound(SoundType.METAL)
				);
				
		
		this.ingot = item;
		
		ModBlocks.pickaxe.add(this);
		ModBlocks.tool_iron.add(this);
		ModBlocks.cubes.add(this);
		ModBlocks.metals.add(this);

	
	}
	
	public ItemLike getIngot() {
		return this.ingot;
	}
	
}
