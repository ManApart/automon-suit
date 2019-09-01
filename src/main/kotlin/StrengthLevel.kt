enum class StrengthLevel(private val multiplier: Float) {
    WEAK(.5f),
    NORMAL(1f),
    STRONG(2f);

    operator fun times(other: Int): Int {
        return (multiplier * other).toInt()
    }
}