package net.sweenus.simplyswords.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.sweenus.simplyswords.config.Config;
import net.sweenus.simplyswords.config.ConfigDefaultValues;
import net.sweenus.simplyswords.item.UniqueSwordItem;
import net.sweenus.simplyswords.registry.EffectRegistry;
import net.sweenus.simplyswords.registry.SoundRegistry;
import net.sweenus.simplyswords.util.HelperMethods;

import java.util.List;

public class EmberlashSwordItem extends UniqueSwordItem {
    public EmberlashSwordItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 0;
    }

    private static int stepMod = 0;
    public static boolean scalesWithSpellPower;
    public static float tooltipEffectDamage = 0.20f;

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.getWorld().isClient()) {
            ServerWorld world = (ServerWorld) attacker.getWorld();
            DamageSource damageSource = world.getDamageSources().generic();
            float abilityDamage = (float) HelperMethods.getEntityAttackDamage(attacker);
            float spellScalingModifier = Config.getFloat("smoulderSpellScaling", "UniqueEffects", ConfigDefaultValues.smoulderSpellScaling);
            if (HelperMethods.commonSpellAttributeScaling(spellScalingModifier, attacker, "fire") > HelperMethods.getEntityAttackDamage(attacker)) {
                abilityDamage = HelperMethods.commonSpellAttributeScaling(spellScalingModifier, attacker, "fire");
                scalesWithSpellPower = true;
            }

            if (attacker instanceof PlayerEntity player)
                damageSource = attacker.getDamageSources().playerAttack(player);

            int maximum_stacks = (int) Config.getFloat("smoulderMaxStacks", "UniqueEffects", ConfigDefaultValues.smoulderMaxStacks);
            HelperMethods.playHitSounds(attacker, target);

            if (target.hasStatusEffect(EffectRegistry.SMOULDERING)) {
                target.timeUntilRegen = 0;
                StatusEffectInstance smoulderingEffect = target.getStatusEffect(EffectRegistry.SMOULDERING);
                if (smoulderingEffect != null) {
                    float damageMultiplier = 0.15f * smoulderingEffect.getAmplifier();
                    target.damage(damageSource, abilityDamage * damageMultiplier);
                }
            }
            HelperMethods.incrementStatusEffect(target, EffectRegistry.SMOULDERING, 100, 1, maximum_stacks+1);

        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        int skillCooldown = (int) Config.getFloat("smoulderCooldown", "UniqueEffects", ConfigDefaultValues.smoulderCooldown);
        user.swingHand(hand);
        world.playSound(null, user.getBlockPos(), SoundRegistry.SPELL_FIRE.get(),
                user.getSoundCategory(), 0.5f, 1.0f);

        user.setVelocity(user.getRotationVector().negate().multiply(+1.5));
        user.setVelocity(user.getVelocity().x, 0, user.getVelocity().z); // Prevent user flying to the heavens
        user.velocityModified = true;
        user.heal(user.getMaxHealth() * 0.15f);
        user.getItemCooldownManager().set(this, skillCooldown);

        return super.use(world, user, hand);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (stepMod > 0) stepMod--;
        if (stepMod <= 0) stepMod = 7;
        HelperMethods.createFootfalls(entity, stack, world, stepMod, ParticleTypes.FALLING_LAVA,
                ParticleTypes.SMOKE, ParticleTypes.SMOKE, true);
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, TooltipContext tooltipContext, List<Text> tooltip, TooltipType type) {
        Style RIGHTCLICK = HelperMethods.getStyle("rightclick");
        Style ABILITY = HelperMethods.getStyle("ability");
        Style TEXT = HelperMethods.getStyle("text");

        tooltip.add(Text.literal(""));
        tooltip.add(Text.translatable("item.simplyswords.emberlashsworditem.tooltip1").setStyle(ABILITY));
        tooltip.add(Text.translatable("item.simplyswords.emberlashsworditem.tooltip2").setStyle(TEXT));
        tooltip.add(Text.literal(""));
        tooltip.add(Text.translatable("item.simplyswords.emberlashsworditem.tooltip3").setStyle(TEXT));
        tooltip.add(Text.translatable("item.simplyswords.emberlashsworditem.tooltip4").setStyle(TEXT));
        tooltip.add(Text.translatable("item.simplyswords.emberlashsworditem.tooltip5", tooltipEffectDamage).setStyle(TEXT));
        tooltip.add(Text.literal(""));
        tooltip.add(Text.translatable("item.simplyswords.onrightclick").setStyle(RIGHTCLICK));
        tooltip.add(Text.translatable("item.simplyswords.emberlashsworditem.tooltip6").setStyle(TEXT));
        tooltip.add(Text.translatable("item.simplyswords.emberlashsworditem.tooltip7", Config.getFloat("smoulderHeal", "UniqueEffects",ConfigDefaultValues.smoulderHeal)).setStyle(TEXT));
        if (scalesWithSpellPower) {
            tooltip.add(Text.literal(""));
            tooltip.add(Text.translatable("item.simplyswords.compat.scaleFire"));
        }

        super.appendTooltip(itemStack, tooltipContext, tooltip, type);
    }
}
