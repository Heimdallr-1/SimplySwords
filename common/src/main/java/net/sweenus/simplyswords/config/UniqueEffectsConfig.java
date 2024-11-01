package net.sweenus.simplyswords.config;

import me.fzzyhmstrs.fzzy_config.config.Config;
import me.fzzyhmstrs.fzzy_config.validation.misc.ValidatedAny;
import me.fzzyhmstrs.fzzy_config.validation.misc.ValidatedCondition;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sweenus.simplyswords.SimplySwords;
import net.sweenus.simplyswords.item.custom.ArcanethystSwordItem;
import net.sweenus.simplyswords.item.custom.BrambleSwordItem;
import net.sweenus.simplyswords.item.custom.BrimstoneClaymoreItem;
import net.sweenus.simplyswords.item.custom.CaelestisSwordItem;
import net.sweenus.simplyswords.item.custom.DreadtideSwordItem;
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
import net.sweenus.simplyswords.item.custom.TempestSwordItem;
import net.sweenus.simplyswords.item.custom.ThunderbrandSwordItem;
import net.sweenus.simplyswords.item.custom.TwistedBladeItem;
import net.sweenus.simplyswords.item.custom.WatcherSwordItem;
import net.sweenus.simplyswords.item.custom.WaxweaverSwordItem;
import net.sweenus.simplyswords.item.custom.WhisperwindSwordItem;
import net.sweenus.simplyswords.item.custom.WickpiercerSwordItem;

public class UniqueEffectsConfig extends Config {

    public UniqueEffectsConfig() {
        super(Identifier.of(SimplySwords.MOD_ID, "unique_effects"));
    }

    public float abilityAbsorptionCap = 20f;

    public HarbingerSwordItem.EffectSettings     abyssalStandard = new HarbingerSwordItem.EffectSettings();
    public ArcanethystSwordItem.EffectSettings   arcaneAssault = new ArcanethystSwordItem.EffectSettings();
    public CaelestisSwordItem.EffectSettings     astralShift = new CaelestisSwordItem.EffectSettings();
    public BrambleSwordItem.EffectSettings       bramble = new BrambleSwordItem.EffectSettings();
    public BrimstoneClaymoreItem.EffectSettings  brimstone = new BrimstoneClaymoreItem.EffectSettings();
    public StarsEdgeSwordItem.EffectSettings     celestialSurge = new StarsEdgeSwordItem.EffectSettings();
    public EmberIreSwordItem.EffectSettings      emberIre = new EmberIreSwordItem.EffectSettings();
    public FlamewindSwordItem.EffectSettings     emberstorm = new FlamewindSwordItem.EffectSettings();
    public EnigmaSwordItem.EffectSettings        enigma = new EnigmaSwordItem.EffectSettings();
    public WhisperwindSwordItem.EffectSettings   fatalFlicker = new WhisperwindSwordItem.EffectSettings();
    public TwistedBladeItem.EffectSettings       ferocity = new TwistedBladeItem.EffectSettings();
    public WickpiercerSwordItem.EffectSettings   flickerFury = new WickpiercerSwordItem.EffectSettings();
    public FrostfallSwordItem.EffectSettings     frostFury = new FrostfallSwordItem.EffectSettings();
    public LivyatanSwordItem.EffectSettings      frostShatter = new LivyatanSwordItem.EffectSettings();
    public HiveheartSwordItem.EffectSettings     hivemind = new HiveheartSwordItem.EffectSettings();
    public MagibladeSwordItem.EffectSettings     magiblade = new MagibladeSwordItem.EffectSettings();
    public MagispearSwordItem.EffectSettings     magislam = new MagispearSwordItem.EffectSettings();
    public MagiscytheSwordItem.EffectSettings    magistorm = new MagiscytheSwordItem.EffectSettings();
    public MoltenEdgeSwordItem.EffectSettings    moltenRoar = new MoltenEdgeSwordItem.EffectSettings();
    public IcewhisperSwordItem.EffectSettings    permafrost = new IcewhisperSwordItem.EffectSettings();
    public PlagueSwordItem.EffectSettings        plague = new PlagueSwordItem.EffectSettings();
    public RibboncleaverSwordItem.EffectSettings ribbonwrath = new RibboncleaverSwordItem.EffectSettings();
    public SunfireSwordItem.EffectSettings       righteousStandard = new SunfireSwordItem.EffectSettings();
    public ShadowstingSwordItem.EffectSettings   shadowmist = new ShadowstingSwordItem.EffectSettings();
    public StormbringerSwordItem.EffectSettings  shockDeflect = new StormbringerSwordItem.EffectSettings();
    public EmberlashSwordItem.EffectSettings     smoulder = new EmberlashSwordItem.EffectSettings();
    public LichbladeSwordItem.EffectSettings     soulAnguish = new LichbladeSwordItem.EffectSettings();
    public SoulkeeperSwordItem.EffectSettings    soulkeeper = new SoulkeeperSwordItem.EffectSettings();
    public SoulrenderSwordItem.EffectSettings    soulRend = new SoulrenderSwordItem.EffectSettings();
    public SoulPyreSwordItem.EffectSettings      soultether = new SoulPyreSwordItem.EffectSettings();
    public StealSwordItem.EffectSettings         steal = new StealSwordItem.EffectSettings();
    public StormSwordItem.EffectSettings         storm = new StormSwordItem.EffectSettings();
    public StormsEdgeSwordItem.EffectSettings    stormJolt = new StormsEdgeSwordItem.EffectSettings();
    public ThunderbrandSwordItem.EffectSettings  thunderBlitz = new ThunderbrandSwordItem.EffectSettings();
    public HearthflameSwordItem.EffectSettings   volcanicFury = new HearthflameSwordItem.EffectSettings();
    public TempestSwordItem.EffectSettings       vortex = new TempestSwordItem.EffectSettings();
    public WatcherSwordItem.EffectSettings       watcher = new WatcherSwordItem.EffectSettings();
    public WaxweaverSwordItem.EffectSettings     waxweave = new WaxweaverSwordItem.EffectSettings();

    // eldritch end compat
    public ValidatedCondition<DreadtideSwordItem.EffectSettings> voidcaller = new ValidatedAny<>(new DreadtideSwordItem.EffectSettings())
            .toCondition(
                    () -> SimplySwords.passVersionCheck("eldritch_end", SimplySwords.minimumEldritchEndVersion),
                    Text.translatable("simplyswords.unique_effects.voidcaller.compat"),
					DreadtideSwordItem.EffectSettings::new
            );
}