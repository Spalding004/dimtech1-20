package com.mrspalding.dimtech.custom.blocks;

import com.mrspalding.dimtech.custom.ModBlocks;
import com.mrspalding.dimtech.datagen.helpers.Cobbleable;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;


public class ModCobbleable extends Block{

	private Cobbleable cobble;
	
	public ModCobbleable(Cobbleable cobble) {
		super(BlockBehaviour.Properties
				.of()
				.strength(1.5F, 6F)
				.requiresCorrectToolForDrops()
				);
				
		this.cobble = cobble;
		
		ModBlocks.pickaxe.add(this);
		ModBlocks.cobbleable.add(this);
		ModBlocks.cubes.add(this);
	}
	
	public DeferredBlock getCobble() {
		return this.cobble.getCobble(cobble);
	}
}
