package custom.objects.items;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class ModEdible extends Item{

	public ModEdible(FoodProperties food) {
		super(new Item.Properties().food(food));
	}
	
}
