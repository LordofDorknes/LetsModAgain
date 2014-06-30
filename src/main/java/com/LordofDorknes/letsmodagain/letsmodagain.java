package com.LordofDorknes.letsmodagain;
import com.LordofDorknes.letsmodagain.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Robert on 6/29/2014.
 */
@Mod(modid="letsmodagain", name="Lets Mod Again", version = "1.7.10-1.0")
public class letsmodagain {
@Mod.Instance("letsmodagain")
public static letsmodagain instance;

   @SidedProxy(clientSide ="com.LordofDorknes.letsmodagain.proxy.ClientProxy",serverSide ="com.LordofDorknes.letsmodagain.proxy.ServerProxy")
   public static IProxy proxy;


@Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

};
   @Mod.EventHandler
   public void init(FMLInitializationEvent event){


   }

@Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

};

}
