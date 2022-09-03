package net.jactech.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.jactech.tutorialmod.TutorialMod;
import net.jactech.tutorialmod.block.ModBlocks;
import net.jactech.tutorialmod.item.custom.DiceItem;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item RAW_PLATIN = registerItem("raw_platin",
            new Item(new FabricItemSettings().group(ModitemGroup.PLATIN)));
    public static final Item PLATIN = registerItem("platin",
            new Item(new FabricItemSettings().group(ModitemGroup.PLATIN)));

    public static final Item DICE = registerItem("dice",
            new DiceItem(new FabricItemSettings().group(ModitemGroup.PLATIN).maxCount(1)));

    public static final Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds",
            new AliasedBlockItem(ModBlocks.STRAWBERRY_CROP, new FabricItemSettings().group(ModitemGroup.PLATIN)));

    public static final Item STRAWBERRY = registerItem("strawberry",
            new Item(new FabricItemSettings().group(ModitemGroup.PLATIN).food(new FoodComponent.Builder().hunger(3).saturationModifier(2f).build())));

    public static final Item ROAST_DUCK = registerItem("roast_duck",
            new Item(new FabricItemSettings().group(ModitemGroup.PLATIN).food(new FoodComponent.Builder().hunger(6).saturationModifier(8f).build())));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }
    public static void registerModItems() {

        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);

    }
}
