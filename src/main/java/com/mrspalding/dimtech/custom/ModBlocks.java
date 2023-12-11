package com.mrspalding.dimtech.custom;

import java.util.ArrayList;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.custom.blocks.ModCoalOre;
import com.mrspalding.dimtech.custom.blocks.ModCobbleable;
import com.mrspalding.dimtech.custom.blocks.ModEndcroachment;
import com.mrspalding.dimtech.custom.blocks.ModEndfection;
import com.mrspalding.dimtech.custom.blocks.ModFabric;
import com.mrspalding.dimtech.custom.blocks.ModOre;
import com.mrspalding.dimtech.custom.blocks.ModSlabStone;
import com.mrspalding.dimtech.custom.blocks.ModStone;
import com.mrspalding.dimtech.custom.blocks.ModStoneStairs;
import com.mrspalding.dimtech.custom.blocks.ModWallStone;
import com.mrspalding.dimtech.datagen.helpers.Cobbleable;
import com.mrspalding.dimtech.datagen.helpers.SlabMap;
import com.mrspalding.dimtech.datagen.helpers.StairMap;
import com.mrspalding.dimtech.datagen.helpers.WallMap;

import net.minecraft.core.Holder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
	
	
	public static ArrayList<Block> cubes = new ArrayList<>();
	public static ArrayList<Block> ore = new ArrayList<>();
	public static ArrayList<Block> vanilla_dropping_ore = new ArrayList<>();
	public static ArrayList<Block> stones = new ArrayList<>();
	public static ArrayList<Block> cobbleable = new ArrayList<>();
	
	public static ArrayList<Block> tool_any = new ArrayList<>();
	public static ArrayList<Block> tool_stone = new ArrayList<>();
	public static ArrayList<Block> tool_iron = new ArrayList<>();
	public static ArrayList<Block> tool_diamond = new ArrayList<>();
	public static ArrayList<Block> tool_nether = new ArrayList<>();
	
	public static ArrayList<Block> coal_ores = new ArrayList<>();
	
	public static ArrayList<Block> pickaxe = new ArrayList<>();
	public static ArrayList<Block> axe = new ArrayList<>();	
	public static ArrayList<Block> shovel = new ArrayList<>();
	public static ArrayList<Block> hoe = new ArrayList<>();
	
	public static ArrayList<Block> stairs = new ArrayList<>();
	public static ArrayList<Block> walls = new ArrayList<>();
	public static ArrayList<Block> slabs = new ArrayList<>();
	public static ArrayList<Block> fences = new ArrayList<>();
	public static ArrayList<Block> buttons = new ArrayList<>();
	public static ArrayList<Block> doors = new ArrayList<>();
	
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Dimtech.MODID);
	
	//stones (and bowls)
	public static final DeferredBlock<ModStone> MARCASITE = BLOCKS.register("marcasite", () -> new ModStone());
	public static final DeferredBlock<ModStone> MARCASITE_SMOOTH = BLOCKS.register("marcasite_smooth", () -> new ModStone());
	public static final DeferredBlock<ModStone> SHALE = BLOCKS.register("shale", () -> new ModStone());
	public static final DeferredBlock<ModStone> SHALE_SMOOTH = BLOCKS.register("shale_smooth", () -> new ModStone());
	public static final DeferredBlock<ModStone> APATITE = BLOCKS.register("apatite", () -> new ModStone());
	public static final DeferredBlock<ModStone> APATITE_SMOOTH = BLOCKS.register("apatite_smooth", () -> new ModStone());
	
	public static final DeferredBlock<ModStone> ALUNITE = BLOCKS.register("alunite", () -> new ModStone());
	public static final DeferredBlock<ModStone> ALUNITE_SMOOTH = BLOCKS.register("alunite_smooth", () -> new ModStone());
	public static final DeferredBlock<ModStone> UMBER = BLOCKS.register("umber", () -> new ModStone());
	public static final DeferredBlock<ModStone> UMBER_SMOOTH = BLOCKS.register("umber_smooth", () -> new ModStone());
	public static final DeferredBlock<ModStone> CORMALITE = BLOCKS.register("cormalite", () -> new ModStone());
	public static final DeferredBlock<ModStone> CORMALITE_SMOOTH = BLOCKS.register("cormalite_smooth", () -> new ModStone());
	
	public static final DeferredBlock<ModStone> PUMICE = BLOCKS.register("pumice", () -> new ModStone("pumice"));
	
	public static final DeferredBlock<ModCobbleable> VOIDSTONE = BLOCKS.register("voidstone", () -> new ModCobbleable(Cobbleable.VOIDSTONE));
	public static final DeferredBlock<ModStone> VOIDSTONE_COBBLE = BLOCKS.register("voidstone_cobble", () -> new ModStone());
	
	public static final DeferredBlock<ModStone> MIXED_STONE = BLOCKS.register("mixed_stone", () -> new ModStone());
	
	//walls, stairs, slabs
	public static final DeferredBlock<ModWallStone> POLISHED_MARCASITE_WALL = BLOCKS.register("polished_marcasite_wall", () -> new ModWallStone());
	public static final DeferredBlock<ModStoneStairs> POLISHED_MARCASITE_STAIRS = BLOCKS.register("polished_marcasite_stairs", () -> new ModStoneStairs(ModBlocks.MARCASITE_SMOOTH));
	public static final DeferredBlock<ModSlabStone> POLISHED_MARCASITE_SLAB = BLOCKS.register("polished_marcasite_slab", () -> new ModSlabStone());
		
	
	public static final DeferredBlock<ModWallStone> POLISHED_APATITE_WALL = BLOCKS.register("polished_apatite_wall", () -> new ModWallStone());
	public static final DeferredBlock<ModStoneStairs> POLISHED_APATITE_STAIRS = BLOCKS.register("polished_apatite_stairs", () -> new ModStoneStairs(ModBlocks.APATITE_SMOOTH));
	public static final DeferredBlock<ModSlabStone> POLISHED_APATITE_SLAB = BLOCKS.register("polished_apatite_slab", () -> new ModSlabStone());
	
	
	public static final DeferredBlock<ModWallStone> POLISHED_SHALE_WALL = BLOCKS.register("polished_shale_wall", () -> new ModWallStone());
	public static final DeferredBlock<ModStoneStairs> POLISHED_SHALE_STAIRS = BLOCKS.register("polished_shale_stairs", () -> new ModStoneStairs(ModBlocks.SHALE_SMOOTH));
	public static final DeferredBlock<ModSlabStone> POLISHED_SHALE_SLAB = BLOCKS.register("polished_shale_slab", () -> new ModSlabStone());
	
	public static final DeferredBlock<ModWallStone> POLISHED_ALUNITE_WALL = BLOCKS.register("polished_alunite_wall", () -> new ModWallStone());
	public static final DeferredBlock<ModStoneStairs> POLISHED_ALUNITE_STAIRS = BLOCKS.register("polished_alunite_stairs", () -> new ModStoneStairs(ModBlocks.ALUNITE_SMOOTH));
	public static final DeferredBlock<ModSlabStone> POLISHED_ALUNITE_SLAB = BLOCKS.register("polished_alunite_slab", () -> new ModSlabStone());
	
	public static final DeferredBlock<ModWallStone> MIXED_STONE_WALL = BLOCKS.register("mixed_stone_wall", () -> new ModWallStone());
	public static final DeferredBlock<ModStoneStairs> MIXED_STONE_STAIRS = BLOCKS.register("mixed_stone_stairs", () -> new ModStoneStairs(ModBlocks.MIXED_STONE));
	public static final DeferredBlock<ModSlabStone> MIXED_STONE_SLAB = BLOCKS.register("mixed_stone_slab", () -> new ModSlabStone());
	
	public static final DeferredBlock<ModWallStone> POLISHED_CORMALITE_WALL = BLOCKS.register("polished_cormalite_wall", () -> new ModWallStone());
	public static final DeferredBlock<ModStoneStairs> POLISHED_CORMALITE_STAIRS = BLOCKS.register("polished_cormalite_stairs", () -> new ModStoneStairs(ModBlocks.CORMALITE_SMOOTH));
	public static final DeferredBlock<ModSlabStone> POLISHED_CORMALITE_SLAB = BLOCKS.register("polished_cormalite_slab", () -> new ModSlabStone());
	
	public static final DeferredBlock<ModWallStone> POLISHED_UMBER_WALL = BLOCKS.register("polished_umber_wall", () -> new ModWallStone());
	public static final DeferredBlock<ModStoneStairs> POLISHED_UMBER_STAIRS = BLOCKS.register("polished_umber_stairs", () -> new ModStoneStairs(ModBlocks.UMBER_SMOOTH));
	public static final DeferredBlock<ModSlabStone> POLISHED_UMBER_SLAB = BLOCKS.register("polished_umber_slab", () -> new ModSlabStone());
	
	
	//ores
	public static final DeferredBlock<ModOre> VENDAR_ORE = BLOCKS.register("vendar_ore", () -> new ModOre(3, ModItems.VENDAR_CHUNK));
	public static final DeferredBlock<ModOre> VENDAR_ORE_DENSE = BLOCKS.register("vendar_ore_dense", () -> new ModOre(3, ModItems.VENDAR_CHUNK));
	
	public static final DeferredBlock<ModOre> INDIRIUM_ORE = BLOCKS.register("indirium_ore", () -> new ModOre(3, ModItems.INDIRIUM_CHUNK));
	public static final DeferredBlock<ModOre> GELDAR_ORE = BLOCKS.register("geldar_ore", () -> new ModOre(3, ModItems.GELDAR_CHUNK));
	public static final DeferredBlock<ModOre> VIRONIUM_ORE = BLOCKS.register("vironium_ore", () -> new ModOre(3, ModItems.VIRONIUM_CHUNK));
	public static final DeferredBlock<ModOre> PRISMARINE_ORE = BLOCKS.register("prismarine_ore", () -> new ModOre(3, Items.PRISMARINE_CRYSTALS));
	
	public static final DeferredBlock<ModCoalOre> COAL_ORE_LAPIS = BLOCKS.register("coal_ore_lapis", () -> new ModCoalOre(1));
	public static final DeferredBlock<ModCoalOre> COAL_ORE_REDSTONE = BLOCKS.register("coal_ore_redstone", () -> new ModCoalOre(1));
	public static final DeferredBlock<ModCoalOre> COAL_ORE_EMERALD = BLOCKS.register("coal_ore_emerald", () -> new ModCoalOre(1));
	public static final DeferredBlock<ModCoalOre> COAL_ORE_IRON = BLOCKS.register("coal_ore_iron", () -> new ModCoalOre(1));
	public static final DeferredBlock<ModCoalOre> COAL_ORE_GOLD = BLOCKS.register("coal_ore_gold", () -> new ModCoalOre(1));
	public static final DeferredBlock<ModCoalOre> COAL_ORE_COPPER = BLOCKS.register("coal_ore_copper", () -> new ModCoalOre(1));
	public static final DeferredBlock<ModCoalOre> COAL_ORE_DIAMOND = BLOCKS.register("coal_ore_diamond", () -> new ModCoalOre(1));
	
	
	//endfection
	public static final DeferredBlock<ModEndcroachment> ENDCROACHED_NETHERRACK = BLOCKS.register("endcroached_netherrack", () -> new ModEndcroachment());
	public static final DeferredBlock<ModEndfection> ENDFECTED_NETHERRACK_A = BLOCKS.register("endfected_netherrack_a", () -> new ModEndfection("A"));
	public static final DeferredBlock<ModEndfection> ENDFECTED_NETHERRACK_B = BLOCKS.register("endfected_netherrack_b", () -> new ModEndfection("B"));
	public static final DeferredBlock<ModEndfection> ENDFECTED_NETHERRACK_C = BLOCKS.register("endfected_netherrack_c", () -> new ModEndfection("C"));
	public static final DeferredBlock<ModEndfection> ENDFECTED_OBSIDIAN = BLOCKS.register("endfected_obsidian", () -> new ModEndfection("O"));
	
	//non-stones, non-machines
	public static final DeferredBlock<ModFabric> WOVEN_LEATHER = BLOCKS.register("woven_leather", () -> new ModFabric());
	
	
	//dimensional outputs
	public static final DeferredBlock<ModStone> COBBLERACK = BLOCKS.register("cobblerack", () -> new ModStone());
	public static final DeferredBlock<ModStone> COBBLED_NETHERREND = BLOCKS.register("cobbled_netherrend", () -> new ModStone());
	public static final DeferredBlock<ModCobbleable> NETHERREND = BLOCKS.register("netherrend", () -> new ModCobbleable(Cobbleable.NETHERREND));
	
	
	
	public static void RegisterBlockItems() {
		
	
		int blockCount = BLOCKS.getEntries().size();
		Object[] blocks = BLOCKS.getEntries().toArray();
		
		for (int x = 0; x < blockCount; x++) {
		
			ModItems.ITEMS.registerSimpleBlockItem((DeferredBlock<?>) blocks[x]);
			//ModItems.ITEMS.registerB
				
			
		
		}
	}



	
	
	
}
