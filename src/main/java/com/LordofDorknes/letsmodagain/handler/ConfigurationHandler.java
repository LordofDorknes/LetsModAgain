package com.LordofDorknes.letsmodagain.handler;
import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import com.LordofDorknes.letsmodagain.reference.Reference;
/**
 * Created by Robert on 6/30/2014.
 */
public class ConfigurationHandler {


    public static Configuration configuration;
    public static boolean testValue = false;


    public static void init(File configFile) {
//
        if(configuration == null) {
            configuration = new Configuration(configFile);
        }



    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event ){
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID)){
        //resync configs
        loadConfiguration();

        }

    }

public void loadConfiguration(){
testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false,"Example Config Value Thing");

if(configuration.hasChanged()) {
    configuration.save();


}
}

}



