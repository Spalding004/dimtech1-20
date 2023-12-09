package com.mrspalding.dimtech.custom.items;

import java.util.List;

import javax.annotation.Nullable;

import com.mrspalding.dimtech.library.TextUtils;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;


public class ModNetherPearl extends Item{

	public ModNetherPearl() {
		super(new Item.Properties());
	
	}

	
	@Override
	   public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> list, TooltipFlag flagIn) {
		list.add(Component.translatable(TextUtils.lT("nether_pearl")).withStyle(ChatFormatting.YELLOW));
	}
	
	@Override
	public InteractionResultHolder<ItemStack> use(Level worldIn, Player player, InteractionHand hand) {
	      ItemStack itemHeld = player.getItemInHand(hand);
	      byte diff;
	      switch(worldIn.getDifficulty()) {
	      case HARD:
	         diff = 3;
	         break;
	      case NORMAL:
	         diff = 2;
	         break;
	      case EASY:
	         diff = 1;
	         break;
	      case PEACEFUL:
	         diff = 0;
	         break;
	      default:
	         diff = 1;
	      }

	      player.setSecondsOnFire(1 + diff * 2);
	      itemHeld.shrink(1);
	      player.getCooldowns().addCooldown(this, 20);
	      return InteractionResultHolder.success(player.getItemInHand(hand));
	   }
	
}
