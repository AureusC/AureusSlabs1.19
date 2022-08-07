package com.aureusc.aureusstuff.client.armor;

import com.aureusc.aureusstuff.AureusStuff;
import com.aureusc.aureusstuff.item.custom.GlowBerryGogglesItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GlowBerryGogglesModel extends AnimatedGeoModel<GlowBerryGogglesItem> {
    @Override
    public ResourceLocation getModelResource(GlowBerryGogglesItem object) {
        return new ResourceLocation(AureusStuff.MOD_ID,"geo/glow_berry_goggles.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GlowBerryGogglesItem object) {
        return new ResourceLocation(AureusStuff.MOD_ID,"textures/models/armor/glow_berry_goggles_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GlowBerryGogglesItem animatable) {
        return new ResourceLocation(AureusStuff.MOD_ID,"animations/armor_animations.json");
    }
}
