package com.stuunami.stuunamimods.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

import com.stuunami.stuunamimods.Reference;
import com.stuunami.stuunamimods.tileentity.InventoryPanelTileEntity;

public class InventoryPanelBlock extends Block implements ITileEntityProvider {
	
	public static final PropertyDirection FACING = PropertyDirection.create("facing");
	
	public InventoryPanelBlock(String registryName)
	{
        super(Material.ROCK);
        setUnlocalizedName(Reference.MODID + ".InventoryPanel");
        setRegistryName(registryName);
        setCreativeTab(CreativeTabs.MISC);
        setSoundType(SoundType.STONE);
        setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
	}
	
	@Override
	public BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] { FACING });
	}
	
	@Override
	public IBlockState getStateFromMeta( int meta )
	{
	    EnumFacing enumfacing = EnumFacing.getFront(meta);

	    if (enumfacing.getAxis() == EnumFacing.Axis.Y)
	    {
	        enumfacing = EnumFacing.NORTH;
	    }

	    return this.getDefaultState().withProperty(FACING, enumfacing);
	}
	
	@Override
	public int getMetaFromState( IBlockState state )
	{
	    return (( EnumFacing )state.getValue( FACING )).getIndex();
	}
	
	
	@Override
	public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY,
			float hitZ, int meta, EntityLivingBase placer, EnumHand hand) {
		return this.getDefaultState().withProperty(FACING, EnumFacing.getDirectionFromEntityLiving(pos, placer));
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

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new InventoryPanelTileEntity();
	}
}
