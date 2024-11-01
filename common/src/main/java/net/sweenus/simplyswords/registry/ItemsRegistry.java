package net.sweenus.simplyswords.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Rarity;
import net.sweenus.simplyswords.SimplySwords;
import net.sweenus.simplyswords.config.Config;
import net.sweenus.simplyswords.item.ContainedRemnantItem;
import net.sweenus.simplyswords.item.EmpoweredRemnantItem;
import net.sweenus.simplyswords.item.ModToolMaterial;
import net.sweenus.simplyswords.item.NetherfusedGemItem;
import net.sweenus.simplyswords.item.RunefusedGemItem;
import net.sweenus.simplyswords.item.RunicSwordItem;
import net.sweenus.simplyswords.item.RunicTabletItem;
import net.sweenus.simplyswords.item.SimplySwordsNetheriteSwordItem;
import net.sweenus.simplyswords.item.SimplySwordsSwordItem;
import net.sweenus.simplyswords.item.custom.ArcanethystSwordItem;
import net.sweenus.simplyswords.item.custom.BrambleSwordItem;
import net.sweenus.simplyswords.item.custom.BrimstoneClaymoreItem;
import net.sweenus.simplyswords.item.custom.CaelestisSwordItem;
import net.sweenus.simplyswords.item.custom.DormantRelicSwordItem;
import net.sweenus.simplyswords.item.custom.EmberIreSwordItem;
import net.sweenus.simplyswords.item.custom.EmberlashSwordItem;
import net.sweenus.simplyswords.item.custom.EnigmaSwordItem;
import net.sweenus.simplyswords.item.custom.FlamewindSwordItem;
import net.sweenus.simplyswords.item.custom.FrostfallSwordItem;
import net.sweenus.simplyswords.item.custom.HarbingerSwordItem;
import net.sweenus.simplyswords.item.custom.HearthflameSwordItem;
import net.sweenus.simplyswords.item.custom.HiveheartSwordItem;
import net.sweenus.simplyswords.item.custom.IcewhisperSwordItem;
import net.sweenus.simplyswords.item.custom.LichbladeSwordItem;
import net.sweenus.simplyswords.item.custom.LivyatanSwordItem;
import net.sweenus.simplyswords.item.custom.MagibladeSwordItem;
import net.sweenus.simplyswords.item.custom.MagiscytheSwordItem;
import net.sweenus.simplyswords.item.custom.MagispearSwordItem;
import net.sweenus.simplyswords.item.custom.MoltenEdgeSwordItem;
import net.sweenus.simplyswords.item.custom.PlagueSwordItem;
import net.sweenus.simplyswords.item.custom.RibboncleaverSwordItem;
import net.sweenus.simplyswords.item.custom.RighteousRelicSwordItem;
import net.sweenus.simplyswords.item.custom.ShadowstingSwordItem;
import net.sweenus.simplyswords.item.custom.SoulPyreSwordItem;
import net.sweenus.simplyswords.item.custom.SoulkeeperSwordItem;
import net.sweenus.simplyswords.item.custom.SoulrenderSwordItem;
import net.sweenus.simplyswords.item.custom.StarsEdgeSwordItem;
import net.sweenus.simplyswords.item.custom.StealSwordItem;
import net.sweenus.simplyswords.item.custom.StormSwordItem;
import net.sweenus.simplyswords.item.custom.StormbringerSwordItem;
import net.sweenus.simplyswords.item.custom.StormsEdgeSwordItem;
import net.sweenus.simplyswords.item.custom.SunfireSwordItem;
import net.sweenus.simplyswords.item.custom.TaintedRelicSwordItem;
import net.sweenus.simplyswords.item.custom.TempestSwordItem;
import net.sweenus.simplyswords.item.custom.ThunderbrandSwordItem;
import net.sweenus.simplyswords.item.custom.TwistedBladeItem;
import net.sweenus.simplyswords.item.custom.WatcherClaymoreItem;
import net.sweenus.simplyswords.item.custom.WatchingWarglaiveItem;
import net.sweenus.simplyswords.item.custom.WaxweaverSwordItem;
import net.sweenus.simplyswords.item.custom.WhisperwindSwordItem;
import net.sweenus.simplyswords.item.custom.WickpiercerSwordItem;

@SuppressWarnings({"SpellCheckingInspection", "UnstableApiUsage"})
public class ItemsRegistry {

    static float iron_modifier = Config.weaponAttribute.materialDamageModifier.iron_damageModifier;
    static float gold_modifier = Config.weaponAttribute.materialDamageModifier.gold_damageModifier;
    static float diamond_modifier = Config.weaponAttribute.materialDamageModifier.diamond_damageModifier;
    static float netherite_modifier = Config.weaponAttribute.materialDamageModifier.netherite_damageModifier;
    static float runic_modifier = Config.weaponAttribute.materialDamageModifier.runic_damageModifier;

