package parts

import Part
import components.BaseMaterials
import slotFrom

object Legs {
    val basicLegs = Part(PartType.LEGS, listOf(
        slotFrom(BaseMaterials.steel)
    ))


}