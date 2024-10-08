package net.sweenus.simplyswords.power;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class RunefusedGemPower extends GemPower {

	public RunefusedGemPower(boolean isGreater) {
		//runefused gems also work in runic weapons
		super(isGreater, PowerType.RUNIC, PowerType.RUNEFUSED);
	}
}