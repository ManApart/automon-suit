package parts

import Part
import components.BaseMaterials
import slotFrom

object Legs {
    val basicLegs = Part(PartType.LEGS, slots = listOf(
        slotFrom(BaseMaterials.steel)
    ))


}