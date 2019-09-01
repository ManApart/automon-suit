package resources.parts

import Part
import resources.components.BaseMaterials
import resources.components.Wiring
import slotFrom

object Helmets {
    val basicHelmet = Part(
        PartType.HELMET,
        slots = listOf(
            slotFrom(BaseMaterials.steel),
            slotFrom(Wiring.basic)
        )
    )


}