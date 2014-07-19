package com.acecase.letsmodreboot.init;

import com.acecase.letsmodreboot.item.ItemLMRB;
import com.acecase.letsmodreboot.item.ItemMapleLeaf;
import com.acecase.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();
    public static void init(){
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
