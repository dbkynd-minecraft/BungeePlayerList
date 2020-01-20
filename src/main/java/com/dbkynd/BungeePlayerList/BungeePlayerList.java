package com.dbkynd.BungeePlayerList;

import com.dbkynd.BungeePlayerList.Listeners.ProxyPingListener;
import net.md_5.bungee.api.plugin.Plugin;
import org.bstats.bungeecord.Metrics;

public class BungeePlayerList extends Plugin {
    @Override
    public void onEnable() {
        Metrics metrics = new Metrics(this);
        getProxy().getPluginManager().registerListener(this, new ProxyPingListener(this));
    }
}
