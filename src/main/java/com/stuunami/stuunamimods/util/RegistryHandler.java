package com.stuunami.stuunamimods.util;

import com.stuunami.stuunamimods.item.*;
import com.stuunami.stuunamimods.block.*;
import com.stuunami.stuunamimods.init.StuunamiModsBlocks;

import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void RegisterItems(Register<Item> event)
	{
		
		final Item[] itemBlocks = {
				new ItemBlock(StuunamiModsBlocks.INVENTORY_PANEL).setRegistryName(StuunamiModsBlocks.INVENTORY_PANEL.getRegistryName())
		};
		
		event.getRegistry().registerAll(itemBlocks);
	}
	
	@SubscribeEvent
	public static void RegisterBlocks(Register<Block> event)
	{
		final Block[] blocks = {
				new InventoryPanelBlock("inventory_panel")
		};
		
		event.getRegistry().registerAll(blocks);
	}
}
