package parts

import Part
import PartType
import components.BaseMaterials
import slotFrom

object Skeletons {
    val basicSkeleton = Part(PartType.SKELETON, listOf(slotFrom(BaseMaterials.steel)))


}