package com.aureusc.aureusstuff.client.armor;

import com.aureusc.aureusstuff.item.custom.GlowBerryGogglesItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class GlowBerryGogglesRenderer extends GeoArmorRenderer<GlowBerryGogglesItem> {
    public GlowBerryGogglesRenderer() {
        super(new GlowBerryGogglesModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}
