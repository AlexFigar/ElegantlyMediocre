package com.elegantlymediocre.item;

import com.elegantlymediocre.common.ElegantlyMediocre;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import scala.Console;
import scala.collection.concurrent.Debug;

public class modSceptre extends net.minecraft.item.Item{

	private String name;

	public modSceptre(ToolMaterial material, String name) {
		//super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		this.setCreativeTab(ElegantlyMediocre.creativeTab);
	}
	
	public void registerItemModel() {
		ElegantlyMediocre.proxy.registerItemRenderer(this, 0, name);	
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		if(!worldIn.isRemote){
			RayTraceResult pos = playerIn.rayTrace(100, 20);
			double x = pos.getBlockPos().getX();
			double y = pos.getBlockPos().getY();
			double z = pos.getBlockPos().getZ();
			
			worldIn.addWeatherEffect(new EntityLightningBolt(worldIn, x, y, z, false));
			
			return new ActionResult(EnumActionResult.SUCCESS, new ItemStack(this));
			
		}else{
		    return new ActionResult(EnumActionResult.FAIL, new ItemStack(this));
		}

	}
	
}