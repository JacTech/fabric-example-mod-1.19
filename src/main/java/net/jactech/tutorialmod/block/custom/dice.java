package net.jactech.tutorialmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;


public class dice extends Block {
    public dice(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(!world.isClient() && hand == Hand.MAIN_HAND) {
            outputRandomNumber(player);
        }
       return super.onUse(state, world, pos, player, hand, hit);

    }

    private void outputRandomNumber(PlayerEntity player) {
        player.sendMessage(Text.literal("You rolled a " + getRandomNumber()));
    }
    private int getRandomNumber() {
        return Random.createLocal().nextInt(7);
    }
}
