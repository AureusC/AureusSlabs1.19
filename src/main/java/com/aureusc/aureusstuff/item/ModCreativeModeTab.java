package com.aureusc.aureusstuff.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab AUREUS_STUFF_TAB = new CreativeModeTab("aureusstufftab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GLOW_BERRY_GOGGLES.get());
        }
    };
}
