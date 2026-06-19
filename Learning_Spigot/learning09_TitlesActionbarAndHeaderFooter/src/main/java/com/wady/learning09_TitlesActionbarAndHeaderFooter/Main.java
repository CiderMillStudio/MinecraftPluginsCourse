package com.wady.learning09_TitlesActionbarAndHeaderFooter;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        // ACTION BARS:
        e.getPlayer().spigot().sendMessage(
                ChatMessageType.ACTION_BAR,
                TextComponent.fromLegacyText("§4§lHELLO friend!"));
        // note that there are no ways to set how long Action Bars take to fade in/out
        // by default, action bars only last for a few seconds, unless you use a
        // runnable to regenerate it.
        // Also note that in order for this to work, you must use the special
        // § symbol (I bookmarked it in firefox). the first four letters of the
        // TextComponent string are "§4§l" (the fourth character is lowercase L).



        // TITLES and SUBTITLES:
        e.getPlayer().sendTitle(
                ChatColor.WHITE + "Welcome!",
                ChatColor.BLUE + "Enjoy your time on the server!",
                40, 100, 40); // note that these ints are TICKS, NOT SECONDS.
        // 1 SECOND = 20 TICKS! (so 100 ticks is 5 seconds)



        // PLAYER LIST HEADER AND FOOTER:
        e.getPlayer().setPlayerListHeaderFooter(
                ChatColor.BLACK + "HEADER IS HERE\n(and you can add\nmultiple lines!)",
                ChatColor.YELLOW + "FOOTER IS HERE\n(multiple lines! empty line: \n ");
    }

    @EventHandler
    public void onPlayerTeleport(PlayerTeleportEvent e) {
        // Another TITLE and SUBTITLE:
        e.getPlayer().sendTitle(
                ChatColor.DARK_PURPLE + "You Teleported!",
                ChatColor.RED + "Tricky tricky maneuvers...",
                20, 60, 20);

    }
}
