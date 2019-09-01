class Suit {
    val skeleton = PartSlot(PartType.SKELETON)
    val helmet = PartSlot(PartType.HELMET)
    val chest = PartSlot(PartType.CHEST)
    val leftArm = PartSlot(PartType.LEFT_ARM)
    val rightArm = PartSlot(PartType.RIGHT_ARM)
    val legs = PartSlot(PartType.LEGS)
    var power: Int = 10

    fun copy() : Suit {
        val copy = Suit()
        copy.skeleton.part = skeleton.part.copy()
        copy.helmet.part = helmet.part.copy()
        copy.chest.part = chest.part.copy()
        copy.rightArm.part = rightArm.part.copy()
        copy.leftArm.part = leftArm.part.copy()
        copy.legs.part = legs.part.copy()
        return copy
    }
}