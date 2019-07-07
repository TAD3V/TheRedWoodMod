package me.duat.redwood.util;

import me.duat.redwood.RedWoodMod;
import me.duat.redwood.block.BlockFirstBlock;
import me.duat.redwood.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = RedWoodMod.MODID)
public class RegistrationHandler {
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = {
				new BlockFirstBlock().setRegistryName("first_block").setUnlocalizedName(RedWoodMod.MODID + "." + "first_block"),
		};

		event.getRegistry().registerAll(blocks);
	}
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				new Item().setRegistryName(RedWoodMod.MODID, "first_item").setUnlocalizedName(RedWoodMod.MODID + "." + "first_item").setCreativeTab(CreativeTabs.MISC)
		};
		
		final Item[] itemBlocks = {
                new ItemBlock(ModBlocks.FIRST_BLOCK).setRegistryName(ModBlocks.FIRST_BLOCK.getRegistryName()),
		};

		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}
	
}
