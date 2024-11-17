package net.sweenus.simplyswords.item.component;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Uuids;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public record TargetedLocationComponent(UUID uuid, double lastX, double lastY, double lastZ) {

	public TargetedLocationComponent(double lastX, double lastY, double lastZ) {
		this(UUID.randomUUID(), lastX, lastY, lastZ);
	}

	@Nullable
	public LivingEntity getEntity(ServerWorld world) {
		if (uuid == DEFAULT_UUID) return null;
		Entity entity = world.getEntity(uuid);
		return entity instanceof LivingEntity ? (LivingEntity) entity : null;
	}

	public TargetedLocationComponent setTarget(Entity newTarget) {
		return new TargetedLocationComponent(newTarget.getUuid(), lastX, lastY, lastZ);
	}

	private static final UUID DEFAULT_UUID = UUID.randomUUID();
	public static TargetedLocationComponent DEFAULT = new TargetedLocationComponent(DEFAULT_UUID, 0.0, 0.0, 0.0);

	public static Codec<TargetedLocationComponent> CODEC = RecordCodecBuilder.create(instance ->
				instance.group(
						Uuids.CODEC.fieldOf("uuid").forGetter(TargetedLocationComponent::uuid),
						Codec.DOUBLE.fieldOf("x").forGetter(TargetedLocationComponent::lastX),
						Codec.DOUBLE.fieldOf("y").forGetter(TargetedLocationComponent::lastY),
						Codec.DOUBLE.fieldOf("z").forGetter(TargetedLocationComponent::lastZ)
				).apply(instance, TargetedLocationComponent::new));

	public static PacketCodec<RegistryByteBuf, TargetedLocationComponent> PACKET_CODEC = PacketCodec.tuple(
			PacketCodecs.STRING.xmap(UUID::fromString, UUID::toString),
			TargetedLocationComponent::uuid,
			PacketCodecs.DOUBLE,
			TargetedLocationComponent::lastX,
			PacketCodecs.DOUBLE,
			TargetedLocationComponent::lastY,
			PacketCodecs.DOUBLE,
			TargetedLocationComponent::lastZ,
			TargetedLocationComponent::new
	);

}