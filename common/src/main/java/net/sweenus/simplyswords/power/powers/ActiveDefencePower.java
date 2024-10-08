package net.sweenus.simplyswords.power.powers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.text.Text;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.sweenus.simplyswords.config.Config;
import net.sweenus.simplyswords.config.ConfigDefaultValues;
import net.sweenus.simplyswords.power.RunefusedGemPower;
import net.sweenus.simplyswords.util.HelperMethods;
import net.sweenus.simplyswords.util.Styles;

import java.util.List;

public class ActiveDefencePower extends RunefusedGemPower {

	public ActiveDefencePower() {
		super(false);
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, LivingEntity user, int slot, boolean selected) {
		if (user instanceof PlayerEntity player && player.getInventory().contains(Items.ARROW.getDefaultStack())) {
			int frequency = (int) Config.getFloat("activeDefenceFrequency", "RunicEffects", ConfigDefaultValues.activeDefenceFrequency);
			if (player.age % frequency == 0) {
				int sradius = (int) Config.getFloat("activeDefenceRadius", "RunicEffects", ConfigDefaultValues.activeDefenceRadius);
				int vradius = (int) (Config.getFloat("activeDefenceRadius", "RunicEffects", ConfigDefaultValues.activeDefenceRadius) / 2);
				double x = player.getX();
				double y = player.getY();
				double z = player.getZ();
				Box box = new Box(x + sradius, y + vradius, z + sradius, x - sradius, y - vradius, z - sradius);
				for (Entity entity : world.getOtherEntities(player, box, EntityPredicates.VALID_LIVING_ENTITY)) {

					if (entity instanceof LivingEntity le && HelperMethods.checkFriendlyFire(le, player)) {

						int arrowSlot = player.getInventory().getSlotWithStack(Items.ARROW.getDefaultStack());
						ItemStack arrowStack = player.getInventory().getStack(arrowSlot);
						int randomc = (int) (Math.random() * 100);
						if (randomc < 15) {
							arrowStack.decrement(1);
						}
						ArrowEntity arrow = new ArrowEntity(EntityType.ARROW, world);
						arrow.updatePosition(player.getX(), (player.getY() + 1.5), player.getZ());
						arrow.setOwner(player);
						arrow.setVelocity(le.getX() - player.getX(), (le.getY() - player.getY()) - 1, le.getZ() - player.getZ());
						world.spawnEntity(arrow);
						break;
					}
				}
			}
		}
	}

	@Override
	public void appendTooltip(ItemStack itemStack, Item.TooltipContext tooltipContext, List<Text> tooltip, TooltipType type, boolean isRunic) {
		if (isRunic)
			tooltip.add(Text.translatable("item.simplyswords.activedefencesworditem.tooltip1").setStyle(Styles.RUNIC));
		else
			tooltip.add(Text.translatable("item.simplyswords.uniquesworditem.runefused_power.active_defence").setStyle(Styles.RUNIC));
		tooltip.add(Text.translatable("item.simplyswords.activedefencesworditem.tooltip2").setStyle(Styles.TEXT));
		tooltip.add(Text.translatable("item.simplyswords.activedefencesworditem.tooltip3").setStyle(Styles.TEXT));
	}
}