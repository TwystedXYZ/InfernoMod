package com.twystedxyz.inferno.util;

import com.twystedxyz.inferno.Inferno;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class IFTags {

    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_BLAZE_TOOL = TagKey.create(
                Registries.BLOCK, Inferno.rl(""));
    }
}