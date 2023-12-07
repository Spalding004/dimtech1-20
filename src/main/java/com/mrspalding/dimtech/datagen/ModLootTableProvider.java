package com.mrspalding.dimtech.datagen;

import java.util.List;
import java.util.Set;

import com.mrspalding.dimtech.datagen.loot.ModBlockLoot;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

public class ModLootTableProvider {
	public static LootTableProvider creatre(PackOutput output) {
		return new LootTableProvider(output, Set.of(), List.of(
				new LootTableProvider.SubProviderEntry(ModBlockLoot::new, LootContextParamSets.BLOCK)));
	}
	
	
}
