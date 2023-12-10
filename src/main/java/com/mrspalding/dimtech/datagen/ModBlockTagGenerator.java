package com.mrspalding.dimtech.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.custom.ModBlocks;
import com.mrspalding.dimtech.custom.ModTags;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockTagGenerator extends BlockTagsProvider{

	public ModBlockTagGenerator(PackOutput output, CompletableFuture<Provider> lookupProvider, 
			@Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider,  Dimtech.MODID, existingFileHelper);
		
	}

	@Override
	protected void addTags(Provider provider) {
		
		
		for (int diamonds = 0; diamonds < ModBlocks.tool_diamond.size(); diamonds++) {
			this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ModBlocks.pickaxe.get(diamonds));
		}		
				
		for (int iron = 0; iron < ModBlocks.tool_iron.size(); iron++) {
			this.tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.tool_any.get(iron));
		}
		
		for (int pickable = 0; pickable < ModBlocks.pickaxe.size(); pickable++) {
			this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.pickaxe.get(pickable));
		}
		
		for (int walls = 0; walls <ModBlocks.walls.size(); walls++) {
			this.tag(BlockTags.WALLS).add(ModBlocks.walls.get(walls));
		}
		
		this.tag(ModTags.Blocks.ENDFECTION_TARGETS).add(
				Blocks.NETHERRACK,
				Blocks.NETHER_QUARTZ_ORE,
				Blocks.CRIMSON_NYLIUM,
				Blocks.WARPED_NYLIUM,
				Blocks.CRIMSON_STEM,
				Blocks.WARPED_STEM,
				Blocks.BASALT,
				Blocks.BLACKSTONE,
				Blocks.OBSIDIAN
				)//.addTag(ModTags.Blocks.ENDFECTION_TARGETS)
				;
		
		
		
	}
	
	

}
