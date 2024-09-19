package net.snowkal.theway.block;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.snowkal.theway.TheWorldAroundYou;
import net.snowkal.theway.block.custom.HeartPressurePlateBlock;
import net.snowkal.theway.effect.GoldenEffect;

public class ModBlocks {
    //pressure plates
    public static final Block OAK_HEART_PRESSURE_PLATE = registerBlock("oak_heart_pressure_plate",
            new HeartPressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final Block SPRUCE_HEART_PRESSURE_PLATE = registerBlock("spruce_heart_pressure_plate",
            new HeartPressurePlateBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.copy(Blocks.SPRUCE_PRESSURE_PLATE)));
    public static final Block BIRCH_HEART_PRESSURE_PLATE = registerBlock("birch_heart_pressure_plate",
            new HeartPressurePlateBlock(BlockSetType.BIRCH, AbstractBlock.Settings.copy(Blocks.BIRCH_PRESSURE_PLATE)));
    public static final Block JUNGLE_HEART_PRESSURE_PLATE = registerBlock("jungle_heart_pressure_plate",
            new HeartPressurePlateBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.copy(Blocks.JUNGLE_PRESSURE_PLATE)));
    public static final Block ACACIA_HEART_PRESSURE_PLATE = registerBlock("acacia_heart_pressure_plate",
            new HeartPressurePlateBlock(BlockSetType.ACACIA, AbstractBlock.Settings.copy(Blocks.ACACIA_PRESSURE_PLATE)));
    public static final Block DARK_OAK_HEART_PRESSURE_PLATE = registerBlock("dark_oak_heart_pressure_plate",
            new HeartPressurePlateBlock(BlockSetType.DARK_OAK, AbstractBlock.Settings.copy(Blocks.DARK_OAK_PRESSURE_PLATE)));
    public static final Block MANGROVE_HEART_PRESSURE_PLATE = registerBlock("mangrove_heart_pressure_plate",
            new HeartPressurePlateBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_PRESSURE_PLATE)));
    public static final Block CHERRY_HEART_PRESSURE_PLATE = registerBlock("cherry_heart_pressure_plate",
            new HeartPressurePlateBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.CHERRY_PRESSURE_PLATE)));

    //flowers
    public static final Block MARIGOLD_BUSH = registerBlock("marigold_bush",
            new FlowerBlock(GoldenEffect.GOLDEN, 60f, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block MARIGOLD = registerBlock("marigold",
            new FlowerBlock(GoldenEffect.GOLDEN, 15f, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block POTTED_MARIGOLD = Registry.register(Registries.BLOCK, Identifier.of(TheWorldAroundYou.MOD_ID, "potted_marigold"),
            new FlowerPotBlock(MARIGOLD, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TheWorldAroundYou.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TheWorldAroundYou.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {}
}
