package net.sweenus.simplyswords.power;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import dev.architectury.registry.registries.RegistrySupplier;
import net.sweenus.simplyswords.registry.GemPowerRegistry;

import java.util.List;

public enum PowerType {
	RUNIC,
	RUNEFUSED,
	NETHER;

	private final Supplier<List<RegistrySupplier<GemPower>>> entrySupplier = Suppliers.memoize(() -> GemPowerRegistry.REGISTRY.entrySet().stream().map(entry -> GemPowerRegistry.REGISTRY.wrap(entry.getValue())).filter(entry -> entry.get().applicableTypes().contains(this)).toList());

	public List<RegistrySupplier<GemPower>> getEntries() {
		return entrySupplier.get();
	}
}