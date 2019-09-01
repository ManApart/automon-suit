package resources.locations.levels

import Level
import Location
import MAP_SIZE
import resources.locations.Locations

object GrassField {
    val level = createLevel()

    private fun createLevel(): Level {
        val locations = mutableListOf<MutableList<Location>>()

        for (x in 0..MAP_SIZE.width) {
            val column = mutableListOf<Location>()
            for (y in 0..MAP_SIZE.height) {
                column.add(Locations.grasses.random())
            }
            locations.add(column)
        }
        return Level(locations)
    }
}