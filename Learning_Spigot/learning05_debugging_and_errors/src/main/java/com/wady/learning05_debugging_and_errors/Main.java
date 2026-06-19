package com.wady.learning05_debugging_and_errors;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        String[] strings = new String[]{"Test0", "test1", "test2", "test3"};
        System.out.println("Got to stage 0");

        System.out.println(strings[0]);
        System.out.println("Got to stage 1");
        System.out.println(strings[2]);
        System.out.println("Got to stage 2");
        // System.out.println(strings[3]);
        System.out.println(strings[1]);

        System.out.println("Finished everything!");


    }


}
