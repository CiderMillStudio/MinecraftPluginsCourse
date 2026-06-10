package com.wady.learning02_spigot_commands;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // THIS is where you write the string of the command
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("teleportTenTwentyZero").setExecutor(new TeleportCommand());
    }
}
