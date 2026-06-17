package com.wady.learning04_commands_contd;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig(); // gotta have these two lines when working with config files

        getCommand("testCommand").setExecutor(new TestCommand());
        getCommand("testConsoleCommand").setExecutor(new TestConsoleCommand());
        getCommand("config").setExecutor(new ConfigCommand(this));


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
