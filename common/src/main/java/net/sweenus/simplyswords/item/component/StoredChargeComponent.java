package net.sweenus.simplyswords.item.component;

import com.mojang.serialization.Codec;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;

public record StoredChargeComponent(int charge) {

	public StoredChargeComponent add(int addedCharge) {
		return new StoredChargeComponent(this.charge + addedCharge);
	}

	public StoredChargeComponent set(int newCharge) {
		return new StoredChargeComponent(newCharge);
	}

	public static StoredChargeComponent DEFAULT = new StoredChargeComponent(0);

	public static Codec<StoredChargeComponent> CODEC = Codec.INT.xmap(StoredChargeComponent::new, StoredChargeComponent::charge);

	public static PacketCodec<RegistryByteBuf, StoredChargeComponent> PACKET_CODEC = PacketCodecs.INTEGER.xmap(StoredChargeComponent::new, StoredChargeComponent::charge).cast();

}