// Add level connections - position + other level + other level position
class Level(val locations: List<List<Location>>) {
    fun getLocation(x: Int, y: Int): Location? {
        if (x >= 0 && y >= 0 && x < locations.size && y < locations[x].size) {
            return locations[x][y]
        }
        return null
    }
}