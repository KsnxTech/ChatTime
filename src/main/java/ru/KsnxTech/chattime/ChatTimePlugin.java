package git.KsnxTech.chattime;

import org.bukkit.plugin.java.JavaPlugin;

public final class ChatTimePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
        getLogger().info("Plugin included");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled");
    }
}