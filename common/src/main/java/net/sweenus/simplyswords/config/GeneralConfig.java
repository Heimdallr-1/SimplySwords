package net.sweenus.simplyswords.config;

import dev.architectury.platform.Platform;
import me.fzzyhmstrs.fzzy_config.config.Config;
import me.fzzyhmstrs.fzzy_config.validation.misc.ValidatedBoolean;
import me.fzzyhmstrs.fzzy_config.validation.misc.ValidatedCondition;
import me.fzzyhmstrs.fzzy_config.validation.number.ValidatedFloat;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sweenus.simplyswords.SimplySwords;

import static net.sweenus.simplyswords.SimplySwords.minimumSpellPowerVersion;

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

    public ValidatedCondition<Boolean> compatGobberEndWeaponsUnbreakable = new ValidatedBoolean(true)
            .toCondition(
                    () -> Platform.isModLoaded("gobber2"),
                    Text.translatable("simplyswords.general.compatGobberEndWeaponsUnbreakable.condition"),
                    () -> false
            ).withFailTitle(Text.translatable("simplyswords.general.compatGobberEndWeaponsUnbreakable.failTitle"));

    public ValidatedCondition<Boolean> compatEnableSpellPowerScaling = new ValidatedBoolean(true)
            .toCondition(
                    () -> SimplySwords.passVersionCheck("spell_power", minimumSpellPowerVersion),
                    Text.translatable("simplyswords.general.compatEnableSpellPowerScaling.condition"),
                    () -> false
            ).withFailTitle(Text.translatable("simplyswords.general.compatEnableSpellPowerScaling.failTitle"));

}