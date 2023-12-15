package com.mrspalding.dimtech.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.custom.ModBlocks;
import com.mrspalding.dimtech.custom.ModTags;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBiomeTagGenerator extends BiomeTagsProvider{

	public ModBiomeTagGenerator(PackOutput output, CompletableFuture<Provider> lookupProvider, 
			@Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider,  Dimtech.MODID, existingFileHelper);
		
	}

	@Override
	protected void addTags(Provider provider) {
		
		
		
		
		this.tag(ModTags.Biomes.IS_WATER)
		.addTag(BiomeTags.IS_OCEAN)
		.addTag(BiomeTags.IS_RIVER);
		
		
		
		
	}
	
	

}
