package com.mrspalding.dimtech.datagen.loot;

import java.util.Set;

import com.mrspalding.dimtech.objects.ModCoalOre;
import com.mrspalding.dimtech.objects.ModOre;
import com.mrspalding.dimtech.objects.mod.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
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
	
		
		for (int stones = 0; stones <ModBlocks.stones.size(); stones++) {
			this.dropSelf(ModBlocks.stones.get(stones));
		}
		
		for (int ores = 0; ores < ModBlocks.ore.size(); ores++) {
			Block oreBlock = (ModOre) ModBlocks.ore.get(ores);
			DeferredItem<?> toDrop = ((ModOre) oreBlock).getDrop();
			this.add(oreBlock, block -> createOreDrop(oreBlock, (Item) toDrop.get()));
		}
		
		for (int coals = 0; coals < ModBlocks.coal_ores.size(); coals++) {
			this.dropSelf(ModBlocks.coal_ores.get(coals));
			
		}
		
		//this.add(ModBlocks.VENDAR_ORE.get(), block -> createOreDrop(ModBlocks.VENDAR_ORE.get(), ModItems.VENDAR_CHUNK.get()));
	}
	
	

	
	
}
