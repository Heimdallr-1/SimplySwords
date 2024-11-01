package net.sweenus.simplyswords.power.powers;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.sweenus.simplyswords.power.NetherGemPower;
import net.sweenus.simplyswords.util.HelperMethods;
import net.sweenus.simplyswords.util.Styles;

import java.util.List;

public class BerserkPower extends NetherGemPower {

	public BerserkPower() {
		super(false);
	}

	@Override
	public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		int amp = HelperMethods.isUniqueTwohanded(stack) ? 4 : 2;
		if (attacker.getArmor() < 10) {
			target.setHealth(target.getHealth() - amp);
			attacker.heal((float) amp / 2);
		}
	}

	@Override
	public void appendTooltip(ItemStack itemStack, Item.TooltipContext tooltipContext, List<Text> tooltip, TooltipType type, boolean isRunic) {
		tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.netherfused_power.berserk").setStyle(Styles.NETHERFUSED));
		tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.netherfused_power.berserk.description").setStyle(Styles.TEXT));
		tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.netherfused_power.berserk.description2").setStyle(Styles.TEXT));
		tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.netherfused_power.berserk.description3").setStyle(Styles.TEXT));
	}
}