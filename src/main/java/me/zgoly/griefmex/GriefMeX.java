package me.zgoly.griefmex;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class GriefMeX implements Listener {
    @EventHandler
    public void onDestroy(EntityExplodeEvent e) {
        e.blockList().removeIf(b -> b.getType() != Material.CHEST || b.getType() != Material.SHULKER_BOX);
    }
}
