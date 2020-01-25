package com.dbkynd.bungeeplayerlist;

import com.dbkynd.bungeeplayerlist.listeners.ProxyPingListener;
import net.md_5.bungee.api.plugin.Plugin;
import org.bstats.bungeecord.Metrics;

public final class BungeePlayerList extends Plugin {

    @Override
    public void onEnable() {
        new Metrics(this);
        getProxy().getPluginManager().registerListener(this, new ProxyPingListener(this));
    }
}
