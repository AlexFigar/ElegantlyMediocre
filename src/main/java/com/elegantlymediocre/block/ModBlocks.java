package com.elegantlymediocre.block;

import com.elegantlymediocre.common.ElegantlyMediocre;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static BlockArmored armoredBlock = new BlockArmored("armored_block").setCreativeTab(ElegantlyMediocre.creativeTab);
	

	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll( 
				armoredBlock
				);
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				armoredBlock.createItemBlock()
				);
	}

	public static void registerModels() {
		armoredBlock.registerItemModel(Item.getItemFromBlock(armoredBlock));

	}

}