    static float longsword_modifier = Config.weaponAttribute.typeDamageModifier.longsword_damageModifier;
    static float twinblade_modifier = Config.weaponAttribute.typeDamageModifier.twinblade_damageModifier;
    static float rapier_modifier = Config.weaponAttribute.typeDamageModifier.rapier_damageModifier;
    static float katana_modifier = Config.weaponAttribute.typeDamageModifier.katana_damageModifier;
    static float sai_modifier = Config.weaponAttribute.typeDamageModifier.sai_damageModifier;
    static float spear_modifier = Config.weaponAttribute.typeDamageModifier.spear_damageModifier;
    static float glaive_modifier = Config.weaponAttribute.typeDamageModifier.glaive_damageModifier;
    static float warglaive_modifier = Config.weaponAttribute.typeDamageModifier.warglaive_damageModifier;
    static float cutlass_modifier = Config.weaponAttribute.typeDamageModifier.cutlass_damageModifier;
    static float claymore_modifier = Config.weaponAttribute.typeDamageModifier.claymore_damageModifier;
    static float greataxe_modifier = Config.weaponAttribute.typeDamageModifier.greataxe_damageModifier;
    static float greathammer_modifier = Config.weaponAttribute.typeDamageModifier.greathammer_damageModifier;
    static float chakram_modifier = Config.weaponAttribute.typeDamageModifier.chakram_damageModifier;
    static float scythe_modifier = Config.weaponAttribute.typeDamageModifier.scythe_damageModifier;
    static float halberd_modifier = Config.weaponAttribute.typeDamageModifier.halberd_damageModifier;

    static float longsword_attackspeed = Config.weaponAttribute.typeAttackSpeed.longsword_attackSpeed;
    static float twinblade_attackspeed = Config.weaponAttribute.typeAttackSpeed.twinblade_attackSpeed;
    static float rapier_attackspeed = Config.weaponAttribute.typeAttackSpeed.rapier_attackSpeed;
    static float sai_attackspeed = Config.weaponAttribute.typeAttackSpeed.sai_attackSpeed;
    static float spear_attackspeed = Config.weaponAttribute.typeAttackSpeed.spear_attackSpeed;
    static float katana_attackspeed = Config.weaponAttribute.typeAttackSpeed.katana_attackSpeed;
    static float glaive_attackspeed = Config.weaponAttribute.typeAttackSpeed.glaive_attackSpeed;
    static float warglaive_attackspeed = Config.weaponAttribute.typeAttackSpeed.warglaive_attackSpeed;
    static float cutlass_attackspeed = Config.weaponAttribute.typeAttackSpeed.cutlass_attackSpeed;
    static float claymore_attackspeed = Config.weaponAttribute.typeAttackSpeed.claymore_attackSpeed;
    static float greataxe_attackspeed = Config.weaponAttribute.typeAttackSpeed.greataxe_attackSpeed;
    static float greathammer_attackspeed = Config.weaponAttribute.typeAttackSpeed.greathammer_attackSpeed;
    static float chakram_attackspeed = Config.weaponAttribute.typeAttackSpeed.chakram_attackSpeed;
    static float scythe_attackspeed = Config.weaponAttribute.typeAttackSpeed.scythe_attackSpeed;
    static float halberd_attackspeed = Config.weaponAttribute.typeAttackSpeed.halberd_attackSpeed;

    static float brimstone_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.brimstone_attackSpeed;
    static float thewatcher_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.thewatcher_attackSpeed;
    static float stormsedge_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.stormsedge_attackSpeed;
    static float stormbringer_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.stormbringer_attackSpeed;
    static float swordonastick_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.swordonastick_attackSpeed;
    static float bramblethorn_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.bramblethorn_attackSpeed;
    static float watchingwarglaive_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.watchingwarglaive_attackSpeed;
    static float longswordofplague_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.longswordofplague_attackSpeed;
    static float emberblade_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.emberblade_attackSpeed;
    static float hearthflame_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.hearthflame_attackSpeed;
    static float soulkeeper_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.soulkeeper_attackSpeed;
    static float twistedblade_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.twistedblade_attackSpeed;
    static float soulstealer_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.soulstealer_attackSpeed;
    static float soulrender_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.soulrender_attackSpeed;
    static float mjolnir_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.mjolnir_attackSpeed;
    static float soulpyre_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.soulpyre_attackSpeed;
    static float frostfall_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.frostfall_attackSpeed;
    static float moltenedge_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.moltenedge_attackSpeed;
    static float livyatan_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.livyatan_attackSpeed;
    static float icewhisper_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.icewhisper_attackSpeed;
    static float arcanethyst_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.arcanethyst_attackSpeed;
    static float thunderbrand_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.thunderbrand_attackSpeed;
    static float lichblade_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.lichblade_attackSpeed;
    static float shadowsting_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.shadowsting_attackSpeed;
    static float sunfire_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.sunfire_attackSpeed;
    static float harbinger_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.harbinger_attackSpeed;
    static float whisperwind_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.whisperwind_attackSpeed;
    static float emberlash_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.emberlash_attackSpeed;
    static float waxweaver_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.waxweaver_attackSpeed;
    static float hiveheart_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.hiveheart_attackSpeed;
    static float starsedge_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.starsedge_attackSpeed;
    static float wickpiercer_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.wickpiercer_attackSpeed;
    static float tempest_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.tempest_attackSpeed;
    static float flamewind_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.flamewind_attackSpeed;
    static float ribboncleaver_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.ribboncleaver_attackSpeed;
    static float magiscythe_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.magiscythe_attackSpeed;
    static float enigma_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.enigma_attackSpeed;
    static float magispear_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.magispear_attackSpeed;
    static float magiblade_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.magiblade_attackSpeed;
    static float caelestis_attackspeed = Config.weaponAttribute.uniqueAttackSpeed.caelestis_attackSpeed;

