class ComponentSlot(private val type: ComponentType, var component: Component = NO_COMPONENT) {
    fun canEquip(component: Component) : Boolean {
        return component.type == type
    }
}

fun slotFrom(component: Component) : ComponentSlot {
    return ComponentSlot(component.type, component)
}