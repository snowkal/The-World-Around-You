package net.snowkal.theway.item;

import net.minecraft.item.Item;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.snowkal.theway.TheWorldAroundYou;
import net.snowkal.theway.item.custom.WayToolMaterial;

public class ModItems {
    //tools
    public static final Item COPPER_SWORD = registerItem("copper_sword", new SwordItem(WayToolMaterial.COPPER, (new Item.Settings())
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.COPPER, 4, -2.4f))));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TheWorldAroundYou.MOD_ID, name), item);
    }
    public static void registerModItems() {
    }
}
