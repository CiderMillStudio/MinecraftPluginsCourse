package com.wady.learning04_commands_contd;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("hello")) {
                    player.sendMessage("hello right back at you my friend!");
                }
            }

            if (player.hasPermission("testcommand.use")) {
                player.sendMessage(ChatColor.GREEN + "You have permission to use testcommand.");
            } else {
                player.sendMessage(ChatColor.RED + "You do NOT have permission to use testcommand.");
            }


        } else {

        }

        return false;
    }
}
