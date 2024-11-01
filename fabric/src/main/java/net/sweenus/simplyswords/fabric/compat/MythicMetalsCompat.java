package net.sweenus.simplyswords.fabric.compat;

import net.sweenus.simplyswords.config.Config;
import net.sweenus.simplyswords.config.ConfigDefaultValues;

public class MythicMetalsCompat {

    //Compat for Mythic Metals

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


    static float adamantite_modifier = Config.weaponAttribute.materialDamageModifier.adamantite_damageModifier.get();
    static float aquarium_modifier = Config.weaponAttribute.materialDamageModifier.aquarium_damageModifier.get();
    static float banglum_modifier = Config.weaponAttribute.materialDamageModifier.banglum_damageModifier.get();
    static float carmot_modifier = Config.weaponAttribute.materialDamageModifier.carmot_damageModifier.get();
    static float kyber_modifier = Config.weaponAttribute.materialDamageModifier.kyber_damageModifier.get();
    static float mythril_modifier = Config.weaponAttribute.materialDamageModifier.mythril_damageModifier.get();
    static float orichalcum_modifier = Config.weaponAttribute.materialDamageModifier.orichalcum_damageModifier.get();
    static float durasteel_modifier = Config.weaponAttribute.materialDamageModifier.durasteel_damageModifier.get();
    static float osmium_modifier = Config.weaponAttribute.materialDamageModifier.osmium_damageModifier.get();
    static float prometheum_modifier = Config.weaponAttribute.materialDamageModifier.prometheum_damageModifier.get();
    static float quadrillum_modifier = Config.weaponAttribute.materialDamageModifier.quadrillum_damageModifier.get();
    static float runite_modifier = Config.weaponAttribute.materialDamageModifier.runite_damageModifier.get();
    static float star_platinum_modifier = Config.weaponAttribute.materialDamageModifier.starPlatinum_damageModifier.get();
    static float bronze_modifier = Config.weaponAttribute.materialDamageModifier.bronze_damageModifier.get();
    static float copper_modifier = Config.weaponAttribute.materialDamageModifier.copper_damageModifier.get();
    static float steel_modifier = Config.weaponAttribute.materialDamageModifier.steel_damageModifier.get();
    static float palladium_modifier = Config.weaponAttribute.materialDamageModifier.palladium_damageModifier.get();
    static float stormyx_modifier = Config.weaponAttribute.materialDamageModifier.stormyx_damageModifier.get();
    static float celestium_modifier = Config.weaponAttribute.materialDamageModifier.celestium_damageModifier.get();
    static float metallurgium_modifier = Config.weaponAttribute.materialDamageModifier.metallurgium_damageModifier.get();

