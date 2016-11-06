package org.devathon.contest2016;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

public class DevathonPlugin extends JavaPlugin {

    private Location spawnLocation = new Location(Bukkit.getWorlds().get(0), 0, 200, 0);

    @Override
    public void onEnable() {
        initWorld();

        getServer().getPluginManager().registerEvents(new PlayerListener(this), this);
    }

    @Override
    public void onDisable() {

    }

    private void initWorld() {

        spawnLocation.getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, 1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);

        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, 1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, 1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, 1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);

        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, 1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, 1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, 1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, 1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, 1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);

        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, 1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, 1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, 1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, 1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, 1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, 1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, 1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(-1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(0, 0, -1).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        spawnLocation.add(1, 0, 0).getBlock().setType(Material.COBBLESTONE);
        
        spawnLocation.setX(0);
        spawnLocation.setZ(0);
    }

    public Location getSpawnLocation() {
        return spawnLocation;
    }
}

