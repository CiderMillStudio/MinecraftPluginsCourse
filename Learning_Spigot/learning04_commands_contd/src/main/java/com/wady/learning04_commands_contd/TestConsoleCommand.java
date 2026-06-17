package com.wady.learning04_commands_contd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestConsoleCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            ((Player) sender).sendMessage("Sorry, only console can use this command.");
        } else {
            System.out.println("Hello, you have messaged the console!");
        }

        return false;
    }
}
