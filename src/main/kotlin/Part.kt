import resources.locations.Locations.NO_LOCATION

val NO_PART = Part(PartType.OTHER, Element.OTHER)

//eventually add name once we have an actual interface
// add move
class Part(
    val type: PartType,
    val element: Element = Element.OTHER,
    private val baseHealth: Int = 10,
    private val baseArmor: Int = 0,
    private val baseSpeed: Affinities = Affinities(),
    private val baseWeight: Int = 1,
    //max supported weight?
    var currentHealth: Int = baseHealth,
    val slots: List<ComponentSlot> = listOf()
) {

    fun copy(): Part {
        return Part(type, element, baseHealth, baseArmor, baseSpeed, baseWeight, baseHealth, slots)
    }

    fun getTotalHealth(): Int {
        return baseHealth + slots.sumBy { it.component.healthBonus }
    }

    fun getArmor(): Int {
        return baseArmor + slots.sumBy { it.component.armorBonus }
    }

    fun getSpeed(location: Location = NO_LOCATION): Int {
        return baseSpeed.getAffinity(location.element, location.terrainDescriptors) + slots.sumBy { it.component.getSpeedBonus(location) }
    }

    fun getWeight(): Int {
        return baseWeight + slots.sumBy { it.component.weight }
    }

    fun getEnergyConsumed(): Int {
        return slots.sumBy { it.component.energyConsumed }
    }

    fun getEnergyProduced(): Int {
        return slots.sumBy { it.component.energyProduced }
    }

}