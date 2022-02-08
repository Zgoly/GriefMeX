package me.zgoly.griefmex;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public static String R = "\u001B[0m";
    public static String Y = "\u001B[33m";
    public static String C = "\u001B[36m";
    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(C +"-----------------" + R + "\n" + C + "GriefMeX started!" + R + "\n" + C + "-----------------" + R);
        getServer().getPluginManager().registerEvents((Listener) new GriefMeX(), this);
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println(Y +"-----------------" + R + "\n" + Y + "GriefMeX stopped!" + R + "\n" + Y + "-----------------" + R);
    }
}
