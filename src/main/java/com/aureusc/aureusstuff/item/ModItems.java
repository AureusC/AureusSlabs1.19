package com.aureusc.aureusstuff.item;

import com.aureusc.aureusstuff.AureusStuff;
import com.aureusc.aureusstuff.item.custom.GlowBerryGogglesItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AureusStuff.MOD_ID);

    public static final RegistryObject<Item> GLOW_BERRY_GOGGLES = ITEMS.register("glow_berry_goggles",
            () -> new GlowBerryGogglesItem(ModArmorMaterials.GLOW_BERRY_GOGGLES, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.AUREUS_STUFF_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
