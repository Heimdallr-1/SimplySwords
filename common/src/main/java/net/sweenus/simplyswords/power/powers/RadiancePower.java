package net.sweenus.simplyswords.power.powers;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.sweenus.simplyswords.power.NetherGemPower;
import net.sweenus.simplyswords.registry.EffectRegistry;
import net.sweenus.simplyswords.util.Styles;

import java.util.List;

public class RadiancePower extends NetherGemPower {

	public RadiancePower() {
		super(false);
	}

	@Override
	public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		if (target.hasStatusEffect(StatusEffects.WEAKNESS)) {
			attacker.addStatusEffect(new StatusEffectInstance(EffectRegistry.IMMOLATION, 200, 4), attacker);
		}
	}

	@Override
	public void appendTooltip(ItemStack itemStack, Item.TooltipContext tooltipContext, List<Text> tooltip, TooltipType type, boolean isRunic) {
		tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.netherfused_power.radiance").setStyle(Styles.NETHERFUSED));
		tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.netherfused_power.radiance.description").setStyle(Styles.TEXT));
		tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.netherfused_power.radiance.description2").setStyle(Styles.TEXT));
		tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.netherfused_power.radiance.description3").setStyle(Styles.TEXT));
	}
}