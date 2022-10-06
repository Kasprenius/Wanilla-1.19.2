package net.kas.wanilla.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kas.wanilla.Wanilla;
import net.kas.wanilla.block.ModBlocks;
import net.kas.wanilla.item.custom.EightBallItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.WallStandingBlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Wanilla.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Wanilla.LOGGER.debug("Registering Mod Items for " + Wanilla.MOD_ID);
    }
}
