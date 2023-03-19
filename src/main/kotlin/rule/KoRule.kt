package rule

enum class KoRule(val state: Boolean) {
    KO_ALL(true),
    KO_THREE_TO_THREE(true),
    KO_FOUR_TO_FOUR(true),
    KO_OVERLINE(true),
    NOT_KO(false);

    companion object {
        const val OVERLINE_SIZE = 6
        const val THREE_TO_THREE_SIZE = 3
        const val FOUR_TO_FOUR_SIZE = 4
        const val FOUL_CONDITION_SIZE = 2
        const val MAX_EMPTY_SIZE = 1
    }
}
