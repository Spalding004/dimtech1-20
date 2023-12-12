package com.mrspalding.dimtech.custom.blocks;

import com.mrspalding.dimtech.custom.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

@SuppressWarnings("rawtypes")
public class ModCobbleable extends Block{

	private DeferredBlock toDrop;
	
	public ModCobbleable(DeferredBlock cobble) {
		super(BlockBehaviour.Properties
				.of()
				.strength(1.5F, 6F)
				.requiresCorrectToolForDrops()
				);
				
		this.toDrop = cobble;
		
		ModBlocks.pickaxe.add(this);
		ModBlocks.cobbleable.add(this);
		ModBlocks.cubes.add(this);
		
		
	}
	
	public DeferredBlock getDeferredDrop() {
		return this.toDrop;
	}
}
