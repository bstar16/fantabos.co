package com.matt.forgehax.mods;

import com.matt.forgehax.asm.events.ComputeVisibilityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class NoCaveCulling extends ToggleMod {
    public NoCaveCulling() {
        super("NoCaveCulling", false, "Disables mojangs dumb cave culling shit");
    }

    public void reloadRenderers() {
        if(MC.renderGlobal != null) {
            MC.renderGlobal.loadRenderers();
        }
    }

    @SubscribeEvent
    public void onComputeVisibility(ComputeVisibilityEvent event) {
        event.getSetVisibility().setAllVisible(true);
    }
}
