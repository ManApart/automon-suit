val NO_LOCATION = Location()

class Location(private val effectiveElements: List<Element> = listOf(), private val ineffectiveElements: List<Element> = listOf()) {

//    fun getStrength(part: Part): StrengthLevel {
//        return getStrength(part.element)
//    }
//
//    fun getStrength(component: Component): StrengthLevel {
//        return getStrength(component.element)
//    }

    fun getStrength(element: Element): StrengthLevel {
        return when {
            effectiveElements.contains(element) && ineffectiveElements.contains(element) -> StrengthLevel.NORMAL
            effectiveElements.contains(element) -> StrengthLevel.STRONG
            ineffectiveElements.contains(element) -> StrengthLevel.WEAK
            else -> StrengthLevel.NORMAL
        }
    }
}