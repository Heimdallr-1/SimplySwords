package net.sweenus.simplyswords.config.settings;

import me.fzzyhmstrs.fzzy_config.annotations.Translation;
import me.fzzyhmstrs.fzzy_config.validation.number.ValidatedInt;
import net.minecraft.item.tooltip.TooltipAppender;

import java.util.function.Supplier;

public class BasicSettings extends TooltipSettings {

	public BasicSettings(int chance, int duration, Supplier<? extends TooltipAppender> appender) {
		super(appender);
		this.chance = chance;
		this.duration = duration;
	}

	public BasicSettings(int chance, int duration) {
		super();
		this.chance = chance;
		this.duration = duration;
	}

	@Translation(prefix = "simplyswords.config.basic_settings")
	@ValidatedInt.Restrict(min = 0, max = 100)
	public int chance;

	@Translation(prefix = "simplyswords.config.basic_settings")
	@ValidatedInt.Restrict(min = 0)
	public int duration;

}