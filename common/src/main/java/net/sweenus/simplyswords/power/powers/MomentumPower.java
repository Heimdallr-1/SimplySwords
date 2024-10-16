package net.sweenus.simplyswords.power.powers;

import me.fzzyhmstrs.fzzy_config.annotations.Translation;
import me.fzzyhmstrs.fzzy_config.util.Walkable;
import me.fzzyhmstrs.fzzy_config.validation.number.ValidatedDouble;
import me.fzzyhmstrs.fzzy_config.validation.number.ValidatedInt;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.sweenus.simplyswords.config.Config;
import net.sweenus.simplyswords.config.ConfigDefaultValues;
import net.sweenus.simplyswords.config.settings.TooltipSettings;
import net.sweenus.simplyswords.power.RunefusedGemPower;
import net.sweenus.simplyswords.power.RunicGemPower;
import net.sweenus.simplyswords.registry.GemPowerRegistry;
import net.sweenus.simplyswords.registry.SoundRegistry;
import net.sweenus.simplyswords.util.Styles;

import java.util.List;

public class MomentumPower extends RunicGemPower {

	public MomentumPower(boolean isGreater) {
		super(isGreater);
	}

	@Override
	public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {
		int skillCooldown = Config.gemPowers.momentum.cooldown;

		if (user.getEquippedStack(EquipmentSlot.MAINHAND) == stack && user.isOnGround()) {
			//Player dash forward
			if (remainingUseTicks == (this.isGreater() ? 10 : 12) || remainingUseTicks == 13 && user.getEquippedStack(EquipmentSlot.MAINHAND) == stack) {
				user.setVelocity(user.getRotationVector().multiply(+3));
				user.setVelocity(user.getVelocity().x, 0, user.getVelocity().z); // Prevent player flying to the heavens
				user.velocityModified = true;
				if (user instanceof PlayerEntity player) {
					player.getItemCooldownManager().set(stack.getItem(), skillCooldown);
				}
			}
		}
	}

	@Override
	public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
		if (user.getEquippedStack(EquipmentSlot.MAINHAND) == stack) {
			user.setVelocity(0, 0, 0); // Stop player at end of charge
			user.velocityModified = true;
		}
	}

	@Override
	public int getMaxUseTime(ItemStack stack) {
		return 15;
	}

	@Override
	public void appendTooltip(ItemStack itemStack, Item.TooltipContext tooltipContext, List<Text> tooltip, TooltipType type, boolean isRunic) {
		tooltip.add(Text.translatable("item.simplyswords.momentumsworditem.tooltip1").setStyle(Styles.RUNIC));
		tooltip.add(Text.translatable("item.simplyswords.momentumsworditem.tooltip2").setStyle(Styles.TEXT));
		tooltip.add(Text.translatable("item.simplyswords.momentumsworditem.tooltip3").setStyle(Styles.TEXT));
	}

	public static class Settings extends TooltipSettings {

		public Settings() {
			super(GemPowerRegistry.MOMENTUM);
		}

		@Translation(prefix = "simplyswords.config.basic_settings")
		@ValidatedInt.Restrict(min = 1)
		public int cooldown = 140;
	}
}