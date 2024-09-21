package net.sweenus.simplyswords.compat.eldritch_end;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.RegistryKeys;
import net.sweenus.simplyswords.SimplySwords;

public class EldritchEndCompatRegistry {

    public static final DeferredRegister<StatusEffect> EFFECT = DeferredRegister.create(SimplySwords.MOD_ID, RegistryKeys.STATUS_EFFECT);

    /* 1.21
    public static final RegistrySupplier<StatusEffect> VOIDHUNGER = EFFECT.register("voidhunger", () ->
            new VoidhungerEffect(StatusEffectCategory.HARMFUL, 1124687)
                    .addAttributeModifier(Registries.ATTRIBUTE.get(Identifier.of("eldritch_end:corruption")),
                            "03360b9d-c99b-4525-826a-ff5da528ebc2",
                            1.0,
                            EntityAttributeModifier.Operation.ADD_VALUE));

     */


}
