package net.sweenus.simplyswords.compat;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.item.Item;
import net.sweenus.simplyswords.config.Config;
import net.sweenus.simplyswords.registry.ItemsRegistry;

public class EldritchEndCompat {

    //Compat for Eldritch End
    static float dreadtide_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.dreadtide_damageModifier.get();
    static float dreadtide_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.dreadtide_attackSpeed.get();

    public static final DeferredRegister<Item> ITEM = ItemsRegistry.ITEM;
/*
    public static final RegistrySupplier<DreadtideSwordItem> DREADTIDE = ITEM.register( "dreadtide", () ->
            new DreadtideSwordItem(EldritchEndCompatMaterial.ABERRATION,
                    (int) (dreadtide_damage_modifier),
                    dreadtide_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()));

    public static void registerModItems() {
        SimplySwords.LOGGER.info("Registering Eldritch End compat Items for " + SimplySwords.MOD_ID);
    }
 */

}