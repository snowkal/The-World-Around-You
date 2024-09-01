package net.snowkal.theway.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.snowkal.theway.TheWorldAroundYou;

public class WayItemGroups {
    public static final ItemGroup THE_WORLD_AROUND_YOU = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheWorldAroundYou.MOD_ID, "the_world_around_you"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.COPPER_SWORD)).displayName(Text.translatable("itemgroup.theway"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModItems.COPPER_SWORD);
                    }).build());

    public static void registerItemGroups() {}
}
