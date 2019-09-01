import org.hexworks.zircon.api.Layers
import org.hexworks.zircon.api.Positions
import org.hexworks.zircon.api.Sizes
import org.hexworks.zircon.api.Tiles
import org.hexworks.zircon.api.color.ANSITileColor
import org.hexworks.zircon.api.graphics.Layer
import resources.suits.Suits

class Player(val suit: Suit = Suits.basicSuit()) {
    val tile: Layer = playerLayer()

    fun attemptMove(x: Int, y: Int) {
        val target = currentLevel.getLocation(tile.x + x, tile.y + y)
        if (target != null) {
            val speed = suit.getSpeed(target)
            if (speed >= 1) {
                tile.moveTo(pos(tile.x + x, tile.y + y))
                println("moving to ${tile.position} with speed $speed")
            } else {
                println("Can't move to $target")
            }
        }
    }
}


private fun playerLayer(): Layer {
    val tile = Tiles.newBuilder()
        .withBackgroundColor(ANSITileColor.BLACK)
        .withForegroundColor(ANSITileColor.WHITE)
        .withCharacter('@')
        .buildCharacterTile()


    return Layers.newBuilder()
        .withSize(Sizes.one())
        .withOffset(Positions.create(MAP_SIZE.width / 2, MAP_SIZE.height / 2))
        .build()
        .fill(tile)
}