package com.elegantlymediocre.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockArmored extends BlockBase {

	public BlockArmored(String name) {
		super(Material.ROCK, name);
	
		setHardness(4f);
		setResistance(6f);
	}
	
	@Override
	public BlockArmored setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}