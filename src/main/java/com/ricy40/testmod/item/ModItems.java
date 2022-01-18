package com.ricy40.testmod.item;

import com.ricy40.testmod.TestMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> NIXIUM_INGOT = ITEMS.register("nixium_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).fireResistant().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> NIXIUM_NUGGET = ITEMS.register("nixium_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).fireResistant().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> NIXIUM_RAW = ITEMS.register("nixium_raw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).fireResistant().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> DICK = ITEMS.register("dick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).fireResistant().rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
