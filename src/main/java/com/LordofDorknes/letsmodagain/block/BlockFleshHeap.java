package com.LordofDorknes.letsmodagain.block;

import com.LordofDorknes.letsmodagain.creativetab.CreativeTabLMA;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
/**
 * Created by Robert on 7/8/2014.
 */
public class BlockFleshHeap extends BlockLMA {

    public BlockFleshHeap() {
        super(Material.clay);//eww
        this.setBlockName("fleshHeap");
        this.setStepSound(soundTypeSnow);//need to figure out how to add a "meatier" custom sound
        this.setHardness(0.5F);
        this.setHarvestLevel("sword",0);
        this.setCreativeTab(CreativeTabLMA.TAB_LMA);
    }
        //this block needs a texture that tiles much better


}
