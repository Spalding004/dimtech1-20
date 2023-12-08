package custom;

import java.util.ArrayList;

import com.mrspalding.dimtech.Dimtech;
import com.mrspalding.dimtech.library.ModFoods;

import custom.objects.items.ModCard;
import custom.objects.items.ModDamageItem;
import custom.objects.items.ModEdible;
import custom.objects.items.ModNetherGaze;
import custom.objects.items.ModNetherPearl;
import custom.objects.items.ModSavingBook;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
	
		public static ArrayList<BlockItem> blockItems = new ArrayList<>();
	
	  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Dimtech.MODID);
	  
	  
	  public static final DeferredItem<Item> VENDAR_CHUNK = ITEMS.registerSimpleItem("vendar_chunk");
	  
	
	  
	  public static final DeferredItem<Item> INDIRIUM_CHUNK = ITEMS.registerSimpleItem("indirium_chunk");
	  
	  public static final DeferredItem<Item> GELDAR_CHUNK = ITEMS.registerSimpleItem("geldar_ore_chunk");
	  public static final DeferredItem<Item> VIRONIUM_CHUNK = ITEMS.registerSimpleItem("vironium_ore_chunk");
	  public static final DeferredItem<Item> DUST_SILVER_FINE = ITEMS.registerSimpleItem("dust_silver_fine");
	  public static final DeferredItem<Item> DUST_SILVER = ITEMS.registerSimpleItem("dust_silver");
	 
	  public static final DeferredItem<Item> INGOT_SILVER = ITEMS.registerSimpleItem("ingot_silver");
	  public static final DeferredItem<Item> CHARGED_CARBON = ITEMS.registerSimpleItem("charged_carbon");
	  public static final DeferredItem<Item> STEEL_INGOT = ITEMS.registerSimpleItem("steel_ingot");
	  public static final DeferredItem<Item> VENDAR_INGOT = ITEMS.registerSimpleItem("vendar_ingot");
	  public static final DeferredItem<Item> INDIRIUM_INGOT = ITEMS.registerSimpleItem("indirium_ingot");
	  
	  public static final DeferredItem<Item> GELDAR_INGOT = ITEMS.registerSimpleItem("geldar_ingot");
	  
	  public static final DeferredItem<Item> VIRONIUM_INGOT = ITEMS.registerSimpleItem("vironium_ingot");
	 
	  
	  public static final DeferredItem<Item> POLISHING_STONE = ITEMS.registerSimpleItem("polishing_stone");
	  
	 
	  public static final DeferredItem<Item> LAPIS_SHARD = ITEMS.registerSimpleItem("lapis_shard");
		 
	  public static final DeferredItem<Item> FRACTURED_LAPIS = ITEMS.registerSimpleItem("fractured_lapis");
	 
	  public static final DeferredItem<ModDamageItem> SAWBLADE = ITEMS.register("sawblade", () -> new ModDamageItem(128));
	  public static final DeferredItem<Item> SAWDUST = ITEMS.registerSimpleItem("sawdust");
	  public static final DeferredItem<Item> WOOD_PULP = ITEMS.registerSimpleItem("wood_pulp");
	  
	  public static final DeferredItem<ModEdible> CHEVAL_STEAK = ITEMS.register("cheval_steak", () -> new ModEdible(ModFoods.CHEVAL_STEAK));
	  public static final DeferredItem<ModEdible> RAW_CHEVAL = ITEMS.register("raw_cheval", () -> new ModEdible(ModFoods.RAW_CHEVAL));
	  
	  public static final DeferredItem<ModCard> CARD_BASIC = ITEMS.register("card_basic", () -> new ModCard(128));
	  public static final DeferredItem<Item> CARD_NETHER = ITEMS.register("card_nether", () -> new ModCard(128));
	  public static final DeferredItem<Item> CARD_END = ITEMS.register("card_end", () -> new ModCard(128));
	  public static final DeferredItem<Item> CARD_WITHER = ITEMS.register("card_wither", () -> new ModCard(1));
	  
	  public static final DeferredItem<Item> DIMENSIONAL_CONDUCTOR = ITEMS.registerSimpleItem("dimensional_conductor");
	  public static final DeferredItem<ModSavingBook> SAVING_BOOK = ITEMS.register("saving_book", () -> new ModSavingBook());
	  
	  
	  public static final DeferredItem<Item> INERT_CRYSTAL = ITEMS.registerSimpleItem("inert_crystal");
	  public static final DeferredItem<Item> ENERGETIC_CRYSTAL = ITEMS.registerSimpleItem("energetic_crystal");
	  public static final DeferredItem<ModDamageItem> REPLICATING_CRYSTAL = ITEMS.register("replicating_crystal", () -> new ModDamageItem(256));
	  
	  public static final DeferredItem<Item> DIAMOND_SLIVER = ITEMS.registerSimpleItem("diamond_sliver");
	  public static final DeferredItem<Item> END_ESSENCE = ITEMS.registerSimpleItem("end_essence");
	  public static final DeferredItem<ModNetherPearl> NETHER_PEARL = ITEMS.register("nether_pearl", () -> new ModNetherPearl());
	  public static final DeferredItem<ModNetherGaze> NETHER_GAZE = ITEMS.register("nether_gaze", () -> new ModNetherGaze());
}
