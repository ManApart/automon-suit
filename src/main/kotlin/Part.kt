val NO_PART = Part(PartType.OTHER)

//eventually add name once we have an actual interface
class Part(
    val type: PartType,
//    private val baseHealth: Int,
//    private val baseArmor: Int,
//    private val baseWeight: Int,
//    var currentHealth: Int = baseHealth,
    val slots: List<ComponentSlot> = listOf()) {

    fun copy() : Part {
        return Part(type, slots)
    }

    fun getHealthTotal() : Int {
        return 0
    }

    fun getArmor() : Int {
        return 0
    }

    fun getWeight() : Int {
        return 0
    }

    fun getPowerUsed() : Int {
        return 0
    }

    fun getPowerCreated() : Int {
        return 0
    }

}