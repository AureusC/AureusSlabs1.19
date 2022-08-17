package com.aureusc.aureusslabs.item;

import com.aureusc.aureusslabs.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab AUREUS_SLABS_TAB = new CreativeModeTab("aureusslabstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.DIRT_SLAB.get());
        }
    };
}
