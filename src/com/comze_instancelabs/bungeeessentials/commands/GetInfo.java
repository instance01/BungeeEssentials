package com.comze_instancelabs.bungeeessentials.commands;

import com.comze_instancelabs.bungeeessentials.Main;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class GetInfo extends Command {

	Main main = null;
	
	public GetInfo(Main This) {
		super("getinfo");
		main = This;
	}


	@Override
	public void execute(CommandSender sender, String[] args) {
		if ((sender instanceof ProxiedPlayer)) {
			ProxiedPlayer p = (ProxiedPlayer) sender;
			//if (p.hasPermission("bungeeessentials.getinfo")){
				p.sendMessage("§3Info about the server: ");
				ProxyServer ps = main.getProxy();
				p.sendMessage("§2" + ps.getGameVersion());
				p.sendMessage("§2" + ps.getName());
				p.sendMessage("§2Online Players (" + Integer.toString(ps.getOnlineCount()) + "):");
				String players = "";
				for(ProxiedPlayer p_ : ps.getPlayers()){
					players += p_.getName() + ", ";
				}
				players = players.substring(0, players.length() - 2);
				p.sendMessage(players);
			//}
		}
	}
}
