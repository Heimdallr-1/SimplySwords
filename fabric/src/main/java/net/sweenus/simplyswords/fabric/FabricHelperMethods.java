package net.sweenus.simplyswords.fabric;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.player.PlayerEntity;
import net.spell_power.api.SpellPower;
import net.spell_power.api.SpellSchools;

public class FabricHelperMethods {


    //Compatibility with Spell Power Attributes
    public static float useSpellAttributeScaling(float damageModifier, PlayerEntity player, String magicSchool) {
        if (FabricLoader.getInstance().isModLoaded("spell_power")) {
            if (player != null && !player.getWorld().isClient) {

                double attributePower = 0;
                double damageOutput = 0.1;

                // Fetch attributes (crit damage/chance is now handled internally in API via randomValue)

                if (magicSchool.contains("lightning"))
                    attributePower = SpellPower.getSpellPower(SpellSchools.LIGHTNING, player).randomValue();
                else if (magicSchool.contains("fire"))
                    attributePower = SpellPower.getSpellPower(SpellSchools.FIRE, player).randomValue();
                else if (magicSchool.contains("frost"))
                    attributePower = SpellPower.getSpellPower(SpellSchools.FROST, player).randomValue();
                else if (magicSchool.contains("arcane"))
                    attributePower = SpellPower.getSpellPower(SpellSchools.ARCANE, player).randomValue();
                else if (magicSchool.contains("soul"))
                    attributePower = SpellPower.getSpellPower(SpellSchools.SOUL, player).randomValue();
                else if (magicSchool.contains("healing"))
                    attributePower = SpellPower.getSpellPower(SpellSchools.HEALING, player).randomValue();


                damageOutput = (damageModifier * attributePower);

                return (float) damageOutput;
            }
        }
        return 0;
    }
}