package net.sweenus.simplyswords.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
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
import net.sweenus.simplyswords.registry.SoundRegistry;
import net.sweenus.simplyswords.util.HelperMethods;

import java.util.List;

public class HasteSwordItem extends UniqueSwordItem {
    public HasteSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 0;
    }

    private static int stepMod = 0;

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.getWorld().isClient()) {
            ServerWorld world = (ServerWorld) attacker.getWorld();
            int fhitchance = (int) Config.getFloat("ferocityChance", "UniqueEffects", ConfigDefaultValues.ferocityChance);
            int fduration = (int) Config.getFloat("ferocityDuration", "UniqueEffects", ConfigDefaultValues.ferocityDuration);
            int maximum_stacks = (int) Config.getFloat("ferocityMaxStacks", "UniqueEffects", ConfigDefaultValues.ferocityMaxStacks);
            HelperMethods.playHitSounds(attacker, target);

            if (attacker.getRandom().nextInt(100) <= fhitchance) {
                if (attacker.hasStatusEffect(StatusEffects.HASTE)) {

                    int a = (attacker.getStatusEffect(StatusEffects.HASTE).getAmplifier() + 1);
                    world.playSoundFromEntity(null, attacker, SoundRegistry.ELEMENTAL_BOW_HOLY_SHOOT_IMPACT_02.get(),
                            attacker.getSoundCategory(), 0.3f, 1f + (a / 10f));

                    if ((attacker.getStatusEffect(StatusEffects.HASTE).getAmplifier() < maximum_stacks)) {
                        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, fduration, a), attacker);
                    } else {
                        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, fduration, a - 1), attacker);
                    }
                } else {
                    attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, fduration, 1), attacker);
                }
            }
        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (user.hasStatusEffect(StatusEffects.HASTE)) {
            int strength_tier = (int) Config.getFloat("ferocityStrengthTier", "UniqueEffects", ConfigDefaultValues.ferocityStrengthTier);

            int a = (user.getStatusEffect(StatusEffects.HASTE).getAmplifier() * 20);
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, a, strength_tier), user);
            user.swingHand(hand);
            user.removeStatusEffect(StatusEffects.HASTE);
            world.playSound(null, user.getBlockPos(), SoundRegistry.ELEMENTAL_BOW_SCIFI_SHOOT_IMPACT_03.get(),
                    user.getSoundCategory(), 0.5f, 1.5f);
        }
        return super.use(world, user, hand);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (stepMod > 0) stepMod--;
        if (stepMod <= 0) stepMod = 7;
        HelperMethods.createFootfalls(entity, stack, world, stepMod, ParticleTypes.ASH,
                ParticleTypes.ASH, ParticleTypes.ASH, false);
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        Style RIGHTCLICK = HelperMethods.getStyle("rightclick");
        Style ABILITY = HelperMethods.getStyle("ability");
        Style TEXT = HelperMethods.getStyle("text");

        tooltip.add(Text.literal(""));
        tooltip.add(Text.translatable("item.simplyswords.ferocitysworditem.tooltip1").setStyle(ABILITY));
        tooltip.add(Text.translatable("item.simplyswords.ferocitysworditem.tooltip2").setStyle(TEXT));
        tooltip.add(Text.translatable("item.simplyswords.ferocitysworditem.tooltip3").setStyle(TEXT));
        tooltip.add(Text.literal(""));
        tooltip.add(Text.translatable("item.simplyswords.onrightclick").setStyle(RIGHTCLICK));
        tooltip.add(Text.translatable("item.simplyswords.ferocitysworditem.tooltip4").setStyle(TEXT));
        tooltip.add(Text.translatable("item.simplyswords.ferocitysworditem.tooltip5").setStyle(TEXT));
        tooltip.add(Text.translatable("item.simplyswords.ferocitysworditem.tooltip6").setStyle(TEXT));

        super.appendTooltip(itemStack, world, tooltip, tooltipContext);
    }
}
