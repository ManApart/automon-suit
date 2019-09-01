package parts

import Part
import components.BaseMaterials
import components.Generators
import slotFrom

object Chests {
    val basicChest = Part(
        PartType.CHEST, listOf(
            slotFrom(BaseMaterials.steel),
            slotFrom(Generators.smallPower)
        )
    )


}