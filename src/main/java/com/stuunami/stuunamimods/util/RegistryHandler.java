package com.stuunami.stuunamimods.util;

import com.stuunami.stuunamimods.item.ItemBasic;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void RegisterItems(Register<Item> event)
	{
		final Item[] items = {
				new ItemBasic("itemBasic","basic_item")
		};
		
		event.getRegistry().registerAll(items);
	}
}
