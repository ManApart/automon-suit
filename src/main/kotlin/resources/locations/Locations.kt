package resources.locations

import Location

object Locations {
    val NO_LOCATION = Location("None")

    val grass = Location("Grass", Tiles.grass, Element.PLANT, listOf(TerrainDescriptor.OPEN))
    val thinGrass = Location("Thin Grass", Tiles.thinGrass, Element.PLANT, listOf(TerrainDescriptor.SMOOTH, TerrainDescriptor.OPEN))
    val thickGrass =
        Location("Thick Grass", Tiles.thickGrass, Element.PLANT, listOf(TerrainDescriptor.SMOOTH, TerrainDescriptor.ENTANGLED))
    val grasses = listOf(grass, thinGrass, thickGrass)

    val dirt = Location("Dirt", Tiles.dirt, Element.DIRT, listOf(TerrainDescriptor.OPEN, TerrainDescriptor.ROUGH))
    val compactDirt = Location("Compact Dirt", Tiles.compactDirt, Element.DIRT, listOf(TerrainDescriptor.OPEN, TerrainDescriptor.SMOOTH))

    val boulder = Location("Boulder", Tiles.boulder, Element.STONE, listOf(TerrainDescriptor.IMMERSED, TerrainDescriptor.ROUGH))

    val river = Location("River", Tiles.river, Element.WATER, listOf(TerrainDescriptor.ROUGH, TerrainDescriptor.ENTANGLED))
    val deepRiver = Location("Deep River", Tiles.deepRiver, Element.WATER, listOf(TerrainDescriptor.IMMERSED, TerrainDescriptor.OPEN))

}