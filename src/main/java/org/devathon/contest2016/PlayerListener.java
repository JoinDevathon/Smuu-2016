package org.devathon.contest2016;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {

    private final DevathonPlugin plugin;

    public PlayerListener(DevathonPlugin devathonPlugin) {
        this.plugin = devathonPlugin;
    }

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        player.teleport(plugin.getSpawnLocation().add(0.5, 1, 0.5));

        event.setJoinMessage(null);
    }

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
        event.setQuitMessage(null);
    }
}
