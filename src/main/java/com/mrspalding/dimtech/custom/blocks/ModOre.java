package com.mrspalding.dimtech.custom.blocks;

import com.mrspalding.dimtech.custom.ModBlocks;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredItem;

@SuppressWarnings("rawtypes")
public class ModOre extends Block{

	private DeferredItem toDrop;
	private Item         itemToDrop;
	
	public ModOre(int level, DeferredItem toDrop) {
		super(BlockBehaviour.Properties
				.of()
				.strength(3.0F, 3.0F)
				.requiresCorrectToolForDrops()
				);
		
		setup(level, toDrop);
		ModBlocks.ore.add(this);
		
			
	}
	
	public ModOre(int level, Item toDrop) {
		super(BlockBehaviour.Properties
				.of()
				.strength(3.0F, 3.0F)
				.requiresCorrectToolForDrops()
				);
		
		setup(level, toDrop);
		ModBlocks.vanilla_dropping_ore.add(this);
		
	}
	
	public Item getItem() {
		if (itemToDrop == null) return toDrop.asItem();
		return itemToDrop;
	}
	
	public DeferredItem getDeferredDrop() {
		return toDrop;
	}
	
	public Item getItemDrop() {
		return itemToDrop;
	}
	
	private void setup(int level, Item toDrop) {
		this.itemToDrop = toDrop;
		doAssignments(level);
	}
	
	private void setup(int level, DeferredItem toDrop) {
		this.toDrop = toDrop;
		doAssignments(level);
	}

	private void doAssignments(int level) {
		ModBlocks.cubes.add(this);
		ModBlocks.pickaxe.add(this);
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
}
