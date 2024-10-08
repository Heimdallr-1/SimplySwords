package net.sweenus.simplyswords.power;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class RunicGemPower extends GemPower {

	public RunicGemPower(boolean isGreater) {
		super(isGreater, PowerType.RUNIC);
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand, ItemStack itemStack) { return TypedActionResult.fail(itemStack); }
	@Override
	public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {}
	@Override
	public int getMaxUseTime(ItemStack stack) { return 0; }
	@Override
	public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {}
}