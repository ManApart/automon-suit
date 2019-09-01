package parts

import Part
import components.BaseMaterials
import components.Wiring
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