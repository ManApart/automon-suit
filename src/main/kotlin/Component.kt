
val NO_COMPONENT = Component(ComponentType.OTHER)

class Component(
    val type: ComponentType,
    val element: Element = Element.OTHER,
    val healthBonus: Int = 10,
    val armorBonus: Int = 0,
    val speedBonus: Int = 0,
    val evasionBonus: Int = 0,
    val weight: Int = 1,
    val energyProduced: Int = 0,
    val energyConsumed: Int = 0
) {

    fun getSpeedBonus(location: Location = NO_LOCATION): Int {
        return location.getStrength(element) * armorBonus
    }

    fun getEvasionBonus(location: Location = NO_LOCATION): Int {
        return location.getStrength(element) * armorBonus
    }

}

