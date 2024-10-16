package net.sweenus.simplyswords.power.powers;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.sweenus.simplyswords.config.Config;
import net.sweenus.simplyswords.config.ConfigDefaultValues;
import net.sweenus.simplyswords.power.RunefusedGemPower;
import net.sweenus.simplyswords.registry.GemPowerRegistry;
import net.sweenus.simplyswords.registry.SoundRegistry;
import net.sweenus.simplyswords.config.settings.BasicSettings;
import net.sweenus.simplyswords.util.Styles;

import java.util.List;

public class TrailblazePower extends RunefusedGemPower {

	public TrailblazePower(boolean isGreater) {
		super(isGreater);
	}

	@Override
	public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		int hitChance = (int) Config.getFloat("trailblazeChance", "RunicEffects", ConfigDefaultValues.trailblazeChance);
		int duration = (int) Config.getFloat("trailblazeDuration", "RunicEffects", ConfigDefaultValues.trailblazeDuration);

		if (attacker.getRandom().nextInt(100) <= hitChance) {
			attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, duration, this.isGreater() ? 2 : 1), attacker);
			attacker.setOnFireFor(duration / 20f);
			attacker.getWorld().playSoundFromEntity(null, attacker, SoundRegistry.MAGIC_SWORD_SPELL_02.get(),
					attacker.getSoundCategory(), 0.1f, 1.8f);
		}
	}

	@Override
	public void appendTooltip(ItemStack itemStack, Item.TooltipContext tooltipContext, List<Text> tooltip, TooltipType type, boolean isRunic) {
		if (isRunic)
			tooltip.add(Text.translatable("item.simplyswords.trailblazesworditem.tooltip1").setStyle(Styles.RUNIC));
		else
			tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.runefused_power.trailblaze").setStyle(Styles.RUNIC));
		tooltip.add(Text.translatable("item.simplyswords.trailblazesworditem.tooltip2").setStyle(Styles.TEXT));
		tooltip.add(Text.translatable("item.simplyswords.trailblazesworditem.tooltip3").setStyle(Styles.TEXT));
	}

	public static class Settings extends BasicSettings {

		public Settings() {
			super(15, 120, GemPowerRegistry.TRAILBLAZE);
		}
	}
}