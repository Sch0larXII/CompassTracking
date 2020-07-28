package me.Sch0larXII.Track;

import org.bukkit.plugin.java.JavaPlugin;

import me.Sch0larXII.Track.Events.EventsClass;
import net.md_5.bungee.api.ChatColor;

public class CompassTracker extends JavaPlugin {

	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "\nCompasses track players. Hello Kevin :)\n");
		getServer().getPluginManager().registerEvents(new EventsClass(), this);
	}
	
	public void OnDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "\nCompasses no longer track. Goodbye Kevin... :(\n");
	}
	
}
