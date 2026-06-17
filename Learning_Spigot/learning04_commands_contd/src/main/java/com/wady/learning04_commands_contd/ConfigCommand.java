package com.wady.learning04_commands_contd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class ConfigCommand implements CommandExecutor {

    private Main main;

    public ConfigCommand(Main _main) {
        this.main = _main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            player.sendMessage(main.getConfig().getString("Word"));
            player.sendMessage(main.getConfig().getInt("Number") + ""); // add + "" to make it think that this message is a string
            if (main.getConfig().getBoolean("TradingEnabled")) {
                player.sendMessage("Trading is enabled!");
            } else {
                player.sendMessage("Trading is disabled");
            }

            for (String string : main.getConfig().getStringList("String-list")) {
                player.sendMessage(string);
            }

            main.getConfig().set("Word", "Pancakessss");

            List<String> stringList = main.getConfig().getStringList("String-list");
            stringList.add("New Value!");

            main.getConfig().set("String-list", stringList);

            main.saveConfig();




        }

        return false;
    }
}
