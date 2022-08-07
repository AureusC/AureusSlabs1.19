package com.aureusc.aureusstuff.util;

import com.aureusc.aureusstuff.AureusStuff;
import com.aureusc.aureusstuff.block.ModBlocks;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.GrassColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AureusStuff.MOD_ID, bus =  Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BlockItemColors {
    public static final BlockColor GRASS_BLOCK_COLOR = (state, reader, pos, color) -> reader != null && pos != null ? BiomeColors.getAverageGrassColor(reader, pos) : GrassColor.get(0.5, 1);

    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
        event.getBlockColors().register(GRASS_BLOCK_COLOR, ModBlocks.GRASS_SLAB.get());
    }

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        event.getItemColors().register((stack, color) -> event.getBlockColors().getColor(((BlockItem) stack.getItem()).getBlock().defaultBlockState(), null, null, color),
                ModBlocks.GRASS_SLAB.get());
    }
}