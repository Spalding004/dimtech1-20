package com.mrspalding.dimtech.datagen;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.custom.ModBlocks;
import com.mrspalding.dimtech.custom.ModItems;
import com.mrspalding.dimtech.custom.blocks.ModWallStone;
import com.mrspalding.dimtech.datagen.helpers.WallMap;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelGenerator extends ItemModelProvider{

	public ModItemModelGenerator(PackOutput output,  ExistingFileHelper existingFileHelper) {
		super(output, Dimtech.MODID, existingFileHelper);
	
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void registerModels() {
		
		for (int x = 0; x < ModItems.ITEMS.getEntries().size(); x++) {
			if (!ModBlocks.BLOCKS.getEntries().stream().toList().contains(
					ModItems.ITEMS.getEntries().stream().toList().get(x))) {
					
			this.basicItem(BuiltInRegistries.ITEM.get(ModItems.ITEMS.getEntries().stream().toList().get(x).getId()));
			}
		}
		
		for (int walls = 0; walls < ModBlocks.walls.size(); walls++) {
		
				wallItem(((ModWallStone) ModBlocks.walls.get(walls)).getWall(), 
						((ModWallStone) ModBlocks.walls.get(walls)).getBaseBlock());
		
		}
		
		
	}
	
	public void wallItem(DeferredBlock block, DeferredBlock baseBlock) {
		this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
		.texture("wall", "block/" + baseBlock.getId().getPath());
	}
	
	
	 public ItemModelBuilder basicItem(ResourceLocation item) {
	        return getBuilder(item.toString())
	                .parent(new ModelFile.UncheckedModelFile("item/generated"))
	                .texture("layer0", new ResourceLocation(Dimtech.MODID, "item/" + item.getPath()));
	    }
	

}