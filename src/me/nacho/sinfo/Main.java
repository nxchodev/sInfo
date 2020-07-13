package me.nacho.sinfo;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import lombok.Getter;
import lombok.Setter;
import me.nacho.sinfo.commands.DiscordCommand;
import me.nacho.sinfo.commands.ForumCommand;
import me.nacho.sinfo.commands.SInfoCommand;
import me.nacho.sinfo.commands.StoreCommand;
import me.nacho.sinfo.commands.TeamSpeakCommand;
import me.nacho.sinfo.commands.TwitterCommand;
import me.nacho.sinfo.commands.WebsiteCommand;
import me.nacho.sinfo.utils.Colors;

@Setter
@Getter
public class Main extends JavaPlugin {

	@Getter
	public static Main instance;
	
	public void onEnable() {
		this.instance = this;
		
		getConfig().options().copyDefaults(true);
		saveConfig();
		
		Bukkit.getConsoleSender().sendMessage(Colors.translate("&7&m------------------------------------------"));
		Bukkit.getConsoleSender().sendMessage(Colors.translate("&bSuccessfully &aloaded &9sInfo to your server"));
		Bukkit.getConsoleSender().sendMessage(Colors.translate("&7> Version: 1.0"));
		Bukkit.getConsoleSender().sendMessage(Colors.translate("&7> &bType &9/sinfo help &bfor more information"));
		Bukkit.getConsoleSender().sendMessage(Colors.translate("&7&m------------------------------------------"));
		importCommands();
		
	}
	
	public void importCommands() {
		getCommand("discord").setExecutor(new DiscordCommand());
		getCommand("teamspeak").setExecutor(new TeamSpeakCommand());
		getCommand("forum").setExecutor(new ForumCommand());
		getCommand("website").setExecutor(new WebsiteCommand());
		getCommand("twitter").setExecutor(new TwitterCommand());
		getCommand("store").setExecutor(new StoreCommand());
		getCommand("sinfo").setExecutor(new SInfoCommand());
	}
	
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(Colors.translate("&7&m------------------------------------------"));
		Bukkit.getConsoleSender().sendMessage(Colors.translate("&bSuccessfully &cunloaded &9sInfo to your server"));
		Bukkit.getConsoleSender().sendMessage(Colors.translate("&7&m------------------------------------------"));
	}
}
