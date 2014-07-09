package com.LordofDorknes.letsmodagain.init;
import com.LordofDorknes.letsmodagain.item.ItemFleshPile;
import cpw.mods.fml.common.registry.GameRegistry;
import com.LordofDorknes.letsmodagain.reference.Reference;
import com.LordofDorknes.letsmodagain.item.ItemLMA;
import com.LordofDorknes.letsmodagain.reference.Names;
import com.LordofDorknes.letsmodagain.utility.*;


/**
 * Created by Robert on 6/30/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
//Initialize items: public static final ItemLMA someItem = new ItemSomeItem(); (someItem=codename,ItemSomeItem=class of item
public static final ItemLMA fleshPile = new ItemFleshPile();











    public static void init()
    {
        //GameRegistry.registerItem(someItem, Names.Items.SOME_ITEM);
        GameRegistry.registerItem(fleshPile,Names.Items.FLESH_PILE);
        //LogHelper.info("Flesh Pile Registered"); //this was a test when I screwed up earlier
    }















}
