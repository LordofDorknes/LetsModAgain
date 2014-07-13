package com.LordofDorknes.letsmodagain.item;
import com.LordofDorknes.letsmodagain.creativetab.CreativeTabLMA;
import com.LordofDorknes.letsmodagain.reference.Textures;
import com.LordofDorknes.letsmodagain.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import com.LordofDorknes.letsmodagain.reference.Names;
import net.minecraft.item.ItemStack;

/**
 * Created by Robert on 7/3/2014.
 */
public class ItemLMA extends Item {

    public ItemLMA(){
    super();
        this.setCreativeTab(CreativeTabLMA.TAB_LMA);
        //setTextureName(Reference.MOD_ID + ":" +this.getClass().getSimpleName()); // would this change for each item to "MOD_ID:WhateverItemClass?" or will it give ItemLMA?
        //this.setUnlocalizedName("Unnamed LMA Item"); //this would appear to overwrite any name given by an item extending this and make it unable to be found by forge
    }
    @Override
    public String getUnlocalizedName(){

        return String.format("item.%s%s",Textures.RESOURCE_PREFIX,getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }
    @Override
    public String getUnlocalizedName(ItemStack itemStack){

        return String.format("item.%s%s",Textures.RESOURCE_PREFIX,getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }




    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}





