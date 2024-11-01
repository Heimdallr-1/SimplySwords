package net.sweenus.simplyswords.config;

import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.sweenus.simplyswords.SimplySwords;

@Config(name = SimplySwords.MOD_ID +"_main")
@Config.Gui.Background("cloth-config2:transparent")
public class ConfigWrapper extends PartitioningSerializer.GlobalData {
    @ConfigEntry.Category("weapon_attributes")
    @ConfigEntry.Gui.TransitiveObject
    public WeaponAttributesConfigOld weapon_attributes = new WeaponAttributesConfigOld();
}