package com.stuunami.stuunamimods.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.stuunami.stuunamimods.Reference;
 
public class BlockBasic extends Block {
 
    public BlockBasic(Material material, String unlocalizedName, String registryName) {
        this(material, SoundType.STONE, unlocalizedName, registryName);
    }
    
    public BlockBasic(Material material, SoundType sound, String unlocalizedName, String registryName, CreativeTabs creativeTab) {
        super(material);
        setUnlocalizedName(Reference.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(creativeTab);
        setSoundType(sound);
    }
 
    public BlockBasic(Material material, SoundType sound, String unlocalizedName, String registryName) {
        super(material);
        setUnlocalizedName(Reference.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(CreativeTabs.MISC);
        setSoundType(sound);
    }
 
}
