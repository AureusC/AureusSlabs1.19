package com.aureusc.aureusstuff.event;

import com.aureusc.aureusstuff.client.armor.GlowBerryGogglesRenderer;
import com.aureusc.aureusstuff.item.custom.GlowBerryGogglesItem;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import com.aureusc.aureusstuff.AureusStuff;

@Mod.EventBusSubscriber(modid = AureusStuff.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(GlowBerryGogglesItem.class, new GlowBerryGogglesRenderer());
    }
}