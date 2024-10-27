package net.sweenus.simplyswords.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.RegistryKeys;
import net.sweenus.simplyswords.SimplySwords;
import net.sweenus.simplyswords.item.component.ChargedLocationComponent;
import net.sweenus.simplyswords.item.component.MoltenParticleComponent;
import net.sweenus.simplyswords.item.component.ParryComponent;
import net.sweenus.simplyswords.item.component.RelocationComponent;
import net.sweenus.simplyswords.item.component.StoredChargeComponent;
import net.sweenus.simplyswords.item.component.TargetedLocationComponent;
import net.sweenus.simplyswords.power.GemPowerComponent;

public class ComponentTypeRegistry {

    public static final DeferredRegister<ComponentType<?>> COMPONENT_TYPES = DeferredRegister.create(SimplySwords.MOD_ID, RegistryKeys.DATA_COMPONENT_TYPE);

    public static final RegistrySupplier<ComponentType<GemPowerComponent>> GEM_POWER = COMPONENT_TYPES.register("gem_power", () -> ComponentType.<GemPowerComponent>builder().codec(GemPowerComponent.CODEC).packetCodec(GemPowerComponent.PACKET_CODEC).build());
    public static final RegistrySupplier<ComponentType<StoredChargeComponent>> STORED_CHARGE = COMPONENT_TYPES.register("stored_charge", () -> ComponentType.<StoredChargeComponent>builder().codec(StoredChargeComponent.CODEC).packetCodec(StoredChargeComponent.PACKET_CODEC).build());
    public static final RegistrySupplier<ComponentType<StoredChargeComponent>> STORED_BONUS = COMPONENT_TYPES.register("stored_bonus", () -> ComponentType.<StoredChargeComponent>builder().codec(StoredChargeComponent.CODEC).packetCodec(StoredChargeComponent.PACKET_CODEC).build());
    public static final RegistrySupplier<ComponentType<ChargedLocationComponent>> CHARGED_LOCATION = COMPONENT_TYPES.register("charged_location", () -> ComponentType.<ChargedLocationComponent>builder().codec(ChargedLocationComponent.CODEC).packetCodec(ChargedLocationComponent.PACKET_CODEC).build());
    public static final RegistrySupplier<ComponentType<TargetedLocationComponent>> TARGETED_LOCATION = COMPONENT_TYPES.register("targeted_location", () -> ComponentType.<TargetedLocationComponent>builder().codec(TargetedLocationComponent.CODEC).packetCodec(TargetedLocationComponent.PACKET_CODEC).build());
    public static final RegistrySupplier<ComponentType<RelocationComponent>> RELOCATION = COMPONENT_TYPES.register("relocation", () -> ComponentType.<RelocationComponent>builder().codec(RelocationComponent.CODEC).packetCodec(RelocationComponent.PACKET_CODEC).build());
    public static final RegistrySupplier<ComponentType<MoltenParticleComponent>> MOLTEN_PARTICLE = COMPONENT_TYPES.register("molten_particle", () -> ComponentType.<MoltenParticleComponent>builder().codec(MoltenParticleComponent.CODEC).packetCodec(MoltenParticleComponent.PACKET_CODEC).build());
    public static final RegistrySupplier<ComponentType<ParryComponent>> PARRY = COMPONENT_TYPES.register("parry", () -> ComponentType.<ParryComponent>builder().codec(ParryComponent.CODEC).packetCodec(ParryComponent.PACKET_CODEC).build());

}