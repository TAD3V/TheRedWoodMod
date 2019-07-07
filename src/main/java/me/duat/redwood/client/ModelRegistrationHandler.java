package me.duat.redwood.client;

import me.duat.redwood.RedWoodMod;
import me.duat.redwood.block.BlockFirstBlock;
import me.duat.redwood.init.ModBlocks;
import me.duat.redwood.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = RedWoodMod.MODID)
public class ModelRegistrationHandler {
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		registerModel(ModItems.FIRST_ITEM, 0);
		registerModel(Item.getItemFromBlock(ModBlocks.FIRST_BLOCK), 0);
	}

	
	private static void registerModel(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta, 
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}