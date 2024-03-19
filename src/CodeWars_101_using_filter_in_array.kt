class CodeWars_101_using_filter_in_array {
    fun countPositivesSumNegatives(input : Array<Int>?):Array<Int> =
        if (input.isNullOrEmpty())
            arrayOf()
        else
            arrayOf(input.count { it > 0 }, input.filter{ it < 0 }.sum())
}