package net.sweenus.simplyswords.power.powers;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.sweenus.simplyswords.config.Config;
import net.sweenus.simplyswords.power.RunefusedGemPower;
import net.sweenus.simplyswords.registry.GemPowerRegistry;
import net.sweenus.simplyswords.registry.SoundRegistry;
import net.sweenus.simplyswords.config.settings.ChanceDurationSettings;
import net.sweenus.simplyswords.util.Styles;

import java.util.List;

public class StoneskinPower extends RunefusedGemPower {

	public StoneskinPower(boolean isGreater) {
		super(isGreater);
	}

	@Override
	public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		int hitChance = Config.gemPowers.stoneskin.chance;
		int duration = Config.gemPowers.stoneskin.duration;

		if (attacker.getRandom().nextInt(100) <= hitChance) {
			attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, duration,  this.isGreater() ? 2 : 1), attacker);
			attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, duration, 0), attacker);
			attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, duration, this.isGreater() ? 1 : 0), attacker);
			attacker.getWorld().playSoundFromEntity(null, attacker, SoundRegistry.ELEMENTAL_SWORD_EARTH_ATTACK_02.get(),
					attacker.getSoundCategory(), 0.3f, this.isGreater() ? 1.1f : 1.3f);
		}
	}

	@Override
	public void appendTooltip(ItemStack itemStack, Item.TooltipContext tooltipContext, List<Text> tooltip, TooltipType type, boolean isRunic) {
		if (isRunic)
			tooltip.add(Text.translatable("item.simplyswords.stoneskinsworditem.tooltip1").setStyle(Styles.RUNIC));
		else
			tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.runefused_power.stoneskin").setStyle(Styles.RUNIC));
		tooltip.add(Text.translatable("item.simplyswords.stoneskinsworditem.tooltip2").setStyle(Styles.TEXT));
		tooltip.add(Text.translatable("item.simplyswords.stoneskinsworditem.tooltip3").setStyle(Styles.TEXT));
	}

	public static class Settings extends ChanceDurationSettings {

		public Settings() {
			super(15, 60, GemPowerRegistry.STONESKIN);
		}
	}
}