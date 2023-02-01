/*Very simple, given an integer or a floating-point number, find its opposite.
Examples:
1: -1
14: -14
-34: 34*/
object Codewars_1 {
    @JvmStatic
    fun opposite(number: Int) = number * (-1)

    @JvmStatic
    fun main(args: Array<String>) {
        println(opposite(-1))
    }
}