package com.pancake.right_click_text_clear.mixin;


import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EditBox.class)
public class MixinEditBox{
    @Inject(method = "onClick", at = @At("HEAD"))
    private void onRightClickClearText(double p_279417_, double p_279437_, CallbackInfo ci) {
        if (Screen.hasShiftDown()) {
            ((EditBox) (Object) this).setValue("");
        }
    }
}