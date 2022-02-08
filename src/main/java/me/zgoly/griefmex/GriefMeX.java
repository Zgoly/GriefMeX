package me.zgoly.griefmex;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import java.util.Iterator;

public class GriefMeX implements Listener {
    @EventHandler
    public void onDestroy(EntityExplodeEvent e) {
        Iterator<Block> iterator = e.blockList().iterator();
        while(iterator.hasNext()) {
            String m = iterator.next().getType().name();
            if (!m.endsWith("CHEST") && !m.endsWith("SHULKER_BOX")) iterator.remove();
        }
    }
}