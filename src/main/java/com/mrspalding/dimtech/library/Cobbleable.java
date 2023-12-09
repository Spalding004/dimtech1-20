package com.mrspalding.dimtech.library;

import com.mrspalding.dimtech.custom.ModBlocks;

import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;

@SuppressWarnings("rawtypes")
public class Cobbleable {

	public static Cobbleable NETHERREND = new Cobbleable(ModBlocks.NETHERREND, ModBlocks.COBBLED_NETHERREND);
	public static Cobbleable VOIDSTONE = new Cobbleable(ModBlocks.VOIDSTONE, ModBlocks.VOIDSTONE_COBBLE);
	
	private DeferredBlock input;
	private DeferredBlock output;
	
	
	public Cobbleable(DeferredBlock stone, DeferredBlock cobble)
	{
		this.input = stone;
		this.output = cobble;
	}
	
	public DeferredBlock getStone(Cobbleable pair) {
		return input;
	}
	
	public DeferredBlock getCobble(Cobbleable pair) {
		return output;
	}
}
