package com.stuunami.stuunamimods.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nonnull;

import com.stuunami.stuunamimods.Reference;

public class InventoryPanelBlock extends Block {
	
	public InventoryPanelBlock(String registryName)
	{
        super(Material.ROCK);
        setUnlocalizedName(Reference.MODID + ".InventoryPanel");
        setRegistryName(registryName);
        setCreativeTab(CreativeTabs.MISC);
        setSoundType(SoundType.STONE);
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	 @Override
	  public boolean isOpaqueCube(@Nonnull IBlockState bs) {
	    return false;
	 }
	
	  @Override
	  public boolean isBlockNormalCube(@Nonnull IBlockState bs) {
	    return false;
	  }
	  
}
