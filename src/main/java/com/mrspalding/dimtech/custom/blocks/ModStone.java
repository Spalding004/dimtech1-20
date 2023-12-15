package com.mrspalding.dimtech.custom.blocks;

import com.mrspalding.dimtech.custom.ModBlocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;


public class ModStone extends Block{

	public ModStone(int level) {
		super(BlockBehaviour.Properties
				.of()
				.strength(1.5F, 6F)
				.requiresCorrectToolForDrops()
				);
				
		
		ModBlocks.pickaxe.add(this);
		ModBlocks.stones.add(this);
		ModBlocks.cubes.add(this);
		
		doAssignments(level);
	}
	
	public ModStone() {
		super(BlockBehaviour.Properties
				.of()
				.strength(1.5F, 6F)
				.requiresCorrectToolForDrops()
				);
				
		
		ModBlocks.pickaxe.add(this);
		ModBlocks.stones.add(this);
		ModBlocks.cubes.add(this);
	}
	
	public ModStone(String name) {
		super(BlockBehaviour.Properties
				.of()
				.strength(1.5F, 6F)
				.requiresCorrectToolForDrops()
				);
				
		
		ModBlocks.pickaxe.add(this);
		ModBlocks.cubes.add(this);
	}
	
	
	private void doAssignments(int level) {
		
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
