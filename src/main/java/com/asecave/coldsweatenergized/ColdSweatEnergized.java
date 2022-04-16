package com.asecave.coldsweatenergized;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.asecave.coldsweatenergized.common.item.Items;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ColdSweatEnergized.MOD_ID)
public class ColdSweatEnergized {

    public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "coldsweatenergized";
	
	public ColdSweatEnergized() {
		
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		Items.register(bus);
	}
}
