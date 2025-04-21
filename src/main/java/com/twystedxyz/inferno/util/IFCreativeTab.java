package com.twystedxyz.inferno.util;

import com.twystedxyz.inferno.Inferno;
import com.twystedxyz.inferno.content.IFItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class IFCreativeTab {
    private static final CreativeModeTab.Builder ITEM_GROUP_BUILDER = FabricItemGroup.builder().title(Component.translatable("itemGroup.inferno")).icon(() -> new ItemStack(IFItems.BLAZE_RING)).displayItems(((displayContext, entries) -> {

        entries.accept(IFItems.BLAZE_SHOVEL);
        entries.accept(IFItems.BLAZE_PICKAXE);
        entries.accept(IFItems.BLAZE_AXE);
        entries.accept(IFItems.BLAZE_HOE);
        entries.accept(IFItems.BLAZE_SWORD);
        entries.accept(IFItems.BLAZE_HELMET);
        entries.accept(IFItems.BLAZE_CHESTPLATE);
        entries.accept(IFItems.BLAZE_LEGGINGS);
        entries.accept(IFItems.BLAZE_BOOTS);

        entries.accept(IFItems.BLAZE_RING);

        entries.accept(IFItems.BLAZE_UPGRADE_SMITHING_TEMPLATE);
    }));

    public static CreativeModeTab INFERNO;

    public static void init() {
        INFERNO = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Inferno.rl("inferno"), ITEM_GROUP_BUILDER.build());
        Inferno.LOGGER.debug("Registering creative tab");
    }
}
