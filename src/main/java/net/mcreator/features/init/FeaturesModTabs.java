
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.features.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.features.FeaturesMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FeaturesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FeaturesMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FEATURES = REGISTRY.register("features",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.features.features")).icon(() -> new ItemStack(FeaturesModItems.IKISTONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FeaturesModItems.IKISTONE.get());
				tabData.accept(FeaturesModItems.IKIAXE.get());
				tabData.accept(FeaturesModItems.IKICHISEL.get());
				tabData.accept(FeaturesModItems.IKIPICKAXE.get());
				tabData.accept(FeaturesModItems.IKISHOVEL.get());
				tabData.accept(FeaturesModItems.IKISWORD.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(FeaturesModItems.IKIAXE.get());
			tabData.accept(FeaturesModItems.IKICHISEL.get());
			tabData.accept(FeaturesModItems.IKIPICKAXE.get());
			tabData.accept(FeaturesModItems.IKISHOVEL.get());
			tabData.accept(FeaturesModItems.IKISWORD.get());

		}
	}
}
