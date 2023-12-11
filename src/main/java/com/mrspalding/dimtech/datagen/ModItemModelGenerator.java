package com.mrspalding.dimtech.datagen;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.custom.ModBlocks;
import com.mrspalding.dimtech.custom.ModItems;
import com.mrspalding.dimtech.custom.blocks.ModSlabStone;
import com.mrspalding.dimtech.custom.blocks.ModStoneStairs;
import com.mrspalding.dimtech.custom.blocks.ModWallStone;
import com.mrspalding.dimtech.datagen.helpers.WallMap;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
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

			
			if (!(ModItems.ITEMS.getEntries().stream().toList().get(x).get() instanceof BlockItem)) {
			
				this.basicItem(BuiltInRegistries.ITEM.get(ModItems.ITEMS.getEntries().stream().toList().get(x).getId()));
			
			}
		}
		
			wallItem(ModBlocks.POLISHED_APATITE_WALL, ModBlocks.APATITE_SMOOTH);
			evenSimplerBlockItem(ModBlocks.POLISHED_APATITE_SLAB);
			evenSimplerBlockItem(ModBlocks.POLISHED_APATITE_STAIRS);
			
			wallItem(ModBlocks.POLISHED_SHALE_WALL, ModBlocks.SHALE_SMOOTH);
			evenSimplerBlockItem(ModBlocks.POLISHED_SHALE_SLAB);
			evenSimplerBlockItem(ModBlocks.POLISHED_SHALE_STAIRS);
			
			wallItem(ModBlocks.POLISHED_MARCASITE_WALL, ModBlocks.MARCASITE_SMOOTH);
			evenSimplerBlockItem(ModBlocks.POLISHED_MARCASITE_SLAB);
			evenSimplerBlockItem(ModBlocks.POLISHED_MARCASITE_STAIRS);
			
			wallItem(ModBlocks.POLISHED_ALUNITE_WALL, ModBlocks.ALUNITE_SMOOTH);
			evenSimplerBlockItem(ModBlocks.POLISHED_ALUNITE_SLAB);
			evenSimplerBlockItem(ModBlocks.POLISHED_ALUNITE_STAIRS);
		
			wallItem(ModBlocks.MIXED_STONE_WALL, ModBlocks.MIXED_STONE);
			evenSimplerBlockItem(ModBlocks.MIXED_STONE_SLAB);
			evenSimplerBlockItem(ModBlocks.MIXED_STONE_STAIRS);
			
			wallItem(ModBlocks.POLISHED_CORMALITE_WALL, ModBlocks.CORMALITE_SMOOTH);
			evenSimplerBlockItem(ModBlocks.POLISHED_CORMALITE_SLAB);
			evenSimplerBlockItem(ModBlocks.POLISHED_CORMALITE_STAIRS);
			
			wallItem(ModBlocks.POLISHED_UMBER_WALL, ModBlocks.UMBER_SMOOTH);
			evenSimplerBlockItem(ModBlocks.POLISHED_UMBER_SLAB);
			evenSimplerBlockItem(ModBlocks.POLISHED_UMBER_STAIRS);
		
		
		
	}
	
	 public void evenSimplerBlockItem(DeferredBlock block) {
	        this.withExistingParent(block.getId().getPath(),
	                modLoc("block/" + block.getId().getPath()));
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
