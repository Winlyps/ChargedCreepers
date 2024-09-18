package winlyps.chargedCreepers

import org.bukkit.plugin.java.JavaPlugin

class ChargedCreepers : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(CreeperSpawnListener(this), this)
        logger.info("ChargedCreepers plugin has been enabled!")
    }

    override fun onDisable() {
        logger.info("ChargedCreepers plugin has been disabled!")
    }
}