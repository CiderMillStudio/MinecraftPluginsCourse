package com.wady.learning03_spigot_commands_contd;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("teleportTenTwentyZero").setExecutor(new TeleportCommand());

    }


}
