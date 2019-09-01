package resources.suits

import Suit
import resources.parts.*

object Suits {

    fun basicSuit(): Suit {
        val suit = Suit()
        suit.skeleton.part = Skeletons.basicSkeleton
        suit.helmet.part = Helmets.basicHelmet
        suit.chest.part = Chests.basicChest
        suit.rightArm.part = RightArms.basicRightArm
        suit.leftArm.part = LeftArms.basicLeftArm
        suit.legs.part = Legs.basicLegs
        return suit.copy()
    }
}