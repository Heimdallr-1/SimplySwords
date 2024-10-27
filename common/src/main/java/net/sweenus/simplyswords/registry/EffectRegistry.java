package net.sweenus.simplyswords.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.sweenus.simplyswords.SimplySwords;
import net.sweenus.simplyswords.config.Config;
import net.sweenus.simplyswords.effect.AstralShiftEffect;
import net.sweenus.simplyswords.effect.BattleFatigueEffect;
import net.sweenus.simplyswords.effect.EchoEffect;
import net.sweenus.simplyswords.effect.ElementalVortexEffect;
import net.sweenus.simplyswords.effect.FatalFlickerEffect;
import net.sweenus.simplyswords.effect.FireVortexEffect;
import net.sweenus.simplyswords.effect.FlameSeedEffect;
import net.sweenus.simplyswords.effect.FreezeEffect;
import net.sweenus.simplyswords.effect.FrenzyEffect;
import net.sweenus.simplyswords.effect.FrostVortexEffect;
import net.sweenus.simplyswords.effect.ImmolationEffect;
import net.sweenus.simplyswords.effect.MagislamEffect;
import net.sweenus.simplyswords.effect.MagistormEffect;
import net.sweenus.simplyswords.effect.OnslaughtEffect;
import net.sweenus.simplyswords.effect.PainEffect;
import net.sweenus.simplyswords.effect.ResilienceEffect;
import net.sweenus.simplyswords.effect.RibboncleaveEffect;
import net.sweenus.simplyswords.effect.RibbonwrathEffect;
import net.sweenus.simplyswords.effect.SmoulderingEffect;
import net.sweenus.simplyswords.effect.SporeSwarmEffect;
import net.sweenus.simplyswords.effect.StormEffect;
import net.sweenus.simplyswords.effect.VoidAssaultEffect;
import net.sweenus.simplyswords.effect.VoidcloakEffect;
import net.sweenus.simplyswords.effect.WardEffect;
import net.sweenus.simplyswords.effect.WildfireEffect;

public class EffectRegistry {

    public static final DeferredRegister<StatusEffect> EFFECT = DeferredRegister.create(SimplySwords.MOD_ID, RegistryKeys.STATUS_EFFECT);

    public static final RegistrySupplier<StatusEffect> WILDFIRE = EFFECT.register("wildfire", () ->
            new WildfireEffect(StatusEffectCategory.HARMFUL, 1124687));
    public static final RegistrySupplier<StatusEffect> STORM = EFFECT.register("storm", () ->
            new StormEffect(StatusEffectCategory.HARMFUL, 1124687));

