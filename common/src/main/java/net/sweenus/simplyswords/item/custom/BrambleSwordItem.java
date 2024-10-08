package net.sweenus.simplyswords.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.sweenus.simplyswords.config.Config;
import net.sweenus.simplyswords.config.ConfigDefaultValues;
import net.sweenus.simplyswords.item.UniqueSwordItem;
import net.sweenus.simplyswords.registry.EffectRegistry;
import net.sweenus.simplyswords.util.HelperMethods;

import java.util.List;

public class BrambleSwordItem extends UniqueSwordItem {
    public BrambleSwordItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

	private static int stepMod = 0;

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.getWorld().isClient()) {

            int fhitchance = (int) Config.getFloat("brambleChance", "UniqueEffects", ConfigDefaultValues.brambleChance);
            HelperMethods.playHitSounds(attacker, target);
            if (attacker.getRandom().nextInt(100) <= fhitchance) {
                if (!attacker.hasStatusEffect(EffectRegistry.SPORE_SWARM))
                    attacker.addStatusEffect(new StatusEffectInstance(EffectRegistry.SPORE_SWARM, 200, 2, false, false, true));
            }

        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (stepMod > 0) stepMod--;
        if (stepMod <= 0) stepMod = 7;
        HelperMethods.createFootfalls(entity, stack, world, stepMod, ParticleTypes.SPORE_BLOSSOM_AIR,
                ParticleTypes.SPORE_BLOSSOM_AIR, ParticleTypes.MYCELIUM, true);
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, TooltipContext tooltipContext, List<Text> tooltip, TooltipType type) {
        Style ABILITY = HelperMethods.getStyle("ability");
        Style TEXT = HelperMethods.getStyle("text");

        tooltip.add(Text.literal(""));
        tooltip.add(Text.translatable("item.simplyswords.bramblesworditem.tooltip1").setStyle(ABILITY));
        tooltip.add(Text.translatable("item.simplyswords.bramblesworditem.tooltip2").setStyle(TEXT));
        tooltip.add(Text.translatable("item.simplyswords.bramblesworditem.tooltip3").setStyle(TEXT));
        tooltip.add(Text.translatable("item.simplyswords.bramblesworditem.tooltip4").setStyle(TEXT));
        tooltip.add(Text.literal(""));
        tooltip.add(Text.translatable("item.simplyswords.bramblesworditem.tooltip5").setStyle(TEXT));
        tooltip.add(Text.translatable("item.simplyswords.bramblesworditem.tooltip6").setStyle(TEXT));
        tooltip.add(Text.translatable("item.simplyswords.bramblesworditem.tooltip7").setStyle(TEXT));
        tooltip.add(Text.translatable("item.simplyswords.bramblesworditem.tooltip8").setStyle(TEXT));

        super.appendTooltip(itemStack, tooltipContext, tooltip, type);
    }
}