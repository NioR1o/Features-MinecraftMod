
package net.mcreator.features.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IkistoneItem extends Item {
	public IkistoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
