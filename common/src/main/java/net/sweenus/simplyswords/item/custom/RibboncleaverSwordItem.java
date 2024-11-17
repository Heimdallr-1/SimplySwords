package net.sweenus.simplyswords.item.custom;

import dev.architectury.platform.Platform;
import me.fzzyhmstrs.fzzy_config.validation.number.ValidatedDouble;
import me.fzzyhmstrs.fzzy_config.validation.number.ValidatedInt;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.sweenus.simplyswords.config.Config;
import net.sweenus.simplyswords.config.settings.ItemStackTooltipAppender;
import net.sweenus.simplyswords.config.settings.TooltipSettings;
import net.sweenus.simplyswords.item.UniqueSwordItem;
import net.sweenus.simplyswords.registry.EffectRegistry;
import net.sweenus.simplyswords.registry.ItemsRegistry;
import net.sweenus.simplyswords.registry.SoundRegistry;
import net.sweenus.simplyswords.util.HelperMethods;
import net.sweenus.simplyswords.util.Styles;

import java.util.List;

public class RibboncleaverSwordItem extends UniqueSwordItem {
    public RibboncleaverSwordItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.getWorld().isClient()) {

            HelperMethods.playHitSounds(attacker, target);

        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        int skillCooldown = Config.uniqueEffects.ribbonwrath.cooldown;
        int resilienceAmplifier = Config.uniqueEffects.ribbonwrath.resilienceAmplifier;


        world.playSound(null, user.getBlockPos(), SoundRegistry.ELEMENTAL_BOW_EARTH_SHOOT_IMPACT_03.get(),
                user.getSoundCategory(), 0.4f, 1.3f);
        if (user.isOnGround())
            world.playSound(null, user.getBlockPos(), SoundRegistry.OBJECT_IMPACT_THUD_REPEAT.get(),
                    user.getSoundCategory(), 0.5f, 1.2f);
        user.setVelocity(user.getRotationVector().multiply(+1.7));
        user.setVelocity(user.getVelocity().x, 0, user.getVelocity().z); // Prevent user flying to the heavens
        user.velocityModified = true;
        user.addStatusEffect(new StatusEffectInstance(EffectRegistry.getReference(EffectRegistry.RIBBONCLEAVE),
                60, 0, false, false, true));
        user.addStatusEffect(new StatusEffectInstance(EffectRegistry.getReference(EffectRegistry.RESILIENCE),
                15, resilienceAmplifier, false, false, true));
        user.getItemCooldownManager().set(this, skillCooldown);

        return super.use(world, user, hand);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {

        //Drag weapon particles
        if (entity.isOnGround() && Platform.isModLoaded("bettercombat") && HelperMethods.isWalking(entity)
                && entity instanceof PlayerEntity player) {
            if (player.getMainHandStack().isOf(ItemsRegistry.RIBBONCLEAVER.get())) {

                BlockState blockState = entity.getSteppingBlockState();
                ParticleEffect particleEffect = new BlockStateParticleEffect(ParticleTypes.BLOCK, blockState);

                double bodyRadians = Math.toRadians(entity.getBodyYaw() + 180);
                Vec3d backwardDirection = new Vec3d(-Math.sin(bodyRadians), 0, Math.cos(bodyRadians)).multiply(1.1);

                double strafeRadians = Math.toRadians(entity.getBodyYaw() + 90);
                Vec3d strafeDirection = new Vec3d(-Math.sin(strafeRadians), 0, Math.cos(strafeRadians));

                Vec3d movementVector = entity.getVelocity();
                double strafeMagnitude = movementVector.dotProduct(strafeDirection.normalize());

                double pivotOffsetFactor = 3;
                Vec3d pivotOffset = strafeDirection.multiply(strafeMagnitude * pivotOffsetFactor);

                Vec3d adjustedBackwardDirection = backwardDirection.subtract(pivotOffset);

                Vec3d handPosOffset = entity.getHandPosOffset(stack.getItem());
                double particleX = entity.getX() + adjustedBackwardDirection.x + handPosOffset.getX();
                double particleY = entity.getY() + handPosOffset.getY();
                double particleZ = entity.getZ() + adjustedBackwardDirection.z + handPosOffset.getZ();

                particleY = entity.isOnGround() ? entity.getY() : particleY;

                world.addParticle(particleEffect, particleX, particleY, particleZ, 0, 0.0, 0);
                world.addParticle(ParticleTypes.POOF, particleX, particleY, particleZ, 0, 0.0, 0);

            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, TooltipContext tooltipContext, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.literal(""));
        tooltip.add(Text.translatable("item.simplyswords.ribboncleaversworditem.tooltip1").setStyle(Styles.ABILITY));
        tooltip.add(Text.translatable("item.simplyswords.ribboncleaversworditem.tooltip2").setStyle(Styles.TEXT));
        tooltip.add(Text.translatable("item.simplyswords.ribboncleaversworditem.tooltip3").setStyle(Styles.TEXT));
        tooltip.add(Text.translatable("item.simplyswords.ribboncleaversworditem.tooltip4").setStyle(Styles.TEXT));
        tooltip.add(Text.literal(""));
        tooltip.add(Text.translatable("item.simplyswords.onrightclick").setStyle(Styles.RIGHT_CLICK));
        tooltip.add(Text.translatable("item.simplyswords.ribboncleaversworditem.tooltip5").setStyle(Styles.TEXT));
        tooltip.add(Text.translatable("item.simplyswords.ribboncleaversworditem.tooltip6").setStyle(Styles.TEXT));
        tooltip.add(Text.translatable("item.simplyswords.ribboncleaversworditem.tooltip7").setStyle(Styles.TEXT));
        tooltip.add(Text.translatable("item.simplyswords.ribboncleaversworditem.tooltip8").setStyle(Styles.TEXT));
        tooltip.add(Text.translatable("item.simplyswords.ribboncleaversworditem.tooltip9").setStyle(Styles.TEXT));
        tooltip.add(Text.translatable("item.simplyswords.ribboncleaversworditem.tooltip10").setStyle(Styles.TEXT));

        super.appendTooltip(itemStack, tooltipContext, tooltip, type);
    }

    public static class EffectSettings extends TooltipSettings {

        public EffectSettings() {
            super(new ItemStackTooltipAppender(ItemsRegistry.RIBBONCLEAVER::get));
        }

        @ValidatedInt.Restrict(min = 0)
        public int cooldown = 40;
        @ValidatedDouble.Restrict(min = 0.0)
        public double damageBonusPercent = 0.95;
        @ValidatedInt.Restrict(min = 0)
        public int resilienceAmplifier = 1;

    }
}