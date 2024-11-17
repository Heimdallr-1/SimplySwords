package net.sweenus.simplyswords.power;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipAppender;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * A Runic, Nether, or other type of gem power
 * <p>
 * For the pre-existing gem types, it's best to use the subclasses made for that purpose
 * @see RunicGemPower
 * @see RunefusedGemPower
 * @see NetherGemPower
 */
public class GemPower implements TooltipAppender {

	public GemPower(boolean isGreater, PowerType... applicableTypes) {
		this.isGreater = isGreater;
		this.applicableTypes = Arrays.stream(applicableTypes).toList();
	}

	private final boolean isGreater;
	private final List<PowerType> applicableTypes;

	public boolean isGreater() { return isGreater; }
	public List<PowerType> applicableTypes() { return applicableTypes; }

	@Override
	public void appendTooltip(Item.TooltipContext context, Consumer<Text> tooltip, TooltipType type) {
		List<Text> list = new ArrayList<>();
		appendTooltip(ItemStack.EMPTY, context, list, type, false);
		for (Text text : list) {
			tooltip.accept(text);
		}
	}

	public void appendTooltip(ItemStack itemStack, Item.TooltipContext tooltipContext, List<Text> tooltip, TooltipType type, boolean isRunic) {}
	public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {}
	public void inventoryTick(ItemStack stack, World world, LivingEntity user, int slot, boolean selected) {}

	TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand, ItemStack itemStack) { return TypedActionResult.fail(itemStack); }
	void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {}
	void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {}
	int getMaxUseTime(ItemStack stack) { return 0; }

	public boolean isEmpty() { return false; }

	//////////////////////////////

	public static GemPower EMPTY = new EmptyGemPower();

	private static class EmptyGemPower extends GemPower {

		public EmptyGemPower() {
			super(false);
		}

		@Override
		public boolean isEmpty() {
			return true;
		}
	}
}