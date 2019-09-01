package parts

import Part
import components.BaseMaterials
import components.Wiring
import slotFrom

object LeftArms {
    val basicLeftArm = Part(
        PartType.LEFT_ARM, listOf(
            slotFrom(BaseMaterials.steel),
            slotFrom(Wiring.basic)
        )
    )


}