package com.ricy40.testmod.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class NixStickItem extends Item {

    private static float CURRENT_DURABILITY = 3f;

    public NixStickItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {

        if (this.CURRENT_DURABILITY > 1 && pPlayer.isUnderWater()) {
            pPlayer.setAirSupply(10);
            pLevel.playSound(pPlayer, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), SoundEvents.BUBBLE_COLUMN_WHIRLPOOL_INSIDE, SoundSource.PLAYERS, 5f, 5f );
            if (this.CURRENT_DURABILITY == 1) {
                pPlayer.getItemInHand(pUsedHand).hurtAndBreak(1, pPlayer, (player) -> pPlayer.broadcastBreakEvent(pPlayer.getUsedItemHand()));
                pPlayer.setItemInHand(pUsedHand, new ItemStack(ModItems.NIX_STICK_EMPTY.get()));
            } else {
                pPlayer.getItemInHand(pUsedHand).hurtAndBreak(1, pPlayer, (player) -> pPlayer.broadcastBreakEvent(pPlayer.getUsedItemHand()));
            }
        }
        return super.use(pLevel, pPlayer, pUsedHand);
    }

}
