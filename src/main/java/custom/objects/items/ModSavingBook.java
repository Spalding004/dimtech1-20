package custom.objects.items;

import java.util.List;

import javax.annotation.Nullable;

import com.mrspalding.dimtech.library.TextUtils;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;


public class ModSavingBook extends Item{
	public ModSavingBook() {
		super(new Item.Properties()
				);
		
	}
	

	@Override
	   public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> list, TooltipFlag flagIn) {
		list.add(Component.translatable(TextUtils.lT("saving_book")).withStyle(ChatFormatting.DARK_PURPLE));  
	   }
	
	
	@Override
	public boolean isFoil(ItemStack stack) {
	      return true;
	   }
}
