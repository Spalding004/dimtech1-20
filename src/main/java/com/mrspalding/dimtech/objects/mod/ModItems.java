package com.mrspalding.dimtech.objects.mod;

import java.util.ArrayList;

import com.mrspalding.dimtech.Dimtech;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
	
		public static ArrayList<BlockItem> blockItems = new ArrayList<>();
	
	  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Dimtech.MODID);
	  
	  
	  public static final DeferredItem<Item> VENDAR_CHUNK = ITEMS.registerSimpleItem("vendar_chunk", new Item.Properties().food(new FoodProperties.Builder()
	            .alwaysEat().nutrition(1).saturationMod(2f).build()));
	  
	
	  
	  public static final DeferredItem<Item> INDIRIUM_CHUNK = ITEMS.registerSimpleItem("indirium_chunk", new Item.Properties());
	  
	  public static final DeferredItem<Item> GELDAR_CHUNK = ITEMS.registerSimpleItem("geldar_ore_chunk", new Item.Properties());
	  public static final DeferredItem<Item> VIRONIUM_CHUNK = ITEMS.registerSimpleItem("vironium_ore_chunk", new Item.Properties());
	  public static final DeferredItem<Item> DUST_SILVER_FINE = ITEMS.registerSimpleItem("dust_silver_fine", new Item.Properties());
	  public static final DeferredItem<Item> DUST_SILVER = ITEMS.registerSimpleItem("dust_silver", new Item.Properties());
	 
	  public static final DeferredItem<Item> INGOT_SILVER = ITEMS.registerSimpleItem("ingot_silver", new Item.Properties());
	  public static final DeferredItem<Item> CHARGED_CARBON = ITEMS.registerSimpleItem("charged_carbon", new Item.Properties());
	  public static final DeferredItem<Item> STEEL_INGOT = ITEMS.registerSimpleItem("steel_ingot", new Item.Properties());
	  public static final DeferredItem<Item> VENDAR_INGOT = ITEMS.registerSimpleItem("vendar_ingot", new Item.Properties());
	  public static final DeferredItem<Item> INDIRIUM_INGOT = ITEMS.registerSimpleItem("indirium_ingot", new Item.Properties());
	  
	  public static final DeferredItem<Item> GELDAR_INGOT = ITEMS.registerSimpleItem("geldar_ingot", new Item.Properties());
	  
	  public static final DeferredItem<Item> VIRONIUM_INGOT = ITEMS.registerSimpleItem("vironium_ingot", new Item.Properties());
	 
	  
	  public static final DeferredItem<Item> POLISHING_STONE = ITEMS.registerSimpleItem("polishing_stone", new Item.Properties());
	  
	 
	  public static final DeferredItem<Item> LAPIS_SHARD = ITEMS.registerSimpleItem("lapis_shard", new Item.Properties());
		 
	  public static final DeferredItem<Item> FRACTURED_LAPIS = ITEMS.registerSimpleItem("fractured_lapis", new Item.Properties());
	 
	  public static final DeferredItem<Item> SAWDUST = ITEMS.registerSimpleItem("sawdust", new Item.Properties());
	  public static final DeferredItem<Item> WOOD_PULP = ITEMS.registerSimpleItem("wood_pulp", new Item.Properties());
	  
	  
	  public static final DeferredItem<Item> CARD_BASIC = ITEMS.registerSimpleItem("card_basic", new Item.Properties());
	  public static final DeferredItem<Item> CARD_NETHER = ITEMS.registerSimpleItem("card_nether", new Item.Properties());
	  public static final DeferredItem<Item> CARD_END = ITEMS.registerSimpleItem("card_end", new Item.Properties());
	  public static final DeferredItem<Item> CARD_WITHER = ITEMS.registerSimpleItem("card_wither", new Item.Properties());
	  

}
