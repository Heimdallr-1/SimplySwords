package net.sweenus.simplyswords.power.powers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.sweenus.simplyswords.config.Config;
import net.sweenus.simplyswords.config.ConfigDefaultValues;
import net.sweenus.simplyswords.power.RunefusedGemPower;
import net.sweenus.simplyswords.util.HelperMethods;
import net.sweenus.simplyswords.util.Styles;

import java.util.List;

public class UnstablePower extends RunefusedGemPower {

	public UnstablePower() {
		super(false);
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, LivingEntity user, int slot, boolean selected) {
		int duration = (int) Config.getFloat("unstableDuration", "RunicEffects", ConfigDefaultValues.unstableDuration);
		int frequency = (int) Config.getFloat("unstableFrequency", "RunicEffects", ConfigDefaultValues.unstableFrequency);
		if (user.age % frequency == 0) {
			int random = (int) (Math.random() * 100);
			if (random < 10)
				user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, duration));
			else if (random < 20)
				user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, duration));
			else if (random < 30)
				user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, duration));
			else if (random < 40)
				user.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, duration));
			else if (random < 50)
				user.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, duration));
			else if (random < 60)
				user.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, duration));
			else if (random < 70)
				user.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, duration));
			else if (random < 80)
				user.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, duration));
			else if (random < 90)
				user.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, duration));
			else if (random < 95)
				user.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, duration));
			else if (random < 100)
				user.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, duration));
		}
	}

	@Override
	public void appendTooltip(ItemStack itemStack, Item.TooltipContext tooltipContext, List<Text> tooltip, TooltipType type, boolean isRunic) {
		if (isRunic)
			tooltip.add(Text.translatable("item.simplyswords.unstablesworditem.tooltip1").setStyle(Styles.RUNIC));
		else
			tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.runefused_power.unstable").setStyle(Styles.RUNIC));
		tooltip.add(Text.translatable("item.simplyswords.unstablesworditem.tooltip2").setStyle(Styles.TEXT));
		tooltip.add(Text.translatable("item.simplyswords.unstablesworditem.tooltip3").setStyle(Styles.TEXT));
	}
}