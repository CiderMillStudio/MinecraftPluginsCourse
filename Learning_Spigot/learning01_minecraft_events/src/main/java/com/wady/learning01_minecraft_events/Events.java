package com.wady.learning01_minecraft_events;

import org.bukkit.event.Listener;

// Let's say you wanted to put your events into a DIFFERENT class besides Main. You CAN! Make sure you implements Listener:
public class Events implements Listener {
    // Let's say you've got some events here. You'd go to the Main "onEnable" method, and where you register events (
    // via Bukkit.getPluginManager().registerEvents()), you'd enter the following arguments in the Main onEnable() method: ... .registerEvents(new Events(), this)
}
