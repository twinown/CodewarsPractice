

class CodeWars_127_long_to_intArray {
    fun digitize(n:Long):IntArray = n.toString().reversed().map { it.digitToInt() }.toIntArray()
}