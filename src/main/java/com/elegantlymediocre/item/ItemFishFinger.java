package com.elegantlymediocre.item;

import com.elegantlymediocre.common.ElegantlyMediocre;

import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

public class ItemFishFinger extends ItemFood{

	
	private String oreName;
	protected String name;
	
	public ItemFishFinger(String Name, String OreName) {
		super(4, 0.6f, false);
		oreName = OreName;
		name = Name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ElegantlyMediocre.creativeTab);
	}
	
	public void registerItemModel() {
		ElegantlyMediocre.proxy.registerItemRenderer(this, 0, name);
	}
	
	public void initOreDict() {
		OreDictionary.registerOre(oreName, this);
	}

}
