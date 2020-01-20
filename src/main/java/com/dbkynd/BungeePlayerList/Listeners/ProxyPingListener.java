package com.dbkynd.BungeePlayerList.Listeners;

import com.dbkynd.BungeePlayerList.BungeePlayerList;
import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class ProxyPingListener implements Listener {
    BungeePlayerList plugin;

    public ProxyPingListener(BungeePlayerList plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPing(ProxyPingEvent event) {
        ServerPing response = event.getResponse();
        ServerPing.Players players = response.getPlayers();
        ServerPing.PlayerInfo[] playerInfo = plugin.getProxy().getPlayers().stream().map(player -> new ServerPing.PlayerInfo(player.getName(), player.getUniqueId())).toArray(ServerPing.PlayerInfo[]::new);
        players.setSample(playerInfo);
        response.setPlayers(players);
        event.setResponse(response);
    }
}
