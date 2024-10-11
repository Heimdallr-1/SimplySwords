package net.sweenus.simplyswords.item;

import me.fzzyhmstrs.fzzy_config.util.ValidationResult;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.ClickType;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import net.sweenus.simplyswords.SimplySwords;
import net.sweenus.simplyswords.api.SimplySwordsAPI;
import net.sweenus.simplyswords.power.GemPowerComponent;
import net.sweenus.simplyswords.power.GemPowerFiller;
import net.sweenus.simplyswords.power.PowerType;
import net.sweenus.simplyswords.registry.ComponentTypeRegistry;
import net.sweenus.simplyswords.registry.GemPowerRegistry;
import net.sweenus.simplyswords.util.Styles;

import java.util.List;

public class RunefusedGemItem extends Item implements GemPowerFiller {

    public RunefusedGemItem() {
        super(new Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof().maxCount(1));
    }

    @Override
    public ValidationResult<GemPowerComponent> fill(ItemStack stack, GemPowerComponent component) {
        GemPowerComponent gemComponent = SimplySwordsAPI.getComponent(stack);
        if (!gemComponent.hasRunicPower() || !component.runicPower().value().isEmpty() || !component.hasRunicPower()) {
            return ValidationResult.Companion.error(component, "Can't socket to the provided component");
        }
        return ValidationResult.Companion.success(component.fill(
            (hasRunic, oldRunic) -> gemComponent.runicPower(),
            (hasNether, oldNether) -> oldNether
        ));
    }

    @Override
    public boolean onClicked(ItemStack stack, ItemStack otherStack, Slot slot, ClickType clickType, PlayerEntity player,
                             StackReference cursorStackReference) {

        if (!stack.contains(ComponentTypeRegistry.GEM_POWER.get())) {
            stack.set(ComponentTypeRegistry.GEM_POWER.get(), GemPowerComponent.runic(GemPowerRegistry.gemRandomPower(PowerType.RUNEFUSED)));
        }
        return false;
    }


    @Override
    public void onCraft(ItemStack stack, World world) {
        if (world.isClient) return;

        if (!stack.contains(ComponentTypeRegistry.GEM_POWER.get())) {
            stack.set(ComponentTypeRegistry.GEM_POWER.get(), GemPowerComponent.runic(GemPowerRegistry.gemRandomPower(PowerType.RUNEFUSED)));
        }
    }

    @Override
    public Text getName(ItemStack stack) {
        return Text.translatable(this.getTranslationKey(stack)).setStyle(Styles.RUNIC);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, TooltipContext tooltipContext, List<Text> tooltip, TooltipType type) {

        tooltip.add(Text.literal(""));

        GemPowerComponent component = SimplySwordsAPI.getComponent(itemStack);

        if(component.isEmpty()) {
            tooltip.add(Text.translatable("item.simplyswords.unidentifiedsworditem.tooltip1").setStyle(Styles.RUNIC));
            tooltip.add(Text.translatable("item.simplyswords.unidentifiedsworditem.tooltip2").setStyle(Styles.TEXT));
        } else {
            component.appendTooltip(itemStack, tooltipContext, tooltip, type);
        }
        tooltip.add(Text.literal(""));
        tooltip.add(Text.translatable("item.simplyswords.gem_description").formatted(Formatting.GRAY, Formatting.ITALIC));
        tooltip.add(Text.translatable("item.simplyswords.gem_description2").formatted(Formatting.GRAY, Formatting.ITALIC));
    }
}