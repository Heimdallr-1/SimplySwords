package net.sweenus.simplyswords.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.RegistryKeys;
import net.sweenus.simplyswords.SimplySwords;
import net.sweenus.simplyswords.item.component.RelocationComponent;
import net.sweenus.simplyswords.power.GemPowerComponent;
import net.sweenus.simplyswords.item.component.StoredChargeComponent;

public class ComponentTypeRegistry {

    public static final DeferredRegister<ComponentType<?>> COMPONENT_TYPES = DeferredRegister.create(SimplySwords.MOD_ID, RegistryKeys.DATA_COMPONENT_TYPE);

    public static final RegistrySupplier<ComponentType<GemPowerComponent>> GEM_POWER = COMPONENT_TYPES.register("gem_power", () -> ComponentType.<GemPowerComponent>builder().codec(GemPowerComponent.CODEC).packetCodec(GemPowerComponent.PACKET_CODEC).build());
    public static final RegistrySupplier<ComponentType<StoredChargeComponent>> STORED_CHARGE = COMPONENT_TYPES.register("stored_charge", () -> ComponentType.<StoredChargeComponent>builder().codec(StoredChargeComponent.CODEC).packetCodec(StoredChargeComponent.PACKET_CODEC).build());
    public static final RegistrySupplier<ComponentType<RelocationComponent>> RELOCATION = COMPONENT_TYPES.register("relocation", () -> ComponentType.<RelocationComponent>builder().codec(RelocationComponent.CODEC).packetCodec(RelocationComponent.PACKET_CODEC).build());

}