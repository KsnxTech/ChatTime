package git.KsnxTech.chattime;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ChatListener implements Listener {

    private final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerChat(AsyncChatEvent event) {
        String currentTime = LocalTime.now().format(timeFormatter);
        Component timePrefix = Component.text("[" + currentTime + "] ", NamedTextColor.GRAY);

        event.renderer((source, sourceDisplayName, message, viewer) -> 
            timePrefix
                .append(sourceDisplayName)
                .append(Component.text(": "))
                .append(message)
        );
    }
}