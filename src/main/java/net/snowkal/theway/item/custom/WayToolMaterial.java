package net.snowkal.theway.item.custom;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.snowkal.theway.item.ModItems;

import java.util.function.Supplier;

public enum WayToolMaterial implements ToolMaterial {
    COPPER(BlockTags.INCORRECT_FOR_IRON_TOOL, 300, 3, 1, 9, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    ROSE_GOLD(BlockTags.INCORRECT_FOR_IRON_TOOL, 550, 5, 1, 18, () -> Ingredient.ofItems(ModItems.ROSE_GOLD_INGOT)),
    AMETHYST(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 650, 3, 1, 12, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
    OBSIDIAN(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1250, 4, 1, 14, () -> Ingredient.ofItems(ModItems.OBSIDIAN_SHARD));


    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    WayToolMaterial(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
