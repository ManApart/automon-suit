package resources.parts

import Part
import resources.components.BaseMaterials
import resources.components.Wiring
import slotFrom

object LeftArms {
    val basicLeftArm = Part(
        PartType.LEFT_ARM, slots = listOf(
            slotFrom(BaseMaterials.steel),
            slotFrom(Wiring.basic)
        )
    )


}