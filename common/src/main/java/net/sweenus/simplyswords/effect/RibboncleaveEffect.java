package net.sweenus.simplyswords.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.particle.ParticleTypes;
import net.sweenus.simplyswords.item.custom.RibboncleaverSwordItem;
import net.sweenus.simplyswords.registry.EffectRegistry;

public class RibboncleaveEffect extends OrbitingEffect {
    public RibboncleaveEffect(StatusEffectCategory statusEffectCategory, int color) {
        super (statusEffectCategory, color);
        setParticleType(ParticleTypes.CLOUD);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity livingEntity, int amplifier) {
        if (!livingEntity.getWorld().isClient()) {
            if (!(livingEntity.getMainHandStack().getItem() instanceof RibboncleaverSwordItem))
                livingEntity.removeStatusEffect(EffectRegistry.getReference(EffectRegistry.RIBBONCLEAVE));
        }
        super.applyUpdateEffect(livingEntity, amplifier);
        return false;
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes) {

    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return super.canApplyUpdateEffect(pDuration, pAmplifier);
    }
}