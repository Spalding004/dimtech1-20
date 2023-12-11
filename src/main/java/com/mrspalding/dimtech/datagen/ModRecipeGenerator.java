package com.mrspalding.dimtech.datagen;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.custom.ModBlocks;
import com.mrspalding.dimtech.custom.ModItems;
import com.mrspalding.dimtech.datagen.helpers.Smeltables;
import com.mrspalding.dimtech.datagen.helpers.WallMap;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

public class ModRecipeGenerator extends RecipeProvider implements IConditionBuilder{

	public ModRecipeGenerator(PackOutput pack, CompletableFuture<Provider> lookupProvider) {
		super(pack, lookupProvider);
		
	}
	
	private static final List<ItemLike> VENDAR = List.of(ModBlocks.VENDAR_ORE.get(), ModItems.VENDAR_CHUNK.get());
	private static final List<ItemLike> INDIRIUM = List.of(ModBlocks.INDIRIUM_ORE.get(), ModItems.INDIRIUM_CHUNK.get());
	private static final List<ItemLike> GELDAR = List.of(ModBlocks.GELDAR_ORE.get(), ModItems.GELDAR_CHUNK.get());
	private static final List<ItemLike> VIRONIUM = List.of(ModBlocks.VIRONIUM_ORE.get(), ModItems.VIRONIUM_CHUNK.get());

	@Override
	protected void buildRecipes(RecipeOutput recipe) {
		
		System.out.println(VENDAR);
		
		oreSmelting(recipe, VENDAR, RecipeCategory.MISC, ModItems.VENDAR_INGOT.get(), .25f, 200, "vendar");
		oreBlasting(recipe, VENDAR, RecipeCategory.MISC, ModItems.VENDAR_INGOT.get(), .25f, 100, "vendar");
		
		oreSmelting(recipe, GELDAR, RecipeCategory.MISC, ModItems.GELDAR_INGOT.get(), .25f, 200, "geldar");
		oreBlasting(recipe, GELDAR, RecipeCategory.MISC, ModItems.GELDAR_INGOT.get(), .25f, 100, "geldar");
		
		oreSmelting(recipe, VIRONIUM, RecipeCategory.MISC, ModItems.VIRONIUM_INGOT.get(), .25f, 200, "vironium");
		oreBlasting(recipe, VIRONIUM, RecipeCategory.MISC, ModItems.VIRONIUM_INGOT.get(), .25f, 100, "vironium");
		
		oreSmelting(recipe, INDIRIUM, RecipeCategory.MISC, ModItems.INDIRIUM_INGOT.get(), .25f, 200, "indirium");
		oreBlasting(recipe, INDIRIUM, RecipeCategory.MISC, ModItems.INDIRIUM_INGOT.get(), .25f, 100, "indirium");
		
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
		/*
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
	
	
	 protected static void oreSmelting(
		      RecipeOutput p_301183_, List<ItemLike> p_250172_, RecipeCategory p_250588_, ItemLike p_251868_, float p_250789_, int p_252144_, String p_251687_
		   ) {
		      oreCooking(p_301183_, RecipeSerializer.SMELTING_RECIPE, p_250172_, p_250588_, p_251868_, p_250789_, p_252144_, p_251687_, "_from_smelting");
		   }

		   protected static void oreBlasting(
		      RecipeOutput p_301288_, List<ItemLike> p_251504_, RecipeCategory p_248846_, ItemLike p_249735_, float p_248783_, int p_250303_, String p_251984_
		   ) {
		      oreCooking(p_301288_, RecipeSerializer.BLASTING_RECIPE, p_251504_, p_248846_, p_249735_, p_248783_, p_250303_, p_251984_, "_from_blasting");
		   }

		   protected static void oreCooking(
		      RecipeOutput output,
		      RecipeSerializer<? extends AbstractCookingRecipe> serializer,
		      List<ItemLike> list,
		      RecipeCategory category,
		      ItemLike item,
		      float xp,
		      int dur,
		      String group,
		      String name
		   ) {
		      for(ItemLike itemlike : list) {
		         SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), category, item, xp, dur, serializer)
		            .group(group)
		            .unlockedBy(getHasName(itemlike), has(itemlike))
		            .save(output, Dimtech.MODID + ":" + getItemName(item) + name + "_" + getItemName(itemlike));
		      }
		   }
	

}
