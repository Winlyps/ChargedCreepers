package winlyps.chargedCreepers

import org.bukkit.entity.Creeper
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.CreatureSpawnEvent
import org.bukkit.plugin.java.JavaPlugin

class CreeperSpawnListener(private val plugin: JavaPlugin) : Listener {

    @EventHandler
    fun onCreeperSpawn(event: CreatureSpawnEvent) {
        val entity = event.entity
        if (entity is Creeper) {
            // Turn the creeper into a charged creeper
            entity.isPowered = true
            plugin.logger.info("A regular creeper has been turned into a charged creeper!")
        }
    }
}