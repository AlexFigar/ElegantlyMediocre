package com.elegantlymediocre.common;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.world.EnumSkyBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;

import org.apache.logging.log4j.Logger;

import com.elegantlymediocre.item.ModItems;
import com.elegantlymediocre.proxy.CommonProxy;
import com.elegantlymediocre.recipe.ModRecipes;

@Mod(modid = ElegantlyMediocre.MODID, name = ElegantlyMediocre.NAME, version = ElegantlyMediocre.VERSION)
public class ElegantlyMediocre
{
    public static final String MODID = "elegantlymediocre";
    public static final String NAME = "The Elegantly Mediocre Mod";
    public static final String VERSION = "1.0";

    public static final ModTab creativeTab = new ModTab();
    
    public static final Item.ToolMaterial ematerial = EnumHelper.addToolMaterial("ematerial", 3, 0, 6, 30, 23);
    public static final Item.ToolMaterial amaterial = EnumHelper.addToolMaterial("amaterial", 3, 0, 6, 7, 0);
    
    private static Logger logger;

	@Mod.Instance(MODID)
	public static ElegantlyMediocre instance;
	
	@SidedProxy(serverSide = "com.elegantlymediocre.proxy.CommonProxy", clientSide = "com.elegantlymediocre.proxy.ClientProxy")
	public static CommonProxy proxy;
    
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
	
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ModItems.registerModels();
		}
	
	}
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(NAME + " is loading!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}