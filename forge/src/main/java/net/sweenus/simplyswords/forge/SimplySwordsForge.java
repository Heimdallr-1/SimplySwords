package net.sweenus.simplyswords.forge;


import net.neoforged.fml.common.Mod;
import net.sweenus.simplyswords.SimplySwords;

@Mod(SimplySwords.MOD_ID)
public class SimplySwordsForge {
    public SimplySwordsForge() {
        /*// Submit our event bus to let architectury register our content on the right time -
        EventBuses.registerModEventBus(SimplySwords.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        SimplySwords.init();
        //MinecraftForge.EVENT_BUS.register(new SimplySwordsClientEvents());

        ModLoadingContext.get().registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class, () -> {
            return new ConfigScreenHandler.ConfigScreenFactory((minecraft, screen) -> {
                return AutoConfig.getConfigScreen(ConfigWrapper.class, screen).get();
            });
        });

        if (ModList.get().isLoaded("gobber2")) {
            GobberCompat.registerModItems();
            GobberCompat.GOBBER_ITEM.register(FMLJavaModLoadingContext.get().getModEventBus());
        }*/

    }
}