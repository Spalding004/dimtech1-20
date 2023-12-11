package com.mrspalding.dimtech.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.custom.ModBlocks;
import com.mrspalding.dimtech.custom.ModItems;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

public class ModRecipeGenerator extends RecipeProvider implements IConditionBuilder{

	public ModRecipeGenerator(PackOutput pack, CompletableFuture<Provider> lookupProvider) {
		super(pack, lookupProvider);
		
	}
	
	private static final List<ItemLike> VENDAR = List.of(ModItems.VENDAR_INGOT.get(), ModBlocks.VENDAR_ORE, ModItems.VENDAR_CHUNK.get());
	private static final List<ItemLike> INDIRIUM = List.of(ModItems.INDIRIUM_INGOT.get(), ModItems.INDIRIUM_CHUNK.get());
//	private static final List<ItemLike> GELDAR = List.of(ModBlocks.GELDAR_ORE.get(), ModItems.GELDAR_CHUNK.get());
//	private static final List<ItemLike> VIRONIUM = List.of(ModBlocks.VIRONIUM_ORE.get(), ModItems.VIRONIUM_CHUNK.get());

	private static final List<List<ItemLike>> SMELTABLES = List.of(VENDAR, INDIRIUM);
	
	@Override
	protected void buildRecipes(RecipeOutput recipe) {
		
		for (int l = 0; l < SMELTABLES.size(); l++) {
			List<ItemLike> searchlist = SMELTABLES.get(l);
			for (int i = 1; i < searchlist.size(); i++) {
				
				ItemLike input = searchlist.get(i);
				ItemLike result = searchlist.get(0);
			
				SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), RecipeCategory.MISC, result, .25f, 200).unlockedBy(getHasName(input), has(input)).save(recipe, "smelting/" +Dimtech.MODID + ":" + getItemName(result) + "_from_smelting_" + getItemName(input));;
				SimpleCookingRecipeBuilder.blasting(Ingredient.of(input), RecipeCategory.MISC, result, .25f, 100).unlockedBy(getHasName(input), has(input)).save(recipe, "blasting/" +Dimtech.MODID + ":" + getItemName(result) + "_from_blasting_" + getItemName(input));;
;
		
				}
			}
	///	oreSmelting(recipe, GELDAR, RecipeCategory.MISC, ModItems.GELDAR_INGOT.get(), .25f, 200, "geldar");
	//	oreBlasting(recipe, GELDAR, RecipeCategory.MISC, ModItems.GELDAR_INGOT.get(), .25f, 100, "geldar");
	//	
	//	oreSmelting(recipe, VIRONIUM, RecipeCategory.MISC, ModItems.VIRONIUM_INGOT.get(), .25f, 200, "vironium");
	//	oreBlasting(recipe, VIRONIUM, RecipeCategory.MISC, ModItems.VIRONIUM_INGOT.get(), .25f, 100, "vironium");
		
	//	oreSmelting(recipe, INDIRIUM, RecipeCategory.MISC, ModItems.INDIRIUM_INGOT.get(), .25f, 200, "indirium");
	//	oreBlasting(recipe, INDIRIUM, RecipeCategory.MISC, ModItems.INDIRIUM_INGOT.get(), .25f, 100, "indirium");
		/*
		for (int x = 0; x < Dimtech.WALLMAPS.size(); x++) {
		Block input =  (Block) WallMap.getBase(Dimtech.WALLMAPS.get(x)).get();
		Block output = 	(Block) WallMap.getWall(Dimtech.WALLMAPS.get(x)).get();
			ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output, 6)
		.pattern("SSS")
		.pattern("SSS")
		.define('S', input)
		.unlockedBy(getHasName(input), has(input))
		.save(recipe);
		}
		
		Block input =  ModBlocks.ALUNITE_SMOOTH.get();
		Block output = ModBlocks.POLISHED_ALUNITE_WALL.get();;
			ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output, 6)
		.pattern("SSS")
		.pattern("SSS")
		.define('S', input)
		.unlockedBy(getHasName(input), has(input))
		.save(recipe);
		*/
	}
	
	
	
}
