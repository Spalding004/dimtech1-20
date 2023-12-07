package com.mrspalding.dimtech.objects.mod;

import java.util.ArrayList;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.objects.ModCoalOre;
import com.mrspalding.dimtech.objects.ModOre;
import com.mrspalding.dimtech.objects.ModStone;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
	
	
	public static ArrayList<Block> cubes = new ArrayList<>();
	public static ArrayList<Block> ore = new ArrayList<>();
	public static ArrayList<Block> stones = new ArrayList<>();
	
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
	
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Dimtech.MODID);
	
	//stones (and bowls)
	public static final DeferredBlock<ModStone> MARCASITE = BLOCKS.register("marcasite", () -> new ModStone());
	public static final DeferredBlock<ModStone> SHALE = BLOCKS.register("shale", () -> new ModStone());
	public static final DeferredBlock<ModStone> APATITE = BLOCKS.register("apatite", () -> new ModStone());
	
	public static final DeferredBlock<ModStone> ALUNITE = BLOCKS.register("alunite", () -> new ModStone());
	public static final DeferredBlock<ModStone> UMBER = BLOCKS.register("umber", () -> new ModStone());
	public static final DeferredBlock<ModStone> CORMALITE = BLOCKS.register("cormalite", () -> new ModStone());
	
	public static final DeferredBlock<ModStone> PUMICE = BLOCKS.register("pumice", () -> new ModStone());
	
	public static final DeferredBlock<ModStone> VOIDSTONE = BLOCKS.register("voidstone", () -> new ModStone());
	
	public static final DeferredBlock<ModStone> MIXED_STONE = BLOCKS.register("mixed_stone", () -> new ModStone());
	
	
	
	//ores
	public static final DeferredBlock<ModOre> VENDAR_ORE = BLOCKS.register("vendar_ore", () -> new ModOre(3, ModItems.VENDAR_CHUNK));
	public static final DeferredBlock<ModOre> VENDAR_ORE_DENSE = BLOCKS.register("vendar_ore_dense", () -> new ModOre(3, ModItems.VENDAR_CHUNK));
	
	public static final DeferredBlock<ModOre> INDIRIUM_ORE = BLOCKS.register("indirium_ore", () -> new ModOre(3, ModItems.VENDAR_CHUNK));
	public static final DeferredBlock<ModOre> GELDAR_ORE = BLOCKS.register("geldar_ore", () -> new ModOre(3, ModItems.VENDAR_CHUNK));
	public static final DeferredBlock<ModOre> VIRONIUM_ORE = BLOCKS.register("vironium_ore", () -> new ModOre(3, ModItems.VENDAR_CHUNK));
	
	public static final DeferredBlock<ModCoalOre> COAL_ORE_LAPIS = BLOCKS.register("coal_ore_lapis", () -> new ModCoalOre(1));
	public static final DeferredBlock<ModCoalOre> COAL_ORE_REDSTONE = BLOCKS.register("coal_ore_redstone", () -> new ModCoalOre(1));
	public static final DeferredBlock<ModCoalOre> COAL_ORE_EMERALD = BLOCKS.register("coal_ore_emerald", () -> new ModCoalOre(1));
	public static final DeferredBlock<ModCoalOre> COAL_ORE_IRON = BLOCKS.register("coal_ore_iron", () -> new ModCoalOre(1));
	public static final DeferredBlock<ModCoalOre> COAL_ORE_GOLD = BLOCKS.register("coal_ore_gold", () -> new ModCoalOre(1));
	public static final DeferredBlock<ModCoalOre> COAL_ORE_COPPER = BLOCKS.register("coal_ore_copper", () -> new ModCoalOre(1));
	public static final DeferredBlock<ModCoalOre> COAL_ORE_DIAMOND = BLOCKS.register("coal_ore_diamond", () -> new ModCoalOre(1));
	
	
	
	
	//dimensional outputs
	public static final DeferredBlock<ModStone> COBBLERACK = BLOCKS.register("cobblerack", () -> new ModStone());
	public static final DeferredBlock<ModStone> COBBLED_NETHERREND = BLOCKS.register("cobbled_netherrend", () -> new ModStone());
	public static final DeferredBlock<ModStone> NETHERREND = BLOCKS.register("netherrend", () -> new ModStone());
	
	
	@SuppressWarnings("unchecked")
	public static void RegisterBlockItems() {
		
	
		int blockCount = BLOCKS.getEntries().size();
		Object[] blocks = BLOCKS.getEntries().toArray();
		
		for (int x = 0; x < blockCount; x++) {
		
			
				ModItems.ITEMS.registerSimpleBlockItem((Holder<Block>) blocks[x]);
				
			
		
		}
	}



	
	
	
}
