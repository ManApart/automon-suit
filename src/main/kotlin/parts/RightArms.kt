package parts

import Part
import components.BaseMaterials
import components.Wiring
import slotFrom

object RightArms {
    val basicRightArm = Part(
        PartType.RIGHT_ARM, listOf(
            slotFrom(BaseMaterials.steel),
            slotFrom(Wiring.basic)
        )
    )


}