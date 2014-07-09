package com.LordofDorknes.letsmodagain.init;

import com.LordofDorknes.letsmodagain.block.BlockFleshHeap;
import com.LordofDorknes.letsmodagain.block.BlockLMA;
import com.LordofDorknes.letsmodagain.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Robert on 6/30/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockLMA fleshHeap = new BlockFleshHeap();


    public static void init(){
        GameRegistry.registerBlock(fleshHeap,"fleshHeap");


    }




}
