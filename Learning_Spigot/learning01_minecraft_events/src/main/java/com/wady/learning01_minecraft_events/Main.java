package com.wady.learning01_minecraft_events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener; // We MUST Import this every project in order to listen for events ("implements Listener")
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this); // We MUST run this line in the onEnable() function before we can use any events
        // "Ctrl + P" while hovering over a method like ".registerEvents()" allows you to see the arguments needed!
        // We can reference "this" as a listener because this class (Main) implements the org.bukkit.event.Listener Class
        // We can reference "this" as our Plugin because this argument is basically just asking for our Main() class, which is indeed the hub of our pluggin!
     }

    // --- THE PLAYER MOVE EVENT: --------------------------------------------------------
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {
        // e.getFrom() --> gets where the player is moving from
        // e.getTo() --> gets where the player is moving to
        // There are so many getters, we can do so much!!
        e.setCancelled(true); // this cancels the player movement entirely, preventing them from moving (every time the player triggers the move event, it will get canceled.
        e.getPlayer().sendMessage(ChatColor.RED + "Stop moving, you are frozen!");


    }

    @EventHandler
    public void onPlayerEggThrow(PlayerEggThrowEvent e) {
        e.getPlayer().sendMessage(ChatColor.AQUA + "You just threw an egg!");
    }




    @Override
    public void onDisable() {

    }
}
