package com.stuunami.stuunamimods;

import org.apache.logging.log4j.Logger;
//import com.stuunami.stuunamimods.proxy.ServerProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
 
@Mod(modid = StuunamiMods.MODID, name = StuunamiMods.NAME, version = StuunamiMods.VERSION, acceptedMinecraftVersions = StuunamiMods.MC_VERSION)
public class StuunamiMods {
 
    public static final String MODID = "stuunamimods";
    public static final String NAME = "Stuunami Mods";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "[1.12.2]";
 
    public static Logger logger;
 
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }
 
    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("TutorialMod.NAME " + "says hi!");
    }
 
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
 
    }
 
}