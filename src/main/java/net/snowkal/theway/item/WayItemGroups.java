package net.snowkal.theway.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.snowkal.theway.TheWorldAroundYou;
import net.snowkal.theway.block.ModBlocks;

public class WayItemGroups {
    public static final ItemGroup THE_WORLD_AROUND_YOU = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheWorldAroundYou.MOD_ID, "the_world_around_you"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.MARIGOLD)).displayName(Text.translatable("itemgroup.theway"))
                    .entries((displayContext, entries) -> {
                      //blocks
                      entries.add(ModBlocks.OAK_HEART_PRESSURE_PLATE);
                      entries.add(ModBlocks.SPRUCE_HEART_PRESSURE_PLATE);
                      entries.add(ModBlocks.BIRCH_HEART_PRESSURE_PLATE);
                      entries.add(ModBlocks.JUNGLE_HEART_PRESSURE_PLATE);
                      entries.add(ModBlocks.ACACIA_HEART_PRESSURE_PLATE);
                      entries.add(ModBlocks.DARK_OAK_HEART_PRESSURE_PLATE);
                      entries.add(ModBlocks.MANGROVE_HEART_PRESSURE_PLATE);
                      entries.add(ModBlocks.CHERRY_HEART_PRESSURE_PLATE);
                      entries.add(ModBlocks.MARIGOLD);
                      entries.add(ModBlocks.MARIGOLD_BUSH);

                      //tools
                      entries.add(ModItems.COPPER_SWORD);
                      entries.add(ModItems.COPPER_PICKAXE);
                      entries.add(ModItems.COPPER_AXE);
                      entries.add(ModItems.COPPER_SHOVEL);
                      entries.add(ModItems.COPPER_HOE);
                      entries.add(ModItems.ROSE_GOLD_SWORD);
                      entries.add(ModItems.ROSE_GOLD_PICKAXE);
                      entries.add(ModItems.ROSE_GOLD_AXE);
                      entries.add(ModItems.ROSE_GOLD_SHOVEL);
                      entries.add(ModItems.ROSE_GOLD_HOE);
                      entries.add(ModItems.AMETHYST_SWORD);
                      entries.add(ModItems.AMETHYST_PICKAXE);
                      entries.add(ModItems.AMETHYST_AXE);
                      entries.add(ModItems.AMETHYST_SHOVEL);
                      entries.add(ModItems.AMETHYST_HOE);
                      entries.add(ModItems.OBSIDIAN_SWORD);
                      entries.add(ModItems.OBSIDIAN_PICKAXE);
                      entries.add(ModItems.OBSIDIAN_AXE);
                      entries.add(ModItems.OBSIDIAN_SHOVEL);
                      entries.add(ModItems.OBSIDIAN_HOE);

                      //resources
                      entries.add(ModItems.ROSE_GOLD_INGOT);
                      entries.add(ModItems.OBSIDIAN_SHARD);

                      //discs
                        entries.add(ModItems.OCHRE_DISC);
                    }).build());

    public static void registerItemGroups() {}
}
