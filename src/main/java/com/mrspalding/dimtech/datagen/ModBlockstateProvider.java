package com.mrspalding.dimtech.datagen;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.custom.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
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
		
		stairsBlock(ModBlocks.POLISHED_APATITE_STAIRS.get(), blockTexture(ModBlocks.APATITE_SMOOTH.get()));
		wallBlock((WallBlock) ModBlocks.POLISHED_APATITE_WALL.get(), blockTexture(ModBlocks.APATITE_SMOOTH.get()));
		slabBlock(ModBlocks.POLISHED_APATITE_SLAB.get(), blockTexture(ModBlocks.APATITE_SMOOTH.get()),
				   blockTexture(ModBlocks.APATITE_SMOOTH.get()));
		
		stairsBlock(ModBlocks.NETHERREND_BRICK_STAIRS.get(), blockTexture(ModBlocks.NETHERREND_BRICKS.get()));
		wallBlock((WallBlock) ModBlocks.NETHERREND_BRICK_WALL.get(), blockTexture(ModBlocks.NETHERREND_BRICKS.get()));
		slabBlock(ModBlocks.NETHERREND_BRICK_SLAB.get(), blockTexture(ModBlocks.NETHERREND_BRICKS.get()),
				   blockTexture(ModBlocks.NETHERREND_BRICKS.get()));
		
		stairsBlock(ModBlocks.VOIDSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.VOIDSTONE_BRICKS.get()));
		wallBlock((WallBlock) ModBlocks.VOIDSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.VOIDSTONE_BRICKS.get()));
		slabBlock(ModBlocks.VOIDSTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.VOIDSTONE_BRICKS.get()),
				   blockTexture(ModBlocks.VOIDSTONE_BRICKS.get()));
			
		stairsBlock(ModBlocks.NETHERSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.NETHERSTONE_BRICKS.get()));
		wallBlock((WallBlock) ModBlocks.NETHERSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.NETHERSTONE_BRICKS.get()));
		slabBlock(ModBlocks.NETHERSTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.NETHERSTONE_BRICKS.get()),
				   blockTexture(ModBlocks.NETHERSTONE_BRICKS.get()));
		
		stairsBlock(ModBlocks.SOILSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.SOILSTONE_BRICKS.get()));
		wallBlock((WallBlock) ModBlocks.SOILSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.SOILSTONE_BRICKS.get()));
		slabBlock(ModBlocks.SOILSTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.SOILSTONE_BRICKS.get()),
				   blockTexture(ModBlocks.SOILSTONE_BRICKS.get()));
		
		
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
