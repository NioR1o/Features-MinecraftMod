
package net.mcreator.features.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class IkistoneItem extends Item {
	public IkistoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.literal("\u042D\u0442\u043E \u0434\u0440\u0435\u0432\u043D\u0438\u0439 \u043C\u0438\u043D\u0435\u0440\u0430\u043B, \u0441\u043E\u0437\u0434\u0430\u043D\u044B\u0439 \u0432\u0440\u0435\u043C\u0435\u043D\u0435\u043C"));
		list.add(Component.literal(
				"\u041E\u0431\u044B\u0447\u043D\u043E \u043C\u043E\u0436\u043D\u043E \u043D\u0430\u0439\u0442\u0438 \u0432 \u043F\u043E\u0434\u043E\u0437\u0440\u0438\u0442\u0435\u043B\u044C\u043D\u043E\u043C \u043F\u0435\u0441\u043A\u0435 \u0438 \u0433\u0440\u0430\u0432\u0438\u0438"));
	}
}
