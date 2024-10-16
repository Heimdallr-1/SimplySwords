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
import net.sweenus.simplyswords.registry.EffectRegistry;
import net.sweenus.simplyswords.registry.GemPowerRegistry;
import net.sweenus.simplyswords.registry.SoundRegistry;
import net.sweenus.simplyswords.config.settings.BasicSettings;
import net.sweenus.simplyswords.util.Styles;

import java.util.List;

public class FreezePower extends RunefusedGemPower {

	public FreezePower() {
		super(false);
	}

	@Override
	public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		int hitChance = Config.gemPowers.freeze.chance;
		int freezeDuration = Config.gemPowers.freeze.duration;
		int duration = freezeDuration * 3;

		target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, duration, 1), attacker);

		if (attacker.getRandom().nextInt(100) <= hitChance) {
			target.addStatusEffect(new StatusEffectInstance(EffectRegistry.FREEZE, freezeDuration, 1), attacker);
			attacker.getWorld().playSoundFromEntity(null, attacker, SoundRegistry.MAGIC_SWORD_SPELL_02.get(),
					attacker.getSoundCategory(), 0.1f, 1.8f);
		}
	}

	@Override
	public void appendTooltip(ItemStack itemStack, Item.TooltipContext tooltipContext, List<Text> tooltip, TooltipType type, boolean isRunic) {
		if (isRunic)
			tooltip.add(Text.translatable("item.simplyswords.freezesworditem.tooltip1").setStyle(Styles.RUNIC));
		else
			tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.runefused_power.freeze").setStyle(Styles.RUNIC));

		tooltip.add(Text.translatable("item.simplyswords.freezesworditem.tooltip2").setStyle(Styles.TEXT));
	}

	public static class Settings extends BasicSettings {

		public Settings() {
			super(15, 120, GemPowerRegistry.FREEZE);
		}
	}
}