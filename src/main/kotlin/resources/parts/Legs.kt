package resources.parts

import Part
import PartType
import fromElementsAndTerrain
import resources.components.BaseMaterials
import slotFrom

object Legs {
    val basicLegs = buildBasicLegs()

    private fun buildBasicLegs(): Part {
        val affinities = fromElementsAndTerrain(
            listOf(Element.PLANT, Element.WATER, Element.STONE),
            listOf(
                TerrainDescriptor.SMOOTH,
                TerrainDescriptor.ROUGH,
                TerrainDescriptor.ENTANGLED,
                TerrainDescriptor.OPEN
            ),
            1
        )
        affinities.addAffinity(
            listOf(Element.PLANT, Element.STONE),
            listOf(TerrainDescriptor.SMOOTH, TerrainDescriptor.OPEN),
            2
        )

        return Part(
            PartType.LEGS,
            baseSpeed = affinities,
            slots = listOf(
                slotFrom(BaseMaterials.steel)
            )
        )
    }

}