    static float brimstone_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.brimstone_damageModifier;
    static float thewatcher_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.thewatcher_damageModifier;
    static float stormsedge_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.stormsedge_damageModifier;
    static float stormbringer_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.stormbringer_damageModifier;
    static float swordonastick_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.swordonastick_damageModifier;
    static float bramblethorn_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.bramblethorn_damageModifier;
    static float watchingwarglaive_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.watchingwarglaive_damageModifier;
    static float longswordofplague_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.longswordofplague_damageModifier;
    static float emberblade_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.emberblade_damageModifier;
    static float hearthflame_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.hearthflame_damageModifier;
    static float soulkeeper_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.soulkeeper_damageModifier;
    static float twistedblade_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.twistedblade_damageModifier;
    static float soulstealer_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.soulstealer_damageModifier;
    static float soulrender_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.soulrender_damageModifier;
    static float mjolnir_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.mjolnir_damageModifier;
    static float soulpyre_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.soulpyre_damageModifier;
    static float frostfall_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.frostfall_damageModifier;
    static float moltenedge_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.moltenedge_damageModifier;
    static float livyatan_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.livyatan_damageModifier;
    static float icewhisper_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.icewhisper_damageModifier;
    static float arcanethyst_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.arcanethyst_damageModifier;
    static float thunderbrand_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.thunderbrand_damageModifier;
    static float lichblade_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.lichblade_damageModifier;
    static float shadowsting_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.shadowsting_damageModifier;
    static float sunfire_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.sunfire_damageModifier;
    static float harbinger_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.harbinger_damageModifier;
    static float whisperwind_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.whisperwind_damageModifier;
    static float emberlash_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.emberlash_damageModifier;
    static float waxweaver_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.waxweaver_damageModifier;
    static float hiveheart_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.hiveheart_damageModifier;
    static float starsedge_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.starsedge_damageModifier;
    static float wickpiercer_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.wickpiercer_damageModifier;
    static float tempest_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.tempest_damageModifier;
    static float flamewind_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.flamewind_damageModifier;
    static float ribboncleaver_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.ribboncleaver_damageModifier;
    static float magiscythe_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.magiscythe_damageModifier;
    static float enigma_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.enigma_damageModifier;
    static float magispear_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.magispear_damageModifier;
    static float magiblade_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.magiblade_damageModifier;
    static float caelestis_damage_modifier = Config.weaponAttribute.uniqueDamageModifier.caelestis_damageModifier;

    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(SimplySwords.MOD_ID, RegistryKeys.ITEM);

