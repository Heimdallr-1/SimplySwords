package net.sweenus.simplyswords.config;

import me.fzzyhmstrs.fzzy_config.config.Config;
import me.fzzyhmstrs.fzzy_config.config.ConfigSection;
import me.fzzyhmstrs.fzzy_config.validation.collection.ValidatedSet;
import me.fzzyhmstrs.fzzy_config.validation.minecraft.ValidatedIdentifier;
import me.fzzyhmstrs.fzzy_config.validation.number.ValidatedInt;
import net.minecraft.util.Identifier;
import net.sweenus.simplyswords.SimplySwords;
import net.sweenus.simplyswords.power.powers.ActiveDefencePower;
import net.sweenus.simplyswords.power.powers.FloatPower;
import net.sweenus.simplyswords.power.powers.FreezePower;
import net.sweenus.simplyswords.power.powers.FrostWardPower;
import net.sweenus.simplyswords.power.powers.ImbuedPower;
import net.sweenus.simplyswords.power.powers.MomentumPower;
import net.sweenus.simplyswords.power.powers.ShieldingPower;
import net.sweenus.simplyswords.power.powers.SlowPower;
import net.sweenus.simplyswords.power.powers.StoneskinPower;
import net.sweenus.simplyswords.power.powers.SwiftnessPower;
import net.sweenus.simplyswords.power.powers.TrailblazePower;
import net.sweenus.simplyswords.power.powers.UnstablePower;
import net.sweenus.simplyswords.power.powers.WeakenPower;
import net.sweenus.simplyswords.power.powers.WildfirePower;
import net.sweenus.simplyswords.power.powers.ZephyrPower;
import net.sweenus.simplyswords.registry.GemPowerRegistry;

public class GemPowersConfig extends Config {

	public GemPowersConfig() {
		super(Identifier.of(SimplySwords.MOD_ID, "gem_powers"));
	}

	@SuppressWarnings("deprecation")
	public ValidatedSet<Identifier> disabledPowers = ValidatedIdentifier.ofRegistryKey(GemPowerRegistry.REGISTRY.key()).toSet();

	public ActiveDefencePower.Settings activeDefence = new ActiveDefencePower.Settings();
	public FloatPower.Settings         floating = new FloatPower.Settings();
	public FreezePower.Settings        freeze = new FreezePower.Settings();
	public FrostWardPower.Settings     frostWard = new FrostWardPower.Settings();
	public ImbuedPower.Settings        imbued = new ImbuedPower.Settings();
	public MomentumPower.Settings      momentum = new MomentumPower.Settings();
	public ShieldingPower.Settings     shielding = new ShieldingPower.Settings();
	public SlowPower.Settings          slow = new SlowPower.Settings();
	public StoneskinPower.Settings     stoneskin = new StoneskinPower.Settings();
	public SwiftnessPower.Settings     swiftness = new SwiftnessPower.Settings();
	public TrailblazePower.Settings    trailblaze = new TrailblazePower.Settings();
	public UnstablePower.Settings      unstable = new UnstablePower.Settings();
	public WeakenPower.Settings        weaken = new WeakenPower.Settings();
	public WildfirePower.Settings      wildfire = new WildfirePower.Settings();
	public ZephyrPower.Settings        zephyr = new ZephyrPower.Settings();

	public SimplySkills simplySkills = new SimplySkills();

	public static class SimplySkills extends ConfigSection {

		@ValidatedInt.Restrict(min = 0, max = 100)
		public int preciseChance = 30;

		@ValidatedInt.Restrict(min = 0, max = 100)
		public int mightyChance = 30;

		@ValidatedInt.Restrict(min = 0, max = 100)
		public int stealthyChance = 30;

		@ValidatedInt.Restrict(min = 0, max = 100)
		public int renewedChance = 30;

		@ValidatedInt.Restrict(min = 0, max = 100)
		public int leapingChance = 65;

		@ValidatedInt.Restrict(min = 0, max = 100)
		public int spellshieldChance = 15;
	}

}