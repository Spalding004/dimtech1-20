package com.mrspalding.dimtech.datagen;

import java.util.concurrent.CompletableFuture;

import com.mrspalding.dimtech.Dimtech;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemTagGenerator extends ItemTagsProvider {

	public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<Provider> provider,
			CompletableFuture<TagLookup<Block>> blocktag,  ExistingFileHelper existingFileHelper) {
		super(packOutput, provider, blocktag, Dimtech.MODID, existingFileHelper);
		
	}

	@Override
	protected void addTags(Provider p_256380_) {
		
		
		
	}

}
