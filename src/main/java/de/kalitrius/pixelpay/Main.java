package de.kalitrius.pixelpay;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main instance;
    private pixelPayAPI pixelPayAPI;

    @Override
    public void onEnable() {
        instance = this;
        pixelPayAPI = new pixelPayAPI();

        getLogger().info("PixelPayAPI enabled!");

    }

    @Override
    public void onDisable() {
        getLogger().info("PixelPayAPI disabled!");
    }

    public static Main getInstance() {
        return instance;
    }

    public pixelPayAPI getPixelPayAPI() {
        return pixelPayAPI;
    }
}
