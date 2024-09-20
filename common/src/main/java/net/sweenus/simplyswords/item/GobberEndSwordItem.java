package net.sweenus.simplyswords.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.sweenus.simplyswords.SimplySwords;
import net.sweenus.simplyswords.config.Config;
import net.sweenus.simplyswords.config.ConfigDefaultValues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GobberEndSwordItem extends SwordItem {
    String[] repairIngredient;

    public GobberEndSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, String... repairIngredient) {
        super(toolMaterial, attackDamage, attackSpeed,
                new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS));
        this.repairIngredient = repairIngredient;
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        List<Item> potentialIngredients = new ArrayList<>(List.of());
        Arrays.stream(repairIngredient).toList().forEach(repIngredient ->
            potentialIngredients.add(
                    Registries.ITEM.get(Identifier.of(repIngredient))));


        return potentialIngredients.contains(ingredient.getItem());
    }

    //Unbreakable weapon support for Gobber
    static boolean unbreakable = Config.getBoolean("compatGobberEndWeaponsUnbreakable", "General", ConfigDefaultValues.compatGobberEndWeaponsUnbreakable);

    /* 1.21
    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player)
    {
        if(world.isClient) return;

        if(unbreakable)
        {
            stack.getOrCreateNbt().putBoolean("Unbreakable", true);
        }
    }
     */

}
