package com.mrspalding.dimtech.custom;

import com.mrspalding.dimtech.Dimtech;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

@SuppressWarnings("unused")
public class ModTags {

	public static class Blocks {
		
		private static TagKey<Block> tag(String name) {
			return BlockTags.create(new ResourceLocation(Dimtech.MODID, name));
		}
		
		public static final TagKey<Block> ENDFECTION_TARGETS = tag("endfection_targets");
		public static final TagKey<Block> VENDAR_ORES = tag("vendar_ores");
		public static final TagKey<Block> INDIRIUM_ORES = tag("indirium_ores");
		
		
	}
	
	public static class Biomes {
		
		private static TagKey<Biome> tag(String name) {
			return create(name);
		}
		
		
		public static final TagKey<Biome> IS_WATER = tag("is_water");
		
		
		
	}
	
	public static class Items {
		
		
		private static TagKey<Item> tag(String name) {
			return ItemTags.create(new ResourceLocation(Dimtech.MODID, name));
		}
		
	}
	
	private static TagKey<Biome> create(String name) {
        return TagKey.create(Registries.BIOME, new ResourceLocation(Dimtech.MODID, name));
    }
}
