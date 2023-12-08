package custom.objects.items;



import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModDamageItem extends Item{

	public ModDamageItem(int i) {
		super(new Item.Properties()
				.stacksTo(1)
				.durability(i));
	
		
	}
	
	@Override
	 public boolean isEnchantable(ItemStack p_41456_) {
	      return false;
	   }
	
	
}
