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
import net.sweenus.simplyswords.registry.SoundRegistry;
import net.sweenus.simplyswords.util.Styles;

import java.util.List;

public class FloatPower extends RunefusedGemPower {

	public FloatPower(boolean isGreater) {
		super(isGreater);
	}

	@Override
	public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		int hitChance = (int) Config.getFloat("floatChance", "RunicEffects", ConfigDefaultValues.floatChance);
		int duration = (int) Config.getFloat("floatDuration", "RunicEffects", ConfigDefaultValues.floatDuration);

		if (attacker.getRandom().nextInt(100) <= hitChance) {
			target.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, duration, this.isGreater() ? 3 : 2), attacker);
			attacker.getWorld().playSoundFromEntity(null, attacker, SoundRegistry.MAGIC_SWORD_SPELL_02.get(),
					attacker.getSoundCategory(), 0.1f, 1.8f);
		}
	}

	@Override
	public void appendTooltip(ItemStack itemStack, Item.TooltipContext tooltipContext, List<Text> tooltip, TooltipType type, boolean isRunic) {
		if (isRunic)
			tooltip.add(Text.translatable("item.simplyswords.levitationsworditem.tooltip1").setStyle(Styles.RUNIC));
		else
			tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.runefused_power.float").setStyle(Styles.RUNIC));
		tooltip.add(Text.translatable("item.simplyswords.levitationsworditem.tooltip2").setStyle(Styles.TEXT));
		tooltip.add(Text.translatable("item.simplyswords.levitationsworditem.tooltip3").setStyle(Styles.TEXT));
	}
}