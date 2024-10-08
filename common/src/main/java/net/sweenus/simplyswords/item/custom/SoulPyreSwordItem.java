package net.sweenus.simplyswords.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.sweenus.simplyswords.config.Config;
import net.sweenus.simplyswords.config.ConfigDefaultValues;
import net.sweenus.simplyswords.item.TwoHandedWeapon;
import net.sweenus.simplyswords.item.UniqueSwordItem;
import net.sweenus.simplyswords.registry.EffectRegistry;
import net.sweenus.simplyswords.registry.SoundRegistry;
import net.sweenus.simplyswords.util.HelperMethods;

import java.util.List;

public class SoulPyreSwordItem extends UniqueSwordItem implements TwoHandedWeapon {
    public SoulPyreSwordItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    private int relocationTimer;
    private static int stepMod = 0;
    private final int relocationDuration = (int) Config.getFloat("soultetherDuration", "UniqueEffects", ConfigDefaultValues.soultetherDuration);
    private boolean canRelocate;
    private LivingEntity relocateTarget;
    private double relocateX;
    private double relocateY;
    private double relocateZ;

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.getWorld().isClient()) {
            HelperMethods.playHitSounds(attacker, target);
        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!user.getWorld().isClient()) {
            int range = (int) Config.getFloat("soultetherRange", "UniqueEffects", ConfigDefaultValues.soultetherRange);
            int radius = (int) Config.getFloat("soultetherRadius", "UniqueEffects", ConfigDefaultValues.soultetherRadius);
            int ignite_duration = (int) (Config.getFloat("soultetherIgniteDuration", "UniqueEffects", ConfigDefaultValues.soultetherIgniteDuration) / 20);
            int resistance_duration = (int) Config.getFloat("soultetherResistanceDuration", "UniqueEffects", ConfigDefaultValues.soultetherResistanceDuration);
            //Position swap target & player
            LivingEntity target = (LivingEntity) HelperMethods.getTargetedEntity(user, range);
            if (target != null && HelperMethods.checkFriendlyFire(target, user)) {
                relocateX = user.getX();
                relocateY = user.getY();
                relocateZ = user.getZ();
                relocateTarget = target;
                double rememberx = target.getX();
                double remembery = target.getY();
                double rememberz = target.getZ();
                target.teleport(user.getX(), user.getY(), user.getZ(), true);
                user.teleport(rememberx, remembery, rememberz, true);
                world.playSoundFromEntity(null, user, SoundRegistry.ELEMENTAL_SWORD_SCIFI_ATTACK_01.get(),
                        user.getSoundCategory(), 0.3f, 1f);
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, resistance_duration, 0), user);
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, resistance_duration, 0), user);
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, relocationDuration, 3), user);
                target.addStatusEffect(new StatusEffectInstance(EffectRegistry.FREEZE, relocationDuration - 10, 0), user);
                canRelocate = true;
                relocationTimer = relocationDuration;
                //AOE ignite & pull
                Box box = new Box(rememberx + radius, remembery + radius, rememberz + radius,
                        rememberx - radius, remembery - radius, rememberz - radius);
                for (Entity entity : world.getOtherEntities(user, box, EntityPredicates.VALID_LIVING_ENTITY)) {
                    if ((entity instanceof LivingEntity le) && HelperMethods.checkFriendlyFire(le, user)) {
                        le.setVelocity((rememberx - le.getX()) / 4, (remembery - le.getY()) / 4, (rememberz - le.getZ()) / 4);
                        le.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 40, 3), user);
                        world.playSoundFromEntity(null, le, SoundRegistry.ELEMENTAL_BOW_FIRE_SHOOT_IMPACT_03.get(),
                                le.getSoundCategory(), 0.1f, 3f);
                        le.setOnFireFor(ignite_duration);
                    }
                }
                user.getItemCooldownManager().set(this, relocationDuration);
            }
        }
        return super.use(world, user, hand);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && (entity instanceof PlayerEntity player) && canRelocate) {
            relocationTimer--;
            if (relocationTimer <= 0) {
                if (relocateTarget != null) {
                    relocateTarget.teleport(player.getX(), player.getY(), player.getZ(), true);
                }
                player.teleport(relocateX, relocateY, relocateZ, true);
                world.playSoundFromEntity(null, player, SoundRegistry.ELEMENTAL_SWORD_SCIFI_ATTACK_03.get(),
                        player.getSoundCategory(), 0.3f, 1f);
                canRelocate = false;
            } else if (relocationTimer == 40) {
                world.playSoundFromEntity(null, player, SoundRegistry.ELEMENTAL_BOW_RECHARGE.get(),
                        player.getSoundCategory(), 0.3f, 0.4f);
            }
        }
        if (stepMod > 0) stepMod--;
        if (stepMod <= 0) stepMod = 7;
        HelperMethods.createFootfalls(entity, stack, world, stepMod, ParticleTypes.SOUL_FIRE_FLAME,
                ParticleTypes.SOUL_FIRE_FLAME, ParticleTypes.MYCELIUM, true);
        HelperMethods.createFootfalls(entity, stack, world, stepMod, ParticleTypes.SMALL_FLAME,
                ParticleTypes.SMALL_FLAME, ParticleTypes.MYCELIUM, false);
        HelperMethods.createFootfalls(entity, stack, world, stepMod, ParticleTypes.SMOKE, ParticleTypes.SMOKE,
                ParticleTypes.MYCELIUM, false);
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, TooltipContext tooltipContext, List<Text> tooltip, TooltipType type) {
        Style RIGHTCLICK = HelperMethods.getStyle("rightclick");
        Style ABILITY = HelperMethods.getStyle("ability");
        Style TEXT = HelperMethods.getStyle("text");

        tooltip.add(Text.literal(""));
        tooltip.add(Text.translatable("item.simplyswords.soulpyresworditem.tooltip1").setStyle(ABILITY));
        tooltip.add(Text.literal(""));
        tooltip.add(Text.translatable("item.simplyswords.onrightclick").setStyle(RIGHTCLICK));
        tooltip.add(Text.translatable("item.simplyswords.soulpyresworditem.tooltip2").setStyle(TEXT));
        tooltip.add(Text.translatable("item.simplyswords.soulpyresworditem.tooltip3").setStyle(TEXT));
        tooltip.add(Text.translatable("item.simplyswords.soulpyresworditem.tooltip4").setStyle(TEXT));
        tooltip.add(Text.translatable("item.simplyswords.soulpyresworditem.tooltip5").setStyle(TEXT));
        tooltip.add(Text.translatable("item.simplyswords.soulpyresworditem.tooltip6").setStyle(TEXT));
        tooltip.add(Text.literal(""));
        tooltip.add(Text.translatable("item.simplyswords.soulpyresworditem.tooltip7", relocationDuration / 20).setStyle(TEXT));
        tooltip.add(Text.translatable("item.simplyswords.soulpyresworditem.tooltip8").setStyle(TEXT));
        tooltip.add(Text.translatable("item.simplyswords.soulpyresworditem.tooltip9").setStyle(TEXT));

        super.appendTooltip(itemStack, tooltipContext, tooltip, type);
    }
}