package me.nacho.sinfo.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.nacho.sinfo.Main;
import me.nacho.sinfo.utils.Colors;

public class SInfoCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(args.length == 0) {
			
			sender.sendMessage(Colors.translate("&7&m----------------------------------------------"));
			sender.sendMessage(Colors.translate("&bThis server is currently using &9&lsInfo"));
			sender.sendMessage(Colors.translate("&7&m----------------------------------------------"));
			sender.sendMessage(Colors.translate("&7> &bVersion: &91.0"));
			sender.sendMessage(Colors.translate("&7> &bSupport: &9nacho.host/discord"));
			sender.sendMessage(Colors.translate("&7> &bDownload: &9nacho.host/sinfo"));
			sender.sendMessage(Colors.translate(""));
			sender.sendMessage(Colors.translate("&7> &bHelp: &9/sinfo help"));
			sender.sendMessage(Colors.translate(""));
			sender.sendMessage(Colors.translate("&bSuggest features at our discord!"));
			sender.sendMessage(Colors.translate("&7&m----------------------------------------------"));
			return true;
		}
		
		if(args[0].equalsIgnoreCase("help")) {
			
			sender.sendMessage(Colors.translate("&7&m----------------------------------------------"));
			sender.sendMessage(Colors.translate("&9&lHelp Command &7(Page 1 out of 1)"));
			sender.sendMessage("");
			sender.sendMessage(Colors.translate("&b/teamspeak &7- &fGives the teamspeak of the server."));
			sender.sendMessage(Colors.translate("&b/forum &7- &fGives the forum of the server."));
			sender.sendMessage(Colors.translate("&b/discord &7- &fGives the discord of the server."));
			sender.sendMessage(Colors.translate("&b/store &7- &fGives the store of the server."));
			sender.sendMessage(Colors.translate("&b/twitter &7- &fGives the twitter of the server."));
			sender.sendMessage(Colors.translate("&b/website &7- &fGives the website of the server."));
			sender.sendMessage(Colors.translate("&7&m----------------------------------------------"));
		}
		return true;
	}
}