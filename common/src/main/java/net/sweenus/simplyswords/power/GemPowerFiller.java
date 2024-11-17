package net.sweenus.simplyswords.power;

import me.fzzyhmstrs.fzzy_config.util.ValidationResult;
import net.minecraft.item.ItemStack;

public interface GemPowerFiller {
    ValidationResult<GemPowerComponent> fill(ItemStack stack, GemPowerComponent component);
}
