package com.mrspalding.dimtech.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class ModHelpers {
	public static Boolean isAirAdjacent(ServerLevel world, BlockPos pos) {
		return isAirAdjacent(world, pos, 1);
	}
	
	public static Boolean isAirAdjacent(ServerLevel world, BlockPos pos, int minFaces) {
		
		int count = 0;
		
		List<Block> toCheck = pollAdjacentFaces(world, pos);
		for (Block b : toCheck) {
			if (b == Blocks.AIR) count ++;
		}
		
		
		return count >= minFaces;
	}
	
	public static List<Block> pollAdjacentFaces(ServerLevel world, BlockPos pos) {
		List<Block> returnList = new ArrayList<Block>();
		
		returnList.add(world.getBlockState(pos.above()).getBlock());
		returnList.add(world.getBlockState(pos.below()).getBlock());		
		returnList.add(world.getBlockState(pos.east()).getBlock());
		returnList.add(world.getBlockState(pos.west()).getBlock());
		returnList.add(world.getBlockState(pos.north()).getBlock());
		returnList.add(world.getBlockState(pos.south()).getBlock());
		
		
		return returnList;
	}
	
	
	
	@SafeVarargs
	public static boolean checkBlockTags(Block block, TagKey<Block>... tags) {
		for (TagKey<Block> key : tags) {
			if (!BuiltInRegistries.BLOCK.getHolderOrThrow(BuiltInRegistries.BLOCK.getResourceKey(block).get()).tags().toList().contains(key)) {
				return false;
			}
		}
		
		return true;
		
		
	}
	
	@SafeVarargs
	public static boolean checkBlockTagsAny(Block block, TagKey<Block>... tags) {
		for (TagKey<Block> key : tags) {
			if (BuiltInRegistries.BLOCK.getHolderOrThrow(BuiltInRegistries.BLOCK.getResourceKey(block).get()).tags().toList().contains(key)) {
				return true;
			}
		}
		
		return false;
		
		
	}
	
	
	public static BlockPos getRandomAdjacentBlock(BlockPos pos) {
		Random rand = new Random();
		int checkLayer = rand.nextInt(3);
		
		switch (checkLayer) {
		case 0:
			pos = pos.above();
			break;
		case 1:
			break;
		case 2: 
			pos = pos.below();
		default: 
		
		}
		
		int checkCompass = rand.nextInt(9);
		switch (checkCompass) {
		case 0: 
			pos = pos.east();
			break;
		case 1: 
			pos = pos.east().north();
			break;
		case 2: 
			pos = pos.north();
			break;
		case 3: 
			pos = pos.north().west();
			break;
		case 4: 
			pos = pos.west();
			break;
		case 5: 
			pos = pos.south().west();
			break;
		case 6: 
			pos = pos.south();
			break;
		case 7: 
			pos = pos.south().east();
			break;
		case 8: 
			
			break;
		default:
			
		}
		return pos;
	}
	
	public static BlockPos getRandomAdjacentFaceBlock(BlockPos pos) {
		Random rand = new Random();
		
		
		int checkCompass = rand.nextInt(6);
		switch (checkCompass) {
		case 0: 
			pos = pos.east();
			break;
		case 1: 
			pos = pos.north();
			break;
		case 2: 
			pos = pos.west();
			break;
		case 3: 
			pos = pos.south();
			break;
		case 4: 
			pos = pos.above();
			break;
		case 5: 
			pos = pos.below();
			break;
		
		default:
			
		}
		return pos;
	}
	
	public static BlockPos getRandomAdjacentCompassBlock(BlockPos pos) {
		Random rand = new Random();
		
		
		int checkCompass = rand.nextInt(10);
		switch (checkCompass) {
		case 0: 
			pos = pos.east();
			break;
		case 1: 
			pos = pos.north();
			break;
		case 2: 
			pos = pos.west();
			break;
		case 3: 
			pos = pos.south();
			break;
		
		case 4: 
			pos = pos.above();
			break;
		case 5: 
			pos = pos.below();
			break;
		case 6: 
			pos = pos.east().north();
			break;
		case 7: 
			pos = pos.north().west();
			break;
		case 8: 
			pos = pos.west().south();
			break;
		case 9: 
			pos = pos.south().east();
			break;
		
		
		
		default:
			
		}
		return pos;
	}
	
	
	  public static int getGroundFromAboveGrass(ServerLevel world, int x, int z) {
          int y = 255;

          Block blockAt;
          for(boolean foundGround = false; !foundGround && y-- >= 0; foundGround = blockAt == Blocks.GRASS_BLOCK) {
             blockAt = world.getBlockState(new BlockPos(x, y, z)).getBlock();
          }

          return y;
       }
	
	  public static int getGroundFromAboveNetherrack(ServerLevel world, int x, int z) {
          int y = 65;

          Block blockAt;
          for(boolean foundGround = false; !foundGround && y-- >= 0; foundGround = blockAt == Blocks.NETHERRACK) {
             blockAt = world.getBlockState(new BlockPos(x, y, z)).getBlock();
          }

          return y;
       }
	
}
