package resources.locations

import org.hexworks.zircon.api.Tiles
import resources.ui.Colors.BLUE
import resources.ui.Colors.BRIGHT_GREEN
import resources.ui.Colors.BROWN
import resources.ui.Colors.CREAM
import resources.ui.Colors.DARK_BLUE
import resources.ui.Colors.DARK_GREEN
import resources.ui.Colors.DARK_GREY
import resources.ui.Colors.LIGHT_GREEN

object Tiles {
    val grass = Tiles.defaultTile()
        .withCharacter(',')
        .withBackgroundColor(DARK_GREEN)
        .withForegroundColor(LIGHT_GREEN)

    val thinGrass = Tiles.defaultTile()
        .withCharacter('.')
        .withBackgroundColor(DARK_GREEN)
        .withForegroundColor(BRIGHT_GREEN)

    val thickGrass = Tiles.defaultTile()
        .withCharacter('"')
        .withBackgroundColor(DARK_GREEN)
        .withForegroundColor(LIGHT_GREEN)

    val boulder = Tiles.defaultTile()
        .withCharacter('o')
        .withBackgroundColor(DARK_GREEN)
        .withForegroundColor(DARK_GREY)

    val dirt = Tiles.defaultTile()
        .withCharacter(':')
        .withBackgroundColor(BROWN)
        .withForegroundColor(CREAM)

    val compactDirt = Tiles.defaultTile()
        .withCharacter(' ')
        .withBackgroundColor(BROWN)
        .withForegroundColor(CREAM)

    val river = Tiles.defaultTile()
        .withCharacter('~')
        .withBackgroundColor(BLUE)
        .withForegroundColor(DARK_GREY)

    val deepRiver = Tiles.defaultTile()
        .withCharacter('~')
        .withBackgroundColor(DARK_BLUE)
        .withForegroundColor(BLUE)

}