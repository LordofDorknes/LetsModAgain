package com.LordofDorknes.letsmodagain;
import com.LordofDorknes.letsmodagain.configuration.ConfigurationHandler;
import com.LordofDorknes.letsmodagain.item.ItemFleshPile;
import com.LordofDorknes.letsmodagain.reference.Reference;
import com.LordofDorknes.letsmodagain.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Robert on 6/29/2014.
 */
//                                         Here is a Mod, there are many like it, but here are some of its parameters.
@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version = Reference.VERSION)
public class letsmodagain {
    //                                                                          Instantiate the mod plz
    @Mod.Instance(Reference.MOD_ID)
    public static letsmodagain instance;
//                                                                              Set up Client and Server Proxies
    @SidedProxy(clientSide =Reference.CLIENT_PROXY_CLASS,serverSide =Reference.SERVER_PROXY_CLASS)
     public static IProxy proxy;

//                                                                       Set up some stuff to do with the event handler
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)//              Before going any further, what do I need to do?
    {
    ConfigurationHandler.init(event.getSuggestedConfigurationFile());// You need to load the config!


    };

   @Mod.EventHandler
   public void init(FMLInitializationEvent event)//                     Okay, Time to initiate. What do I need to do?
   {


   }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)//        Okay, what do I need to do last before being ready?
    {


    };

}//                                                                 kthxbye

//                                                                  Sorry.
