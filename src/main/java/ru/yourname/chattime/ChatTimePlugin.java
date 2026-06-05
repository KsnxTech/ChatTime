package ru.yourname.chattime;

import org.bukkit.plugin.java.JavaPlugin;

public final class ChatTimePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
        getLogger().info("[ChatTime]: плагин запущен");
    }

    @Override
    public void onDisable() {
        getLogger().info("[ChatTime]: плагин выключен.");
    }
}