    /* 1.21

    //ADAMANTITE
    public static final Item ADAMANTITE_LONGSWORD = registerItem( "mythicmetals_compat/adamantite/adamantite_longsword",
            new SimplySwordsSwordItem(ModToolMaterial.ADAMANTITE, adamantite_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:adamantite_ingot"));

    public static final Item ADAMANTITE_TWINBLADE = registerItem( "mythicmetals_compat/adamantite/adamantite_twinblade",
            new SimplySwordsSwordItem(ModToolMaterial.ADAMANTITE, adamantite_modifier + twinblade_modifier, twinblade_attackspeed,
                    "mythicmetals:adamantite_ingot"));

    public static final Item ADAMANTITE_RAPIER = registerItem( "mythicmetals_compat/adamantite/adamantite_rapier",
            new SimplySwordsSwordItem(ModToolMaterial.ADAMANTITE, adamantite_modifier + rapier_modifier, rapier_attackspeed,
                    "mythicmetals:adamantite_ingot"));

    public static final Item ADAMANTITE_KATANA = registerItem( "mythicmetals_compat/adamantite/adamantite_katana",
            new SimplySwordsSwordItem(ModToolMaterial.ADAMANTITE, adamantite_modifier + katana_modifier, katana_attackspeed,
                    "mythicmetals:adamantite_ingot"));

    public static final Item ADAMANTITE_SAI = registerItem( "mythicmetals_compat/adamantite/adamantite_sai",
            new SimplySwordsSwordItem(ModToolMaterial.ADAMANTITE, adamantite_modifier +sai_modifier, sai_attackspeed,
                    "mythicmetals:adamantite_ingot"));

    public static final Item ADAMANTITE_SPEAR = registerItem( "mythicmetals_compat/adamantite/adamantite_spear",
            new SimplySwordsSwordItem(ModToolMaterial.ADAMANTITE, adamantite_modifier + spear_modifier, spear_attackspeed,
                    "mythicmetals:adamantite_ingot"));

    public static final Item ADAMANTITE_GLAIVE = registerItem( "mythicmetals_compat/adamantite/adamantite_glaive",
            new SimplySwordsSwordItem(ModToolMaterial.ADAMANTITE, adamantite_modifier + glaive_modifier, glaive_attackspeed,
                    "mythicmetals:adamantite_ingot"));

    public static final Item ADAMANTITE_WARGLAIVE = registerItem( "mythicmetals_compat/adamantite/adamantite_warglaive",
            new SimplySwordsSwordItem(ModToolMaterial.ADAMANTITE, adamantite_modifier + warglaive_modifier, warglaive_attackspeed,
                    "mythicmetals:adamantite_ingot"));

    public static final Item ADAMANTITE_CUTLASS = registerItem( "mythicmetals_compat/adamantite/adamantite_cutlass",
            new SimplySwordsSwordItem(ModToolMaterial.ADAMANTITE, adamantite_modifier + cutlass_modifier, cutlass_attackspeed,
                    "mythicmetals:adamantite_ingot"));

    public static final Item ADAMANTITE_CLAYMORE = registerItem( "mythicmetals_compat/adamantite/adamantite_claymore",
            new SimplySwordsSwordItem(ModToolMaterial.ADAMANTITE, adamantite_modifier + claymore_modifier, claymore_attackspeed,
                    "mythicmetals:adamantite_ingot"));

    public static final Item ADAMANTITE_GREATHAMMER = registerItem( "mythicmetals_compat/adamantite/adamantite_greathammer",
            new SimplySwordsSwordItem(ModToolMaterial.ADAMANTITE, adamantite_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:adamantite_ingot"));

    public static final Item ADAMANTITE_GREATAXE = registerItem( "mythicmetals_compat/adamantite/adamantite_greataxe",
            new SimplySwordsSwordItem(ModToolMaterial.ADAMANTITE, adamantite_modifier + greataxe_modifier, greataxe_attackspeed,
                    "mythicmetals:adamantite_ingot"));

    public static final Item ADAMANTITE_CHAKRAM = registerItem( "mythicmetals_compat/adamantite/adamantite_chakram",
            new SimplySwordsSwordItem(ModToolMaterial.ADAMANTITE, adamantite_modifier +chakram_modifier, chakram_attackspeed,
                    "mythicmetals:adamantite_ingot"));

    public static final Item ADAMANTITE_SCYTHE = registerItem( "mythicmetals_compat/adamantite/adamantite_scythe",
            new SimplySwordsSwordItem(ModToolMaterial.ADAMANTITE, adamantite_modifier + scythe_modifier, scythe_attackspeed,
                    "mythicmetals:adamantite_ingot"));

    public static final Item ADAMANTITE_HALBERD = registerItem( "mythicmetals_compat/adamantite/adamantite_halberd",
            new SimplySwordsSwordItem(ModToolMaterial.ADAMANTITE, adamantite_modifier + halberd_modifier, halberd_attackspeed,
                    "mythicmetals:adamantite_ingot"));


    //AQUARIUM
    public static final Item AQUARIUM_LONGSWORD = registerItem( "mythicmetals_compat/aquarium/aquarium_longsword",
            new SimplySwordsSwordItem(ModToolMaterial.AQUARIUM, aquarium_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:aquarium_ingot"));

    public static final Item AQUARIUM_TWINBLADE = registerItem( "mythicmetals_compat/aquarium/aquarium_twinblade",
            new SimplySwordsSwordItem(ModToolMaterial.AQUARIUM, aquarium_modifier + twinblade_modifier, twinblade_attackspeed,
                    "mythicmetals:aquarium_ingot"));
    public static final Item AQUARIUM_RAPIER = registerItem( "mythicmetals_compat/aquarium/aquarium_rapier",
            new SimplySwordsSwordItem(ModToolMaterial.AQUARIUM, aquarium_modifier + rapier_modifier, rapier_attackspeed,
                    "mythicmetals:aquarium_ingot"));

    public static final Item AQUARIUM_KATANA = registerItem( "mythicmetals_compat/aquarium/aquarium_katana",
            new SimplySwordsSwordItem(ModToolMaterial.AQUARIUM, aquarium_modifier + katana_modifier, katana_attackspeed,
                    "mythicmetals:aquarium_ingot"));

    public static final Item AQUARIUM_SAI = registerItem( "mythicmetals_compat/aquarium/aquarium_sai",
            new SimplySwordsSwordItem(ModToolMaterial.AQUARIUM, aquarium_modifier +sai_modifier, sai_attackspeed,
                    "mythicmetals:aquarium_ingot"));

    public static final Item AQUARIUM_SPEAR = registerItem( "mythicmetals_compat/aquarium/aquarium_spear",
            new SimplySwordsSwordItem(ModToolMaterial.AQUARIUM, aquarium_modifier + spear_modifier, spear_attackspeed,
                    "mythicmetals:aquarium_ingot"));

    public static final Item AQUARIUM_GLAIVE = registerItem( "mythicmetals_compat/aquarium/aquarium_glaive",
            new SimplySwordsSwordItem(ModToolMaterial.AQUARIUM, aquarium_modifier + glaive_modifier, glaive_attackspeed,
                    "mythicmetals:aquarium_ingot"));

    public static final Item AQUARIUM_WARGLAIVE = registerItem( "mythicmetals_compat/aquarium/aquarium_warglaive",
            new SimplySwordsSwordItem(ModToolMaterial.AQUARIUM, aquarium_modifier + warglaive_modifier, warglaive_attackspeed,
                    "mythicmetals:aquarium_ingot"));

    public static final Item AQUARIUM_CUTLASS = registerItem( "mythicmetals_compat/aquarium/aquarium_cutlass",
            new SimplySwordsSwordItem(ModToolMaterial.AQUARIUM, aquarium_modifier + cutlass_modifier, cutlass_attackspeed,
                    "mythicmetals:aquarium_ingot"));

    public static final Item AQUARIUM_CLAYMORE = registerItem( "mythicmetals_compat/aquarium/aquarium_claymore",
            new SimplySwordsSwordItem(ModToolMaterial.AQUARIUM, aquarium_modifier + claymore_modifier, claymore_attackspeed,
                    "mythicmetals:aquarium_ingot"));

    public static final Item AQUARIUM_GREATHAMMER = registerItem( "mythicmetals_compat/aquarium/aquarium_greathammer",
            new SimplySwordsSwordItem(ModToolMaterial.AQUARIUM, aquarium_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:aquarium_ingot"));

    public static final Item AQUARIUM_GREATAXE = registerItem( "mythicmetals_compat/aquarium/aquarium_greataxe",
            new SimplySwordsSwordItem(ModToolMaterial.AQUARIUM, aquarium_modifier + greataxe_modifier, greataxe_attackspeed,
                    "mythicmetals:aquarium_ingot"));

    public static final Item AQUARIUM_CHAKRAM = registerItem( "mythicmetals_compat/aquarium/aquarium_chakram",
            new SimplySwordsSwordItem(ModToolMaterial.AQUARIUM, aquarium_modifier +chakram_modifier, chakram_attackspeed,
                    "mythicmetals:aquarium_ingot"));

    public static final Item AQUARIUM_SCYTHE = registerItem( "mythicmetals_compat/aquarium/aquarium_scythe",
            new SimplySwordsSwordItem(ModToolMaterial.AQUARIUM, aquarium_modifier + scythe_modifier, scythe_attackspeed,
                    "mythicmetals:aquarium_ingot"));

    public static final Item AQUARIUM_HALBERD = registerItem( "mythicmetals_compat/aquarium/aquarium_halberd",
            new SimplySwordsSwordItem(ModToolMaterial.AQUARIUM, aquarium_modifier + halberd_modifier, halberd_attackspeed,
                    "mythicmetals:aquarium_ingot"));


    //BANGLUM
    public static final Item BANGLUM_LONGSWORD = registerItem( "mythicmetals_compat/banglum/banglum_longsword",
            new SimplySwordsSwordItem(ModToolMaterial.BANGLUM, banglum_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:banglum_ingot"));

    public static final Item BANGLUM_TWINBLADE = registerItem( "mythicmetals_compat/banglum/banglum_twinblade",
            new SimplySwordsSwordItem(ModToolMaterial.BANGLUM, banglum_modifier + twinblade_modifier, twinblade_attackspeed,
                    "mythicmetals:banglum_ingot"));

    public static final Item BANGLUM_RAPIER = registerItem( "mythicmetals_compat/banglum/banglum_rapier",
            new SimplySwordsSwordItem(ModToolMaterial.BANGLUM, banglum_modifier + rapier_modifier, rapier_attackspeed,
                    "mythicmetals:banglum_ingot"));

    public static final Item BANGLUM_KATANA = registerItem( "mythicmetals_compat/banglum/banglum_katana",
            new SimplySwordsSwordItem(ModToolMaterial.BANGLUM, banglum_modifier + katana_modifier, katana_attackspeed,
                    "mythicmetals:banglum_ingot"));

    public static final Item BANGLUM_SAI = registerItem( "mythicmetals_compat/banglum/banglum_sai",
            new SimplySwordsSwordItem(ModToolMaterial.BANGLUM, banglum_modifier +sai_modifier, sai_attackspeed,
                    "mythicmetals:banglum_ingot"));

    public static final Item BANGLUM_SPEAR = registerItem( "mythicmetals_compat/banglum/banglum_spear",
            new SimplySwordsSwordItem(ModToolMaterial.BANGLUM, banglum_modifier + spear_modifier, spear_attackspeed,
                    "mythicmetals:banglum_ingot"));

    public static final Item BANGLUM_GLAIVE = registerItem( "mythicmetals_compat/banglum/banglum_glaive",
            new SimplySwordsSwordItem(ModToolMaterial.BANGLUM, banglum_modifier + glaive_modifier, glaive_attackspeed,
                    "mythicmetals:banglum_ingot"));

    public static final Item BANGLUM_WARGLAIVE = registerItem( "mythicmetals_compat/banglum/banglum_warglaive",
            new SimplySwordsSwordItem(ModToolMaterial.BANGLUM, banglum_modifier + warglaive_modifier, warglaive_attackspeed,
                    "mythicmetals:banglum_ingot"));

    public static final Item BANGLUM_CUTLASS = registerItem( "mythicmetals_compat/banglum/banglum_cutlass",
            new SimplySwordsSwordItem(ModToolMaterial.BANGLUM, banglum_modifier + cutlass_modifier, cutlass_attackspeed,
                    "mythicmetals:banglum_ingot"));

    public static final Item BANGLUM_CLAYMORE = registerItem( "mythicmetals_compat/banglum/banglum_claymore",
            new SimplySwordsSwordItem(ModToolMaterial.BANGLUM, banglum_modifier + claymore_modifier, claymore_attackspeed,
                    "mythicmetals:banglum_ingot"));

    public static final Item BANGLUM_GREATHAMMER = registerItem( "mythicmetals_compat/banglum/banglum_greathammer",
            new SimplySwordsSwordItem(ModToolMaterial.BANGLUM, banglum_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:banglum_ingot"));

    public static final Item BANGLUM_GREATAXE = registerItem( "mythicmetals_compat/banglum/banglum_greataxe",
            new SimplySwordsSwordItem(ModToolMaterial.BANGLUM, banglum_modifier + greataxe_modifier, greataxe_attackspeed,
                    "mythicmetals:banglum_ingot"));

    public static final Item BANGLUM_CHAKRAM = registerItem( "mythicmetals_compat/banglum/banglum_chakram",
            new SimplySwordsSwordItem(ModToolMaterial.BANGLUM, banglum_modifier +chakram_modifier, chakram_attackspeed,
                    "mythicmetals:banglum_ingot"));

    public static final Item BANGLUM_SCYTHE = registerItem( "mythicmetals_compat/banglum/banglum_scythe",
            new SimplySwordsSwordItem(ModToolMaterial.BANGLUM, banglum_modifier + scythe_modifier, scythe_attackspeed,
                    "mythicmetals:banglum_ingot"));

    public static final Item BANGLUM_HALBERD = registerItem( "mythicmetals_compat/banglum/banglum_halberd",
            new SimplySwordsSwordItem(ModToolMaterial.BANGLUM, banglum_modifier + halberd_modifier, halberd_attackspeed,
                    "mythicmetals:banglum_ingot"));


    //CARMOT
    public static final Item CARMOT_LONGSWORD = registerItem( "mythicmetals_compat/carmot/carmot_longsword",
            new SimplySwordsSwordItem(ModToolMaterial.CARMOT, carmot_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:carmot_ingot"));

    public static final Item CARMOT_TWINBLADE = registerItem( "mythicmetals_compat/carmot/carmot_twinblade",
            new SimplySwordsSwordItem(ModToolMaterial.CARMOT, carmot_modifier + twinblade_modifier, twinblade_attackspeed,
                    "mythicmetals:carmot_ingot"));

    public static final Item CARMOT_RAPIER = registerItem( "mythicmetals_compat/carmot/carmot_rapier",
            new SimplySwordsSwordItem(ModToolMaterial.CARMOT, carmot_modifier + rapier_modifier, rapier_attackspeed,
                    "mythicmetals:carmot_ingot"));

    public static final Item CARMOT_KATANA = registerItem( "mythicmetals_compat/carmot/carmot_katana",
            new SimplySwordsSwordItem(ModToolMaterial.CARMOT, carmot_modifier + katana_modifier, katana_attackspeed,
                    "mythicmetals:carmot_ingot"));

    public static final Item CARMOT_SAI = registerItem( "mythicmetals_compat/carmot/carmot_sai",
            new SimplySwordsSwordItem(ModToolMaterial.CARMOT, carmot_modifier +sai_modifier, sai_attackspeed,
                    "mythicmetals:carmot_ingot"));

    public static final Item CARMOT_SPEAR = registerItem( "mythicmetals_compat/carmot/carmot_spear",
            new SimplySwordsSwordItem(ModToolMaterial.CARMOT, carmot_modifier + spear_modifier, spear_attackspeed,
                    "mythicmetals:carmot_ingot"));

    public static final Item CARMOT_GLAIVE = registerItem( "mythicmetals_compat/carmot/carmot_glaive",
            new SimplySwordsSwordItem(ModToolMaterial.CARMOT, carmot_modifier + glaive_modifier, glaive_attackspeed,
                    "mythicmetals:carmot_ingot"));

    public static final Item CARMOT_WARGLAIVE = registerItem( "mythicmetals_compat/carmot/carmot_warglaive",
            new SimplySwordsSwordItem(ModToolMaterial.CARMOT, carmot_modifier + warglaive_modifier, warglaive_attackspeed,
                    "mythicmetals:carmot_ingot"));

    public static final Item CARMOT_CUTLASS = registerItem( "mythicmetals_compat/carmot/carmot_cutlass",
            new SimplySwordsSwordItem(ModToolMaterial.CARMOT, carmot_modifier + cutlass_modifier, cutlass_attackspeed,
                    "mythicmetals:carmot_ingot"));

    public static final Item CARMOT_CLAYMORE = registerItem( "mythicmetals_compat/carmot/carmot_claymore",
            new SimplySwordsSwordItem(ModToolMaterial.CARMOT, carmot_modifier + claymore_modifier, claymore_attackspeed,
                    "mythicmetals:carmot_ingot"));

    public static final Item CARMOT_GREATHAMMER = registerItem( "mythicmetals_compat/carmot/carmot_greathammer",
            new SimplySwordsSwordItem(ModToolMaterial.CARMOT, carmot_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:carmot_ingot"));

    public static final Item CARMOT_GREATAXE = registerItem( "mythicmetals_compat/carmot/carmot_greataxe",
            new SimplySwordsSwordItem(ModToolMaterial.CARMOT, carmot_modifier + greataxe_modifier, greataxe_attackspeed,
                    "mythicmetals:carmot_ingot"));

    public static final Item CARMOT_CHAKRAM = registerItem( "mythicmetals_compat/carmot/carmot_chakram",
            new SimplySwordsSwordItem(ModToolMaterial.CARMOT, carmot_modifier +chakram_modifier, chakram_attackspeed,
                    "mythicmetals:carmot_ingot"));

    public static final Item CARMOT_SCYTHE = registerItem( "mythicmetals_compat/carmot/carmot_scythe",
            new SimplySwordsSwordItem(ModToolMaterial.CARMOT, carmot_modifier + scythe_modifier, scythe_attackspeed,
                    "mythicmetals:carmot_ingot"));

    public static final Item CARMOT_HALBERD = registerItem( "mythicmetals_compat/carmot/carmot_halberd",
            new SimplySwordsSwordItem(ModToolMaterial.CARMOT, carmot_modifier + halberd_modifier, halberd_attackspeed,
                    "mythicmetals:carmot_ingot"));

    //KYBER
    public static final Item KYBER_LONGSWORD = registerItem( "mythicmetals_compat/kyber/kyber_longsword",
            new SimplySwordsSwordItem(ModToolMaterial.KYBER, kyber_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:kyber_ingot"));

    public static final Item KYBER_TWINBLADE = registerItem( "mythicmetals_compat/kyber/kyber_twinblade",
            new SimplySwordsSwordItem(ModToolMaterial.KYBER, kyber_modifier + twinblade_modifier, twinblade_attackspeed,
                    "mythicmetals:kyber_ingot"));

    public static final Item KYBER_RAPIER = registerItem( "mythicmetals_compat/kyber/kyber_rapier",
            new SimplySwordsSwordItem(ModToolMaterial.KYBER, kyber_modifier + rapier_modifier, rapier_attackspeed,
                    "mythicmetals:kyber_ingot"));

    public static final Item KYBER_KATANA = registerItem( "mythicmetals_compat/kyber/kyber_katana",
            new SimplySwordsSwordItem(ModToolMaterial.KYBER, kyber_modifier + katana_modifier, katana_attackspeed,
                    "mythicmetals:kyber_ingot"));

    public static final Item KYBER_SAI = registerItem( "mythicmetals_compat/kyber/kyber_sai",
            new SimplySwordsSwordItem(ModToolMaterial.KYBER, kyber_modifier +sai_modifier, sai_attackspeed,
                    "mythicmetals:kyber_ingot"));

    public static final Item KYBER_SPEAR = registerItem( "mythicmetals_compat/kyber/kyber_spear",
            new SimplySwordsSwordItem(ModToolMaterial.KYBER, kyber_modifier + spear_modifier, spear_attackspeed,
                    "mythicmetals:kyber_ingot"));

    public static final Item KYBER_GLAIVE = registerItem( "mythicmetals_compat/kyber/kyber_glaive",
            new SimplySwordsSwordItem(ModToolMaterial.KYBER, kyber_modifier + glaive_modifier, glaive_attackspeed,
                    "mythicmetals:kyber_ingot"));

    public static final Item KYBER_WARGLAIVE = registerItem( "mythicmetals_compat/kyber/kyber_warglaive",
            new SimplySwordsSwordItem(ModToolMaterial.KYBER, kyber_modifier + warglaive_modifier, warglaive_attackspeed,
                    "mythicmetals:kyber_ingot"));

    public static final Item KYBER_CUTLASS = registerItem( "mythicmetals_compat/kyber/kyber_cutlass",
            new SimplySwordsSwordItem(ModToolMaterial.KYBER, kyber_modifier + cutlass_modifier, cutlass_attackspeed,
                    "mythicmetals:kyber_ingot"));

    public static final Item KYBER_CLAYMORE = registerItem( "mythicmetals_compat/kyber/kyber_claymore",
            new SimplySwordsSwordItem(ModToolMaterial.KYBER, kyber_modifier + claymore_modifier, claymore_attackspeed,
                    "mythicmetals:kyber_ingot"));

    public static final Item KYBER_GREATHAMMER = registerItem( "mythicmetals_compat/kyber/kyber_greathammer",
            new SimplySwordsSwordItem(ModToolMaterial.KYBER, kyber_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:kyber_ingot"));

    public static final Item KYBER_GREATAXE = registerItem( "mythicmetals_compat/kyber/kyber_greataxe",
            new SimplySwordsSwordItem(ModToolMaterial.KYBER, kyber_modifier + greataxe_modifier, greataxe_attackspeed,
                    "mythicmetals:kyber_ingot"));

    public static final Item KYBER_CHAKRAM = registerItem( "mythicmetals_compat/kyber/kyber_chakram",
            new SimplySwordsSwordItem(ModToolMaterial.KYBER, kyber_modifier +chakram_modifier, chakram_attackspeed,
                    "mythicmetals:kyber_ingot"));

    public static final Item KYBER_SCYTHE = registerItem( "mythicmetals_compat/kyber/kyber_scythe",
            new SimplySwordsSwordItem(ModToolMaterial.KYBER, kyber_modifier + scythe_modifier, scythe_attackspeed,
                    "mythicmetals:kyber_ingot"));

    public static final Item KYBER_HALBERD = registerItem( "mythicmetals_compat/kyber/kyber_halberd",
            new SimplySwordsSwordItem(ModToolMaterial.KYBER, kyber_modifier + halberd_modifier, halberd_attackspeed,
                    "mythicmetals:kyber_ingot"));


    //MYTHRIL
    public static final Item MYTHRIL_LONGSWORD = registerItem( "mythicmetals_compat/mythril/mythril_longsword",
            new SimplySwordsSwordItem(ModToolMaterial.MYTHRIL, mythril_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:mythril_ingot"));

    public static final Item MYTHRIL_TWINBLADE = registerItem( "mythicmetals_compat/mythril/mythril_twinblade",
            new SimplySwordsSwordItem(ModToolMaterial.MYTHRIL, mythril_modifier + twinblade_modifier, twinblade_attackspeed,
                    "mythicmetals:mythril_ingot"));

    public static final Item MYTHRIL_RAPIER = registerItem( "mythicmetals_compat/mythril/mythril_rapier",
            new SimplySwordsSwordItem(ModToolMaterial.MYTHRIL, mythril_modifier + rapier_modifier, rapier_attackspeed,
                    "mythicmetals:mythril_ingot"));

    public static final Item MYTHRIL_KATANA = registerItem( "mythicmetals_compat/mythril/mythril_katana",
            new SimplySwordsSwordItem(ModToolMaterial.MYTHRIL, mythril_modifier + katana_modifier, katana_attackspeed,
                    "mythicmetals:mythril_ingot"));

    public static final Item MYTHRIL_SAI = registerItem( "mythicmetals_compat/mythril/mythril_sai",
            new SimplySwordsSwordItem(ModToolMaterial.MYTHRIL, mythril_modifier +sai_modifier, sai_attackspeed,
                    "mythicmetals:mythril_ingot"));

    public static final Item MYTHRIL_SPEAR = registerItem( "mythicmetals_compat/mythril/mythril_spear",
            new SimplySwordsSwordItem(ModToolMaterial.MYTHRIL, mythril_modifier + spear_modifier, spear_attackspeed,
                    "mythicmetals:mythril_ingot"));

    public static final Item MYTHRIL_GLAIVE = registerItem( "mythicmetals_compat/mythril/mythril_glaive",
            new SimplySwordsSwordItem(ModToolMaterial.MYTHRIL, mythril_modifier + glaive_modifier, glaive_attackspeed,
                    "mythicmetals:mythril_ingot"));

    public static final Item MYTHRIL_WARGLAIVE = registerItem( "mythicmetals_compat/mythril/mythril_warglaive",
            new SimplySwordsSwordItem(ModToolMaterial.MYTHRIL, mythril_modifier + warglaive_modifier, warglaive_attackspeed,
                    "mythicmetals:mythril_ingot"));

    public static final Item MYTHRIL_CUTLASS = registerItem( "mythicmetals_compat/mythril/mythril_cutlass",
            new SimplySwordsSwordItem(ModToolMaterial.MYTHRIL, mythril_modifier + cutlass_modifier, cutlass_attackspeed,
                    "mythicmetals:mythril_ingot"));

    public static final Item MYTHRIL_CLAYMORE = registerItem( "mythicmetals_compat/mythril/mythril_claymore",
            new SimplySwordsSwordItem(ModToolMaterial.MYTHRIL, mythril_modifier + claymore_modifier, claymore_attackspeed,
                    "mythicmetals:mythril_ingot"));

    public static final Item MYTHRIL_GREATHAMMER = registerItem( "mythicmetals_compat/mythril/mythril_greathammer",
            new SimplySwordsSwordItem(ModToolMaterial.MYTHRIL, mythril_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:mythril_ingot"));

    public static final Item MYTHRIL_GREATAXE = registerItem( "mythicmetals_compat/mythril/mythril_greataxe",
            new SimplySwordsSwordItem(ModToolMaterial.MYTHRIL, mythril_modifier + greataxe_modifier, greataxe_attackspeed,
                    "mythicmetals:mythril_ingot"));

    public static final Item MYTHRIL_CHAKRAM = registerItem( "mythicmetals_compat/mythril/mythril_chakram",
            new SimplySwordsSwordItem(ModToolMaterial.MYTHRIL, mythril_modifier +chakram_modifier, chakram_attackspeed,
                    "mythicmetals:mythril_ingot"));

    public static final Item MYTHRIL_SCYTHE = registerItem( "mythicmetals_compat/mythril/mythril_scythe",
            new SimplySwordsSwordItem(ModToolMaterial.MYTHRIL, mythril_modifier + scythe_modifier, scythe_attackspeed,
                    "mythicmetals:mythril_ingot"));

    public static final Item MYTHRIL_HALBERD = registerItem( "mythicmetals_compat/mythril/mythril_halberd",
            new SimplySwordsSwordItem(ModToolMaterial.MYTHRIL, mythril_modifier + halberd_modifier, halberd_attackspeed,
                    "mythicmetals:mythril_ingot"));


    //ORICHALCUM
    public static final Item ORICHALCUM_LONGSWORD = registerItem( "mythicmetals_compat/orichalcum/orichalcum_longsword",
            new SimplySwordsSwordItem(ModToolMaterial.ORICHALCUM, orichalcum_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:orichalcum_ingot"));

    public static final Item ORICHALCUM_TWINBLADE = registerItem( "mythicmetals_compat/orichalcum/orichalcum_twinblade",
            new SimplySwordsSwordItem(ModToolMaterial.ORICHALCUM, orichalcum_modifier + twinblade_modifier, twinblade_attackspeed,
                    "mythicmetals:orichalcum_ingot"));

    public static final Item ORICHALCUM_RAPIER = registerItem( "mythicmetals_compat/orichalcum/orichalcum_rapier",
            new SimplySwordsSwordItem(ModToolMaterial.ORICHALCUM, orichalcum_modifier + rapier_modifier, rapier_attackspeed,
                    "mythicmetals:orichalcum_ingot"));

    public static final Item ORICHALCUM_KATANA = registerItem( "mythicmetals_compat/orichalcum/orichalcum_katana",
            new SimplySwordsSwordItem(ModToolMaterial.ORICHALCUM, orichalcum_modifier + katana_modifier, katana_attackspeed,
                    "mythicmetals:orichalcum_ingot"));

    public static final Item ORICHALCUM_SAI = registerItem( "mythicmetals_compat/orichalcum/orichalcum_sai",
            new SimplySwordsSwordItem(ModToolMaterial.ORICHALCUM, orichalcum_modifier +sai_modifier, sai_attackspeed,
                    "mythicmetals:orichalcum_ingot"));

    public static final Item ORICHALCUM_SPEAR = registerItem( "mythicmetals_compat/orichalcum/orichalcum_spear",
            new SimplySwordsSwordItem(ModToolMaterial.ORICHALCUM, orichalcum_modifier + spear_modifier, spear_attackspeed,
                    "mythicmetals:orichalcum_ingot"));

    public static final Item ORICHALCUM_GLAIVE = registerItem( "mythicmetals_compat/orichalcum/orichalcum_glaive",
            new SimplySwordsSwordItem(ModToolMaterial.ORICHALCUM, orichalcum_modifier + glaive_modifier, glaive_attackspeed,
                    "mythicmetals:orichalcum_ingot"));

    public static final Item ORICHALCUM_WARGLAIVE = registerItem( "mythicmetals_compat/orichalcum/orichalcum_warglaive",
            new SimplySwordsSwordItem(ModToolMaterial.ORICHALCUM, orichalcum_modifier + warglaive_modifier, warglaive_attackspeed,
                    "mythicmetals:orichalcum_ingot"));

    public static final Item ORICHALCUM_CUTLASS = registerItem( "mythicmetals_compat/orichalcum/orichalcum_cutlass",
            new SimplySwordsSwordItem(ModToolMaterial.ORICHALCUM, orichalcum_modifier + cutlass_modifier, cutlass_attackspeed,
                    "mythicmetals:orichalcum_ingot"));

    public static final Item ORICHALCUM_CLAYMORE = registerItem( "mythicmetals_compat/orichalcum/orichalcum_claymore",
            new SimplySwordsSwordItem(ModToolMaterial.ORICHALCUM, orichalcum_modifier + claymore_modifier, claymore_attackspeed,
                    "mythicmetals:orichalcum_ingot"));

    public static final Item ORICHALCUM_GREATHAMMER = registerItem( "mythicmetals_compat/orichalcum/orichalcum_greathammer",
            new SimplySwordsSwordItem(ModToolMaterial.ORICHALCUM, orichalcum_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:orichalcum_ingot"));

    public static final Item ORICHALCUM_GREATAXE = registerItem( "mythicmetals_compat/orichalcum/orichalcum_greataxe",
            new SimplySwordsSwordItem(ModToolMaterial.ORICHALCUM, orichalcum_modifier + greataxe_modifier, greataxe_attackspeed,
                    "mythicmetals:orichalcum_ingot"));

    public static final Item ORICHALCUM_CHAKRAM = registerItem( "mythicmetals_compat/orichalcum/orichalcum_chakram",
            new SimplySwordsSwordItem(ModToolMaterial.ORICHALCUM, orichalcum_modifier +chakram_modifier, chakram_attackspeed,
                    "mythicmetals:orichalcum_ingot"));

    public static final Item ORICHALCUM_SCYTHE = registerItem( "mythicmetals_compat/orichalcum/orichalcum_scythe",
            new SimplySwordsSwordItem(ModToolMaterial.ORICHALCUM, orichalcum_modifier + scythe_modifier, scythe_attackspeed,
                    "mythicmetals:orichalcum_ingot"));

    public static final Item ORICHALCUM_HALBERD = registerItem( "mythicmetals_compat/orichalcum/orichalcum_halberd",
            new SimplySwordsSwordItem(ModToolMaterial.ORICHALCUM, orichalcum_modifier + halberd_modifier, halberd_attackspeed,
                    "mythicmetals:orichalcum_ingot"));


    //OSMIUM
    public static final Item OSMIUM_LONGSWORD = registerItem( "mythicmetals_compat/osmium/osmium_longsword",
            new SimplySwordsSwordItem(ModToolMaterial.OSMIUM, osmium_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:osmium_ingot"));

    public static final Item OSMIUM_TWINBLADE = registerItem( "mythicmetals_compat/osmium/osmium_twinblade",
            new SimplySwordsSwordItem(ModToolMaterial.OSMIUM, osmium_modifier + twinblade_modifier, twinblade_attackspeed,
                    "mythicmetals:osmium_ingot"));

    public static final Item OSMIUM_RAPIER = registerItem( "mythicmetals_compat/osmium/osmium_rapier",
            new SimplySwordsSwordItem(ModToolMaterial.OSMIUM, osmium_modifier + rapier_modifier, rapier_attackspeed,
                    "mythicmetals:osmium_ingot"));

    public static final Item OSMIUM_KATANA = registerItem( "mythicmetals_compat/osmium/osmium_katana",
            new SimplySwordsSwordItem(ModToolMaterial.OSMIUM, osmium_modifier + katana_modifier, katana_attackspeed,
                    "mythicmetals:osmium_ingot"));

    public static final Item OSMIUM_SAI = registerItem( "mythicmetals_compat/osmium/osmium_sai",
            new SimplySwordsSwordItem(ModToolMaterial.OSMIUM, osmium_modifier +sai_modifier, sai_attackspeed,
                    "mythicmetals:osmium_ingot"));

    public static final Item OSMIUM_SPEAR = registerItem( "mythicmetals_compat/osmium/osmium_spear",
            new SimplySwordsSwordItem(ModToolMaterial.OSMIUM, osmium_modifier + spear_modifier, spear_attackspeed,
                    "mythicmetals:osmium_ingot"));

    public static final Item OSMIUM_GLAIVE = registerItem( "mythicmetals_compat/osmium/osmium_glaive",
            new SimplySwordsSwordItem(ModToolMaterial.OSMIUM, osmium_modifier + glaive_modifier, glaive_attackspeed,
                    "mythicmetals:osmium_ingot"));

    public static final Item OSMIUM_WARGLAIVE = registerItem( "mythicmetals_compat/osmium/osmium_warglaive",
            new SimplySwordsSwordItem(ModToolMaterial.OSMIUM, osmium_modifier + warglaive_modifier, warglaive_attackspeed,
                    "mythicmetals:osmium_ingot"));

    public static final Item OSMIUM_CUTLASS = registerItem( "mythicmetals_compat/osmium/osmium_cutlass",
            new SimplySwordsSwordItem(ModToolMaterial.OSMIUM, osmium_modifier + cutlass_modifier, cutlass_attackspeed,
                    "mythicmetals:osmium_ingot"));

    public static final Item OSMIUM_CLAYMORE = registerItem( "mythicmetals_compat/osmium/osmium_claymore",
            new SimplySwordsSwordItem(ModToolMaterial.OSMIUM, osmium_modifier + claymore_modifier, claymore_attackspeed,
                    "mythicmetals:osmium_ingot"));

    public static final Item OSMIUM_GREATHAMMER = registerItem( "mythicmetals_compat/osmium/osmium_greathammer",
            new SimplySwordsSwordItem(ModToolMaterial.OSMIUM, osmium_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:osmium_ingot"));

    public static final Item OSMIUM_GREATAXE = registerItem( "mythicmetals_compat/osmium/osmium_greataxe",
            new SimplySwordsSwordItem(ModToolMaterial.OSMIUM, osmium_modifier + greataxe_modifier, greataxe_attackspeed,
                    "mythicmetals:osmium_ingot"));

    public static final Item OSMIUM_CHAKRAM = registerItem( "mythicmetals_compat/osmium/osmium_chakram",
            new SimplySwordsSwordItem(ModToolMaterial.OSMIUM, osmium_modifier +chakram_modifier, chakram_attackspeed,
                    "mythicmetals:osmium_ingot"));

    public static final Item OSMIUM_SCYTHE = registerItem( "mythicmetals_compat/osmium/osmium_scythe",
            new SimplySwordsSwordItem(ModToolMaterial.OSMIUM, osmium_modifier + scythe_modifier, scythe_attackspeed,
                    "mythicmetals:osmium_ingot"));

    public static final Item OSMIUM_HALBERD = registerItem( "mythicmetals_compat/osmium/osmium_halberd",
            new SimplySwordsSwordItem(ModToolMaterial.OSMIUM, osmium_modifier + halberd_modifier, halberd_attackspeed,
                    "mythicmetals:osmium_ingot"));


    //PROMETHEUM
    public static final Item PROMETHEUM_LONGSWORD = registerItem( "mythicmetals_compat/prometheum/prometheum_longsword",
            new PrometheumSwordItem(ModToolMaterial.PROMETHEUM, prometheum_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:prometheum_ingot"));

    public static final Item PROMETHEUM_TWINBLADE = registerItem( "mythicmetals_compat/prometheum/prometheum_twinblade",
            new PrometheumSwordItem(ModToolMaterial.PROMETHEUM, prometheum_modifier + twinblade_modifier, twinblade_attackspeed,
                    "mythicmetals:prometheum_ingot"));

    public static final Item PROMETHEUM_RAPIER = registerItem( "mythicmetals_compat/prometheum/prometheum_rapier",
            new PrometheumSwordItem(ModToolMaterial.PROMETHEUM, prometheum_modifier + rapier_modifier, rapier_attackspeed,
                    "mythicmetals:prometheum_ingot"));

    public static final Item PROMETHEUM_KATANA = registerItem( "mythicmetals_compat/prometheum/prometheum_katana",
            new PrometheumSwordItem(ModToolMaterial.PROMETHEUM, prometheum_modifier + katana_modifier, katana_attackspeed,
                    "mythicmetals:prometheum_ingot"));

    public static final Item PROMETHEUM_SAI = registerItem( "mythicmetals_compat/prometheum/prometheum_sai",
            new PrometheumSwordItem(ModToolMaterial.PROMETHEUM, prometheum_modifier +sai_modifier, sai_attackspeed,
                    "mythicmetals:prometheum_ingot"));

    public static final Item PROMETHEUM_SPEAR = registerItem( "mythicmetals_compat/prometheum/prometheum_spear",
            new PrometheumSwordItem(ModToolMaterial.PROMETHEUM, prometheum_modifier + spear_modifier, spear_attackspeed,
                    "mythicmetals:prometheum_ingot"));

    public static final Item PROMETHEUM_GLAIVE = registerItem( "mythicmetals_compat/prometheum/prometheum_glaive",
            new PrometheumSwordItem(ModToolMaterial.PROMETHEUM, prometheum_modifier + glaive_modifier, glaive_attackspeed,
                    "mythicmetals:prometheum_ingot"));

    public static final Item PROMETHEUM_WARGLAIVE = registerItem( "mythicmetals_compat/prometheum/prometheum_warglaive",
            new PrometheumSwordItem(ModToolMaterial.PROMETHEUM, prometheum_modifier + warglaive_modifier, warglaive_attackspeed,
                    "mythicmetals:prometheum_ingot"));

    public static final Item PROMETHEUM_CUTLASS = registerItem( "mythicmetals_compat/prometheum/prometheum_cutlass",
            new PrometheumSwordItem(ModToolMaterial.PROMETHEUM, prometheum_modifier + cutlass_modifier, cutlass_attackspeed,
                    "mythicmetals:prometheum_ingot"));

    public static final Item PROMETHEUM_CLAYMORE = registerItem( "mythicmetals_compat/prometheum/prometheum_claymore",
            new PrometheumSwordItem(ModToolMaterial.PROMETHEUM, prometheum_modifier + claymore_modifier, claymore_attackspeed,
                    "mythicmetals:prometheum_ingot"));

    public static final Item PROMETHEUM_GREATHAMMER = registerItem( "mythicmetals_compat/prometheum/prometheum_greathammer",
            new PrometheumSwordItem(ModToolMaterial.PROMETHEUM, prometheum_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:prometheum_ingot"));

    public static final Item PROMETHEUM_GREATAXE = registerItem( "mythicmetals_compat/prometheum/prometheum_greataxe",
            new PrometheumSwordItem(ModToolMaterial.PROMETHEUM, prometheum_modifier + greataxe_modifier, greataxe_attackspeed,
                    "mythicmetals:prometheum_ingot"));

    public static final Item PROMETHEUM_CHAKRAM = registerItem( "mythicmetals_compat/prometheum/prometheum_chakram",
            new PrometheumSwordItem(ModToolMaterial.PROMETHEUM, prometheum_modifier +chakram_modifier, chakram_attackspeed,
                    "mythicmetals:prometheum_ingot"));

    public static final Item PROMETHEUM_SCYTHE = registerItem( "mythicmetals_compat/prometheum/prometheum_scythe",
            new PrometheumSwordItem(ModToolMaterial.PROMETHEUM, prometheum_modifier + scythe_modifier, scythe_attackspeed,
                    "mythicmetals:prometheum_ingot"));

    public static final Item PROMETHEUM_HALBERD = registerItem( "mythicmetals_compat/prometheum/prometheum_halberd",
            new PrometheumSwordItem(ModToolMaterial.PROMETHEUM, prometheum_modifier + halberd_modifier, halberd_attackspeed,
                    "mythicmetals:prometheum_ingot"));


    //QUADRILLUM
    public static final Item QUADRILLUM_LONGSWORD = registerItem( "mythicmetals_compat/quadrillum/quadrillum_longsword",
            new SimplySwordsSwordItem(ModToolMaterial.QUADRILLUM, quadrillum_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:quadrillum_ingot"));

    public static final Item QUADRILLUM_TWINBLADE = registerItem( "mythicmetals_compat/quadrillum/quadrillum_twinblade",
            new SimplySwordsSwordItem(ModToolMaterial.QUADRILLUM, quadrillum_modifier + twinblade_modifier, twinblade_attackspeed,
                    "mythicmetals:quadrillum_ingot"));

    public static final Item QUADRILLUM_RAPIER = registerItem( "mythicmetals_compat/quadrillum/quadrillum_rapier",
            new SimplySwordsSwordItem(ModToolMaterial.QUADRILLUM, quadrillum_modifier + rapier_modifier, rapier_attackspeed,
                    "mythicmetals:quadrillum_ingot"));

    public static final Item QUADRILLUM_KATANA = registerItem( "mythicmetals_compat/quadrillum/quadrillum_katana",
            new SimplySwordsSwordItem(ModToolMaterial.QUADRILLUM, quadrillum_modifier + katana_modifier, katana_attackspeed,
                    "mythicmetals:quadrillum_ingot"));

    public static final Item QUADRILLUM_SAI = registerItem( "mythicmetals_compat/quadrillum/quadrillum_sai",
            new SimplySwordsSwordItem(ModToolMaterial.QUADRILLUM, quadrillum_modifier +sai_modifier, sai_attackspeed,
                    "mythicmetals:quadrillum_ingot"));

    public static final Item QUADRILLUM_SPEAR = registerItem( "mythicmetals_compat/quadrillum/quadrillum_spear",
            new SimplySwordsSwordItem(ModToolMaterial.QUADRILLUM, quadrillum_modifier + spear_modifier, spear_attackspeed,
                    "mythicmetals:quadrillum_ingot"));

    public static final Item QUADRILLUM_GLAIVE = registerItem( "mythicmetals_compat/quadrillum/quadrillum_glaive",
            new SimplySwordsSwordItem(ModToolMaterial.QUADRILLUM, quadrillum_modifier + glaive_modifier, glaive_attackspeed,
                    "mythicmetals:quadrillum_ingot"));

    public static final Item QUADRILLUM_WARGLAIVE = registerItem( "mythicmetals_compat/quadrillum/quadrillum_warglaive",
            new SimplySwordsSwordItem(ModToolMaterial.QUADRILLUM, quadrillum_modifier + warglaive_modifier, warglaive_attackspeed,
                    "mythicmetals:quadrillum_ingot"));

    public static final Item QUADRILLUM_CUTLASS = registerItem( "mythicmetals_compat/quadrillum/quadrillum_cutlass",
            new SimplySwordsSwordItem(ModToolMaterial.QUADRILLUM, quadrillum_modifier + cutlass_modifier, cutlass_attackspeed,
                    "mythicmetals:quadrillum_ingot"));

    public static final Item QUADRILLUM_CLAYMORE = registerItem( "mythicmetals_compat/quadrillum/quadrillum_claymore",
            new SimplySwordsSwordItem(ModToolMaterial.QUADRILLUM, quadrillum_modifier + claymore_modifier, claymore_attackspeed,
                    "mythicmetals:quadrillum_ingot"));

    public static final Item QUADRILLUM_GREATHAMMER = registerItem( "mythicmetals_compat/quadrillum/quadrillum_greathammer",
            new SimplySwordsSwordItem(ModToolMaterial.QUADRILLUM, quadrillum_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:quadrillum_ingot"));

    public static final Item QUADRILLUM_GREATAXE = registerItem( "mythicmetals_compat/quadrillum/quadrillum_greataxe",
            new SimplySwordsSwordItem(ModToolMaterial.QUADRILLUM, quadrillum_modifier + greataxe_modifier, greataxe_attackspeed,
                    "mythicmetals:quadrillum_ingot"));

    public static final Item QUADRILLUM_CHAKRAM = registerItem( "mythicmetals_compat/quadrillum/quadrillum_chakram",
            new SimplySwordsSwordItem(ModToolMaterial.QUADRILLUM, quadrillum_modifier +chakram_modifier, chakram_attackspeed,
                    "mythicmetals:quadrillum_ingot"));

    public static final Item QUADRILLUM_SCYTHE = registerItem( "mythicmetals_compat/quadrillum/quadrillum_scythe",
            new SimplySwordsSwordItem(ModToolMaterial.QUADRILLUM, quadrillum_modifier + scythe_modifier, scythe_attackspeed,
                    "mythicmetals:quadrillum_ingot"));

    public static final Item QUADRILLUM_HALBERD = registerItem( "mythicmetals_compat/quadrillum/quadrillum_halberd",
            new SimplySwordsSwordItem(ModToolMaterial.QUADRILLUM, quadrillum_modifier + halberd_modifier, halberd_attackspeed,
                    "mythicmetals:quadrillum_ingot"));


    //RUNITE
    public static final Item RUNITE_LONGSWORD = registerItem( "mythicmetals_compat/runite/runite_longsword",
            new SimplySwordsSwordItem(ModToolMaterial.RUNITE, runite_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:runite_ingot"));

    public static final Item RUNITE_TWINBLADE = registerItem( "mythicmetals_compat/runite/runite_twinblade",
            new SimplySwordsSwordItem(ModToolMaterial.RUNITE, runite_modifier + twinblade_modifier, twinblade_attackspeed,
                    "mythicmetals:runite_ingot"));

    public static final Item RUNITE_RAPIER = registerItem( "mythicmetals_compat/runite/runite_rapier",
            new SimplySwordsSwordItem(ModToolMaterial.RUNITE, runite_modifier + rapier_modifier, rapier_attackspeed,
                    "mythicmetals:runite_ingot"));

    public static final Item RUNITE_KATANA = registerItem( "mythicmetals_compat/runite/runite_katana",
            new SimplySwordsSwordItem(ModToolMaterial.RUNITE, runite_modifier + katana_modifier, katana_attackspeed,
                    "mythicmetals:runite_ingot"));

    public static final Item RUNITE_SAI = registerItem( "mythicmetals_compat/runite/runite_sai",
            new SimplySwordsSwordItem(ModToolMaterial.RUNITE, runite_modifier +sai_modifier, sai_attackspeed,
                    "mythicmetals:runite_ingot"));

    public static final Item RUNITE_SPEAR = registerItem( "mythicmetals_compat/runite/runite_spear",
            new SimplySwordsSwordItem(ModToolMaterial.RUNITE, runite_modifier + spear_modifier, spear_attackspeed,
                    "mythicmetals:runite_ingot"));

    public static final Item RUNITE_GLAIVE = registerItem( "mythicmetals_compat/runite/runite_glaive",
            new SimplySwordsSwordItem(ModToolMaterial.RUNITE, runite_modifier + glaive_modifier, glaive_attackspeed,
                    "mythicmetals:runite_ingot"));

    public static final Item RUNITE_WARGLAIVE = registerItem( "mythicmetals_compat/runite/runite_warglaive",
            new SimplySwordsSwordItem(ModToolMaterial.RUNITE, runite_modifier + warglaive_modifier, warglaive_attackspeed,
                    "mythicmetals:runite_ingot"));

    public static final Item RUNITE_CUTLASS = registerItem( "mythicmetals_compat/runite/runite_cutlass",
            new SimplySwordsSwordItem(ModToolMaterial.RUNITE, runite_modifier + cutlass_modifier, cutlass_attackspeed,
                    "mythicmetals:runite_ingot"));

    public static final Item RUNITE_CLAYMORE = registerItem( "mythicmetals_compat/runite/runite_claymore",
            new SimplySwordsSwordItem(ModToolMaterial.RUNITE, runite_modifier + claymore_modifier, claymore_attackspeed,
                    "mythicmetals:runite_ingot"));

    public static final Item RUNITE_GREATHAMMER = registerItem( "mythicmetals_compat/runite/runite_greathammer",
            new SimplySwordsSwordItem(ModToolMaterial.RUNITE, runite_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:runite_ingot"));

    public static final Item RUNITE_GREATAXE = registerItem( "mythicmetals_compat/runite/runite_greataxe",
            new SimplySwordsSwordItem(ModToolMaterial.RUNITE, runite_modifier + greataxe_modifier, greataxe_attackspeed,
                    "mythicmetals:runite_ingot"));

    public static final Item RUNITE_CHAKRAM = registerItem( "mythicmetals_compat/runite/runite_chakram",
            new SimplySwordsSwordItem(ModToolMaterial.RUNITE, runite_modifier +chakram_modifier, chakram_attackspeed,
                    "mythicmetals:runite_ingot"));

    public static final Item RUNITE_SCYTHE = registerItem( "mythicmetals_compat/runite/runite_scythe",
            new SimplySwordsSwordItem(ModToolMaterial.RUNITE, runite_modifier + scythe_modifier, scythe_attackspeed,
                    "mythicmetals:runite_ingot"));

    public static final Item RUNITE_HALBERD = registerItem( "mythicmetals_compat/runite/runite_halberd",
            new SimplySwordsSwordItem(ModToolMaterial.RUNITE, runite_modifier + halberd_modifier, halberd_attackspeed,
                    "mythicmetals:runite_ingot"));


    //STAR_PLATINUM
    public static final Item STAR_PLATINUM_LONGSWORD = registerItem( "mythicmetals_compat/star_platinum/star_platinum_longsword",
            new SimplySwordsSwordItem(ModToolMaterial.STAR_PLATINUM, star_platinum_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:star_platinum"));

    public static final Item STAR_PLATINUM_TWINBLADE = registerItem( "mythicmetals_compat/star_platinum/star_platinum_twinblade",
            new SimplySwordsSwordItem(ModToolMaterial.STAR_PLATINUM, star_platinum_modifier + twinblade_modifier, twinblade_attackspeed,
                    "mythicmetals:star_platinum"));

    public static final Item STAR_PLATINUM_RAPIER = registerItem( "mythicmetals_compat/star_platinum/star_platinum_rapier",
            new SimplySwordsSwordItem(ModToolMaterial.STAR_PLATINUM, star_platinum_modifier + rapier_modifier, rapier_attackspeed,
                    "mythicmetals:star_platinum"));

    public static final Item STAR_PLATINUM_KATANA = registerItem( "mythicmetals_compat/star_platinum/star_platinum_katana",
            new SimplySwordsSwordItem(ModToolMaterial.STAR_PLATINUM, star_platinum_modifier + katana_modifier, katana_attackspeed,
                    "mythicmetals:star_platinum"));

    public static final Item STAR_PLATINUM_SAI = registerItem( "mythicmetals_compat/star_platinum/star_platinum_sai",
            new SimplySwordsSwordItem(ModToolMaterial.STAR_PLATINUM, star_platinum_modifier +sai_modifier, sai_attackspeed,
                    "mythicmetals:star_platinum"));

    public static final Item STAR_PLATINUM_SPEAR = registerItem( "mythicmetals_compat/star_platinum/star_platinum_spear",
            new SimplySwordsSwordItem(ModToolMaterial.STAR_PLATINUM, star_platinum_modifier + spear_modifier, spear_attackspeed,
                    "mythicmetals:star_platinum"));

    public static final Item STAR_PLATINUM_GLAIVE = registerItem( "mythicmetals_compat/star_platinum/star_platinum_glaive",
            new SimplySwordsSwordItem(ModToolMaterial.STAR_PLATINUM, star_platinum_modifier + glaive_modifier, glaive_attackspeed,
                    "mythicmetals:star_platinum"));

    public static final Item STAR_PLATINUM_WARGLAIVE = registerItem( "mythicmetals_compat/star_platinum/star_platinum_warglaive",
            new SimplySwordsSwordItem(ModToolMaterial.STAR_PLATINUM, star_platinum_modifier + warglaive_modifier, warglaive_attackspeed,
                    "mythicmetals:star_platinum"));

    public static final Item STAR_PLATINUM_CUTLASS = registerItem( "mythicmetals_compat/star_platinum/star_platinum_cutlass",
            new SimplySwordsSwordItem(ModToolMaterial.STAR_PLATINUM, star_platinum_modifier + cutlass_modifier, cutlass_attackspeed,
                    "mythicmetals:star_platinum"));

    public static final Item STAR_PLATINUM_CLAYMORE = registerItem( "mythicmetals_compat/star_platinum/star_platinum_claymore",
            new SimplySwordsSwordItem(ModToolMaterial.STAR_PLATINUM, star_platinum_modifier + claymore_modifier, claymore_attackspeed,
                    "mythicmetals:star_platinum"));

    public static final Item STAR_PLATINUM_GREATHAMMER = registerItem( "mythicmetals_compat/star_platinum/star_platinum_greathammer",
            new SimplySwordsSwordItem(ModToolMaterial.STAR_PLATINUM, star_platinum_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:star_platinum"));

    public static final Item STAR_PLATINUM_GREATAXE = registerItem( "mythicmetals_compat/star_platinum/star_platinum_greataxe",
            new SimplySwordsSwordItem(ModToolMaterial.STAR_PLATINUM, star_platinum_modifier + greataxe_modifier, greataxe_attackspeed,
                    "mythicmetals:star_platinum"));

    public static final Item STAR_PLATINUM_CHAKRAM = registerItem( "mythicmetals_compat/star_platinum/star_platinum_chakram",
            new SimplySwordsSwordItem(ModToolMaterial.STAR_PLATINUM, star_platinum_modifier +chakram_modifier, chakram_attackspeed,
                    "mythicmetals:star_platinum"));

    public static final Item STAR_PLATINUM_SCYTHE = registerItem( "mythicmetals_compat/star_platinum/star_platinum_scythe",
            new SimplySwordsSwordItem(ModToolMaterial.STAR_PLATINUM, star_platinum_modifier + scythe_modifier, scythe_attackspeed,
                    "mythicmetals:star_platinum"));

    public static final Item STAR_PLATINUM_HALBERD = registerItem( "mythicmetals_compat/star_platinum/star_platinum_halberd",
            new SimplySwordsSwordItem(ModToolMaterial.STAR_PLATINUM, star_platinum_modifier + halberd_modifier, halberd_attackspeed,
                    "mythicmetals:star_platinum"));


    //BRONZE
    public static final Item BRONZE_LONGSWORD = registerItem( "mythicmetals_compat/bronze/bronze_longsword",
            new SimplySwordsSwordItem(ModToolMaterial.BRONZE, bronze_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:bronze_ingot"));

    public static final Item BRONZE_TWINBLADE = registerItem( "mythicmetals_compat/bronze/bronze_twinblade",
            new SimplySwordsSwordItem(ModToolMaterial.BRONZE, bronze_modifier + twinblade_modifier, twinblade_attackspeed,
                    "mythicmetals:bronze_ingot"));

    public static final Item BRONZE_RAPIER = registerItem( "mythicmetals_compat/bronze/bronze_rapier",
            new SimplySwordsSwordItem(ModToolMaterial.BRONZE, bronze_modifier + rapier_modifier, rapier_attackspeed,
                    "mythicmetals:bronze_ingot"));

    public static final Item BRONZE_KATANA = registerItem( "mythicmetals_compat/bronze/bronze_katana",
            new SimplySwordsSwordItem(ModToolMaterial.BRONZE, bronze_modifier + katana_modifier, katana_attackspeed,
                    "mythicmetals:bronze_ingot"));

    public static final Item BRONZE_SAI = registerItem( "mythicmetals_compat/bronze/bronze_sai",
            new SimplySwordsSwordItem(ModToolMaterial.BRONZE, bronze_modifier +sai_modifier, sai_attackspeed,
                    "mythicmetals:bronze_ingot"));

    public static final Item BRONZE_SPEAR = registerItem( "mythicmetals_compat/bronze/bronze_spear",
            new SimplySwordsSwordItem(ModToolMaterial.BRONZE, bronze_modifier + spear_modifier, spear_attackspeed,
                    "mythicmetals:bronze_ingot"));

    public static final Item BRONZE_GLAIVE = registerItem( "mythicmetals_compat/bronze/bronze_glaive",
            new SimplySwordsSwordItem(ModToolMaterial.BRONZE, bronze_modifier + glaive_modifier, glaive_attackspeed,
                    "mythicmetals:bronze_ingot"));

    public static final Item BRONZE_WARGLAIVE = registerItem( "mythicmetals_compat/bronze/bronze_warglaive",
            new SimplySwordsSwordItem(ModToolMaterial.BRONZE, bronze_modifier + warglaive_modifier, warglaive_attackspeed,
                    "mythicmetals:bronze_ingot"));

    public static final Item BRONZE_CUTLASS = registerItem( "mythicmetals_compat/bronze/bronze_cutlass",
            new SimplySwordsSwordItem(ModToolMaterial.BRONZE, bronze_modifier + cutlass_modifier, cutlass_attackspeed,
                    "mythicmetals:bronze_ingot"));

    public static final Item BRONZE_CLAYMORE = registerItem( "mythicmetals_compat/bronze/bronze_claymore",
            new SimplySwordsSwordItem(ModToolMaterial.BRONZE, bronze_modifier + claymore_modifier, claymore_attackspeed,
                    "mythicmetals:bronze_ingot"));

    public static final Item BRONZE_GREATHAMMER = registerItem( "mythicmetals_compat/bronze/bronze_greathammer",
            new SimplySwordsSwordItem(ModToolMaterial.BRONZE, bronze_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:bronze_ingot"));

    public static final Item BRONZE_GREATAXE = registerItem( "mythicmetals_compat/bronze/bronze_greataxe",
            new SimplySwordsSwordItem(ModToolMaterial.BRONZE, bronze_modifier + greataxe_modifier, greataxe_attackspeed,
                    "mythicmetals:bronze_ingot"));

    public static final Item BRONZE_CHAKRAM = registerItem( "mythicmetals_compat/bronze/bronze_chakram",
            new SimplySwordsSwordItem(ModToolMaterial.BRONZE, bronze_modifier +chakram_modifier, chakram_attackspeed,
                    "mythicmetals:bronze_ingot"));

    public static final Item BRONZE_SCYTHE = registerItem( "mythicmetals_compat/bronze/bronze_scythe",
            new SimplySwordsSwordItem(ModToolMaterial.BRONZE, bronze_modifier + scythe_modifier, scythe_attackspeed,
                    "mythicmetals:bronze_ingot"));

    public static final Item BRONZE_HALBERD = registerItem( "mythicmetals_compat/bronze/bronze_halberd",
            new SimplySwordsSwordItem(ModToolMaterial.BRONZE, bronze_modifier + halberd_modifier, halberd_attackspeed,
                    "mythicmetals:bronze_ingot"));


    //STEEL
    public static final Item STEEL_LONGSWORD = registerItem( "mythicmetals_compat/steel/steel_longsword",
            new SimplySwordsSwordItem(ModToolMaterial.STEEL, steel_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:steel_ingot"));

    public static final Item STEEL_TWINBLADE = registerItem( "mythicmetals_compat/steel/steel_twinblade",
            new SimplySwordsSwordItem(ModToolMaterial.STEEL, steel_modifier + twinblade_modifier, twinblade_attackspeed,
                    "mythicmetals:steel_ingot"));

    public static final Item STEEL_RAPIER = registerItem( "mythicmetals_compat/steel/steel_rapier",
            new SimplySwordsSwordItem(ModToolMaterial.STEEL, steel_modifier + rapier_modifier, rapier_attackspeed,
                    "mythicmetals:steel_ingot"));

    public static final Item STEEL_KATANA = registerItem( "mythicmetals_compat/steel/steel_katana",
            new SimplySwordsSwordItem(ModToolMaterial.STEEL, steel_modifier + katana_modifier, katana_attackspeed,
                    "mythicmetals:steel_ingot"));

    public static final Item STEEL_SAI = registerItem( "mythicmetals_compat/steel/steel_sai",
            new SimplySwordsSwordItem(ModToolMaterial.STEEL, steel_modifier +sai_modifier, sai_attackspeed,
                    "mythicmetals:steel_ingot"));

    public static final Item STEEL_SPEAR = registerItem( "mythicmetals_compat/steel/steel_spear",
            new SimplySwordsSwordItem(ModToolMaterial.STEEL, steel_modifier + spear_modifier, spear_attackspeed,
                    "mythicmetals:steel_ingot"));

    public static final Item STEEL_GLAIVE = registerItem( "mythicmetals_compat/steel/steel_glaive",
            new SimplySwordsSwordItem(ModToolMaterial.STEEL, steel_modifier + glaive_modifier, glaive_attackspeed,
                    "mythicmetals:steel_ingot"));

    public static final Item STEEL_WARGLAIVE = registerItem( "mythicmetals_compat/steel/steel_warglaive",
            new SimplySwordsSwordItem(ModToolMaterial.STEEL, steel_modifier + warglaive_modifier, warglaive_attackspeed,
                    "mythicmetals:steel_ingot"));

    public static final Item STEEL_CUTLASS = registerItem( "mythicmetals_compat/steel/steel_cutlass",
            new SimplySwordsSwordItem(ModToolMaterial.STEEL, steel_modifier + cutlass_modifier, cutlass_attackspeed,
                    "mythicmetals:steel_ingot"));

    public static final Item STEEL_CLAYMORE = registerItem( "mythicmetals_compat/steel/steel_claymore",
            new SimplySwordsSwordItem(ModToolMaterial.STEEL, steel_modifier + claymore_modifier, claymore_attackspeed,
                    "mythicmetals:steel_ingot"));

    public static final Item STEEL_GREATHAMMER = registerItem( "mythicmetals_compat/steel/steel_greathammer",
            new SimplySwordsSwordItem(ModToolMaterial.STEEL, steel_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:steel_ingot"));

    public static final Item STEEL_GREATAXE = registerItem( "mythicmetals_compat/steel/steel_greataxe",
            new SimplySwordsSwordItem(ModToolMaterial.STEEL, steel_modifier + greataxe_modifier, greataxe_attackspeed,
                    "mythicmetals:steel_ingot"));

    public static final Item STEEL_CHAKRAM = registerItem( "mythicmetals_compat/steel/steel_chakram",
            new SimplySwordsSwordItem(ModToolMaterial.STEEL, steel_modifier +chakram_modifier, chakram_attackspeed,
                    "mythicmetals:steel_ingot"));

    public static final Item STEEL_SCYTHE = registerItem( "mythicmetals_compat/steel/steel_scythe",
            new SimplySwordsSwordItem(ModToolMaterial.STEEL, steel_modifier + scythe_modifier, scythe_attackspeed,
                    "mythicmetals:steel_ingot"));

    public static final Item STEEL_HALBERD = registerItem( "mythicmetals_compat/steel/steel_halberd",
            new SimplySwordsSwordItem(ModToolMaterial.STEEL, steel_modifier + halberd_modifier, halberd_attackspeed,
                    "mythicmetals:steel_ingot"));


    //STORMYX
    public static final Item STORMYX_LONGSWORD = registerItem( "mythicmetals_compat/stormyx/stormyx_longsword",
            new SimplySwordsSwordItem(ModToolMaterial.STORMYX, stormyx_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:stormyx_ingot"));

    public static final Item STORMYX_TWINBLADE = registerItem( "mythicmetals_compat/stormyx/stormyx_twinblade",
            new SimplySwordsSwordItem(ModToolMaterial.STORMYX, stormyx_modifier + twinblade_modifier, twinblade_attackspeed,
                    "mythicmetals:stormyx_ingot"));

    public static final Item STORMYX_RAPIER = registerItem( "mythicmetals_compat/stormyx/stormyx_rapier",
            new SimplySwordsSwordItem(ModToolMaterial.STORMYX, stormyx_modifier + rapier_modifier, rapier_attackspeed,
                    "mythicmetals:stormyx_ingot"));

    public static final Item STORMYX_KATANA = registerItem( "mythicmetals_compat/stormyx/stormyx_katana",
            new SimplySwordsSwordItem(ModToolMaterial.STORMYX, stormyx_modifier + katana_modifier, katana_attackspeed,
                    "mythicmetals:stormyx_ingot"));

    public static final Item STORMYX_SAI = registerItem( "mythicmetals_compat/stormyx/stormyx_sai",
            new SimplySwordsSwordItem(ModToolMaterial.STORMYX, stormyx_modifier +sai_modifier, sai_attackspeed,
                    "mythicmetals:stormyx_ingot"));

    public static final Item STORMYX_SPEAR = registerItem( "mythicmetals_compat/stormyx/stormyx_spear",
            new SimplySwordsSwordItem(ModToolMaterial.STORMYX, stormyx_modifier + spear_modifier, spear_attackspeed,
                    "mythicmetals:stormyx_ingot"));

    public static final Item STORMYX_GLAIVE = registerItem( "mythicmetals_compat/stormyx/stormyx_glaive",
            new SimplySwordsSwordItem(ModToolMaterial.STORMYX, stormyx_modifier + glaive_modifier, glaive_attackspeed,
                    "mythicmetals:stormyx_ingot"));

    public static final Item STORMYX_WARGLAIVE = registerItem( "mythicmetals_compat/stormyx/stormyx_warglaive",
            new SimplySwordsSwordItem(ModToolMaterial.STORMYX, stormyx_modifier + warglaive_modifier, warglaive_attackspeed,
                    "mythicmetals:stormyx_ingot"));

    public static final Item STORMYX_CUTLASS = registerItem( "mythicmetals_compat/stormyx/stormyx_cutlass",
            new SimplySwordsSwordItem(ModToolMaterial.STORMYX, stormyx_modifier + cutlass_modifier, cutlass_attackspeed,
                    "mythicmetals:stormyx_ingot"));

    public static final Item STORMYX_CLAYMORE = registerItem( "mythicmetals_compat/stormyx/stormyx_claymore",
            new SimplySwordsSwordItem(ModToolMaterial.STORMYX, stormyx_modifier + claymore_modifier, claymore_attackspeed,
                    "mythicmetals:stormyx_ingot"));

    public static final Item STORMYX_GREATHAMMER = registerItem( "mythicmetals_compat/stormyx/stormyx_greathammer",
            new SimplySwordsSwordItem(ModToolMaterial.STORMYX, stormyx_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:stormyx_ingot"));

    public static final Item STORMYX_GREATAXE = registerItem( "mythicmetals_compat/stormyx/stormyx_greataxe",
            new SimplySwordsSwordItem(ModToolMaterial.STORMYX, stormyx_modifier + greataxe_modifier, greataxe_attackspeed,
                    "mythicmetals:stormyx_ingot"));

    public static final Item STORMYX_CHAKRAM = registerItem( "mythicmetals_compat/stormyx/stormyx_chakram",
            new SimplySwordsSwordItem(ModToolMaterial.STORMYX, stormyx_modifier +chakram_modifier, chakram_attackspeed,
                    "mythicmetals:stormyx_ingot"));

    public static final Item STORMYX_SCYTHE = registerItem( "mythicmetals_compat/stormyx/stormyx_scythe",
            new SimplySwordsSwordItem(ModToolMaterial.STORMYX, stormyx_modifier + scythe_modifier, scythe_attackspeed,
                    "mythicmetals:stormyx_ingot"));

    public static final Item STORMYX_HALBERD = registerItem( "mythicmetals_compat/stormyx/stormyx_halberd",
            new SimplySwordsSwordItem(ModToolMaterial.STORMYX, stormyx_modifier + halberd_modifier, halberd_attackspeed,
                    "mythicmetals:stormyx_ingot"));


    //PALLADIUM
    public static final Item PALLADIUM_LONGSWORD = registerItem( "mythicmetals_compat/palladium/palladium_longsword",
            new SimplySwordsSwordItem(ModToolMaterial.PALLADIUM, palladium_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:palladium_ingot"));

    public static final Item PALLADIUM_TWINBLADE = registerItem( "mythicmetals_compat/palladium/palladium_twinblade",
            new SimplySwordsSwordItem(ModToolMaterial.PALLADIUM, palladium_modifier + twinblade_modifier, twinblade_attackspeed,
                    "mythicmetals:palladium_ingot"));

    public static final Item PALLADIUM_RAPIER = registerItem( "mythicmetals_compat/palladium/palladium_rapier",
            new SimplySwordsSwordItem(ModToolMaterial.PALLADIUM, palladium_modifier + rapier_modifier, rapier_attackspeed,
                    "mythicmetals:palladium_ingot"));

    public static final Item PALLADIUM_KATANA = registerItem( "mythicmetals_compat/palladium/palladium_katana",
            new SimplySwordsSwordItem(ModToolMaterial.PALLADIUM, palladium_modifier + katana_modifier, katana_attackspeed,
                    "mythicmetals:palladium_ingot"));

    public static final Item PALLADIUM_SAI = registerItem( "mythicmetals_compat/palladium/palladium_sai",
            new SimplySwordsSwordItem(ModToolMaterial.PALLADIUM, palladium_modifier +sai_modifier, sai_attackspeed,
                    "mythicmetals:palladium_ingot"));

    public static final Item PALLADIUM_SPEAR = registerItem( "mythicmetals_compat/palladium/palladium_spear",
            new SimplySwordsSwordItem(ModToolMaterial.PALLADIUM, palladium_modifier + spear_modifier, spear_attackspeed,
                    "mythicmetals:palladium_ingot"));

    public static final Item PALLADIUM_GLAIVE = registerItem( "mythicmetals_compat/palladium/palladium_glaive",
            new SimplySwordsSwordItem(ModToolMaterial.PALLADIUM, palladium_modifier + glaive_modifier, glaive_attackspeed,
                    "mythicmetals:palladium_ingot"));

    public static final Item PALLADIUM_WARGLAIVE = registerItem( "mythicmetals_compat/palladium/palladium_warglaive",
            new SimplySwordsSwordItem(ModToolMaterial.PALLADIUM, palladium_modifier + warglaive_modifier, warglaive_attackspeed,
                    "mythicmetals:palladium_ingot"));

    public static final Item PALLADIUM_CUTLASS = registerItem( "mythicmetals_compat/palladium/palladium_cutlass",
            new SimplySwordsSwordItem(ModToolMaterial.PALLADIUM, palladium_modifier + cutlass_modifier, cutlass_attackspeed,
                    "mythicmetals:palladium_ingot"));

    public static final Item PALLADIUM_CLAYMORE = registerItem( "mythicmetals_compat/palladium/palladium_claymore",
            new SimplySwordsSwordItem(ModToolMaterial.PALLADIUM, palladium_modifier + claymore_modifier, claymore_attackspeed,
                    "mythicmetals:palladium_ingot"));

    public static final Item PALLADIUM_GREATHAMMER = registerItem( "mythicmetals_compat/palladium/palladium_greathammer",
            new SimplySwordsSwordItem(ModToolMaterial.PALLADIUM, palladium_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:palladium_ingot"));

    public static final Item PALLADIUM_GREATAXE = registerItem( "mythicmetals_compat/palladium/palladium_greataxe",
            new SimplySwordsSwordItem(ModToolMaterial.PALLADIUM, palladium_modifier + greataxe_modifier, greataxe_attackspeed,
                    "mythicmetals:palladium_ingot"));

    public static final Item PALLADIUM_CHAKRAM = registerItem( "mythicmetals_compat/palladium/palladium_chakram",
            new SimplySwordsSwordItem(ModToolMaterial.PALLADIUM, palladium_modifier +chakram_modifier, chakram_attackspeed,
                    "mythicmetals:palladium_ingot"));

    public static final Item PALLADIUM_SCYTHE = registerItem( "mythicmetals_compat/palladium/palladium_scythe",
            new SimplySwordsSwordItem(ModToolMaterial.PALLADIUM, palladium_modifier + scythe_modifier, scythe_attackspeed,
                    "mythicmetals:palladium_ingot"));

    public static final Item PALLADIUM_HALBERD = registerItem( "mythicmetals_compat/palladium/palladium_halberd",
            new SimplySwordsSwordItem(ModToolMaterial.PALLADIUM, palladium_modifier + halberd_modifier, halberd_attackspeed,
                    "mythicmetals:palladium_ingot"));


    //METALLURGIUM
    public static final Item METALLURGIUM_LONGSWORD = registerItem( "mythicmetals_compat/metallurgium/metallurgium_longsword",
            new SimplySwordsSwordItem(ModToolMaterial.METALLURGIUM, metallurgium_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:metallurgium_ingot"));

    public static final Item METALLURGIUM_TWINBLADE = registerItem( "mythicmetals_compat/metallurgium/metallurgium_twinblade",
            new SimplySwordsSwordItem(ModToolMaterial.METALLURGIUM, metallurgium_modifier + twinblade_modifier, twinblade_attackspeed,
                    "mythicmetals:metallurgium_ingot"));

    public static final Item METALLURGIUM_RAPIER = registerItem( "mythicmetals_compat/metallurgium/metallurgium_rapier",
            new SimplySwordsSwordItem(ModToolMaterial.METALLURGIUM, metallurgium_modifier + rapier_modifier, rapier_attackspeed,
                    "mythicmetals:metallurgium_ingot"));

    public static final Item METALLURGIUM_KATANA = registerItem( "mythicmetals_compat/metallurgium/metallurgium_katana",
            new SimplySwordsSwordItem(ModToolMaterial.METALLURGIUM, metallurgium_modifier + katana_modifier, katana_attackspeed,
                    "mythicmetals:metallurgium_ingot"));

    public static final Item METALLURGIUM_SAI = registerItem( "mythicmetals_compat/metallurgium/metallurgium_sai",
            new SimplySwordsSwordItem(ModToolMaterial.METALLURGIUM, metallurgium_modifier +sai_modifier, sai_attackspeed,
                    "mythicmetals:metallurgium_ingot"));

    public static final Item METALLURGIUM_SPEAR = registerItem( "mythicmetals_compat/metallurgium/metallurgium_spear",
            new SimplySwordsSwordItem(ModToolMaterial.METALLURGIUM, metallurgium_modifier + spear_modifier, spear_attackspeed,
                    "mythicmetals:metallurgium_ingot"));

    public static final Item METALLURGIUM_GLAIVE = registerItem( "mythicmetals_compat/metallurgium/metallurgium_glaive",
            new SimplySwordsSwordItem(ModToolMaterial.METALLURGIUM, metallurgium_modifier + glaive_modifier, glaive_attackspeed,
                    "mythicmetals:metallurgium_ingot"));

    public static final Item METALLURGIUM_WARGLAIVE = registerItem( "mythicmetals_compat/metallurgium/metallurgium_warglaive",
            new SimplySwordsSwordItem(ModToolMaterial.METALLURGIUM, metallurgium_modifier + warglaive_modifier, warglaive_attackspeed,
                    "mythicmetals:metallurgium_ingot"));

    public static final Item METALLURGIUM_CUTLASS = registerItem( "mythicmetals_compat/metallurgium/metallurgium_cutlass",
            new SimplySwordsSwordItem(ModToolMaterial.METALLURGIUM, metallurgium_modifier + cutlass_modifier, cutlass_attackspeed,
                    "mythicmetals:metallurgium_ingot"));

    public static final Item METALLURGIUM_CLAYMORE = registerItem( "mythicmetals_compat/metallurgium/metallurgium_claymore",
            new SimplySwordsSwordItem(ModToolMaterial.METALLURGIUM, metallurgium_modifier + claymore_modifier, claymore_attackspeed,
                    "mythicmetals:metallurgium_ingot"));

    public static final Item METALLURGIUM_GREATHAMMER = registerItem( "mythicmetals_compat/metallurgium/metallurgium_greathammer",
            new SimplySwordsSwordItem(ModToolMaterial.METALLURGIUM, metallurgium_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:metallurgium_ingot"));

    public static final Item METALLURGIUM_GREATAXE = registerItem( "mythicmetals_compat/metallurgium/metallurgium_greataxe",
            new SimplySwordsSwordItem(ModToolMaterial.METALLURGIUM, metallurgium_modifier + greataxe_modifier, greataxe_attackspeed,
                    "mythicmetals:metallurgium_ingot"));

    public static final Item METALLURGIUM_CHAKRAM = registerItem( "mythicmetals_compat/metallurgium/metallurgium_chakram",
            new SimplySwordsSwordItem(ModToolMaterial.METALLURGIUM, metallurgium_modifier +chakram_modifier, chakram_attackspeed,
                    "mythicmetals:metallurgium_ingot"));

    public static final Item METALLURGIUM_SCYTHE = registerItem( "mythicmetals_compat/metallurgium/metallurgium_scythe",
            new SimplySwordsSwordItem(ModToolMaterial.METALLURGIUM, metallurgium_modifier + scythe_modifier, scythe_attackspeed,
                    "mythicmetals:metallurgium_ingot"));

    public static final Item METALLURGIUM_HALBERD = registerItem( "mythicmetals_compat/metallurgium/metallurgium_halberd",
            new SimplySwordsSwordItem(ModToolMaterial.METALLURGIUM, metallurgium_modifier + halberd_modifier, halberd_attackspeed,
                    "mythicmetals:metallurgium_ingot"));


    //CELESTIUM
    public static final Item CELESTIUM_LONGSWORD = registerItem( "mythicmetals_compat/celestium/celestium_longsword",
            new SimplySwordsSwordItem(ModToolMaterial.CELESTIUM, celestium_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:celestium_ingot"));

    public static final Item CELESTIUM_TWINBLADE = registerItem( "mythicmetals_compat/celestium/celestium_twinblade",
            new SimplySwordsSwordItem(ModToolMaterial.CELESTIUM, celestium_modifier + twinblade_modifier, twinblade_attackspeed,
                    "mythicmetals:celestium_ingot"));

    public static final Item CELESTIUM_RAPIER = registerItem( "mythicmetals_compat/celestium/celestium_rapier",
            new SimplySwordsSwordItem(ModToolMaterial.CELESTIUM, celestium_modifier + rapier_modifier, rapier_attackspeed,
                    "mythicmetals:celestium_ingot"));

    public static final Item CELESTIUM_KATANA = registerItem( "mythicmetals_compat/celestium/celestium_katana",
            new SimplySwordsSwordItem(ModToolMaterial.CELESTIUM, celestium_modifier + katana_modifier, katana_attackspeed,
                    "mythicmetals:celestium_ingot"));

    public static final Item CELESTIUM_SAI = registerItem( "mythicmetals_compat/celestium/celestium_sai",
            new SimplySwordsSwordItem(ModToolMaterial.CELESTIUM, celestium_modifier +sai_modifier, sai_attackspeed,
                    "mythicmetals:celestium_ingot"));

    public static final Item CELESTIUM_SPEAR = registerItem( "mythicmetals_compat/celestium/celestium_spear",
            new SimplySwordsSwordItem(ModToolMaterial.CELESTIUM, celestium_modifier + spear_modifier, spear_attackspeed,
                    "mythicmetals:celestium_ingot"));

    public static final Item CELESTIUM_GLAIVE = registerItem( "mythicmetals_compat/celestium/celestium_glaive",
            new SimplySwordsSwordItem(ModToolMaterial.CELESTIUM, celestium_modifier + glaive_modifier, glaive_attackspeed,
                    "mythicmetals:celestium_ingot"));

    public static final Item CELESTIUM_WARGLAIVE = registerItem( "mythicmetals_compat/celestium/celestium_warglaive",
            new SimplySwordsSwordItem(ModToolMaterial.CELESTIUM, celestium_modifier + warglaive_modifier, warglaive_attackspeed,
                    "mythicmetals:celestium_ingot"));

    public static final Item CELESTIUM_CUTLASS = registerItem( "mythicmetals_compat/celestium/celestium_cutlass",
            new SimplySwordsSwordItem(ModToolMaterial.CELESTIUM, celestium_modifier + cutlass_modifier, cutlass_attackspeed,
                    "mythicmetals:celestium_ingot"));

    public static final Item CELESTIUM_CLAYMORE = registerItem( "mythicmetals_compat/celestium/celestium_claymore",
            new SimplySwordsSwordItem(ModToolMaterial.CELESTIUM, celestium_modifier + claymore_modifier, claymore_attackspeed,
                    "mythicmetals:celestium_ingot"));

    public static final Item CELESTIUM_GREATHAMMER = registerItem( "mythicmetals_compat/celestium/celestium_greathammer",
            new SimplySwordsSwordItem(ModToolMaterial.CELESTIUM, celestium_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:celestium_ingot"));

    public static final Item CELESTIUM_GREATAXE = registerItem( "mythicmetals_compat/celestium/celestium_greataxe",
            new SimplySwordsSwordItem(ModToolMaterial.CELESTIUM, celestium_modifier + greataxe_modifier, greataxe_attackspeed,
                    "mythicmetals:celestium_ingot"));

    public static final Item CELESTIUM_CHAKRAM = registerItem( "mythicmetals_compat/celestium/celestium_chakram",
            new SimplySwordsSwordItem(ModToolMaterial.CELESTIUM, celestium_modifier +chakram_modifier, chakram_attackspeed,
                    "mythicmetals:celestium_ingot"));

    public static final Item CELESTIUM_SCYTHE = registerItem( "mythicmetals_compat/celestium/celestium_scythe",
            new SimplySwordsSwordItem(ModToolMaterial.CELESTIUM, celestium_modifier + scythe_modifier, scythe_attackspeed,
                    "mythicmetals:celestium_ingot"));

    public static final Item CELESTIUM_HALBERD = registerItem( "mythicmetals_compat/celestium/celestium_halberd",
            new SimplySwordsSwordItem(ModToolMaterial.CELESTIUM, celestium_modifier + halberd_modifier, halberd_attackspeed,
                    "mythicmetals:celestium_ingot"));





    //COPPER
    public static final Item COPPER_LONGSWORD = registerItem( "mythicmetals_compat/copper/copper_longsword",
            new SimplySwordsSwordItem(ModToolMaterial.COPPER, copper_modifier + longsword_modifier, longsword_attackspeed,
                    "mythicmetals:copper_ingot"));

    //DURASTEEL
    public static final Item DURASTEEL_GREATHAMMER = registerItem( "mythicmetals_compat/durasteel/durasteel_greathammer",
            new SimplySwordsSwordItem(ModToolMaterial.DURASTEEL, durasteel_modifier + greathammer_modifier, greathammer_attackspeed,
                    "mythicmetals:durasteel_ingot"));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SimplySwords.MOD_ID, name), item);
    }



    public static void registerModItems() {
        SimplySwords.LOGGER.info("Registering Mythic Metals compat Items for " + SimplySwords.MOD_ID);
    }

     */

}