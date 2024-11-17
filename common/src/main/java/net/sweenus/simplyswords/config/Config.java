package net.sweenus.simplyswords.config;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public final class Config {

    public static void init() {}

    //////////
    //Loot config is registered internally in LootConfig. There were some load order issues otherwise.
    //////////
    public static final GeneralConfig general = ConfigApiJava.registerAndLoadConfig(GeneralConfig::new);
    public static final GemPowersConfig gemPowers = ConfigApiJava.registerAndLoadConfig(GemPowersConfig::new);
    public static final StatusEffectsConfig statusEffects = ConfigApiJava.registerAndLoadConfig(StatusEffectsConfig::new);
    public static final WeaponAttributesConfig weaponAttribute = ConfigApiJava.registerAndLoadConfig(WeaponAttributesConfig::new);
    public static final UniqueEffectsConfig uniqueEffects = ConfigApiJava.registerAndLoadConfig(UniqueEffectsConfig::new);

//Guide to Config Features

//ValidatedThings
        //Validated[Thing] is a fancy setting. In most cases you won't need it, I've used them sparingly where it had functional benefit
        //Validation are suppliers and consumers.
            // Retrieve the setting with [mySetting].get()
            //update the setting internally (not recommended) with [mySetting].accept(newthing)
        //ValidatedSet/List/Map are also themselves Set/List/Map, so you can call the normal collection methods like get() and containsKey() directly.


//ValidatedCondition
        //ValidatedCondition is a wrapper around a setting that only allows interaction with the setting if a condition is met.
        //in SS case, I've used it to gate mod compat settings behind checks for the mod being loaded.
        //Example below.
            //line1: the setting itself, using a `Validated[Thing] instead of a plain java type
            //line2: wraps the setting in the condition
            //line3: supplies the conditional boolean check
            //line4: tooltip text for when the condition is failing. "Requires Gobber" etc.
            //line5: Fallback value. This supplies the value to get from the setting if the condition fails, regardless of the config choices made underneath.
                //So in this case, it will always return false if gobber isn't loaded.
            //line6: adds a unique Caption to the setting button. Normally "Condition not met", in SS I changed it to "Disabled"
        /*
        public ValidatedCondition<Boolean> compatGobberEndWeaponsUnbreakable = new ValidatedBoolean(true)
            .toCondition(
                    () -> Platform.isModLoaded("gobber2"),
                    Text.translatable("simplyswords.general.compatGobberEndWeaponsUnbreakable.condition"),
                    () -> false
            ).withFailTitle(Text.translatable("simplyswords.general.compatGobberEndWeaponsUnbreakable.failTitle"));
        */

//@Validated[Number].Restrict
        //Works basically like the Cloth version of this annotation. Just make sure the [Number] type matches the actual number being restricted.

//Disabled Things
        //With fzzy config, I decided to make sets of disabled things, rather than a collection of booleans for everything being enabled
        //if a things id is in the set, it's disabled
        //Example
            // ValidatedSet<Identifier> disabledPowers = ValidatedIdentifier.ofRegistryKey(GemPowerRegistry.REGISTRY.key()).toSet();
        //To see if a thing is enabled, I check that it's id isn't in the set
            // !Config.gemPowers.disabledPowers.contains(entry.getId()));

//Translation
        //For repeated basic effects on gem powers like cooldown, duration, etc. I made common translation keys.
        //These are referenced using the @Translation annotation
        //Example
            // @Translation(prefix = "simplyswords.config.basic_settings")
        //the entire key will be "simplyswords.config.basic_settings.[fieldName]"
        //Example
            //"simplyswords.config.basic_settings.cooldown"

}