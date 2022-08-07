package com.aureusc.aureusstuff.event;

import com.aureusc.aureusstuff.AureusStuff;
import com.aureusc.aureusstuff.client.armor.GlowBerryGogglesRenderer;
import com.aureusc.aureusstuff.item.custom.GlowBerryGogglesItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = AureusStuff.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(GlowBerryGogglesItem.class, new GlowBerryGogglesRenderer());
    }
}