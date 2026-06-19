package com.wady.learning10_BossBars;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    private BossBar bossBar; // Declaring Boss Bar up here

    @Override
    public void onEnable() {

        bossBar = Bukkit.createBossBar(
                ChatColor.LIGHT_PURPLE + "This Server is Awesome!",
                BarColor.PINK,
                BarStyle.SEGMENTED_6,
                BarFlag.PLAY_BOSS_MUSIC // <-- this line is very optional.
        );

        bossBar.setProgress(0.5); // if the BarStyle is set to SEGMENTED_6, 0.5 means 3/6 hearts.

        Bukkit.getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        bossBar.addPlayer(e.getPlayer());
    }



}
