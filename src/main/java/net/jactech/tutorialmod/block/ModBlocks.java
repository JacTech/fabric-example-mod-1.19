package net.jactech.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.jactech.tutorialmod.TutorialMod;
import net.jactech.tutorialmod.block.custom.dice;
import net.jactech.tutorialmod.block.custom.PlatinLampBlock;
import net.jactech.tutorialmod.item.ModitemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block PLATIN_BLOCK = registerBlock("platin_block",new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModitemGroup.PLATIN);
    public static final Block PLATIN_ORE = registerBlock("platin_ore",new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ModitemGroup.PLATIN);
    public static final Block DEEPSLATE_PLATIN_ORE = registerBlock("deepslate_platin_ore",new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), UniformIntProvider.create(3, 9)), ModitemGroup.PLATIN);
    public static final Block RAW_PLATIN_BLOCK = registerBlock("raw_platin_block",new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModitemGroup.PLATIN);
    public static final Block DICE_BLOCK = registerBlock("dice_block",new dice(FabricBlockSettings.of(Material.WOOL).strength(3f).requiresTool()), ModitemGroup.PLATIN);
    public static final Block PLATIN_LAMP = registerBlock("dice_block",new PlatinLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(3f).requiresTool().luminance(state -> state.get(PlatinLampBlock.LIT)? 15 : 0)), ModitemGroup.PLATIN);
    private  static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name),
        new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void  registerModBlocks() {
        TutorialMod.LOGGER.debug("Registering ModBlocks for " + TutorialMod.MOD_ID);

    }
}
