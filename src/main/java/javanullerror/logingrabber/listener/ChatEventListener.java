package javanullerror.logingrabber.listener;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;


public class ChatEventListener implements Listener {
    @EventHandler
    public void onChatEvent(net.md_5.bungee.api.event.ChatEvent event) {
        ProxiedPlayer player = (ProxiedPlayer) event.getSender();
        String command = event.getMessage().toLowerCase();
        if (command.startsWith("/")) {
            System.out.println("[LoginGrabber]: The player" + player + " used " + command + " command");
        }
    }
}
