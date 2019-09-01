class PartSlot(private val type: PartType, var part: Part = NO_PART) {
    fun canEquip(part: Part) : Boolean {
        return part.type == type
    }
}