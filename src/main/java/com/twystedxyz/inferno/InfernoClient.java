package com.twystedxyz.inferno;

import com.twystedxyz.inferno.content.IFItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.*;

public class InfernoClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Inferno.LOGGER.info("Activating");
    }}