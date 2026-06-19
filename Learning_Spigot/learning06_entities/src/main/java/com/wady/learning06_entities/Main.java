package com.wady.learning06_entities;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.CreatureSpawnEvent;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        Entity armorStand = Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"), 0, 100, 0), EntityType.ARMOR_STAND);
        armorStand.setGlowing(true);


    }


    // Try CreatureSpawnEvent, EntityDeathEvent, EntityDamageEvent
    // Currently unable to get this event to load, I'm sure it's because something isn't set up quite right. Will probably learn this later in the course.
    public void onEntitySpawn(CreatureSpawnEvent e) {
        System.out.println("testing to see if We're getting a message!");
        Location spawn_location = e.getLocation();
        List<Player> players = new ArrayList<>();
        players = Bukkit.getWorld("world").getPlayers();
        for (Player player : players) {
            player.sendMessage("TEST");
        }
        Bukkit.broadcastMessage("location x is: " + spawn_location.getX());
    }


}
