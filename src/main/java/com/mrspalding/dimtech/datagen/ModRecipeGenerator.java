package com.mrspalding.dimtech.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.custom.ModBlocks;
import com.mrspalding.dimtech.custom.ModItems;
import com.mrspalding.dimtech.custom.blocks.ModCobbleable;
import com.mrspalding.dimtech.custom.blocks.ModMetalBlock;
import com.mrspalding.dimtech.custom.blocks.ModSlabStone;
import com.mrspalding.dimtech.custom.blocks.ModStoneBricks;
import com.mrspalding.dimtech.custom.blocks.ModStoneStairs;
import com.mrspalding.dimtech.custom.blocks.ModWallStone;
import com.mrspalding.dimtech.custom.items.ModEdible;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
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
	private static final List<ItemLike> GELDAR = List.of(ModItems.GELDAR_INGOT.get(),ModBlocks.GELDAR_ORE.get(), ModItems.GELDAR_CHUNK.get());
	private static final List<ItemLike> VIRONIUM = List.of(ModItems.VIRONIUM_INGOT.get(),ModBlocks.VIRONIUM_ORE.get(), ModItems.VIRONIUM_CHUNK.get());

	private static final List<List<ItemLike>> SMELTABLES = List.of(VENDAR, INDIRIUM, GELDAR, VIRONIUM);
	
	
	@Override
	protected void buildRecipes(RecipeOutput recipe) {
		
		for (int metals = 0; metals < ModBlocks.metals.size(); metals++) {
			
			ItemLike result = ModBlocks.metals.get(metals);
			ItemLike ingot = ((ModMetalBlock) result).getIngot();
			
			x3Recipe(ingot, result, recipe);
			belch(result, ingot, recipe);
			
		}
		
		
		for (int l = 0; l < SMELTABLES.size(); l++) {
			List<ItemLike> searchlist = SMELTABLES.get(l);
			for (int i = 1; i < searchlist.size(); i++) {
				
				ItemLike input = searchlist.get(i);
				ItemLike result = searchlist.get(0);
				
				SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), RecipeCategory.MISC, result, .25f, 200).unlockedBy(getHasName(input), has(input)).save(recipe,
						Dimtech.makeId("smelting/" + getItemName(result) + "_from_" + getItemName(input)));
				SimpleCookingRecipeBuilder.blasting(Ingredient.of(input), RecipeCategory.MISC, result, .25f, 100).unlockedBy(getHasName(input), has(input)).save(recipe,
						Dimtech.makeId("blasting/" + getItemName(result) + "_from_" + getItemName(input)));
		
				}
			}
		
		
		for (int foods = 0; foods < ModItems.cooked_foods.size(); foods++) {
			ItemLike cooked = ModItems.cooked_foods.get(foods);
			ItemLike raw = ((ModEdible) cooked).getRaw();
			
			SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(raw), RecipeCategory.MISC, cooked, .15f, 600).unlockedBy(getHasName(raw), has(raw)).save(recipe,
					Dimtech.makeId("campfire/" + getItemName(cooked) + "_from_" + getItemName(raw)));
			SimpleCookingRecipeBuilder.smelting(Ingredient.of(raw), RecipeCategory.MISC, cooked, .15f, 200).unlockedBy(getHasName(raw), has(raw)).save(recipe,
					Dimtech.makeId("cooking/" + getItemName(cooked) + "_from_" + getItemName(raw)));
			SimpleCookingRecipeBuilder.smoking(Ingredient.of(raw), RecipeCategory.MISC, cooked, .15f, 100).unlockedBy(getHasName(raw), has(raw)).save(recipe,
					Dimtech.makeId("smoking/" + getItemName(cooked) + "_from_" + getItemName(raw)));
		}
		
		
		for (int cobbles = 0; cobbles <ModBlocks.cobbleable.size(); cobbles++) {
			ItemLike result = (ModCobbleable) ModBlocks.cobbleable.get(cobbles);
			
			ItemLike input = ((ModCobbleable) result).getDeferredDrop();
			
			//System.out.println(ModBlocks.cobbleable);
			
			SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), RecipeCategory.MISC, result, .25f, 200).unlockedBy(getHasName(input), has(input)).save(recipe,
					Dimtech.makeId("smelting/" + getItemName(result) + "_from_" + getItemName(input)));
			
		}
		
				
		x2Recipe(ModBlocks.SHAR, ModBlocks.POLISHED_SHAR, recipe);
		x2Recipe(ModBlocks.ALUNITE, ModBlocks.ALUNITE_SMOOTH, recipe);
		x2Recipe(ModBlocks.MARCASITE, ModBlocks.MARCASITE_SMOOTH, recipe);
		x2Recipe(ModBlocks.APATITE, ModBlocks.APATITE_SMOOTH, recipe);
		x2Recipe(ModBlocks.SHALE, ModBlocks.SHALE_SMOOTH, recipe);
		x2Recipe(ModBlocks.CORMALITE, ModBlocks.CORMALITE_SMOOTH, recipe);
		x2Recipe(ModBlocks.UMBER, ModBlocks.UMBER_SMOOTH, recipe);
		
		
		for (int x = 0; x < ModBlocks.walls.size(); x++) {
			
			ItemLike input =  ((ModWallStone) ModBlocks.walls.get(x)).getInput();
			ItemLike output = 	ModBlocks.walls.get(x);
			
			wallRecipe(input, output, recipe);
			
		}
		
		for (int x = 0; x < ModBlocks.bricks.size(); x++) {
			
			ItemLike input =  ((ModStoneBricks) ModBlocks.bricks.get(x)).getInput();
			ItemLike output = 	ModBlocks.bricks.get(x);
			
			x2Recipe(input, output, recipe);
			
		}
		
		for (int x = 0; x < ModBlocks.stairs.size(); x++) {
			
			ItemLike input =  ((ModStoneStairs) ModBlocks.stairs.get(x)).getInput();
			ItemLike output = 	ModBlocks.stairs.get(x);
			
			stairRecipe(input, output, recipe);
			
		}
		
		for (int x = 0; x < ModBlocks.slabs.size(); x++) {
			
			ItemLike input =  ((ModSlabStone) ModBlocks.slabs.get(x)).getInput();
			ItemLike output = 	ModBlocks.slabs.get(x);
			
			slabRecipe(input, output, recipe);
			
		}
		
		
		
		
	}
	
	private void wallRecipe(ItemLike input, ItemLike output, RecipeOutput recipe) {
		
		
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output, 6)
		.pattern("SSS")
		.pattern("SSS")
		.define('S', input)
		.unlockedBy(getHasName(input), has(input))
		.save(recipe, Dimtech.makeId(getItemName(output)));
		
		
	}
	
	private void x2Recipe(ItemLike input, ItemLike output, RecipeOutput recipe) {
		
		
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output, 4)
		.pattern("SS")
		.pattern("SS")
		.define('S', input)
		.unlockedBy(getHasName(input), has(input))
		.save(recipe, Dimtech.makeId(getItemName(output)));
		
		
	}
	
	private void slabRecipe(ItemLike input, ItemLike output, RecipeOutput recipe) {
		
		
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output, 6)
		
		.pattern("SSS")
		.define('S', input)
		.unlockedBy(getHasName(input), has(input))
		.save(recipe, Dimtech.makeId(getItemName(output)));
		
		
	}
	
	private void stairRecipe(ItemLike input, ItemLike output, RecipeOutput recipe) {
		
		
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output, 4)
		.pattern("S  ")
		.pattern("SS ")
		.pattern("SSS")
		.define('S', input)
		.unlockedBy(getHasName(input), has(input))
		.save(recipe, Dimtech.makeId(getItemName(output)));
		stairRecipeMirror(input, output, recipe);
		
	}
	
	private void stairRecipeMirror(ItemLike input, ItemLike output, RecipeOutput recipe) {
		
		
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output, 4)
		.pattern("  S")
		.pattern(" SS")
		.pattern("SSS")
		.define('S', input)
		.unlockedBy(getHasName(input), has(input))
		.save(recipe, Dimtech.makeId(getItemName(output) + "_mirror"));
		
		
	}
	
	private void x3Recipe(ItemLike input, ItemLike output, RecipeOutput recipe) {
		
		
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output, 1)
		.pattern("SSS")
		.pattern("SSS")
		.pattern("SSS")
		.define('S', input)
		.unlockedBy(getHasName(input), has(input))
		.save(recipe, Dimtech.makeId(getItemName(output) + "_from_" + getItemName(input)));
		
		
	}
	
	private void belch(ItemLike input, ItemLike output, RecipeOutput recipe) {
		
		
		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output, 9)
		.requires(Ingredient.of(input))
		.unlockedBy(getHasName(input), has(input))
		.save(recipe, Dimtech.makeId(getItemName(output) + "_from_" + getItemName(input)));
		
		
	}
	
	
	
}
