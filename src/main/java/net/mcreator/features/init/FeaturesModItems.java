
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.features.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.features.item.IkiswordItem;
import net.mcreator.features.item.IkistoneItem;
import net.mcreator.features.item.IkishovelItem;
import net.mcreator.features.item.IkipickaxeItem;
import net.mcreator.features.item.IkichiselItem;
import net.mcreator.features.item.IkiaxeItem;
import net.mcreator.features.FeaturesMod;

public class FeaturesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(FeaturesMod.MODID);
	public static final DeferredItem<Item> IKISTONE = REGISTRY.register("ikistone", IkistoneItem::new);
	public static final DeferredItem<Item> IKIAXE = REGISTRY.register("ikiaxe", IkiaxeItem::new);
	public static final DeferredItem<Item> IKICHISEL = REGISTRY.register("ikichisel", IkichiselItem::new);
	public static final DeferredItem<Item> IKIPICKAXE = REGISTRY.register("ikipickaxe", IkipickaxeItem::new);
	public static final DeferredItem<Item> IKISHOVEL = REGISTRY.register("ikishovel", IkishovelItem::new);
	public static final DeferredItem<Item> IKISWORD = REGISTRY.register("ikisword", IkiswordItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
