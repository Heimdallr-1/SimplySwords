package net.sweenus.simplyswords.power;

import net.minecraft.item.ItemStack;

public interface GemPowerFiller {
    GemPowerComponent fill(ItemStack stack, GemPowerComponent component);
}
