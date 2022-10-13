package net.kas.wanilla.screen;

import net.minecraft.screen.ScreenHandlerType;

public class ModScreenHandlers {
    public static ScreenHandlerType<RedstoneAssemblerScreenHandler> GEM_INFUSING_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        GEM_INFUSING_SCREEN_HANDLER = new ScreenHandlerType<>(RedstoneAssemblerScreenHandler::new);
    }
}
