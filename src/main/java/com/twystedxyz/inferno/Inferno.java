package com.twystedxyz.inferno;

import com.twystedxyz.inferno.content.*;
import com.twystedxyz.inferno.util.IFCreativeTab;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.loot.v2.LootTableSource;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class Inferno implements ModInitializer {
	public static final String MOD_ID = "inferno";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final boolean SHOW_ME_YOUR_SKIN = FabricLoader.getInstance().isModLoaded("showmeyourskin");

	@Override
	public void onInitialize() {
		IFCreativeTab.init();
		IFItems.init();


		LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
			if (source == LootTableSource.DATA_PACK) return;

			if (BuiltInLootTables.BASTION_BRIDGE == key) {
				LootPool.Builder blazeUpgradePoolBuilder = LootPool.lootPool()
						.add(LootItem.lootTableItem(IFItems.BLAZE_UPGRADE_SMITHING_TEMPLATE))
						.when(LootItemRandomChanceCondition.randomChance(0.2f));

				tableBuilder.withPool(blazeUpgradePoolBuilder);
			}
			if (BuiltInLootTables.BASTION_OTHER == key) {
				LootPool.Builder blazeUpgradePoolBuilder = LootPool.lootPool()
						.add(LootItem.lootTableItem(IFItems.BLAZE_UPGRADE_SMITHING_TEMPLATE))
						.when(LootItemRandomChanceCondition.randomChance(0.2f));

				tableBuilder.withPool(blazeUpgradePoolBuilder);
			}
			if (BuiltInLootTables.BASTION_HOGLIN_STABLE == key) {
				LootPool.Builder blazeUpgradePoolBuilder = LootPool.lootPool()
						.add(LootItem.lootTableItem(IFItems.BLAZE_UPGRADE_SMITHING_TEMPLATE))
						.when(LootItemRandomChanceCondition.randomChance(0.2f));

				tableBuilder.withPool(blazeUpgradePoolBuilder);
			}
			if (BuiltInLootTables.BASTION_TREASURE == key) {
				LootPool.Builder blazeUpgradePoolBuilder = LootPool.lootPool()
						.add(LootItem.lootTableItem(IFItems.BLAZE_UPGRADE_SMITHING_TEMPLATE))
						.when(LootItemRandomChanceCondition.randomChance(0.2f));

				tableBuilder.withPool(blazeUpgradePoolBuilder);
			}
		});
	}

	public static ResourceLocation rl(String path) {
		return ResourceLocation.fromNamespaceAndPath(Inferno.MOD_ID, path);
	}
}
