package resources.parts

import Part
import PartType
import resources.components.BaseMaterials
import slotFrom

object Skeletons {
    val basicSkeleton = Part(PartType.SKELETON, slots = listOf(slotFrom(BaseMaterials.steel)))


}