package com.elegantlymediocre.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import com.elegantlymediocre.common.ElegantlyMediocre;
import com.elegantlymediocre.item.ModItems;

public class ModTab extends CreativeTabs{

	public ModTab() {
		super(ElegantlyMediocre.MODID);
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.magicDust);
	}

}
