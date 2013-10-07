package com.comze_instancelabs.bungeeessentials;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;
import com.comze_instancelabs.bungeeessentials.commands.*;

public class Main extends Plugin {
	@Override
	public void onEnable() {
		getLogger().info("Initializing . . .");
		ProxyServer.getInstance().getPluginManager().registerCommand(this, new GetInfo(this));
		//ProxyServer.getInstance().getPluginManager().registerCommand(this, new Ban(this));

	}
}
