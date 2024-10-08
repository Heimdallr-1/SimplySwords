package net.sweenus.simplyswords.config;

import me.fzzyhmstrs.fzzy_config.config.Config;
import me.fzzyhmstrs.fzzy_config.validation.collection.ValidatedSet;
import me.fzzyhmstrs.fzzy_config.validation.minecraft.ValidatedIdentifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.sweenus.simplyswords.SimplySwords;
import net.sweenus.simplyswords.power.GemPower;
import net.sweenus.simplyswords.registry.GemPowerRegistry;

public class GemPowersConfig extends Config {

	public GemPowersConfig() {
		super(Identifier.of(SimplySwords.MOD_ID, "gem_powers"));
	}

	@SuppressWarnings({"deprecation", "unchecked"})
	public ValidatedSet<Identifier> disabledPowers = ValidatedIdentifier.ofRegistryKey((RegistryKey<Registry<GemPower>>) GemPowerRegistry.REGISTRY.key()).toSet();

}