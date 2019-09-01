import org.hexworks.zircon.api.data.Tile
import resources.locations.Tiles

class Location(val tile: Tile = Tiles.grass, val element: Element = Element.OTHER, val terrainDescriptors: List<TerrainDescriptor> = listOf(), private val effectiveElements: List<Element> = listOf(), private val ineffectiveElements: List<Element> = listOf()) {

    fun getStrength(element: Element): StrengthLevel {
        return when {
            effectiveElements.contains(element) && ineffectiveElements.contains(element) -> StrengthLevel.NORMAL
            effectiveElements.contains(element) -> StrengthLevel.STRONG
            ineffectiveElements.contains(element) -> StrengthLevel.WEAK
            else -> StrengthLevel.NORMAL
        }
    }
}