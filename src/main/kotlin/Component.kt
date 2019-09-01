import resources.locations.Locations.NO_LOCATION

val NO_COMPONENT = Component(ComponentType.OTHER)

class Component(
    val type: ComponentType,
    val element: Element = Element.OTHER,
    val healthBonus: Int = 10,
    val armorBonus: Int = 0,
    val speedBonus: Affinities = Affinities(),
    val weight: Int = 1,
    val energyProduced: Int = 0,
    val energyConsumed: Int = 0
) {

    fun getSpeedBonus(location: Location = NO_LOCATION): Int {
        return speedBonus.getAffinity(location.element, location.terrainDescriptors)
    }

}

