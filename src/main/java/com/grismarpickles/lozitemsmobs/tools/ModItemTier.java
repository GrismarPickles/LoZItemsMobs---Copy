package com.grismarpickles.lozitemsmobs.tools;

import com.grismarpickles.lozitemsmobs.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import java.util.function.Supplier;

public enum ModItemTier implements IItemTier
{
    ORDON(3, 600, 8.0F, 0.0F, 10, () ->
    {
        return Ingredient.of(Items.IRON_INGOT);
    }),
    GODDESS(3, 1100, 8.0F, 0.0F, 12, () ->
    {
        return Ingredient.of(RegistryHandler.LOFTSTEEL.get());
    }),
    GODDESSLONG(3, 3300, 8.0F, 0.0F, 12, () ->
    {
        return Ingredient.of(RegistryHandler.LOFTSTEEL.get());
    }),
    GODDESSWHITE(3, 3400, 8.0F, 0.0F, 12, () ->
    {
        return Ingredient.of(RegistryHandler.LOFTSTEEL.get());
    }),
    MASTER(3, -1, 8.0F, 0.0F, 12, () ->
    {
        return Ingredient.of(RegistryHandler.LOFTSTEEL.get());
    }),
    MASTERT(3, -1, 8.0F, 0.0F, 12, () ->
    {
        return Ingredient.of(RegistryHandler.LOFTSTEEL.get());
    }),
    MASTERT2(3, -1, 8.0F, 0.0F, 16, () ->
    {
        return Ingredient.of(RegistryHandler.LOFTSTEEL.get());
    }),
    MASTERT3(3, -1, 8.0F, 0.0F, 16, () ->
    {
        return Ingredient.of(RegistryHandler.LOFTSTEEL.get());
    }),
    AMASTER(3, -1, 8.0F, 0.0F, 20, () ->
    {
        return Ingredient.of(RegistryHandler.LOFTSTEEL.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
    {

        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;

    }



    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }

}
