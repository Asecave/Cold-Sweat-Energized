package com.asecave;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.momostudios.coldsweat.ColdSweat;

@Mod(ColdSweatEnergized.MOD_ID)
public class ColdSweatEnergized {

    public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "cold_sweat_energized";
	
	public ColdSweatEnergized() {
		
		MinecraftForge.EVENT_BUS.register(this);
		
		LOGGER.log(Level.INFO, ColdSweat.MOD_ID);
	}
}
