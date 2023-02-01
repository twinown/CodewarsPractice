/*Given an array of integers as strings and numbers,
return the sum of the array values as if all were
numbers.
Return your answer as a number.*/
object Codewars_2_rabota_s_list_any_summa_chisel {
    @JvmStatic
    fun sum(mixed: List<Any>): Int = mixed.sumOf { it.toString().toInt() }

    @JvmStatic
    fun main(args: Array<String>) {
        println(sum(listOf(5, "10")))
    }
}