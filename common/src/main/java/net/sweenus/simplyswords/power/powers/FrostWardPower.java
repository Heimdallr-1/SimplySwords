package net.sweenus.simplyswords.power.powers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
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

public class FrostWardPower extends RunefusedGemPower {

	public FrostWardPower() {
		super(false);
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, LivingEntity user, int slot, boolean selected) {
		int frequency = (int) Config.getFloat("frostWardFrequency", "RunicEffects", ConfigDefaultValues.frostWardFrequency);
		int duration = (int) Config.getFloat("frostWardDuration", "RunicEffects", ConfigDefaultValues.frostWardDuration);
		if (user.age % frequency == 0) {
			float sRadius = Config.getFloat("frostWardRadius", "RunicEffects", ConfigDefaultValues.frostWardRadius);
			float vRadius = sRadius / 2f;
			double x = user.getX();
			double y = user.getY();
			double z = user.getZ();
			ServerWorld serverWorld = (ServerWorld) world;
			Box box = new Box(x + sRadius, y + vRadius, z + sRadius, x - sRadius, y - vRadius, z - sRadius);
			for (Entity entity : serverWorld.getOtherEntities(user, box, EntityPredicates.VALID_LIVING_ENTITY)) {

				if (entity instanceof LivingEntity le && HelperMethods.checkFriendlyFire(le, user)) {

					if (le.distanceTo(user) < sRadius) {
						SnowballEntity snowball = new SnowballEntity(EntityType.SNOWBALL, serverWorld);
						snowball.updatePosition(user.getX(), (user.getY() + 1.5), user.getZ());
						snowball.setOwner(user);
						le.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, duration));
						snowball.setVelocity(le.getX() - user.getX(), (le.getY() - user.getY()) - 1, le.getZ() - user.getZ());
						serverWorld.spawnEntity(snowball);
					}
				}
			}
		}
	}

	@Override
	public void appendTooltip(ItemStack itemStack, Item.TooltipContext tooltipContext, List<Text> tooltip, TooltipType type, boolean isRunic) {
		if (isRunic)
			tooltip.add(Text.translatable("item.simplyswords.frostwardsworditem.tooltip1").setStyle(Styles.RUNIC));
		else
			tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.runefused_power.frost_ward").setStyle(Styles.RUNIC));
		tooltip.add(Text.translatable("item.simplyswords.frostwardsworditem.tooltip2").setStyle(Styles.TEXT));
		tooltip.add(Text.translatable("item.simplyswords.frostwardsworditem.tooltip3").setStyle(Styles.TEXT));
	}
}