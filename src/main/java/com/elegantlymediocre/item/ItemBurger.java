package com.elegantlymediocre.item;

import com.elegantlymediocre.common.ElegantlyMediocre;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

public class ItemBurger extends ItemFood{

	
	private String oreName;
	protected String Name;
	
	public ItemBurger(String name, String OreName) {
		super(12, 2.4f, false);
		Name = name;
		oreName = OreName;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ElegantlyMediocre.creativeTab);
	}
	
	public void registerItemModel() {
		ElegantlyMediocre.proxy.registerItemRenderer(this, 0, Name);
	}
	
	public void initOreDict() {
		OreDictionary.registerOre(oreName, this);
	}

}
