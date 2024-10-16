package net.sweenus.simplyswords.util;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import dev.architectury.event.events.common.LootEvent;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.EnchantRandomlyLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.sweenus.simplyswords.config.Config;
import net.sweenus.simplyswords.config.ConfigDefaultValues;
import net.sweenus.simplyswords.config.SimplySwordsConfig;
import net.sweenus.simplyswords.item.UniqueSwordItem;
import net.sweenus.simplyswords.registry.ItemsRegistry;

import java.util.List;

public class ModLootTableModifiers {

    private static final Supplier<List<Item>> swords = Suppliers.memoize(() -> Registries.ITEM.stream().filter(it -> it instanceof UniqueSwordItem).toList());

    public static void init() {

        float standardLootWeight = Config.getFloat("standardLootTableWeight", "Loot", ConfigDefaultValues.standardLootTableWeight);
        float rareLootWeight = Config.getFloat("rareLootTableWeight", "Loot", ConfigDefaultValues.rareLootTableWeight);
        float runicLootWeight = Config.getFloat("runicLootTableWeight", "Loot", ConfigDefaultValues.runicLootTableWeight);


        // 1.21 temp
        /*//STANDARD
        LootEvent.MODIFY_LOOT_TABLE.register(((lootTables, id, context, builtin) -> {
            if (Config.getBoolean("enableLootDrops", "Loot", ConfigDefaultValues.enableLootDrops) && id.getPath().contains("chests") && !id.getPath().contains("spectrum")) {
                //System.out.println( id.getNamespace() + ":" + id.getPath()); //PRINT POSSIBLE PATHS
                if (!Config.getBoolean("enableLootInVillages", "Loot", ConfigDefaultValues.enableLootInVillages) && id.getPath().contains("village")) {
                    //Do nothing
                }
                else {
                    LootPool.Builder pool = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(standardLootWeight)) // 1 = 100% of the time
                            .apply(EnchantRandomlyLootFunction.builder())
                            .with(ItemEntry.builder(ItemsRegistry.IRON_LONGSWORD.get()))
                            .with(ItemEntry.builder(ItemsRegistry.IRON_TWINBLADE.get()))
                            .with(ItemEntry.builder(ItemsRegistry.IRON_RAPIER.get()))
                            .with(ItemEntry.builder(ItemsRegistry.IRON_CUTLASS.get()))
                            .with(ItemEntry.builder(ItemsRegistry.IRON_KATANA.get()))
                            .with(ItemEntry.builder(ItemsRegistry.IRON_GLAIVE.get()))
                            .with(ItemEntry.builder(ItemsRegistry.IRON_WARGLAIVE.get()))
                            .with(ItemEntry.builder(ItemsRegistry.IRON_SPEAR.get()))
                            .with(ItemEntry.builder(ItemsRegistry.IRON_SAI.get()))
                            .with(ItemEntry.builder(ItemsRegistry.IRON_CLAYMORE.get()))
                            .with(ItemEntry.builder(ItemsRegistry.IRON_CHAKRAM.get()))
                            .with(ItemEntry.builder(ItemsRegistry.IRON_GREATAXE.get()))
                            .with(ItemEntry.builder(ItemsRegistry.IRON_GREATHAMMER.get()))
                            .with(ItemEntry.builder(ItemsRegistry.IRON_SCYTHE.get()))
                            .with(ItemEntry.builder(ItemsRegistry.IRON_HALBERD.get()))
                            .with(ItemEntry.builder(ItemsRegistry.GOLD_LONGSWORD.get()))
                            .with(ItemEntry.builder(ItemsRegistry.GOLD_TWINBLADE.get()))
                            .with(ItemEntry.builder(ItemsRegistry.GOLD_RAPIER.get()))
                            .with(ItemEntry.builder(ItemsRegistry.GOLD_CUTLASS.get()))
                            .with(ItemEntry.builder(ItemsRegistry.GOLD_KATANA.get()))
                            .with(ItemEntry.builder(ItemsRegistry.GOLD_GLAIVE.get()))
                            .with(ItemEntry.builder(ItemsRegistry.GOLD_WARGLAIVE.get()))
                            .with(ItemEntry.builder(ItemsRegistry.GOLD_SPEAR.get()))
                            .with(ItemEntry.builder(ItemsRegistry.GOLD_SAI.get()))
                            .with(ItemEntry.builder(ItemsRegistry.GOLD_CLAYMORE.get()))
                            .with(ItemEntry.builder(ItemsRegistry.GOLD_GREATHAMMER.get()))
                            .with(ItemEntry.builder(ItemsRegistry.GOLD_CHAKRAM.get()))
                            .with(ItemEntry.builder(ItemsRegistry.GOLD_GREATAXE.get()))
                            .with(ItemEntry.builder(ItemsRegistry.GOLD_SCYTHE.get()))
                            .with(ItemEntry.builder(ItemsRegistry.GOLD_HALBERD.get()));

                    context.addPool(pool);
                }
            }
        }));*/

        /*//RARE
        LootEvent.MODIFY_LOOT_TABLE.register(((lootTables, id, context, builtin) -> {
            if (Config.getBoolean("enableLootDrops", "Loot", ConfigDefaultValues.enableLootDrops) && id.getPath().contains("chests") && !id.getPath().contains("spectrum")) {
                if (!Config.getBoolean("enableLootInVillages", "Loot", ConfigDefaultValues.enableLootInVillages) && id.getPath().contains("village")) {
                    //Do nothing
                }
                else {
                    LootPool.Builder pool = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(rareLootWeight)) // 1 = 100% of the time
                            .apply(EnchantRandomlyLootFunction.builder())
                            .with(ItemEntry.builder(ItemsRegistry.DIAMOND_LONGSWORD.get()))
                            .with(ItemEntry.builder(ItemsRegistry.DIAMOND_TWINBLADE.get()))
                            .with(ItemEntry.builder(ItemsRegistry.DIAMOND_RAPIER.get()))
                            .with(ItemEntry.builder(ItemsRegistry.DIAMOND_CUTLASS.get()))
                            .with(ItemEntry.builder(ItemsRegistry.DIAMOND_KATANA.get()))
                            .with(ItemEntry.builder(ItemsRegistry.DIAMOND_SPEAR.get()))
                            .with(ItemEntry.builder(ItemsRegistry.DIAMOND_GLAIVE.get()))
                            .with(ItemEntry.builder(ItemsRegistry.DIAMOND_WARGLAIVE.get()))
                            .with(ItemEntry.builder(ItemsRegistry.DIAMOND_SAI.get()))
                            .with(ItemEntry.builder(ItemsRegistry.DIAMOND_CLAYMORE.get()))
                            .with(ItemEntry.builder(ItemsRegistry.DIAMOND_GREATHAMMER.get()))
                            .with(ItemEntry.builder(ItemsRegistry.DIAMOND_CHAKRAM.get()))
                            .with(ItemEntry.builder(ItemsRegistry.DIAMOND_GREATAXE.get()))
                            .with(ItemEntry.builder(ItemsRegistry.DIAMOND_SCYTHE.get()))
                            .with(ItemEntry.builder(ItemsRegistry.DIAMOND_HALBERD.get()));

                    context.addPool(pool);
                }
            }
        }));*/
        /*//RARE 2
        LootEvent.MODIFY_LOOT_TABLE.register(((lootTables, id, context, builtin) -> {
            if (Config.getBoolean("enableLootDrops", "Loot", ConfigDefaultValues.enableLootDrops) && id.getPath().contains("chests") && !id.getPath().contains("spectrum")) {
                if (!Config.getBoolean("enableLootInVillages", "Loot", ConfigDefaultValues.enableLootInVillages) && id.getPath().contains("village")) {
                    //Do nothing
                }
                else {
                    LootPool.Builder pool = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(runicLootWeight)) // 1 = 100% of the time
                            .with(ItemEntry.builder(ItemsRegistry.RUNIC_TABLET.get()));
                    context.addPool(pool);
                }
            }
        }));*/

        //UNIQUE
        // Check each loot table against the listed namespaces in the loot_config.json, if there's a match modify the
        // table according to the config. Otherwise, use the loot global loot modifiers set in the general_config.json

        LootEvent.MODIFY_LOOT_TABLE.register(((RegistryKey<LootTable> key, LootEvent.LootTableModificationContext context, boolean builtin) -> {
            Identifier id = key.getValue();
            if (Config.loot.enableLootDrops) {
                Float lootChance = Config.loot.lootTableOptions.get(id);
                if (lootChance != null && lootChance > 0f) {

                    LootPool.Builder pool = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(lootChance));

                    swords.get().stream().filter(it -> !Config.loot.disabledUniqueWeaponLoot.contains(it)).forEach( item ->
                            pool.with(ItemEntry.builder(item))
                    );

                    context.addPool(pool);
                }
                else {
                    if (id.getPath().contains("chests") && !id.getPath().contains("spectrum")) {
                        LootPool.Builder pool = LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(Config.loot.uniqueLootTableWeight.get())); // 1 = 100% of the time

                        swords.get().stream().filter(it -> !Config.loot.disabledUniqueWeaponLoot.contains(it)).forEach( item ->
                                pool.with(ItemEntry.builder(item))
                        );

                        context.addPool(pool);
                    }
                }
            }
        }));


    }
}