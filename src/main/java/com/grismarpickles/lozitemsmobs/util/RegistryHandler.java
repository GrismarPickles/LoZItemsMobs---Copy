package com.grismarpickles.lozitemsmobs.util;

import com.grismarpickles.lozitemsmobs.LoZItemsMobs;
import com.grismarpickles.lozitemsmobs.blocks.BlockItemBase;
import com.grismarpickles.lozitemsmobs.blocks.LzOreBlock;
import com.grismarpickles.lozitemsmobs.items.ItemBase;
import com.grismarpickles.lozitemsmobs.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler
{

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LoZItemsMobs.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LoZItemsMobs.MOD_ID);

    public static void init()
    {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    // Items
    public static final RegistryObject<Item> MASTERORE = ITEMS.register("master_ore", ItemBase::new);
    public static final RegistryObject<Item> LOFTSTEEL = ITEMS.register("loftsteel", ItemBase::new);
    public static final RegistryObject<Item> HORNGOAT = ITEMS.register("horn_goat", ItemBase::new);

    // Tools
    public static final RegistryObject<SwordItem> ORDON_SWORD = ITEMS.register( "ordon_sword", () ->
            new SwordItem(ModItemTier.ORDON, 5, -2.4F, new Item.Properties().tab(LoZItemsMobs.TAB)));
    public static final RegistryObject<SwordItem> GODDESS_SWORD = ITEMS.register( "goddess_sword", () ->
            new SwordItem(ModItemTier.GODDESS, 6, -2.4F, new Item.Properties().tab(LoZItemsMobs.TAB)));
    public static final RegistryObject<SwordItem> GODDESS_LONG_SWORD = ITEMS.register( "goddess_long_sword", () ->
            new SwordItem(ModItemTier.GODDESSLONG, 7, -2.4F, new Item.Properties().tab(LoZItemsMobs.TAB)));
    public static final RegistryObject<SwordItem> GODDESS_WHITE_SWORD = ITEMS.register( "goddess_white_sword", () ->
            new SwordItem(ModItemTier.GODDESSWHITE, 8, -2.4F, new Item.Properties().tab(LoZItemsMobs.TAB)));
    public static final RegistryObject<SwordItem> MASTER_SWORD = ITEMS.register( "master_sword", () ->
            new SwordItem(ModItemTier.MASTER, 8, -2.2F, new Item.Properties().tab(LoZItemsMobs.TAB)));
    public static final RegistryObject<SwordItem> TRUE_MASTER_SWORD = ITEMS.register( "true_master_sword", () ->
            new SwordItem(ModItemTier.MASTERT, 9, -2.2F, new Item.Properties().tab(LoZItemsMobs.TAB)));
    public static final RegistryObject<SwordItem> TRUE_MASTER_SWORD2 = ITEMS.register( "true_master_sword2", () ->
            new SwordItem(ModItemTier.MASTERT2, 11, -2.2F, new Item.Properties().tab(LoZItemsMobs.TAB)));
    public static final RegistryObject<SwordItem> TRUE_MASTER_SWORD3 = ITEMS.register( "true_master_sword3", () ->
            new SwordItem(ModItemTier.MASTERT3, 11, -2.0F, new Item.Properties().tab(LoZItemsMobs.TAB)));
    public static final RegistryObject<SwordItem> AWAKENED_MASTER_SWORD = ITEMS.register( "awakened_master_sword", () ->
            new SwordItem(ModItemTier.AMASTER, 13, -2.0F, new Item.Properties().tab(LoZItemsMobs.TAB)));

    // Blocks
    public static final RegistryObject<Block> LOFTSTEEL_ORE_BLOCK = BLOCKS.register("loftsteel_ore_block", LzOreBlock::new);
    public static final RegistryObject<Block> MASTER_ORE_BLOCK = BLOCKS.register("master_ore_block", LzOreBlock::new);

    // Block Items
    public static final RegistryObject<Item> LOFTSTEEL_ORE_BLOCK_ITEM = ITEMS.register("loftsteel_ore_block", () -> new BlockItemBase(LOFTSTEEL_ORE_BLOCK.get()));
    public static final RegistryObject<Item> MASTER_ORE_BLOCK_ITEM = ITEMS.register("master_ore_block", () -> new BlockItemBase(MASTER_ORE_BLOCK.get()));


}
