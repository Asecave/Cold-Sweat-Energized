package com.asecave.coldsweatenergized.common.item;

import com.asecave.coldsweatenergized.ColdSweatEnergized;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.momostudios.coldsweat.core.itemgroup.ColdSweatGroup;

public class Items {

	public final static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ColdSweatEnergized.MOD_ID);
	
	public static final RegistryObject<Item> HELMET = ITEMS.register("helmet", HelmetItem::new);
	public static final RegistryObject<Item> CHESTPLATE = ITEMS.register("chestplate", () -> new Item(new Item.Properties().group(ColdSweatGroup.COLD_SWEAT)));
	public static final RegistryObject<Item> LEGGINS = ITEMS.register("leggins", () -> new Item(new Item.Properties().group(ColdSweatGroup.COLD_SWEAT)));
	public static final RegistryObject<Item> BOOTS = ITEMS.register("boots", () -> new Item(new Item.Properties().group(ColdSweatGroup.COLD_SWEAT)));
	
	public static void register(IEventBus bus) {
		ITEMS.register(bus);
	}
}

