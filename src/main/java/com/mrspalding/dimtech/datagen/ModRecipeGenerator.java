package com.mrspalding.dimtech.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.custom.ModBlocks;
import com.mrspalding.dimtech.custom.ModItems;
import com.mrspalding.dimtech.custom.blocks.ModCobbleable;
import com.mrspalding.dimtech.custom.blocks.ModOre;
import com.mrspalding.dimtech.custom.blocks.ModSlabStone;
import com.mrspalding.dimtech.custom.blocks.ModStoneBricks;
import com.mrspalding.dimtech.custom.blocks.ModStoneStairs;
import com.mrspalding.dimtech.custom.blocks.ModWallStone;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredBlock;

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
		
		for (int cobbles = 0; cobbles <ModBlocks.cobbleable.size(); cobbles++) {
			ItemLike result = (ModCobbleable) ModBlocks.cobbleable.get(cobbles);
			
			ItemLike input = ((ModCobbleable) result).getDeferredDrop();
			
			//System.out.println(ModBlocks.cobbleable);
			
			SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), RecipeCategory.MISC, result, .25f, 200).unlockedBy(getHasName(input), has(input)).save(recipe,
					Dimtech.makeId("smelting/" + getItemName(result) + "_from_" + getItemName(input)));
			
		}
		
		
		
		
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
	
	
	
}
