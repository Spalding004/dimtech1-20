package com.mrspalding.dimtech.custom.blocks;

import com.mrspalding.dimtech.custom.ModBlocks;
import com.mrspalding.dimtech.custom.ModTags;
import com.mrspalding.dimtech.library.ModHelpers;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;


public class ModEndcroachment extends Block{
	public ModEndcroachment() {
		super(BlockBehaviour.Properties.of().strength(1F, 2F).requiresCorrectToolForDrops().randomTicks()
				.lightLevel((light) -> {
					return 4;
				}));
		
		ModBlocks.pickaxe.add(this);
		ModBlocks.tool_any.add(this);
		ModBlocks.stones.add(this);

	}

	@Override
	   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_56651_) {
	    
	   }
	
	@Override
	public void randomTick(BlockState state, ServerLevel worldIn, BlockPos pos, RandomSource rand) {

		boolean shouldSpread = true;
		
		
		if (worldIn.getBlockState(pos.above()).isAir()) {
			int type = rand.nextInt(100);

			

			if (type <= 60) {
				worldIn.setBlockAndUpdate(pos, ModBlocks.ENDFECTED_NETHERRACK_C.get().defaultBlockState());
			}

			if (type > 60 && type <= 70) {
				worldIn.setBlockAndUpdate(pos, ModBlocks.ENDFECTED_NETHERRACK_A.get().defaultBlockState());
			}

			if (type > 70) {
				worldIn.setBlockAndUpdate(pos, ModBlocks.ENDFECTED_NETHERRACK_B.get().defaultBlockState());
			}

		}

		if (shouldSpread) {

			
			BlockPos target_pos = ModHelpers.getRandomAdjacentCompassBlock(pos);

			// if (worldIn.getBlockState(pos).getBlock() == Blocks.NETHERRACK
			if (ModHelpers.checkBlockTagsAny(worldIn.getBlockState(target_pos).getBlock(), ModTags.Blocks.ENDFECTION_TARGETS)
					&& ModHelpers.isAirAdjacent(worldIn, target_pos)) {

				if (worldIn.getBlockState(target_pos).getBlock() == Blocks.OBSIDIAN) {
					worldIn.setBlockAndUpdate(target_pos, ModBlocks.ENDFECTED_OBSIDIAN.get().defaultBlockState());
				} else if (worldIn.getBlockState(target_pos).getBlock() == Blocks.NETHER_QUARTZ_ORE) {
					worldIn.setBlockAndUpdate(target_pos, ModBlocks.ENDFECTED_NETHER_QUARTZ_ORE.get().defaultBlockState());
				} else{
					worldIn.setBlockAndUpdate(target_pos, ModBlocks.ENDCROACHED_NETHERRACK.get().defaultBlockState());

				}

			}

		}
	}
}
