package com.mrspalding.dimtech.custom;

import com.mrspalding.dimtech.Dimtech;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

@SuppressWarnings("unused")
public class ModTags {

	public static class Blocks {
		
		private static TagKey<Block> tag(String name) {
			return BlockTags.create(new ResourceLocation(Dimtech.MODID, name));
		}
		
		public static final TagKey<Block> ENDFECTION_TARGETS = tag("endfection_targets");
		
		
	}
	
	public static class Items {
		
		
		private static TagKey<Item> tag(String name) {
			return ItemTags.create(new ResourceLocation(Dimtech.MODID, name));
		}
		
	}
	
}
