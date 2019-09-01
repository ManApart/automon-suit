package resources.locations.levels

import Level
import Location
import MAP_SIZE
import resources.locations.Locations

object Start {
    val level = createLevel()

    private fun createLevel(): Level {
        val locations = mutableListOf<MutableList<Location>>()

        for (x in 0 until MAP_SIZE.width) {
            val column = mutableListOf<Location>()
            for (y in 0 until MAP_SIZE.height) {
                when {
                    isRiver(locations, column, x, y) -> column.add(listOf(Locations.river, Locations.deepRiver).random())
                    Math.random() < 0.01 -> column.add(Locations.boulder)
                    else -> column.add(Locations.grasses.random())
                }
            }
            locations.add(column)
        }
        return Level(locations)
    }


    private fun isRiver(locations: List<List<Location>>, column: List<Location>, x: Int, y: Int): Boolean {
        val combined = locations.toMutableList()
        combined.add(column)

        val above = getLocationIncomplete(combined, x, y - 1)?.element == Element.WATER
        val aboveTwo = getLocationIncomplete(combined, x, y - 2)?.element == Element.WATER
        val belowLeft = getLocationIncomplete(combined, x - 1, y + 1)?.element == Element.WATER
        val belowLeftTwo = getLocationIncomplete(combined, x - 1, y + 2)?.element == Element.WATER
        val left = getLocationIncomplete(combined, x - 1, y)?.element == Element.WATER
        val leftTwo = getLocationIncomplete(combined, x - 2, y)?.element == Element.WATER

        return when {
            Math.random() < 0.001 -> true
            left && !leftTwo && !belowLeft && !belowLeftTwo -> true
            !left && above && Math.random() < .6 -> true
            !left && above && !aboveTwo && Math.random() < .9 -> true
            else -> false
        }
    }

    private fun getLocationIncomplete(combined: List<List<Location>>, x: Int, y: Int): Location? {

        if (x >= 0 && y >= 0 && x < combined.size && y < combined[x].size) {
            return combined[x][y]
        }
        return null
    }

}