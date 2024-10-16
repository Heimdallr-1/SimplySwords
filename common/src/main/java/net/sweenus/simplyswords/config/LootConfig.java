package net.sweenus.simplyswords.config;

import com.google.common.collect.ImmutableMap;
import me.fzzyhmstrs.fzzy_config.annotations.Action;
import me.fzzyhmstrs.fzzy_config.annotations.RequiresAction;
import me.fzzyhmstrs.fzzy_config.config.Config;
import me.fzzyhmstrs.fzzy_config.validation.collection.ValidatedIdentifierMap;
import me.fzzyhmstrs.fzzy_config.validation.collection.ValidatedSet;
import me.fzzyhmstrs.fzzy_config.validation.minecraft.ValidatedIdentifier;
import me.fzzyhmstrs.fzzy_config.validation.minecraft.ValidatedRegistryType;
import me.fzzyhmstrs.fzzy_config.validation.misc.ValidatedBoolean;
import me.fzzyhmstrs.fzzy_config.validation.misc.ValidatedCondition;
import me.fzzyhmstrs.fzzy_config.validation.number.ValidatedFloat;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sweenus.simplyswords.SimplySwords;
import net.sweenus.simplyswords.item.UniqueSwordItem;

@RequiresAction(action = Action.RELOAD_DATA)
public class LootConfig extends Config {

    public LootConfig() {
        super(Identifier.of(SimplySwords.MOD_ID, "loot"));
    }

    @SuppressWarnings("deprecation")
	public ValidatedIdentifierMap<Float> lootTableOptions = new ValidatedIdentifierMap.Builder<Float>()
            .keyHandler(ValidatedIdentifier.ofRegistryKey(RegistryKeys.LOOT_TABLE))
            .valueHandler(new ValidatedFloat(0.01f, 1f, 0f))
            .defaults(
                    ImmutableMap.<Identifier, Float>builder()
                            .put(Identifier.ofVanilla("entities/wither"), 0.05f)
                            .put(Identifier.ofVanilla("entities/ender_dragon"), 0.5f)
                            .put(Identifier.ofVanilla("chests/ruined_portal"), 0f)
                            .put(Identifier.ofVanilla("chests/village/village_armorer"), 0f)
                            .put(Identifier.ofVanilla("chests/village/village_butcher"), 0f)
                            .put(Identifier.ofVanilla("chests/village/village_cartographer"), 0f)
                            .put(Identifier.ofVanilla("chests/village/village_desert_house"), 0f)
                            .put(Identifier.ofVanilla("chests/village/village_fisher"), 0f)
                            .put(Identifier.ofVanilla("chests/village/village_fletcher"), 0f)
                            .put(Identifier.ofVanilla("chests/village/village_mason"), 0f)
                            .put(Identifier.ofVanilla("chests/village/village_plains_house"), 0f)
                            .put(Identifier.ofVanilla("chests/village/village_savanna_hous"), 0f)
                            .put(Identifier.ofVanilla("chests/village/village_shepard"), 0f)
                            .put(Identifier.ofVanilla("chests/village/village_snowy_house"), 0f)
                            .put(Identifier.ofVanilla("chests/village/village_taiga_house"), 0f)
                            .put(Identifier.ofVanilla("chests/village/village_tannery"), 0f)
                            .put(Identifier.ofVanilla("chests/village/village_temple"), 0f)
                            .put(Identifier.ofVanilla("chests/village/village_toolsmith"), 0f)
                            .put(Identifier.ofVanilla("chests/village/village_weaponsmith"), 0f)
                            .build()
            ).build();

    public boolean enableLootDrops = true;
    public boolean enableLootInVillages = false;

    public ValidatedFloat standardLootTableWeight = new ValidatedFloat(0.01f, 1f, 0f);
    public ValidatedFloat rareLootTableWeight = new ValidatedFloat(0.004f, 1f, 0f);
    public ValidatedFloat runicLootTableWeight = new ValidatedFloat(0.007f, 1f, 0f);
    public ValidatedFloat uniqueLootTableWeight = new ValidatedFloat(0.001f, 1f, 0f);
    public ValidatedCondition<Boolean> enableContainedRemnants = new ValidatedBoolean().toCondition(() -> uniqueLootTableWeight.get() == 0f, Text.translatable("simplyswords.loot.enableContainedRemnants.condition"), () -> false).withFailTitle(Text.translatable("simplyswords.loot.enableContainedRemnants.failTitle"));

    public ValidatedSet<Item> disabledUniqueWeaponLoot = ValidatedRegistryType.of(Items.AIR, Registries.ITEM, (entry) -> entry.value() instanceof UniqueSwordItem).toSet();

    public boolean enableTheWatcher = true;
    public boolean enableWatchingWarglaive = true;
    public boolean enableLongswordOfThePlague = true;
    public boolean enableSwordOnAStick = true;
    public boolean enableBramblethorn = true;
    public boolean enableStormsEdge = true;
    public boolean enableStormbringer = true;
    public boolean enableMjolnir = true;
    public boolean enableEmberblade = true;
    public boolean enableHearthflame = true;
    public boolean enableTwistedBlade = true;
    public boolean enableSoulrender = true;
    public boolean enableSoulpyre = true;
    public boolean enableSoulkeeper = true;
    public boolean enableSoulstealer = true;
    public boolean enableFrostfall = true;
    public boolean enableMoltenEdge = true;
    public boolean enableLivyatan = true;
    public boolean enableIcewhisper = true;
    public boolean enableArcanethyst = true;
    public boolean enableThunderbrand = true;
    public boolean enableBrimstone = true;
    public boolean enableSlumberingLichblade = true;
    public boolean enableShadowsting = true;
    public boolean enableDormantRelic = true;
    public boolean enableWhisperwind = true;
    public boolean enableEmberlash = true;
    public boolean enableWaxweaver = true;
    public boolean enableHiveheart = true;
    public boolean enableStarsEdge = true;
    public boolean enableWickpiercer = true;
    public boolean enableTempest = true;
    public boolean enableFlamewind = true;
    public boolean enableRibboncleaver = true;
    public boolean enableCaelestis = true;
}