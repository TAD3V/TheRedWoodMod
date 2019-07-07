package me.duat.redwood.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class LogBlock extends Block {
	public LogBlock() {
		super(Material.PLANTS);
		setCreativeTab(CreativeTabs.MISC);
		setSoundType(SoundType.PLANT);
	}
}
