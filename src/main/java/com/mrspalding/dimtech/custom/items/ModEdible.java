package com.mrspalding.dimtech.custom.items;

import com.mrspalding.dimtech.custom.ModItems;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;

public class ModEdible extends Item{

	ItemLike result;
	
	public ModEdible(FoodProperties food) {
		super(new Item.Properties().food(food));
	}
	
	public ModEdible(FoodProperties food, ItemLike source) {
		super(new Item.Properties().food(food));
		ModItems.cooked_foods.add(this);
		this.result = source;
	}
	
	
	public ItemLike getRaw() {
		
		return this.result;
		
	}
	
}
