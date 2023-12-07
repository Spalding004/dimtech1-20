package com.mrspalding.dimtech.datagen;

import java.util.concurrent.CompletableFuture;

import com.mrspalding.dimtech.Dimtech;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Dimtech.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataGenerators {

	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		PackOutput packOutput = generator.getPackOutput();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
		
		//generator.addProvider(event.includeServer(), null) recipes go here
		generator.addProvider(event.includeServer(), ModLootTableProvider.creatre(packOutput));
		
		ModBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(), 
				new ModBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
		 generator.addProvider(event.includeServer(), new ModItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));
		
		
	}
	
	
}
