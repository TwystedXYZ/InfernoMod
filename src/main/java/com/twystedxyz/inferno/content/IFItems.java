package com.twystedxyz.inferno.content;

import com.twystedxyz.inferno.Inferno;
import com.twystedxyz.inferno.content.items.*;
import com.twystedxyz.inferno.util.IFArmorMaterials;
import com.twystedxyz.inferno.util.IFTiers;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.List;

@SuppressWarnings("unused")
public class IFItems {
    public static final Item BLAZE_UPGRADE_SMITHING_TEMPLATE = register("blaze_upgrade_smithing_template", createBlazeUpgradeSmithingTemplate());
    public static final Item BLAZE_RING = register("blaze_ring", new Item(new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant()));
    public static final Item BLAZE_HELMET = register("blaze_helmet", new BlazeArmorItem(IFArmorMaterials.BLAZE, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(40))));
    public static final Item BLAZE_CHESTPLATE = register("blaze_chestplate", new BlazeArmorItem(IFArmorMaterials.BLAZE, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(40))));
    public static final Item BLAZE_LEGGINGS = register("blaze_leggings", new BlazeArmorItem(IFArmorMaterials.BLAZE, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(40))));
    public static final Item BLAZE_BOOTS = register("blaze_boots", new BlazeArmorItem(IFArmorMaterials.BLAZE, ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(40))));
    public static final Item BLAZE_SHOVEL = register("blaze_shovel", new ShovelItem(IFTiers.BLAZE, new Item.Properties().attributes(ShovelItem.createAttributes(IFTiers.BLAZE, 1.5f, -3)).rarity(Rarity.UNCOMMON).fireResistant()));
    public static final Item BLAZE_PICKAXE = register("blaze_pickaxe", new PickaxeItem(IFTiers.BLAZE, new Item.Properties().attributes(PickaxeItem.createAttributes(IFTiers.BLAZE, 1, -2.8f)).rarity(Rarity.UNCOMMON).fireResistant()));
    public static final Item BLAZE_AXE = register("blaze_axe", new AxeItem(IFTiers.BLAZE, new Item.Properties().attributes(AxeItem.createAttributes(IFTiers.BLAZE, 5, -3)).rarity(Rarity.UNCOMMON).fireResistant()));
    public static final Item BLAZE_HOE = register("blaze_hoe", new HoeItem(IFTiers.BLAZE, new Item.Properties().attributes(HoeItem.createAttributes(IFTiers.BLAZE, -4, 0)).rarity(Rarity.UNCOMMON).fireResistant()));
    public static final Item BLAZE_SWORD = register("blaze_sword", new SwordItem(IFTiers.BLAZE, new Item.Properties().attributes(SwordItem.createAttributes(IFTiers.BLAZE, 3, -2.4f)).rarity(Rarity.UNCOMMON).fireResistant()));

    public static Item register(String id, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, Inferno.rl(id), item);
    }

    private static Item createBlazeUpgradeSmithingTemplate() {
        return new SmithingTemplateItem(
                Component.translatable(Util.makeDescriptionId("item", Inferno.rl("smithing_template.blaze_upgrade.applies_to"))).withStyle(ChatFormatting.BLUE),
                Component.translatable(Util.makeDescriptionId("item", Inferno.rl("smithing_template.blaze_upgrade.ingredients"))).withStyle(ChatFormatting.BLUE),
                Component.translatable(Util.makeDescriptionId("upgrade", Inferno.rl("blaze_upgrade"))).withStyle(ChatFormatting.GRAY),
                Component.translatable(Util.makeDescriptionId("item", Inferno.rl("smithing_template.blaze_upgrade.base_slot_description"))),
                Component.translatable(Util.makeDescriptionId("item", Inferno.rl("smithing_template.blaze_upgrade.additions_slot_description"))),
                getBlazeEmptyBaseSlotTextures(),
                getBlazeEmptyAdditionsSlotTextures());
    }

    private static List<ResourceLocation> getBlazeEmptyBaseSlotTextures() {
        return List.of(ResourceLocation.withDefaultNamespace("item/empty_armor_slot_helmet"),
                ResourceLocation.withDefaultNamespace("item/empty_armor_slot_chestplate"),
                ResourceLocation.withDefaultNamespace("item/empty_armor_slot_leggings"),
                ResourceLocation.withDefaultNamespace("item/empty_armor_slot_boots"),
                ResourceLocation.withDefaultNamespace("item/empty_slot_sword"),
                ResourceLocation.withDefaultNamespace("item/empty_slot_pickaxe"),
                ResourceLocation.withDefaultNamespace("item/empty_slot_axe"),
                ResourceLocation.withDefaultNamespace("item/empty_slot_shovel"),
                ResourceLocation.withDefaultNamespace("item/empty_slot_hoe"));
    }

    private static List<ResourceLocation> getBlazeEmptyAdditionsSlotTextures() {
        return List.of(Inferno.rl("item/empty_slot_blaze_ring"));
    }

    public static void init() {
        Inferno.LOGGER.debug("Registering items");
    }
}
