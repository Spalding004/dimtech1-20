package com.mrspalding.dimtech.events.lootmodifiers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import javax.annotation.Nonnull;

import org.jetbrains.annotations.NotNull;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mrspalding.dimtech.custom.ModItems;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;

public class OreDropsModifier extends LootModifier {


	public OreDropsModifier(LootItemCondition[] conditionsIn) {
		super(conditionsIn);
	}
	
	 public static final Supplier<Codec<OreDropsModifier>> CODEC = Suppliers.memoize(() ->
     RecordCodecBuilder.create(inst -> codecStart(inst).apply(inst, OreDropsModifier::new)));

	@SuppressWarnings("deprecation")
	@Nonnull
	@Override
	protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot,
			LootContext context) {
		
		
		
		@SuppressWarnings("unused")
		Random random = new Random();
		String broken = generatedLoot.toString();
		ItemStack ctxTool = context.getParam(LootContextParams.TOOL);
		int enchant_level = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, ctxTool);
		
		
		System.out.println(broken);
		
		if (generatedLoot.size() == 0) {

			return generatedLoot;

		}
	
		ObjectArrayList<ItemStack> ret = checkloots(generatedLoot, broken, enchant_level, ctxTool, context);

		if (ret.size() == 0 || generatedLoot.get(0).getItem() == ret.get(0).getItem()
				|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, ctxTool) != 0) {

			return generatedLoot;

		} else {
			
			return ret;
		}
	}

	/*
	 * 
	 * 
	 * This is NOT the correct way to use the global loot modifier system.
	 * 
	 * The forge team created a lovely tool here that I have completely bastardized
	 * into something else entirely.
	 * 
	 * Do as I say, not as I do.
	 * 
	 * This is a temporary measure until I convert all of the blockdrops to proper JSON
	 * 
	 * 
	 * 
	 * 
	 */

	private ObjectArrayList<ItemStack> checkloots(List<ItemStack> generatedLoot, String broken, int enchant, ItemStack tool, LootContext context) {
		ObjectArrayList<ItemStack> listReturn = new ObjectArrayList<ItemStack>();
		Random random = new Random();
		String checkedOre = "nonya";
		/*              
			if (broken.contains("lapis_lazuli")) {

				if (tool.getItem() == ModItems.TOOL_VENDAR_FRAKHAMMER.get()) {
    				listReturn.add(new ItemStack(ModItems.FRACTURED_LAPIS.get(), 2 + random.nextInt(3)));
    				return listReturn;
    			}
    			
    			if (tool.getItem() == ModItems.IRON_FRAKHAMMER.get()) {
    				listReturn.add(new ItemStack(ModItems.LAPIS_SHARD.get(), 8 + random.nextInt(6)));
    				return listReturn;
    			}
				
			
			return listReturn;

			}

		
			if (tool.getItem() instanceof ModToolFrakhammer) {
				ArrayList<ItemStack> fraktest = new ArrayList<ItemStack>();
				generatedLoot.forEach((stack) -> fraktest.add(frak(tool, stack, context)));
			//	System.out.println(fraktest);
				if (fraktest.get(0) != generatedLoot.get(0)) {
					return fraktest;
				}
				
			}
			*/
		
		
		
		
		if (broken.contains("endcroached")) {
			
			int dropChance = random.nextInt(100);
			listReturn.add(ItemStack.EMPTY);
			if (dropChance > 50) listReturn.add(new ItemStack(Blocks.NETHERRACK, 1));
			if (dropChance < 30) listReturn.add(new ItemStack(ModItems.END_ESSENCE.get(), 1));
			return listReturn;
			
			
		}
		

		if (broken.contains("endfected_")) {
			
			int dropChance = random.nextInt(100);
			listReturn.add(ItemStack.EMPTY);
			//we don't want it to ever drop itself so we add minecraft:air via ItemStack.EMPTY.
			
			if (broken.contains("netherrack_a")) {
				if (dropChance > 30) {
					listReturn.add(new ItemStack(ModItems.END_ESSENCE.get(), 1 + 1 * random.nextInt(1 + enchant)));
				}
				
				if (dropChance > 90) {
					listReturn.add(new ItemStack(Items.ENDER_PEARL, 1 + 1 * random.nextInt(1 + enchant)));
				}
				return listReturn;
			}
			
			if (broken.contains("netherrack_b")) {
				if (dropChance < 55) {
					listReturn.add(new ItemStack(ModItems.END_ESSENCE.get(), 1 + 1 * random.nextInt(1 + enchant)));
				}
				
				if (dropChance < 75) {
					listReturn.add(new ItemStack(Items.ENDER_PEARL, 1 + 1 * random.nextInt(1 + enchant)));
				}
				System.out.println(broken);
				return listReturn;
			}

			if (broken.contains("netherrack_c")) {
				if (dropChance > 75) {
					listReturn.add(new ItemStack(ModItems.END_ESSENCE.get(), 1 + 1 * random.nextInt(1 + enchant)));
				}
				
				if (dropChance > 95) {
					listReturn.add(new ItemStack(Items.ENDER_PEARL, 1 + 1 * random.nextInt(1 + enchant)));
				}
				return listReturn;
			}
			
			if (broken.contains("obsidian")) {
				if (dropChance > 0) {
					listReturn.add(new ItemStack(ModItems.END_ESSENCE.get(), 2 + 1 * random.nextInt(1 + enchant)));
				}
				
				if (dropChance > 60) {
					listReturn.add(new ItemStack(Blocks.OBSIDIAN, 1 + 1 * random.nextInt(1 + enchant)));
				}
				return listReturn;
			}
			
			if (broken.contains("nether_quartz_ore")) {
				if (dropChance > 10) {
					listReturn.add(new ItemStack(ModItems.END_ESSENCE.get(), 3 + 1 * random.nextInt(1 + enchant)));
				}
				
				
					listReturn.add(new ItemStack(Items.QUARTZ, 3 + 1 * random.nextInt(1 + enchant)));
				
				return listReturn;
			}
			
			
		}
		
		checkedOre = "prismarine";
		if (broken.contains(checkedOre + "_ore")) {
			int blend = 1 + random.nextInt(5);
			int blend2 = Math.abs(blend - 5);
			
			if (blend > 0) {
			listReturn.add(new ItemStack(Items.PRISMARINE_CRYSTALS, blend + blend * random.nextInt(1 + enchant)));
			}
			if (blend2 > 0 ) {
			listReturn.add(new ItemStack(Items.PRISMARINE_SHARD, blend2 + blend2 * random.nextInt(1 + enchant)));
			}
			return listReturn;
		}

		if (broken.contains("coal") && !broken.contains("coal_ore_")) {
			listReturn = (ObjectArrayList<ItemStack>) generatedLoot;
			if (random.nextInt(210 + enchant * 3) >= (198 - enchant * 4))
				listReturn.add(new ItemStack(ModItems.CHARGED_CARBON.get()));

			return listReturn;
		}

		// riddled coal ores

		checkedOre = "diamond";
		if (broken.contains("coal_ore_" + checkedOre)) {

			listReturn.add(new ItemStack(Items.DIAMOND, 1 + random.nextInt(1 + enchant)));
			listReturn.add(new ItemStack(Items.COAL, 1 + random.nextInt(1 + enchant)));
			if (random.nextInt(20 + enchant * 2) >= 19)
				listReturn.add(new ItemStack(ModItems.CHARGED_CARBON.get()));
			return listReturn;
		}

		checkedOre = "emerald";
		if (broken.contains("coal_ore_" + checkedOre)) {

			listReturn.add(new ItemStack(Items.EMERALD, 1 + random.nextInt(1 + enchant)));
			listReturn.add(new ItemStack(Items.COAL, 1 + random.nextInt(1 + enchant)));
			if (random.nextInt(20 + enchant * 2) >= 19)
				listReturn.add(new ItemStack(ModItems.CHARGED_CARBON.get()));
			return listReturn;
		}
		
		checkedOre = "copper";
		if (broken.contains("coal_ore_" + checkedOre)) {

			listReturn.add(new ItemStack(Items.RAW_COPPER, 1 + random.nextInt(1 + enchant)));
			listReturn.add(new ItemStack(Items.COAL, 1 + random.nextInt(1 + enchant)));
			if (random.nextInt(20 + enchant * 2) >= 19)
				listReturn.add(new ItemStack(ModItems.CHARGED_CARBON.get()));
			return listReturn;
		}

		checkedOre = "lapis";
		if (broken.contains("coal_ore_" + checkedOre)) {

			listReturn.add(new ItemStack(Items.LAPIS_LAZULI, 3 + random.nextInt(3) + 3 * random.nextInt(1 + enchant)));
			listReturn.add(new ItemStack(Items.COAL, 1 + random.nextInt(1 + enchant)));
			if (random.nextInt(20 + enchant * 2) >= 19)
				listReturn.add(new ItemStack(ModItems.CHARGED_CARBON.get()));
			return listReturn;
		}

		checkedOre = "redstone";
		if (broken.contains("coal_ore_" + checkedOre)) {

			listReturn.add(new ItemStack(Items.REDSTONE, 4 + random.nextInt(2) + 4 * random.nextInt(1 + enchant)));
			listReturn.add(new ItemStack(Items.COAL, 1 + random.nextInt(1 + enchant)));
			if (random.nextInt(20 + enchant * 2) >= 19)
				listReturn.add(new ItemStack(ModItems.CHARGED_CARBON.get()));
			return listReturn;
		}

		checkedOre = "iron";
		if (broken.contains("coal_ore_" + checkedOre)) {

			
				listReturn.add(new ItemStack(Items.RAW_IRON, 1 + random.nextInt(1 + enchant)));
			
			if (random.nextInt(20 + enchant * 2) >= 19)
			listReturn.add(new ItemStack(ModItems.CHARGED_CARBON.get()));
			listReturn.add(new ItemStack(Items.COAL, 1 + random.nextInt(1 + enchant)));
			return listReturn;
		}

		checkedOre = "gold";
		if (broken.contains("coal_ore_" + checkedOre)) {

			
				listReturn.add(new ItemStack(Items.RAW_GOLD, 1 + random.nextInt(1 + enchant)));
			
			if (random.nextInt(20 + enchant * 2) >= 19)
				listReturn.add(new ItemStack(ModItems.CHARGED_CARBON.get()));
			listReturn.add(new ItemStack(Items.COAL, 1 + random.nextInt(1 + enchant)));
			return listReturn;
		}

		return (ObjectArrayList<ItemStack>) generatedLoot;

	}
/*
	private static ItemStack frak(ItemStack tool, ItemStack stack, LootContext context) {

		 return context.getLevel().getRecipeManager().getRecipeFor(FrakhammerRecipe.Type.INSTANCE, new SimpleContainer(ItemStack.EMPTY, tool, 
				 stack), context.getLevel())
				 .map(FrakhammerRecipe::getResultItem)
				 .filter(itemStack -> !itemStack.isEmpty())
				 .map(itemStack -> ItemHandlerHelper.copyStackWithSize(itemStack, stack.getCount() * itemStack.getCount()))
				 .orElse(stack);
                
		
	}
	
	public static class Serializer extends GlobalLootModifierProvider {
		@Override
		public ModDropsModifier read(ResourceLocation name, JsonObject json, LootItemCondition[] conditionsIn) {
			return new ModDropsModifier(conditionsIn);
		}

		@Override
		public JsonObject write(ModDropsModifier instance) {
			// TODO Auto-generated method stub
			return null;
		}
	}
	*/

	@Override
	public Codec<? extends IGlobalLootModifier> codec() {
		// TODO Auto-generated method stub
		return null;
	}

	
}

