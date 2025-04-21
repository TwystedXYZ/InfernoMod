package com.twystedxyz.inferno.util;

import com.twystedxyz.inferno.content.IFItems;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public enum IFTiers implements Tier {
    BLAZE(IFTags.Blocks.INCORRECT_FOR_BLAZE_TOOL, 2519, 10.0f, 5.0f, 18, IFItems.BLAZE_RING);

    private final TagKey<Block> incorrectBlocksForDrops;
    private final int durability;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Ingredient repairIngredient;

    IFTiers(TagKey<Block> incorrectBlocksForDrops, int durability, float speed, float damage, int enchantmentValue, ItemLike repairIngredient) {
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
        this.durability = durability;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = Ingredient.of(repairIngredient);
    }

    @Override
    public int getUses() {
        return this.durability;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
