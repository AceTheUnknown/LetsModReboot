package com.acecase.letsmodreboot.init;

import com.acecase.letsmodreboot.block.BlockFlag;
import com.acecase.letsmodreboot.block.BlockLMRB;
import com.acecase.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockLMRB flag = new BlockFlag();
    public static void init(){
        GameRegistry.registerBlock(flag, "flag");
    }
}
