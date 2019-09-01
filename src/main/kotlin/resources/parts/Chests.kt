package resources.parts

import Part
import resources.components.BaseMaterials
import resources.components.Generators
import slotFrom

object Chests {
    val basicChest = Part(
        PartType.CHEST, slots = listOf(
            slotFrom(BaseMaterials.steel),
            slotFrom(Generators.smallPower)
        )
    )


}