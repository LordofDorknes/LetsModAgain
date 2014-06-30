package com.LordofDorknes.letsmodagain.configuration;
import java.io.File;
import net.minecraftforge.common.config.Configuration;
/**
 * Created by Robert on 6/30/2014.
 */
public class ConfigurationHandler {
    public static void init(File configFile) {
//                                        Create an object from the contents of a given config file(passed by method)
        Configuration configuration = new Configuration(configFile);

        try {

            //try to load config file
            configuration.load();

            //read in properties in configuration file
            int zombieFleshLeatherEquivalency = configuration.get(Configuration.CATEGORY_GENERAL, "zombieFleshLeatherEquivalency", 1, "How many Leather per zombie flesh").getInt(1);

        } catch (Exception e) {
            //log exception


        } finally {
            configuration.save();           //save the configuration file
        }
    }
}