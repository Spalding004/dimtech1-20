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
	  
	  public static final DeferredItem<Item> CHARGED_CARBON = ITEMS.registerSimpleItem("charged_carbon", new Item.Properties());
}
