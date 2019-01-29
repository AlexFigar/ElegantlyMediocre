package com.elegantlymediocre.item;

import com.elegantlymediocre.common.ElegantlyMediocre;

import net.minecraftforge.oredict.OreDictionary;

public class ItemOre extends ItemBase {

	private String oreName;

	public ItemOre(String name, String oreName) {
		super(name);
	
		this.oreName = oreName;
		this.setCreativeTab(ElegantlyMediocre.creativeTab);
	}
	
	public void initOreDict() {
		OreDictionary.registerOre(oreName, this);
	}

}