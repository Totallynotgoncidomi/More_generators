
package net.mcreator.moregenerators.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.moregenerators.init.MoreGeneratorsModFluids;

public class OilItem extends BucketItem {
	public OilItem() {
		super(MoreGeneratorsModFluids.OIL, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
