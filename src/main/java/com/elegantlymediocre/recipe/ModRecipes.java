package com.elegantlymediocre.recipe;

import com.elegantlymediocre.item.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModItems.magicDust, new ItemStack(ModItems.arcaneEssence), 1.5f);
		GameRegistry.addSmelting(ModItems.rawFishFinger, new ItemStack(ModItems.fishFinger), 2.0f);
		GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER), 1.0f);

		
	}

}