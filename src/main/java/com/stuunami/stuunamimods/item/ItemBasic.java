package com.stuunami.stuunamimods.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.stuunami.stuunamimods.Reference;

public class ItemBasic extends Item {
    public ItemBasic(String unlocalizedName, String registryName, CreativeTabs creativeTab) {
        setUnlocalizedName(Reference.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(creativeTab);
    }
    
    public ItemBasic(String unlocalizedName, String registryName){
        setUnlocalizedName(Reference.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(CreativeTabs.MISC);
    }
}
