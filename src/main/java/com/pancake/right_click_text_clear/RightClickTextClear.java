package com.pancake.right_click_text_clear;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RightClickTextClear.MOD_ID)
public class RightClickTextClear {
    public static final String MOD_ID = "right_click_text_clear";
    public RightClickTextClear() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
