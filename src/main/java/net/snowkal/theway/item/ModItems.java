package net.snowkal.theway.item;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.snowkal.theway.TheWorldAroundYou;
import net.snowkal.theway.item.custom.WayToolMaterial;

public class ModItems {
    //resources
    public static final Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot", new Item(new Item.Settings()));
    public static final Item OBSIDIAN_SHARD = registerItem("obsidian_shard", new Item(new Item.Settings()));

    //tools
    public static final Item COPPER_SWORD = registerItem("copper_sword", new SwordItem(WayToolMaterial.COPPER, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.COPPER, 4, -2.4f)))));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe", new PickaxeItem(WayToolMaterial.COPPER, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.COPPER, 1, -3.1f)))));
    public static final Item COPPER_AXE = registerItem("copper_axe", new AxeItem(WayToolMaterial.COPPER, (new Item.Settings())
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.COPPER, 5, -3.2f))));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel", new ShovelItem(WayToolMaterial.COPPER, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.COPPER, 1, -3.1f)))));
    public static final Item COPPER_HOE = registerItem("copper_hoe", new HoeItem(WayToolMaterial.COPPER, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.COPPER, 1, -3.1f)))));
    public static final Item ROSE_GOLD_SWORD = registerItem("rose_gold_sword", new SwordItem(WayToolMaterial.ROSE_GOLD, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.ROSE_GOLD, 3.5f, -2.4f)))));
    public static final Item ROSE_GOLD_PICKAXE = registerItem("rose_gold_pickaxe", new PickaxeItem(WayToolMaterial.ROSE_GOLD, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.ROSE_GOLD, 1, -3.1f)))));
    public static final Item ROSE_GOLD_AXE = registerItem("rose_gold_axe", new AxeItem(WayToolMaterial.ROSE_GOLD, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.ROSE_GOLD, 4.5f, -3.2f)))));
    public static final Item ROSE_GOLD_SHOVEL = registerItem("rose_gold_shovel", new ShovelItem(WayToolMaterial.ROSE_GOLD, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.ROSE_GOLD, 1, -3.1f)))));
    public static final Item ROSE_GOLD_HOE = registerItem("rose_gold_hoe", new ShovelItem(WayToolMaterial.ROSE_GOLD, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.ROSE_GOLD, 1, -3.1f)))));
    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword", new SwordItem(WayToolMaterial.AMETHYST, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.AMETHYST, 5.5f, -2.4f)))));
    public static final Item AMETHYST_PICKAXE = registerItem("amethyst_pickaxe", new PickaxeItem(WayToolMaterial.AMETHYST, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.AMETHYST, 1, -3.1f)))));
    public static final Item AMETHYST_AXE = registerItem("amethyst_axe", new AxeItem(WayToolMaterial.AMETHYST, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.AMETHYST, 7.5f, -3.2f)))));
    public static final Item AMETHYST_SHOVEL = registerItem("amethyst_shovel", new ShovelItem(WayToolMaterial.AMETHYST, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.AMETHYST, 1, -3.1f)))));
    public static final Item AMETHYST_HOE = registerItem("amethyst_hoe", new HoeItem(WayToolMaterial.AMETHYST, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.AMETHYST, 1, -3.1f)))));
    public static final Item OBSIDIAN_SWORD = registerItem("obsidian_sword", new SwordItem(WayToolMaterial.OBSIDIAN, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.OBSIDIAN, 6.5f, -2.4f)))));
    public static final Item OBSIDIAN_PICKAXE = registerItem("obsidian_pickaxe", new PickaxeItem(WayToolMaterial.OBSIDIAN, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.OBSIDIAN, 1, -3.1f)))));
    public static final Item OBSIDIAN_AXE = registerItem("obsidian_axe", new AxeItem(WayToolMaterial.OBSIDIAN, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.OBSIDIAN, 7.5f, -3.2f)))));
    public static final Item OBSIDIAN_SHOVEL = registerItem("obsidian_shovel", new ShovelItem(WayToolMaterial.OBSIDIAN, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.OBSIDIAN, 1, -3.1f)))));
    public static final Item OBSIDIAN_HOE = registerItem("obsidian_hoe", new HoeItem(WayToolMaterial.OBSIDIAN, (new Item.Settings()
            .attributeModifiers(MiningToolItem.createAttributeModifiers(WayToolMaterial.OBSIDIAN, 1, -3.1f)))));


    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TheWorldAroundYou.MOD_ID, name), item);
    }
    public static void registerModItems() {
    }
}
