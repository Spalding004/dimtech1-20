package com.mrspalding.dimtech.events.lootmodifiers;

import java.util.Random;
import java.util.function.Supplier;

import javax.annotation.Nonnull;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mrspalding.dimtech.custom.ModItems;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;

@SuppressWarnings("unused")
public class ModAddDropsToMob extends LootModifier {
   

    protected ModAddDropsToMob(LootItemCondition[] conditionsIn) {
        super(conditionsIn);
       
    }
    

    
    public static final Supplier<Codec<ModAddDropsToMob>> CODEC = Suppliers.memoize(() ->
    RecordCodecBuilder.create(inst -> codecStart(inst).apply(inst, ModAddDropsToMob::new)));

 
    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
    	Random rand = new Random();
    	if (checkIfHorse(context)) generatedLoot.add(new ItemStack(ModItems.RAW_CHEVAL.get(), rand.nextInt(3)));
        
    	
    	
    	
    	
    	
    	
    	return generatedLoot;
    }

    
 
    

	@Override
	public Codec<? extends IGlobalLootModifier> codec() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	public static boolean checkIfHorse(LootContext context) {
      
            if(context.hasParam(LootContextParams.THIS_ENTITY)) {
                
            	if (context.getParam(LootContextParams.THIS_ENTITY) instanceof Horse mob) {
                    
                        ResourceLocation mob_resource_loc = BuiltInRegistries.ENTITY_TYPE.getKey(mob.getType());
                        return (mob_resource_loc.getNamespace().equals("minecraft")); 
                    }
                }
            return false;
            }
       
		

}
