package resources.parts

import Part
import resources.components.BaseMaterials
import resources.components.Wiring
import slotFrom

object RightArms {
    val basicRightArm = Part(
        PartType.RIGHT_ARM, slots = listOf(
            slotFrom(BaseMaterials.steel),
            slotFrom(Wiring.basic)
        )
    )


}