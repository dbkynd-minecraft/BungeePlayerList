package com.dbkynd.bungeeplayerlist;

import com.dbkynd.bungeeplayerlist.bstats.Metrics;
import com.dbkynd.bungeeplayerlist.listeners.ProxyPingListener;
import net.md_5.bungee.api.plugin.Plugin;

public final class BungeePlayerList extends Plugin {

    @Override
    public void onEnable() {
        new Metrics(this, 6304);
        getProxy().getPluginManager().registerListener(this, new ProxyPingListener(this));
    }
}
