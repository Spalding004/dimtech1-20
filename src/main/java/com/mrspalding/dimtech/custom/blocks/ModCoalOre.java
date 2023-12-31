package com.mrspalding.dimtech.custom.blocks;

import com.mrspalding.dimtech.custom.ModBlocks;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredItem;


@SuppressWarnings("unused")
public class ModCoalOre extends DropExperienceBlock{

	private Item toDrop;
	
	public ModCoalOre(int level) {
		super(UniformInt.of(0, 1 + level) ,BlockBehaviour.Properties
				.of()
				.strength(3.0F, 3.0F)
				.requiresCorrectToolForDrops()
				);
		
		
		
		Block block = Blocks.IRON_ORE;
		
		ModBlocks.cubes.add(this);
		ModBlocks.pickaxe.add(this);
		ModBlocks.coal_ores.add(this);
		
		
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
