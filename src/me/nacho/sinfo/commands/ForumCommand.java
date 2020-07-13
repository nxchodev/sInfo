package me.nacho.sinfo.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.nacho.sinfo.Main;
import me.nacho.sinfo.utils.Colors;

public class ForumCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		for(String lines : Main.getInstance().getConfig().getStringList("forum-command")) {
			sender.sendMessage(Colors.translate(lines));
		}
		
		return true;
	}

}