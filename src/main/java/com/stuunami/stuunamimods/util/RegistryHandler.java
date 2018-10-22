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
		final Item[] items = {
				new ItemBasic("itemBasic","basic_item")
		};
		
		final Item[] itemBlocks = {
				new ItemBlock(StuunamiModsBlocks.BASIC_BLOCK).setRegistryName(StuunamiModsBlocks.BASIC_BLOCK.getRegistryName())
		};
		
		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}
	
	@SubscribeEvent
	public static void RegisterBlocks(Register<Block> event)
	{
		final Block[] blocks = {
				new BlockBasic(Material.SAND, "blockBasic", "basic_block")
		};
		
		event.getRegistry().registerAll(blocks);
	}
}
