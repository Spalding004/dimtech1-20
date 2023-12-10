package com.mrspalding.dimtech.datagen;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.custom.ModBlocks;
import com.mrspalding.dimtech.custom.blocks.ModWallStone;
import com.mrspalding.dimtech.datagen.helpers.WallMap;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockstateProvider extends BlockStateProvider{

	public ModBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, Dimtech.MODID, exFileHelper);
		
	}

	@Override
	protected void registerStatesAndModels() {
		
		for (int cubes = 0; cubes < ModBlocks.cubes.size(); cubes++) {
			blockWithItem(ModBlocks.cubes.get(cubes));
		}
		
		stairsBlock((StairBlock) ModBlocks.POLISHED_MARCASITE_STAIRS.get(), blockTexture(ModBlocks.MARCASITE_SMOOTH.get()));
		slabBlock((SlabBlock) ModBlocks.POLISHED_MARCASITE_SLAB.get(), 
				blockTexture(ModBlocks.MARCASITE_SMOOTH.get()), blockTexture(ModBlocks.MARCASITE_SMOOTH.get()));
		
		for (int walls = 0; walls <ModBlocks.walls.size(); walls++) {
			wallBlock((WallBlock) ((ModWallStone) ModBlocks.walls.get(walls)).getWall().get(), 
					blockTexture((Block) ((ModWallStone) ModBlocks.walls.get(walls)).getBaseBlock().get()));
		}
	}
	
	private void blockWithItem(Block block) {
		simpleBlockWithItem(block, cubeAll(block));
	}

}
