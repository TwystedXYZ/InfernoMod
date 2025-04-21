package com.twystedxyz.inferno.content.items;

import com.twystedxyz.inferno.Inferno;
import com.twystedxyz.inferno.util.IFArmorMaterials;
import net.fabricmc.fabric.api.item.v1.EnchantingContext;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.EnchantmentTags;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;

import java.util.List;

public class BlazeArmorItem extends ArmorItem {
    private final List<Holder<MobEffect>> immunities;

    public BlazeArmorItem(Holder<ArmorMaterial> material, Type type, Properties properties) {
        this(material, type, properties, List.of());
    }

    public BlazeArmorItem(Holder<ArmorMaterial> material, Type type, Properties properties, List<Holder<MobEffect>> immunities) {
        super(material, type, properties);
        this.immunities = immunities;
    }

    public static ItemAttributeModifiers createAttributes() {
        ResourceLocation location = Inferno.rl("armor.blaze");
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(location, IFArmorMaterials.BLAZE.value().getDefense(Type.LEGGINGS), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(location, IFArmorMaterials.BLAZE.value().toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(location, IFArmorMaterials.BLAZE.value().knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.MOVEMENT_SPEED, new AttributeModifier(location, 0.05, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS).build();
    }
}
