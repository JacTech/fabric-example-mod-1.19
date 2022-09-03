package net.jactech.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.jactech.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModitemGroup {

    public static final ItemGroup PLATIN = FabricItemGroupBuilder.build(new Identifier(TutorialMod.MOD_ID, "platin"), () -> new ItemStack(ModItems.PLATIN));
}
