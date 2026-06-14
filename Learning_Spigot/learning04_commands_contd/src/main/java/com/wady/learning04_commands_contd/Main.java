package com.wady.learning04_commands_contd;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("testCommand").setExecutor(new TestCommand());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
