package com.mrspalding.dimtech.custom.items;



import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCard extends Item{

	public ModCard(int i) {
		super(new Item.Properties()
				.stacksTo(1)
				.durability(i));
	
		
	}
	
	@Override
	 public boolean isEnchantable(ItemStack p_41456_) {
	      return false;
	   }
	
}
