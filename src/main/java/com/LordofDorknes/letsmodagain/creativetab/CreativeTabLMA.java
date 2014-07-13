package com.LordofDorknes.letsmodagain.creativetab;

import com.LordofDorknes.letsmodagain.init.ModItems;
import com.LordofDorknes.letsmodagain.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Robert on 7/11/2014.
 */
public class CreativeTabLMA
{
public static final CreativeTabs TAB_LMA = new CreativeTabs(Reference.MOD_ID)
{
    @Override
    public Item getTabIconItem() {
        return ModItems.fleshPile;
    }
@Override
public String getTranslatedTabLabel(){

    return "Let's Mod Again";

}




};





}
