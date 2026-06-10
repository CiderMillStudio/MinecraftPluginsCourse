package com.wady.learning02_spigot_commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeleportCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("Teleporting!");

            Location toLocation = new Location(player.getWorld(),
                    player.getLocation().getX() + 10,
                    player.getLocation().getY() + 20,
                    player.getLocation().getZ() + 0);

            player.teleport(toLocation);

        }

        return false;
    }
}