    public static final RegistrySupplier<RunicTabletItem> RUNIC_TABLET = ITEM.register("runic_tablet", RunicTabletItem::new);
    public static final RegistrySupplier<RunefusedGemItem> RUNEFUSED_GEM = ITEM.register("runefused_gem", RunefusedGemItem::new);
    public static final RegistrySupplier<NetherfusedGemItem> NETHERFUSED_GEM = ITEM.register("netherfused_gem", NetherfusedGemItem::new);
    public static final RegistrySupplier<EmpoweredRemnantItem> EMPOWERED_REMNANT = ITEM.register("empowered_remnant", EmpoweredRemnantItem::new);
    public static final RegistrySupplier<ContainedRemnantItem> CONTAINED_REMNANT = ITEM.register("contained_remnant", ContainedRemnantItem::new);
    public static final RegistrySupplier<ContainedRemnantItem> TAMPERED_REMNANT = ITEM.register("tampered_remnant", ContainedRemnantItem::new);

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_LONGSWORD = ITEM.register("iron_longsword", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.COMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON,
                                    (int) (iron_modifier + longsword_modifier), longsword_attackspeed)), "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_TWINBLADE = ITEM.register("iron_twinblade", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.COMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON,
                                    (int) (iron_modifier + twinblade_modifier), twinblade_attackspeed)), "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_RAPIER = ITEM.register("iron_rapier", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.COMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON,
                                    (int) (iron_modifier + rapier_modifier), rapier_attackspeed)), "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_KATANA = ITEM.register("iron_katana", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.COMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON,
                                    (int) (iron_modifier + katana_modifier), katana_attackspeed)), "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_SAI = ITEM.register("iron_sai", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.COMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON,
                                    (int) (iron_modifier + sai_modifier), sai_attackspeed)), "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_SPEAR = ITEM.register("iron_spear", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.COMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON,
                                    (int) (iron_modifier + spear_modifier), spear_attackspeed)), "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_GLAIVE = ITEM.register("iron_glaive", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.COMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON,
                                    (int) (iron_modifier + glaive_modifier), glaive_attackspeed)), "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_WARGLAIVE = ITEM.register("iron_warglaive", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.COMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON,
                                    (int) (iron_modifier + warglaive_modifier), warglaive_attackspeed)), "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_CUTLASS = ITEM.register("iron_cutlass", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.COMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON,
                                    (int) (iron_modifier + cutlass_modifier), cutlass_attackspeed)), "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_CLAYMORE = ITEM.register("iron_claymore", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.COMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON,
                                    (int) (iron_modifier + claymore_modifier), claymore_attackspeed)), "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_GREATHAMMER = ITEM.register("iron_greathammer", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.COMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON,
                                    (int) (iron_modifier + greathammer_modifier), greathammer_attackspeed)), "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_GREATAXE = ITEM.register("iron_greataxe", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.COMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON,
                                    (int) (iron_modifier + greataxe_modifier), greataxe_attackspeed)), "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_CHAKRAM = ITEM.register("iron_chakram", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.COMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON,
                                    (int) (iron_modifier + chakram_modifier), chakram_attackspeed)), "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_SCYTHE = ITEM.register("iron_scythe", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.COMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON,
                                    (int) (iron_modifier + scythe_modifier), scythe_attackspeed)), "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_HALBERD = ITEM.register("iron_halberd", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.COMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON,
                                    (int) (iron_modifier + halberd_modifier), halberd_attackspeed)), "minecraft:iron_ingot"));

    // GOLD
    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_LONGSWORD = ITEM.register("gold_longsword", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.UNCOMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD,
                                    (int) (gold_modifier + longsword_modifier), longsword_attackspeed)), "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_TWINBLADE = ITEM.register("gold_twinblade", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.UNCOMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD,
                                    (int) (gold_modifier + twinblade_modifier), twinblade_attackspeed)), "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_RAPIER = ITEM.register("gold_rapier", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.UNCOMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD,
                                    (int) (gold_modifier + rapier_modifier), rapier_attackspeed)), "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_KATANA = ITEM.register("gold_katana", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.UNCOMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD,
                                    (int) (gold_modifier + katana_modifier), katana_attackspeed)), "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_SAI = ITEM.register("gold_sai", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.UNCOMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD,
                                    (int) (gold_modifier + sai_modifier), sai_attackspeed)), "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_SPEAR = ITEM.register("gold_spear", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.UNCOMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD,
                                    (int) (gold_modifier + spear_modifier), spear_attackspeed)), "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_GLAIVE = ITEM.register("gold_glaive", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.UNCOMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD,
                                    (int) (gold_modifier + glaive_modifier), glaive_attackspeed)), "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_WARGLAIVE = ITEM.register("gold_warglaive", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.UNCOMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD,
                                    (int) (gold_modifier + warglaive_modifier), warglaive_attackspeed)), "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_CUTLASS = ITEM.register("gold_cutlass", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.UNCOMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD,
                                    (int) (gold_modifier + cutlass_modifier), cutlass_attackspeed)), "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_CLAYMORE = ITEM.register("gold_claymore", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.UNCOMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD,
                                    (int) (gold_modifier + claymore_modifier), claymore_attackspeed)), "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_GREATHAMMER = ITEM.register("gold_greathammer", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.UNCOMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD,
                                    (int) (gold_modifier + greathammer_modifier), greathammer_attackspeed)), "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_GREATAXE = ITEM.register("gold_greataxe", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.UNCOMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD,
                                    (int) (gold_modifier + greataxe_modifier), greataxe_attackspeed)), "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_CHAKRAM = ITEM.register("gold_chakram", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.UNCOMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD,
                                    (int) (gold_modifier + chakram_modifier), chakram_attackspeed)), "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_SCYTHE = ITEM.register("gold_scythe", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.UNCOMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD,
                                    (int) (gold_modifier + scythe_modifier), scythe_attackspeed)), "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_HALBERD = ITEM.register("gold_halberd", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.UNCOMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD,
                                    (int) (gold_modifier + halberd_modifier), halberd_attackspeed)), "minecraft:gold_ingot"));

    // DIAMOND
    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_LONGSWORD = ITEM.register("diamond_longsword", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,
                                    (int) (diamond_modifier + longsword_modifier), longsword_attackspeed)), "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_TWINBLADE = ITEM.register("diamond_twinblade", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,
                                            (int) (diamond_modifier + twinblade_modifier), twinblade_attackspeed)), "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_RAPIER = ITEM.register("diamond_rapier", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,
                                    (int) (diamond_modifier + rapier_modifier), rapier_attackspeed)), "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_KATANA = ITEM.register("diamond_katana", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,
                                    (int) (diamond_modifier + katana_modifier), katana_attackspeed)), "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_SAI = ITEM.register("diamond_sai", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,
                                    (int) (diamond_modifier + sai_modifier), sai_attackspeed)), "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_SPEAR = ITEM.register("diamond_spear", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,
                                    (int) (diamond_modifier + spear_modifier), spear_attackspeed)), "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_GLAIVE = ITEM.register("diamond_glaive", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,
                                    (int) (diamond_modifier + glaive_modifier), glaive_attackspeed)), "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_WARGLAIVE = ITEM.register("diamond_warglaive", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,
                                    (int) (diamond_modifier + warglaive_modifier), warglaive_attackspeed)), "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_CUTLASS = ITEM.register("diamond_cutlass", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,
                                    (int) (diamond_modifier + cutlass_modifier), cutlass_attackspeed)), "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_CLAYMORE = ITEM.register("diamond_claymore", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,
                                    (int) (diamond_modifier + claymore_modifier), claymore_attackspeed)), "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_GREATHAMMER = ITEM.register("diamond_greathammer", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,
                                    (int) (diamond_modifier + greathammer_modifier), greathammer_attackspeed)), "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_GREATAXE = ITEM.register("diamond_greataxe", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,
                                    (int) (diamond_modifier + greataxe_modifier), greataxe_attackspeed)), "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_CHAKRAM = ITEM.register("diamond_chakram", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,
                                    (int) (diamond_modifier + chakram_modifier), chakram_attackspeed)), "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_SCYTHE = ITEM.register("diamond_scythe", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,
                                    (int) (diamond_modifier + scythe_modifier), scythe_attackspeed)), "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_HALBERD = ITEM.register("diamond_halberd", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,
                                    (int) (diamond_modifier + halberd_modifier), halberd_attackspeed)), "minecraft:diamond"));

    // NETHERITE
    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_LONGSWORD = ITEM.register("netherite_longsword", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE,
                                    (int) (netherite_modifier + longsword_modifier), longsword_attackspeed)), "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_TWINBLADE = ITEM.register("netherite_twinblade", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE,
                                    (int) (netherite_modifier + twinblade_modifier), twinblade_attackspeed)), "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_RAPIER = ITEM.register("netherite_rapier", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE,
                                    (int) (netherite_modifier + rapier_modifier), rapier_attackspeed)), "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_KATANA = ITEM.register("netherite_katana", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE,
                                    (int) (netherite_modifier + katana_modifier), katana_attackspeed)), "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_SAI = ITEM.register("netherite_sai", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE,
                                    (int) (netherite_modifier + sai_modifier), sai_attackspeed)), "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_SPEAR = ITEM.register("netherite_spear", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE,
                                    (int) (netherite_modifier + spear_modifier), spear_attackspeed)), "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_GLAIVE = ITEM.register("netherite_glaive", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE,
                                    (int) (netherite_modifier + glaive_modifier), glaive_attackspeed)), "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_WARGLAIVE = ITEM.register("netherite_warglaive", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE,
                                    (int) (netherite_modifier + warglaive_modifier), warglaive_attackspeed)), "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_CUTLASS = ITEM.register("netherite_cutlass", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE,
                                    (int) (netherite_modifier + cutlass_modifier), cutlass_attackspeed)), "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_CLAYMORE = ITEM.register("netherite_claymore", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE,
                                    (int) (netherite_modifier + claymore_modifier), claymore_attackspeed)), "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_GREATHAMMER = ITEM.register("netherite_greathammer", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE,
                                    (int) (netherite_modifier + greathammer_modifier), greathammer_attackspeed)), "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_GREATAXE = ITEM.register("netherite_greataxe", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE,
                                    (int) (netherite_modifier + greataxe_modifier), greataxe_attackspeed)), "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_CHAKRAM = ITEM.register("netherite_chakram", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE,
                                    (int) (netherite_modifier + chakram_modifier), chakram_attackspeed)), "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_SCYTHE = ITEM.register("netherite_scythe", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE,
                                    (int) (netherite_modifier + scythe_modifier), scythe_attackspeed)), "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_HALBERD = ITEM.register("netherite_halberd", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE,
                                    (int) (netherite_modifier + halberd_modifier), halberd_attackspeed)), "minecraft:netherite_ingot"));

    // RUNIC
    public static final RegistrySupplier<RunicSwordItem> RUNIC_LONGSWORD = ITEM.register("runic_longsword", () ->
            new RunicSwordItem(
                    ModToolMaterial.RUNIC,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.RUNIC,
                                    (int) (runic_modifier + longsword_modifier), longsword_attackspeed))));

    public static final RegistrySupplier<RunicSwordItem> RUNIC_TWINBLADE = ITEM.register("runic_twinblade", () ->
            new RunicSwordItem(
                    ModToolMaterial.RUNIC,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.RUNIC,
                                    (int) (runic_modifier + twinblade_modifier), twinblade_attackspeed))));

    public static final RegistrySupplier<RunicSwordItem> RUNIC_RAPIER = ITEM.register("runic_rapier", () ->
            new RunicSwordItem(
                    ModToolMaterial.RUNIC,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.RUNIC,
                                    (int) (runic_modifier + rapier_modifier), rapier_attackspeed))));

    public static final RegistrySupplier<RunicSwordItem> RUNIC_KATANA = ITEM.register("runic_katana", () ->
            new RunicSwordItem(
                    ModToolMaterial.RUNIC,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.RUNIC,
                                    (int) (runic_modifier + katana_modifier), katana_attackspeed))));

    public static final RegistrySupplier<RunicSwordItem> RUNIC_SAI = ITEM.register("runic_sai", () ->
            new RunicSwordItem(
                    ModToolMaterial.RUNIC,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.RUNIC,
                                    (int) (runic_modifier + sai_modifier), sai_attackspeed))));

    public static final RegistrySupplier<RunicSwordItem> RUNIC_SPEAR = ITEM.register("runic_spear", () ->
            new RunicSwordItem(
                    ModToolMaterial.RUNIC,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.RUNIC,
                                    (int) (runic_modifier + spear_modifier), spear_attackspeed))));

    public static final RegistrySupplier<RunicSwordItem> RUNIC_GLAIVE = ITEM.register("runic_glaive", () ->
            new RunicSwordItem(
                    ModToolMaterial.RUNIC,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.RUNIC,
                                    (int) (runic_modifier + glaive_modifier), glaive_attackspeed))));

    public static final RegistrySupplier<RunicSwordItem> RUNIC_WARGLAIVE = ITEM.register("runic_warglaive", () ->
            new RunicSwordItem(
                    ModToolMaterial.RUNIC,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.RUNIC,
                                    (int) (runic_modifier + warglaive_modifier), warglaive_attackspeed))));

    public static final RegistrySupplier<RunicSwordItem> RUNIC_CUTLASS = ITEM.register("runic_cutlass", () ->
            new RunicSwordItem(
                    ModToolMaterial.RUNIC,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.RUNIC,
                                    (int) (runic_modifier + cutlass_modifier), cutlass_attackspeed))));

    public static final RegistrySupplier<RunicSwordItem> RUNIC_CLAYMORE = ITEM.register("runic_claymore", () ->
            new RunicSwordItem(
                    ModToolMaterial.RUNIC,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.RUNIC,
                                    (int) (runic_modifier + claymore_modifier), claymore_attackspeed))));

    public static final RegistrySupplier<RunicSwordItem> RUNIC_CHAKRAM = ITEM.register("runic_chakram", () ->
            new RunicSwordItem(
                    ModToolMaterial.RUNIC,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.RUNIC,
                                    (int) (runic_modifier + chakram_modifier), chakram_attackspeed))));

    public static final RegistrySupplier<RunicSwordItem> RUNIC_GREATAXE = ITEM.register("runic_greataxe", () ->
            new RunicSwordItem(
                    ModToolMaterial.RUNIC,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.RUNIC,
                                    (int) (runic_modifier + greataxe_modifier), greataxe_attackspeed))));

    public static final RegistrySupplier<RunicSwordItem> RUNIC_GREATHAMMER = ITEM.register("runic_greathammer", () ->
            new RunicSwordItem(
                    ModToolMaterial.RUNIC,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.RUNIC,
                                    (int) (runic_modifier + greathammer_modifier), greathammer_attackspeed))));

    public static final RegistrySupplier<RunicSwordItem> RUNIC_SCYTHE = ITEM.register("runic_scythe", () ->
            new RunicSwordItem(
                    ModToolMaterial.RUNIC,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.RUNIC,
                                    (int) (runic_modifier + scythe_modifier), scythe_attackspeed))));

    public static final RegistrySupplier<RunicSwordItem> RUNIC_HALBERD = ITEM.register("runic_halberd", () ->
            new RunicSwordItem(
                    ModToolMaterial.RUNIC,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.RUNIC,
                                    (int) (runic_modifier + halberd_modifier), halberd_attackspeed))));

    // SPECIAL
    public static final RegistrySupplier<BrimstoneClaymoreItem> BRIMSTONE_CLAYMORE = ITEM.register("brimstone_claymore", () ->
            new BrimstoneClaymoreItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) brimstone_damage_modifier, brimstone_attackspeed))));

    public static final RegistrySupplier<WatcherClaymoreItem> WATCHER_CLAYMORE = ITEM.register("watcher_claymore", () ->
            new WatcherClaymoreItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) thewatcher_damage_modifier, thewatcher_attackspeed))));

    public static final RegistrySupplier<StormsEdgeSwordItem> STORMS_EDGE = ITEM.register("storms_edge", () ->
            new StormsEdgeSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) stormsedge_damage_modifier, stormsedge_attackspeed))));

    public static final RegistrySupplier<StormbringerSwordItem> STORMBRINGER = ITEM.register("stormbringer", () ->
            new StormbringerSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) stormbringer_damage_modifier, stormbringer_attackspeed))));

    public static final RegistrySupplier<SwordItem> SWORD_ON_A_STICK = ITEM.register("sword_on_a_stick", () ->
            new SwordItem(
                    ToolMaterials.WOOD,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.WOOD,
                                    (int) swordonastick_damage_modifier, swordonastick_attackspeed))));

    public static final RegistrySupplier<BrambleSwordItem> BRAMBLETHORN = ITEM.register("bramblethorn", () ->
            new BrambleSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) bramblethorn_damage_modifier, bramblethorn_attackspeed))));

    public static final RegistrySupplier<WatchingWarglaiveItem> WATCHING_WARGLAIVE = ITEM.register("watching_warglaive", () ->
            new WatchingWarglaiveItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) watchingwarglaive_damage_modifier, watchingwarglaive_attackspeed))));

    public static final RegistrySupplier<PlagueSwordItem> TOXIC_LONGSWORD = ITEM.register("toxic_longsword", () ->
            new PlagueSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) longswordofplague_damage_modifier, longswordofplague_attackspeed))));

    public static final RegistrySupplier<EmberIreSwordItem> EMBERBLADE = ITEM.register("emberblade", () ->
            new EmberIreSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) emberblade_damage_modifier, emberblade_attackspeed))));

    public static final RegistrySupplier<HearthflameSwordItem> HEARTHFLAME = ITEM.register("hearthflame", () ->
            new HearthflameSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) hearthflame_damage_modifier, hearthflame_attackspeed))));

    public static final RegistrySupplier<SoulkeeperSwordItem> SOULKEEPER = ITEM.register("soulkeeper", () ->
            new SoulkeeperSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) soulkeeper_damage_modifier, soulkeeper_attackspeed))));

    public static final RegistrySupplier<TwistedBladeItem> TWISTED_BLADE = ITEM.register("twisted_blade", () ->
            new TwistedBladeItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) twistedblade_damage_modifier, twistedblade_attackspeed))));

    public static final RegistrySupplier<StealSwordItem> SOULSTEALER = ITEM.register("soulstealer", () ->
            new StealSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) soulstealer_damage_modifier, soulstealer_attackspeed))));

    public static final RegistrySupplier<SoulrenderSwordItem> SOULRENDER = ITEM.register("soulrender", () ->
            new SoulrenderSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) soulrender_damage_modifier, soulrender_attackspeed))));

    public static final RegistrySupplier<SoulPyreSwordItem> SOULPYRE = ITEM.register("soulpyre", () ->
            new SoulPyreSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) soulpyre_damage_modifier, soulpyre_attackspeed))));

    public static final RegistrySupplier<FrostfallSwordItem> FROSTFALL = ITEM.register("frostfall", () ->
            new FrostfallSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) frostfall_damage_modifier, frostfall_attackspeed))));

    public static final RegistrySupplier<MoltenEdgeSwordItem> MOLTEN_EDGE = ITEM.register("molten_edge", () ->
            new MoltenEdgeSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) moltenedge_damage_modifier, moltenedge_attackspeed))));

    public static final RegistrySupplier<LivyatanSwordItem> LIVYATAN = ITEM.register("livyatan", () ->
            new LivyatanSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) livyatan_damage_modifier, livyatan_attackspeed))));

    public static final RegistrySupplier<IcewhisperSwordItem> ICEWHISPER = ITEM.register("icewhisper", () ->
            new IcewhisperSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) icewhisper_damage_modifier, icewhisper_attackspeed))));

    public static final RegistrySupplier<ArcanethystSwordItem> ARCANETHYST = ITEM.register("arcanethyst", () ->
            new ArcanethystSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) arcanethyst_damage_modifier, arcanethyst_attackspeed))));

    public static final RegistrySupplier<ThunderbrandSwordItem> THUNDERBRAND = ITEM.register("thunderbrand", () ->
            new ThunderbrandSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) thunderbrand_damage_modifier, thunderbrand_attackspeed))));

    public static final RegistrySupplier<StormSwordItem> MJOLNIR = ITEM.register("mjolnir", () ->
            new StormSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) mjolnir_damage_modifier, mjolnir_attackspeed))));

    public static final RegistrySupplier<LichbladeSwordItem> SLUMBERING_LICHBLADE = ITEM.register("slumbering_lichblade", () ->
            new LichbladeSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) lichblade_damage_modifier, lichblade_attackspeed))));

    public static final RegistrySupplier<LichbladeSwordItem> WAKING_LICHBLADE = ITEM.register("waking_lichblade", () ->
            new LichbladeSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) lichblade_damage_modifier, lichblade_attackspeed))));

    public static final RegistrySupplier<LichbladeSwordItem> AWAKENED_LICHBLADE = ITEM.register("awakened_lichblade", () ->
            new LichbladeSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) lichblade_damage_modifier, lichblade_attackspeed))));

    public static final RegistrySupplier<ShadowstingSwordItem> SHADOWSTING = ITEM.register("shadowsting", () ->
            new ShadowstingSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) shadowsting_damage_modifier, shadowsting_attackspeed))));

    public static final RegistrySupplier<DormantRelicSwordItem> DORMANT_RELIC = ITEM.register("dormant_relic", () ->
            new DormantRelicSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) sunfire_damage_modifier, sunfire_attackspeed))));

    public static final RegistrySupplier<RighteousRelicSwordItem> RIGHTEOUS_RELIC = ITEM.register("righteous_relic", () ->
            new RighteousRelicSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) sunfire_damage_modifier, sunfire_attackspeed))));

    public static final RegistrySupplier<TaintedRelicSwordItem> TAINTED_RELIC = ITEM.register("tainted_relic", () ->
            new TaintedRelicSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) harbinger_damage_modifier, harbinger_attackspeed))));

    public static final RegistrySupplier<SunfireSwordItem> SUNFIRE = ITEM.register("sunfire", () ->
            new SunfireSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                            (int) sunfire_damage_modifier, sunfire_attackspeed))));

    public static final RegistrySupplier<HarbingerSwordItem> HARBINGER = ITEM.register("harbinger", () ->
            new HarbingerSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) harbinger_damage_modifier, harbinger_attackspeed))));

    public static final RegistrySupplier<WhisperwindSwordItem> WHISPERWIND = ITEM.register("whisperwind", () ->
            new WhisperwindSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) whisperwind_damage_modifier, whisperwind_attackspeed))));

    public static final RegistrySupplier<EmberlashSwordItem> EMBERLASH = ITEM.register("emberlash", () ->
            new EmberlashSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) emberlash_damage_modifier, emberlash_attackspeed))));

    public static final RegistrySupplier<WaxweaverSwordItem> WAXWEAVER = ITEM.register("waxweaver", () ->
            new WaxweaverSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) waxweaver_damage_modifier, waxweaver_attackspeed))));

    public static final RegistrySupplier<HiveheartSwordItem> HIVEHEART = ITEM.register("hiveheart", () ->
            new HiveheartSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) hiveheart_damage_modifier, hiveheart_attackspeed))));

    public static final RegistrySupplier<StarsEdgeSwordItem> STARS_EDGE = ITEM.register("stars_edge", () ->
            new StarsEdgeSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) starsedge_damage_modifier, starsedge_attackspeed))));

    public static final RegistrySupplier<WickpiercerSwordItem> WICKPIERCER = ITEM.register("wickpiercer", () ->
            new WickpiercerSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) wickpiercer_damage_modifier, wickpiercer_attackspeed))));

    public static final RegistrySupplier<TempestSwordItem> TEMPEST = ITEM.register("tempest", () ->
            new TempestSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) tempest_damage_modifier, tempest_attackspeed))));

    public static final RegistrySupplier<FlamewindSwordItem> FLAMEWIND = ITEM.register("flamewind", () ->
            new FlamewindSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) flamewind_damage_modifier, flamewind_attackspeed))));

    public static final RegistrySupplier<RibboncleaverSwordItem> RIBBONCLEAVER = ITEM.register("ribboncleaver", () ->
            new RibboncleaverSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) ribboncleaver_damage_modifier, ribboncleaver_attackspeed))));

    public static final RegistrySupplier<DormantRelicSwordItem> DECAYING_RELIC = ITEM.register( "decaying_relic", () ->
            new DormantRelicSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) magiscythe_damage_modifier, magiscythe_attackspeed))));

    public static final RegistrySupplier<MagiscytheSwordItem> MAGISCYTHE = ITEM.register("magiscythe", () ->
            new MagiscytheSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) magiscythe_damage_modifier, magiscythe_attackspeed))));

    public static final RegistrySupplier<EnigmaSwordItem> ENIGMA = ITEM.register("enigma", () ->
            new EnigmaSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) enigma_damage_modifier, enigma_attackspeed))));

    public static final RegistrySupplier<MagispearSwordItem> MAGISPEAR = ITEM.register("magispear", () ->
            new MagispearSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) magispear_damage_modifier, magispear_attackspeed))));

    public static final RegistrySupplier<MagibladeSwordItem> MAGIBLADE = ITEM.register("magiblade", () ->
            new MagibladeSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) magiblade_damage_modifier, magiblade_attackspeed))));

    public static final RegistrySupplier<CaelestisSwordItem> CAELESTIS = ITEM.register("caelestis", () ->
            new CaelestisSwordItem(
                    ModToolMaterial.UNIQUE,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.EPIC).fireproof()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.UNIQUE,
                                    (int) caelestis_damage_modifier, caelestis_attackspeed))));
}