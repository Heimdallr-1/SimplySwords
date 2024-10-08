package net.sweenus.simplyswords.power;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.entry.RegistryFixedCodec;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.sweenus.simplyswords.registry.GemPowerRegistry;

import java.util.List;

public record GemPowerComponent(boolean hasRunicPower, boolean hasNetherPower, RegistryEntry<GemPower> runicPower, RegistryEntry<GemPower> netherPower) {

	public static final Codec<GemPowerComponent> CODEC = RecordCodecBuilder.create(instance ->
				instance.group(
						Codec.BOOL.fieldOf("has_runic_power").forGetter(GemPowerComponent::hasRunicPower),
						Codec.BOOL.fieldOf("has_nether_power").forGetter(GemPowerComponent::hasNetherPower),
						RegistryFixedCodec.of(GemPowerRegistry.REGISTRY.key()).fieldOf("runic_power").forGetter(GemPowerComponent::runicPower),
						RegistryFixedCodec.of(GemPowerRegistry.REGISTRY.key()).fieldOf("nether_power").forGetter(GemPowerComponent::netherPower)
				).apply(instance, GemPowerComponent::new)
			);

	public static final PacketCodec<RegistryByteBuf, GemPowerComponent> PACKET_CODEC = PacketCodec.tuple(
			PacketCodecs.BOOL,
			GemPowerComponent::hasRunicPower,
			PacketCodecs.BOOL,
			GemPowerComponent::hasNetherPower,
			PacketCodecs.registryEntry(GemPowerRegistry.REGISTRY.key()),
			GemPowerComponent::runicPower,
			PacketCodecs.registryEntry(GemPowerRegistry.REGISTRY.key()),
			GemPowerComponent::netherPower,
			GemPowerComponent::new
	);

	void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		runicPower.value().postHit(stack, target, attacker);
		netherPower.value().postHit(stack, target, attacker);
	}

	TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		ItemStack itemStack = user.getStackInHand(hand);
		TypedActionResult<ItemStack> result1 = runicPower.value().use(world, user, hand, itemStack);
		TypedActionResult<ItemStack> result2 = netherPower.value().use(world, user, hand, itemStack);
		if (result1.getResult().compareTo(result2.getResult()) < 0) {
			return result1;
		} else {
			return result2;
		}
	}

	void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {
		runicPower.value().usageTick(world, user, stack, remainingUseTicks);
		netherPower.value().usageTick(world, user, stack, remainingUseTicks);
	}

	void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
		runicPower.value().onStoppedUsing(stack, world, user, remainingUseTicks);
		netherPower.value().onStoppedUsing(stack, world, user, remainingUseTicks);
	}

	void inventoryTick(ItemStack stack, World world, LivingEntity user, int slot, boolean selected) {
		if (!world.isClient) {
			runicPower.value().inventoryTick(stack, world, user, slot, selected);
			netherPower.value().inventoryTick(stack, world, user, slot, selected);
		}
	}

	void appendTooltip(ItemStack itemStack, Item.TooltipContext tooltipContext, List<Text> tooltip, TooltipType type) {
		appendTooltip(itemStack, tooltipContext, tooltip, type, false);
	}

	void appendTooltip(ItemStack itemStack, Item.TooltipContext tooltipContext, List<Text> tooltip, TooltipType type, boolean isRunic) {
		if (hasRunicPower) {
			runicPower.value().appendTooltip(itemStack, tooltipContext, tooltip, type, isRunic);
			if (hasNetherPower) {
				tooltip.add(Text.literal(""));
			}
		}
		if (hasNetherPower) {
			netherPower.value().appendTooltip(itemStack, tooltipContext, tooltip, type, isRunic);
		}
	}
}