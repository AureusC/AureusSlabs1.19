package com.aureusc.aureusslabs.block;

import com.aureusc.aureusslabs.AureusSlabs;
import com.aureusc.aureusslabs.item.ModCreativeModeTab;
import com.aureusc.aureusslabs.item.ModItems;
import com.aureusc.aureusslabs.item.custom.DirtPathSlab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AureusSlabs.MOD_ID);

    public static final RegistryObject<Block> DIRT_SLAB = registerBlock("dirt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT)
                    .strength(0.5f).sound(SoundType.GRAVEL)), ModCreativeModeTab.AUREUS_SLABS_TAB);

    public static final RegistryObject<Block> COARSE_DIRT_SLAB = registerBlock("coarse_dirt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT)
                    .strength(0.5f).sound(SoundType.GRAVEL)), ModCreativeModeTab.AUREUS_SLABS_TAB);

    public static final RegistryObject<Block> MYCELIUM_SLAB = registerBlock("mycelium_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.COLOR_PURPLE)
                    .strength(0.6f).sound(SoundType.GRASS)), ModCreativeModeTab.AUREUS_SLABS_TAB);

    public static final RegistryObject<Block> PODZOL_SLAB = registerBlock("podzol_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.PODZOL)
                    .strength(0.6f).sound(SoundType.GRAVEL)), ModCreativeModeTab.AUREUS_SLABS_TAB);

    public static final RegistryObject<Block> ROOTED_DIRT_SLAB = registerBlock("rooted_dirt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT)
                    .strength(0.5f).sound(SoundType.ROOTED_DIRT)), ModCreativeModeTab.AUREUS_SLABS_TAB);

    public static final RegistryObject<Block> GRASS_SLAB = registerBlock("grass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
                    .strength(0.6f).sound(SoundType.GRASS)), ModCreativeModeTab.AUREUS_SLABS_TAB);

    public static final RegistryObject<Block> DIRT_PATH_SLAB = registerBlock("dirt_path_slab",
            () -> new DirtPathSlab(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT)
                    .strength(0.6f).sound(SoundType.GRASS)), ModCreativeModeTab.AUREUS_SLABS_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name,toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
