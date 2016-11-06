package org.devathon.contest2016;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        event.setJoinMessage(null);
    }

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
        event.setQuitMessage(null);
    }
}
