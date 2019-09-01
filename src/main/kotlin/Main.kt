import ch.qos.logback.classic.Logger
import org.hexworks.zircon.api.AppConfigs
import org.hexworks.zircon.api.Positions
import org.hexworks.zircon.api.Sizes
import org.hexworks.zircon.api.SwingApplications
import org.hexworks.zircon.api.data.Position
import org.hexworks.zircon.api.grid.TileGrid
import org.slf4j.LoggerFactory
import resources.locations.levels.Start

val MAP_SIZE = Sizes.create(50, 50)

val tileGrid by lazy { createGrid() }
var currentLevel = Start.level
val player = Player()


fun createGrid(): TileGrid {
    return SwingApplications.startTileGrid(
        AppConfigs.newConfig()
            .withTitle("Automon")
            .withSize(MAP_SIZE)
            .build()
    )
}

fun main(args: Array<String>) {
    (LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME) as Logger).level = ch.qos.logback.classic.Level.INFO
    load(Start.level)
    ControlManager(tileGrid)

}

private fun load(level: Level) {
    for (x in 0 until level.locations.size) {
        for (y in 0 until level.locations[x].size) {
            val location = level.locations[x][y]
            tileGrid.setTileAt(pos(x, y), location.tile)
        }
    }
    tileGrid.pushLayer(player.tile)
    currentLevel = level
}

fun pos(x: Int, y: Int): Position {
    return Positions.create(x, y)
}