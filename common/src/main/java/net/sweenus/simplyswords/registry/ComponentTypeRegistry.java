package net.sweenus.simplyswords.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.component.ComponentType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.sweenus.simplyswords.SimplySwords;
import net.sweenus.simplyswords.entity.BattleStandardDarkEntity;
import net.sweenus.simplyswords.entity.BattleStandardEntity;
import net.sweenus.simplyswords.entity.SimplySwordsBeeEntity;
import net.sweenus.simplyswords.power.GemPowerComponent;

public class ComponentTypeRegistry {

    public static final DeferredRegister<ComponentType<?>> COMPONENT_TYPES = DeferredRegister.create(SimplySwords.MOD_ID, RegistryKeys.DATA_COMPONENT_TYPE);

    public static final RegistrySupplier<ComponentType<GemPowerComponent>> GEM_POWER = COMPONENT_TYPES.register("gem_power", () -> ComponentType.<GemPowerComponent>builder().codec(GemPowerComponent.CODEC).packetCodec(GemPowerComponent.PACKET_CODEC).build());

}