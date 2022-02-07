package me.zgoly.griefmex;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;




public final class Main extends JavaPlugin {
    public static String Y = "\u001B[33m";
    public static String C = "\u001B[36m";
    public static String R = "\u001B[0m";
    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(C +"-----------------\nGriefMeX started!\n-----------------" + R);
        getServer().getPluginManager().registerEvents((Listener) new GriefMeX(), this);
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println(Y +"-----------------\nGriefMeX stopped!\n-----------------" + R);
    }
}
