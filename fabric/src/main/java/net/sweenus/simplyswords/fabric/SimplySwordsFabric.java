package net.sweenus.simplyswords.fabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.sweenus.simplyswords.SimplySwords;

public class SimplySwordsFabric implements ModInitializer {
    @Override
    public void onInitialize() {


        SimplySwords.init();

        //Quilt makes the load order wierd - gobbercompat item registry needs to be injected to prevent crash
        if (FabricLoader.getInstance().isModLoaded("quilt_loader") && FabricLoader.getInstance().isModLoaded("gobber2")
                && FabricLoader.getInstance().isModLoaded("mythicmetals")) {
            System.out.println("SimplySwords: Detected Quilt Loader. Mythic Metals and Gobber compatibility fix is being applied.");
            //GobberCompat.registerModItems(); 1.21
            /* 1.21 temp
            MythicMetalsCompat.registerModItems();

             */
        }
        else {
            if (FabricLoader.getInstance().isModLoaded("gobber2")) {
                //GobberCompat.registerModItems(); 1.21
            }
            if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
                /* 1.21 temp
                MythicMetalsCompat.registerModItems();

                 */
            }
        }
    }

}
