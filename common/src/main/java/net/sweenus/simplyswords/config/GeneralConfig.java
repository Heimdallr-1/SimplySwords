package net.sweenus.simplyswords.config;

import me.fzzyhmstrs.fzzy_config.config.Config;
import me.fzzyhmstrs.fzzy_config.validation.number.ValidatedFloat;
import net.minecraft.util.Identifier;
import net.sweenus.simplyswords.SimplySwords;

public class GeneralConfig extends Config {

    public GeneralConfig() {
        super(Identifier.of(SimplySwords.MOD_ID, "general"));
    }

    public boolean enableWeaponImpactSounds = true;
    @ValidatedFloat.Restrict(min = 0f, max = 1f)
    public float weaponImpactSoundsVolume = 0.3f;
    public boolean enableWeaponFootfalls = true;
    public boolean enablePassiveParticles = true;
    public boolean enableUniqueGemSockets = true;
    public boolean compatGobberEndWeaponsUnbreakable = true;
    public boolean compatEnableSpellPowerScaling = true;

}