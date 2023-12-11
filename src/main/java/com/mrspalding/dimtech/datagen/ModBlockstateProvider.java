package com.mrspalding.dimtech.datagen;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.custom.ModBlocks;
import com.mrspalding.dimtech.custom.blocks.ModSlabStone;
import com.mrspalding.dimtech.custom.blocks.ModStoneStairs;
import com.mrspalding.dimtech.custom.blocks.ModWallStone;
import com.mrspalding.dimtech.datagen.helpers.WallMap;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockstateProvider extends BlockStateProvider{

	public ModBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, Dimtech.MODID, exFileHelper);
		
	}

	@Override
	protected void registerStatesAndModels() {
		
		for (int cubes = 0; cubes < ModBlocks.cubes.size(); cubes++) {
			blockWithItem(ModBlocks.cubes.get(cubes));
		}
		
		stairsBlock(ModBlocks.POLISHED_APATITE_STAIRS.get(), blockTexture(ModBlocks.APATITE_SMOOTH.get()));
		wallBlock((WallBlock) ModBlocks.POLISHED_APATITE_WALL.get(), blockTexture(ModBlocks.APATITE_SMOOTH.get()));
		slabBlock(ModBlocks.POLISHED_APATITE_SLAB.get(), blockTexture(ModBlocks.APATITE_SMOOTH.get()),
				   blockTexture(ModBlocks.APATITE_SMOOTH.get()));
		
		
		stairsBlock(ModBlocks.POLISHED_MARCASITE_STAIRS.get(), blockTexture(ModBlocks.MARCASITE_SMOOTH.get()));
		wallBlock((WallBlock) ModBlocks.POLISHED_MARCASITE_WALL.get(), blockTexture(ModBlocks.MARCASITE_SMOOTH.get()));
		slabBlock(ModBlocks.POLISHED_MARCASITE_SLAB.get(), blockTexture(ModBlocks.MARCASITE_SMOOTH.get()),
				   blockTexture(ModBlocks.MARCASITE_SMOOTH.get()));

		
		stairsBlock(ModBlocks.POLISHED_SHALE_STAIRS.get(), blockTexture(ModBlocks.SHALE_SMOOTH.get()));
		wallBlock((WallBlock) ModBlocks.POLISHED_SHALE_WALL.get(), blockTexture(ModBlocks.SHALE_SMOOTH.get()));
		slabBlock(ModBlocks.POLISHED_SHALE_SLAB.get(), blockTexture(ModBlocks.SHALE_SMOOTH.get()),
				   blockTexture(ModBlocks.SHALE_SMOOTH.get()));
		
		
		stairsBlock(ModBlocks.POLISHED_ALUNITE_STAIRS.get(), blockTexture(ModBlocks.ALUNITE_SMOOTH.get()));
		wallBlock((WallBlock) ModBlocks.POLISHED_ALUNITE_WALL.get(), blockTexture(ModBlocks.ALUNITE_SMOOTH.get()));
		slabBlock(ModBlocks.POLISHED_ALUNITE_SLAB.get(), blockTexture(ModBlocks.ALUNITE_SMOOTH.get()),
				   blockTexture(ModBlocks.ALUNITE_SMOOTH.get()));
		
		stairsBlock(ModBlocks.MIXED_STONE_STAIRS.get(), blockTexture(ModBlocks.MIXED_STONE.get()));
		wallBlock((WallBlock) ModBlocks.MIXED_STONE_WALL.get(), blockTexture(ModBlocks.MIXED_STONE.get()));
		slabBlock(ModBlocks.MIXED_STONE_SLAB.get(), blockTexture(ModBlocks.MIXED_STONE.get()),
				   blockTexture(ModBlocks.MIXED_STONE.get()));
		
		stairsBlock(ModBlocks.POLISHED_CORMALITE_STAIRS.get(), blockTexture(ModBlocks.CORMALITE_SMOOTH.get()));
		wallBlock((WallBlock) ModBlocks.POLISHED_CORMALITE_WALL.get(), blockTexture(ModBlocks.CORMALITE_SMOOTH.get()));
		slabBlock(ModBlocks.POLISHED_CORMALITE_SLAB.get(), blockTexture(ModBlocks.CORMALITE_SMOOTH.get()),
				   blockTexture(ModBlocks.CORMALITE_SMOOTH.get()));
		
		stairsBlock(ModBlocks.POLISHED_UMBER_STAIRS.get(), blockTexture(ModBlocks.UMBER_SMOOTH.get()));
		wallBlock((WallBlock) ModBlocks.POLISHED_UMBER_WALL.get(), blockTexture(ModBlocks.UMBER_SMOOTH.get()));
		slabBlock(ModBlocks.POLISHED_UMBER_SLAB.get(), blockTexture(ModBlocks.UMBER_SMOOTH.get()),
				   blockTexture(ModBlocks.UMBER_SMOOTH.get()));
		
		
		
	}
	
	private void blockWithItem(Block block) {
		simpleBlockWithItem(block, cubeAll(block));
	}

}
