package com.wady.learning07_BlocksMaterialsAndItems;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        // ArmorStand armorStand = (ArmorStand) Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"), 0, 100, 0), EntityType.ARMOR_STAND);

        // learning about Item Stacks.
        ItemStack itemStack = new ItemStack(Material.CARROT, 3);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setItemName("moooooooo");
        itemStack.setItemMeta(meta);

        // Learning Block Basics
        Block block = Bukkit.getWorld("world").getBlockAt(0, 130, 20);
        block.setType(Material.LAVA); // sets a random block of air in the sky to Lava
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
