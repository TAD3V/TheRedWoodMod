package me.duat.redwood.block;

import net.minecraft.block.BlockLog;
import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;

public class BlockFirstBlock extends BlockLog {	
	public BlockFirstBlock() {
		super();
		setCreativeTab(CreativeTabs.MISC);
		setSoundType(SoundType.WOOD);
		setHardness(2.0F);
	}
}
