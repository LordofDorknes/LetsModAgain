package com.LordofDorknes.letsmodagain.block;

import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
/**
 * Created by Robert on 7/8/2014.
 */
public class BlockFleshHeap extends BlockLMA {

    public BlockFleshHeap() {
        super(Material.clay);//eww
        this.setBlockName("fleshHeap");
        this.setStepSound(soundTypeSnow);
        this.setHardness(0.5F);
        this.setHarvestLevel("sword",0);

    }



}
