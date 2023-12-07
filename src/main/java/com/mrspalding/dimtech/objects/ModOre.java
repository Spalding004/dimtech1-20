package com.mrspalding.dimtech.objects;

import com.mrspalding.dimtech.objects.mod.ModBlocks;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredItem;


public class ModOre extends Block{

	private DeferredItem toDrop;
	
	public ModOre(int level, DeferredItem toDrop) {
		super(BlockBehaviour.Properties
				.of()
				.strength(3.0F, 3.0F)
				.requiresCorrectToolForDrops()
				);
		
		this.toDrop = toDrop;
		
		
		ModBlocks.cubes.add(this);
		ModBlocks.pickaxe.add(this);
		ModBlocks.ore.add(this);
		
		switch(level) {
		
		case 0: ModBlocks.tool_any.add(this);
				break;
		case 1: ModBlocks.tool_stone.add(this);
				break;		
		case 2: ModBlocks.tool_iron.add(this);
				break;		
		case 3: ModBlocks.tool_diamond.add(this);
				break;		
		case 4: ModBlocks.tool_nether.add(this);
				break;		
		default:ModBlocks.tool_any.add(this);
				break;
		
		}
		
	}
	
	public DeferredItem getDrop() {
		return toDrop;
	}
	

}
