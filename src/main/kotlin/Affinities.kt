class Affinities(affinities: List<Affinity> = listOf()) {
    private val affinityMap: MutableMap<Element, MutableMap<TerrainDescriptor, Int>> = mutableMapOf()

    init {
        affinities.forEach { addAffinity(it) }
    }

    fun addAffinity(elements: List<Element>, terrainDescriptors: List<TerrainDescriptor>, score: Int) {
        elements.forEach { element ->
            addAffinity(element, terrainDescriptors, score)
        }
    }

    fun addAffinity(element: Element, terrainDescriptors: List<TerrainDescriptor>, score: Int) {
        terrainDescriptors.forEach { terrainDescriptor ->
            addAffinity(element, terrainDescriptor, score)
        }
    }

    fun addAffinity(affinity: Affinity) {
        addAffinity(affinity.element, affinity.terrainDescriptor, affinity.score)
    }

    fun addAffinity(element: Element, terrainDescriptor: TerrainDescriptor, score: Int) {
        if (!affinityMap.containsKey(element)) {
            affinityMap[element] = mutableMapOf()
        }
        affinityMap[element]!![terrainDescriptor] = score
    }

    fun getAffinity(element: Element, terrainDescriptors: List<TerrainDescriptor>): Int {
        if (terrainDescriptors.isEmpty()) {
            return 0
        }

        val totalScore = terrainDescriptors.map { affinityMap[element]?.get(it) ?: 0 }.sum()
        return totalScore / terrainDescriptors.size
    }
}

fun fromElementsAndTerrain(
    elements: List<Element>,
    terrainDescriptors: List<TerrainDescriptor>,
    score: Int
): Affinities {
    val affinities = mutableListOf<Affinity>()
    elements.forEach { element ->
        terrainDescriptors.forEach { terrainDescriptor ->
            affinities.add(Affinity(element, terrainDescriptor, score))
        }
    }
    return Affinities(affinities)
}