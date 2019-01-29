package com.elegantlymediocre.item;

import com.elegantlymediocre.common.ElegantlyMediocre;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

	public static ItemOre magicDust = new ItemOre("magic_dust", "magicDust");
	public static ItemOre arcaneEssence = new ItemOre("arcane_essence", "arcaneEssence");
	public static ItemOre arcaneCore = new ItemOre("arcane_core", "arcaneCore");
	public static ItemOre eyeIntoTheAether = new ItemOre("eye_into_the_aether", "eyeIntoTheAether");
	public static ItemOre rawFishFinger = new ItemOre("raw_fish_finger", "rawFishFinger");
	
	public static modSceptre aetherSceptre = new modSceptre(ElegantlyMediocre.amaterial, "aether_sceptre");
	public static modSword crimsonBlade = new modSword(ElegantlyMediocre.ematerial, "crimson_blade");
	
	public static ItemBurger barramundiBurger = new ItemBurger("barramundi_burger", "barramundiBurger");
	public static ItemFishFinger fishFinger = new ItemFishFinger("fish_finger", "fishFinger");
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				magicDust,
				arcaneEssence,
				arcaneCore,
				eyeIntoTheAether,
				rawFishFinger,
				aetherSceptre,
				crimsonBlade,
				barramundiBurger,
				fishFinger
		);
	}
	
	public static void registerModels() {
		magicDust.registerItemModel();
		arcaneEssence.registerItemModel();
		arcaneCore.registerItemModel();
		eyeIntoTheAether.registerItemModel();
		rawFishFinger.registerItemModel();
		aetherSceptre.registerItemModel();
		crimsonBlade.registerItemModel();
		barramundiBurger.registerItemModel();
		fishFinger.registerItemModel();
		}
}