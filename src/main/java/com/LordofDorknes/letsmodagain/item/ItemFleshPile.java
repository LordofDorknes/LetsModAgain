package com.LordofDorknes.letsmodagain.item;

import com.LordofDorknes.letsmodagain.reference.Names;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Robert on 6/30/2014.
 */
public class ItemFleshPile extends ItemLMA {//this is for use later

    public ItemFleshPile(){
    super();// I have no idea what I am doing
    this.setUnlocalizedName(Names.Items.FLESH_PILE);
    this.setCreativeTab(CreativeTabs.tabMaterials);
    }
//will have configurable number of rotten flesh in recipe and be smeltable into leather

}
