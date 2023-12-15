package com.mrspalding.dimtech.datagen.loot;

import java.util.Set;

import com.mrspalding.dimtech.custom.ModBlocks;
import com.mrspalding.dimtech.custom.ModItems;
import com.mrspalding.dimtech.custom.blocks.ModCobbleable;
import com.mrspalding.dimtech.custom.blocks.ModOre;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModBlockLoot extends BlockLootSubProvider{

	public ModBlockLoot() {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags());
	
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Iterable<Block> getKnownBlocks() {
		return (Iterable<Block>) ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get).toList();
	   }
	
	@Override
	protected void generate() {
	
		
		for (int endfs = 0; endfs < ModBlocks.endfections.size(); endfs++) {
			Block oreBlock = ModBlocks.endfections.get(endfs);
			this.dropSelf(oreBlock);
		}
		
		for (int metals = 0; metals < ModBlocks.metals.size(); metals++) {
			Block oreBlock = ModBlocks.metals.get(metals);
			this.dropSelf(oreBlock);
		}
		
		for (int stones = 0; stones <ModBlocks.stones.size(); stones++) {
			this.dropSelf(ModBlocks.stones.get(stones));
		}
		//stone overrides
		this.add(ModBlocks.PUMICE.get(), block -> createPumiceDrops(ModBlocks.PUMICE.get()));
		
		for (int cobbles = 0; cobbles <ModBlocks.cobbleable.size(); cobbles++) {
			Block oreBlock = (ModCobbleable) ModBlocks.cobbleable.get(cobbles);
			
			Item toDrop = ((ModCobbleable) oreBlock).getDeferredDrop().asItem();
			this.add(oreBlock, block -> createOreDrop(oreBlock, toDrop));
		}
		
		for (int ores = 0; ores < ModBlocks.ore.size(); ores++) {
			Block oreBlock = (ModOre) ModBlocks.ore.get(ores);
			
				DeferredItem<?> toDrop = ((ModOre) oreBlock).getDeferredDrop();
				this.add(oreBlock, block -> createOreDrop(oreBlock, (Item) toDrop.get()));
			}
		
		this.add(ModBlocks.VENDAR_ORE_DENSE.get(), block -> createDenseDrops(ModBlocks.VENDAR_ORE_DENSE.get(), ModItems.VENDAR_CHUNK));
		this.add(ModBlocks.DEEPSLATE_VENDAR_ORE_DENSE.get(), block -> createDenseDrops(ModBlocks.DEEPSLATE_VENDAR_ORE_DENSE.get(), ModItems.VENDAR_CHUNK));
		
		for (int vdo = 0; vdo < ModBlocks.vanilla_dropping_ore.size(); vdo++) {
			Block oreBlock = (ModOre) ModBlocks.vanilla_dropping_ore.get(vdo);
			
				Item toDrop = ((ModOre) oreBlock).getItemDrop();
				this.add(oreBlock, block -> createOreDrop(oreBlock, (Item) toDrop));
			
		}
		
		this.dropSelf(ModBlocks.PRISMARINE_ORE.get());
		
		for (int coals = 0; coals < ModBlocks.coal_ores.size(); coals++) {
			this.dropSelf(ModBlocks.coal_ores.get(coals));
			
		}
		
		//this.add(ModBlocks.VENDAR_ORE.get(), block -> createOreDrop(ModBlocks.VENDAR_ORE.get(), ModItems.VENDAR_CHUNK.get()));
	}
	
	 protected LootTable.Builder createPumiceDrops(Block p_251906_) {
	      return createSilkTouchDispatchTable(
	         p_251906_,
	         this.applyExplosionDecay(
	            p_251906_,
	            LootItem.lootTableItem(ModItems.POLISHING_STONE)
	               .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F)))
	               .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
	         )
	      );
	   }

	 protected LootTable.Builder createDenseDrops(Block p_251906_, ItemLike toDrop) {
	      return createSilkTouchDispatchTable(
	         p_251906_,
	         this.applyExplosionDecay(
	            p_251906_,
	            LootItem.lootTableItem(toDrop)
	               .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F)))
	               .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
	         )
	      );
	   }
	
	 protected LootTable.Builder selfDropOverride(Block block) {
	      return createSilkTouchDispatchTable(
	    		  block,
	         this.applyExplosionDecay(
	        		 block,
	            LootItem.lootTableItem(block)
	               .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F)))
	              
	         )
	      );
	   }
	
	
}
