package com.mrspalding.dimtech.events.lootmodifiers;

import com.mojang.serialization.Codec;
import com.mrspalding.dimtech.Dimtech;

import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public final class ModGlobalLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> GLM = DeferredRegister.create(NeoForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Dimtech.MODID);

    public static final DeferredHolder<Codec<? extends IGlobalLootModifier>, Codec<OreDropsModifier>> ORE_DROPS_MODIFIER = GLM.register("ore_drops_mofidier", OreDropsModifier.CODEC);
    }