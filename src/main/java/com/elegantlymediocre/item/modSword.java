package com.elegantlymediocre.item;

import com.elegantlymediocre.common.ElegantlyMediocre;

import net.minecraft.item.Item;

public class modSword extends net.minecraft.item.ItemSword{

	private String name;

	public modSword(ToolMaterial material, String name) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		this.setCreativeTab(ElegantlyMediocre.creativeTab);

	}
	
	public void registerItemModel() {
		ElegantlyMediocre.proxy.registerItemRenderer(this, 0, name);	
	}
}