package resources.components

import Component

object Generators {
    val tinyPower = Component(ComponentType.GENERATOR, weight = 1, energyProduced = 2)
    val smallPower = Component(ComponentType.GENERATOR, weight = 2, energyProduced = 5)
    val largePower = Component(ComponentType.GENERATOR, weight = 5, energyProduced = 10)
    val sheilds = Component(ComponentType.GENERATOR, weight = 2, armorBonus = 5, energyConsumed = 2)

}