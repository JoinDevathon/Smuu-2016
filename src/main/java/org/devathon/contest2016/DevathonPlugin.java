package org.devathon.contest2016;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
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

        clearEntities();

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

        spawnLocation.add(0.5, 1, 3.5).setYaw((float) 180);

        spawnLocation.getWorld().spawnEntity(spawnLocation, EntityType.IRON_GOLEM);

        spawnLocation.setX(0);
        spawnLocation.setZ(0);
    }

    private void clearEntities() {
        Bukkit.getWorlds().get(0).getEntities().forEach(Entity::remove);
    }

    public Location getSpawnLocation() {
        return spawnLocation;
    }
}

