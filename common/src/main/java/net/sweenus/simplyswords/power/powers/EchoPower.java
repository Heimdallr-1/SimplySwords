package net.sweenus.simplyswords.power.powers;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.sweenus.simplyswords.power.NetherGemPower;
import net.sweenus.simplyswords.registry.EffectRegistry;
import net.sweenus.simplyswords.util.HelperMethods;
import net.sweenus.simplyswords.util.Styles;

import java.util.List;

public class EchoPower extends NetherGemPower {

	public EchoPower() {
		super(false);
	}

	@Override
	public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		int amp = HelperMethods.isUniqueTwohanded(stack) ? 2 : 0;
		target.addStatusEffect(new StatusEffectInstance(EffectRegistry.getReference(EffectRegistry.ECHO), 20, amp), attacker);
	}

	@Override
	public void appendTooltip(ItemStack itemStack, Item.TooltipContext tooltipContext, List<Text> tooltip, TooltipType type, boolean isRunic) {
		tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.netherfused_power.echo").setStyle(Styles.NETHERFUSED));
		tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.netherfused_power.echo.description").setStyle(Styles.TEXT));
		tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.netherfused_power.echo.description2").setStyle(Styles.TEXT));
		tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.netherfused_power.echo.description3").setStyle(Styles.TEXT));
	}
}