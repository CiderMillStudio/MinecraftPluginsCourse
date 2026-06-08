package com.wady.first_spigot_pluggin_ever;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Woohoo! My plugin has started!!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
