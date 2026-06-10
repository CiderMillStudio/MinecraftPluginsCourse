package com.wady.learning02_spigot_commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Command sender is WHO is sending the command (can be a console, or a player, etc...)
        // Command command is the string of the command??
        // String label we'll likely never have to use, ever.
        // String[] args we'll get to later. (separate lecture, complex, stay tuned.)

        if (sender instanceof Player) { // here, we're checking to see if the sender is an instance of the player class
            Player player = (Player) sender;
            player.sendMessage("Your health has been restored.");
            player.setHealth(20);
        }
        // If they're not an instance of the player class,
        // they're either a console, or a command block (both can run commands)

        return false;
    }
}