    public static final RegistrySupplier<StatusEffect> FREEZE = EFFECT.register("freeze", () ->
            new FreezeEffect(StatusEffectCategory.HARMFUL, 1124687));
    public static final RegistrySupplier<StatusEffect> WARD = EFFECT.register("ward", () ->
            new WardEffect(StatusEffectCategory.BENEFICIAL, 1124687));
    public static final RegistrySupplier<StatusEffect> IMMOLATION = EFFECT.register("immolation", () ->
            new ImmolationEffect(StatusEffectCategory.BENEFICIAL, 1124687));
    public static final RegistrySupplier<StatusEffect> ECHO = EFFECT.register("echo", () ->
            new EchoEffect(StatusEffectCategory.HARMFUL, 1124687));
    public static final RegistrySupplier<StatusEffect> ONSLAUGHT = EFFECT.register("onslaught", () ->
            new OnslaughtEffect(StatusEffectCategory.BENEFICIAL, 1124687));
    public static final RegistrySupplier<StatusEffect> BATTLE_FATIGUE = EFFECT.register("battle_fatigue", () ->
            new BattleFatigueEffect(StatusEffectCategory.HARMFUL, 1124687));
    public static final RegistrySupplier<StatusEffect> FATAL_FLICKER = EFFECT.register("fatal_flicker", () ->
            new FatalFlickerEffect(StatusEffectCategory.BENEFICIAL, 1124687));
    public static final RegistrySupplier<StatusEffect> SMOULDERING = EFFECT.register("smouldering", () ->
            new SmoulderingEffect(StatusEffectCategory.HARMFUL, 1124687));
    public static final RegistrySupplier<StatusEffect> FRENZY = EFFECT.register("frenzy", () ->
            new FrenzyEffect(StatusEffectCategory.BENEFICIAL, 1124687)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED,
                            Identifier.of("54e1b9b9-6de9-49bb-a716-564b3d375892"),
                            0.8,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final RegistrySupplier<StatusEffect> VOIDCLOAK = EFFECT.register("voidcloak", () ->
            new VoidcloakEffect(StatusEffectCategory.BENEFICIAL, 1124687)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED,
                            Identifier.of("d07f34ad-6367-4a86-b47a-736947e2c008"),
                            0.1,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final RegistrySupplier<StatusEffect> VOIDASSAULT = EFFECT.register("void_assault", () ->
            new VoidAssaultEffect(StatusEffectCategory.HARMFUL, 1124687));

    public static final RegistrySupplier<StatusEffect> FIRE_VORTEX = EFFECT.register("fire_vortex", () ->
            new FireVortexEffect(StatusEffectCategory.HARMFUL, 1124687)
                    .addAttributeModifier(EntityAttributes.GENERIC_ARMOR,
                            Identifier.of("f20d79bc-5f73-49d3-9e3f-30bf9a8da15a"),
                            -0.01,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,
                            Identifier.of("3f68cd63-6fc5-4a23-87bd-c5902579d9db"),
                            85,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final RegistrySupplier<StatusEffect> FROST_VORTEX = EFFECT.register("frost_vortex", () ->
            new FrostVortexEffect(StatusEffectCategory.HARMFUL, 1124687)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of("d0814391-9325-441e-bc7e-ace3f8f89a21"),
                            -0.01,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,
                            Identifier.of("8b1fc18c-9539-4718-af61-224d0ccd274f"),
                            85,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final RegistrySupplier<StatusEffect> ELEMENTAL_VORTEX = EFFECT.register("elemental_vortex", () ->
            new ElementalVortexEffect(StatusEffectCategory.BENEFICIAL, 1124687));

    public static final RegistrySupplier<StatusEffect> FLAMESEED = EFFECT.register("flameseed", () ->
            new FlameSeedEffect(StatusEffectCategory.HARMFUL, 1124687));

    public static final RegistrySupplier<StatusEffect> RIBBONWRATH = EFFECT.register("ribbonwrath", () ->
            new RibbonwrathEffect(StatusEffectCategory.HARMFUL, 1124687)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of("325de159-03bd-421c-8dd0-53e0090857ed"),
                            -0.05,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final RegistrySupplier<StatusEffect> RIBBONCLEAVE = EFFECT.register("ribboncleave", () ->
            new RibboncleaveEffect(StatusEffectCategory.BENEFICIAL, 1124687)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE,
                            Identifier.of("c8fb5e9f-c446-4475-b73f-a2290196210f"),
                            Config.uniqueEffects.ribbonwrath.damageBonusPercent,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,
                            Identifier.of("1b147b80-6598-48d4-917f-7da3032c070f"),
                            1,
                            EntityAttributeModifier.Operation.ADD_VALUE));
    public static final RegistrySupplier<StatusEffect> RESILIENCE = EFFECT.register("resilience", () ->
            new ResilienceEffect(StatusEffectCategory.BENEFICIAL, 1124687));

    public static final RegistrySupplier<StatusEffect> SPORE_SWARM = EFFECT.register("spore_swarm", () ->
            new SporeSwarmEffect(StatusEffectCategory.BENEFICIAL, 1124687));

    public static final RegistrySupplier<StatusEffect> PAIN = EFFECT.register("pain", () ->
            new PainEffect(StatusEffectCategory.HARMFUL, 1124687));

    public static final RegistrySupplier<StatusEffect> MAGISTORM = EFFECT.register("magistorm", () ->
            new MagistormEffect(StatusEffectCategory.BENEFICIAL, 1124687));

    public static final RegistrySupplier<StatusEffect> MAGISLAM = EFFECT.register("magislam", () ->
            new MagislamEffect(StatusEffectCategory.BENEFICIAL, 1124687));

    public static final RegistrySupplier<StatusEffect> ASTRAL_SHIFT = EFFECT.register("astral_shift", () ->
            new AstralShiftEffect(StatusEffectCategory.BENEFICIAL, 1124687));

}