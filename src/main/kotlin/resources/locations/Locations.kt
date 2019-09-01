package resources.locations

import Location

object Locations {
    val NO_LOCATION = Location()

    val grass = Location(Tiles.grass, Element.PLANT, listOf(TerrainDescriptor.OPEN))
    val thinGrass = Location(Tiles.thinGrass, Element.PLANT, listOf(TerrainDescriptor.SMOOTH, TerrainDescriptor.OPEN))
    val thickGrass =
        Location(Tiles.thickGrass, Element.PLANT, listOf(TerrainDescriptor.SMOOTH, TerrainDescriptor.ENTANGLED))
    val grasses = listOf(grass, thinGrass, thickGrass)

    val boulder = Location(Tiles.boulder, Element.STONE, listOf(TerrainDescriptor.IMMERSED, TerrainDescriptor.ROUGH))

    val river = Location(Tiles.river, Element.WATER, listOf(TerrainDescriptor.ROUGH, TerrainDescriptor.ENTANGLED))
    val deepRiver = Location(Tiles.deepRiver, Element.WATER, listOf(TerrainDescriptor.IMMERSED, TerrainDescriptor.OPEN))

}