/*Write a function partlist that gives all the ways to divide a list (an array)
of at least two elements into two non-empty parts.
Each two non empty parts will be in a pair (or an array for languages
without tuples or a structin C - C: see Examples test Cases - )
Each part will be in a string
Elements of a pair must be in the same order as in the original array.
Examples of returns in different languages:
a = ["az", "toto", "picaro", "zone", "kiwi"] -->
"(az, toto picaro zone kiwi)(az toto, picaro zone kiwi)(az toto picaro, zone kiwi)(az toto picaro zone, kiwi)"
Note
You can see other examples for each language in "Your test cases"*/
object CodeWars_15_rabota_s_dvumern_massivom_pechat_massiva {
    fun partlist(arr: Array<String>): Array<Array<String>> {
        val newArr = Array<Array<String>>(arr.size - 1) { Array(2) { "" } }
        for (i in 0 until arr.size - 1) {
            newArr[i] = arrayOf(

                //sliceArray()-возвращает массив , содержащий элемены данного массива в пределах заданных индексов
                //joinToString()- объединение данных в массиве
                /* println(numbers.joinToString()) // 1, 2, 3, 4, 5, 6
              println (numbers.joinToString(prefix = "[", postfix = "]")) // [1, 2, 3, 4, 5, 6]
              println (numbers.joinToString(prefix = "<", postfix = ">", separator = "•")) // <1•2•3•4•5•6>*/

                arr.sliceArray(0..i).joinToString().replace(", ", " "),
                arr.sliceArray(i + 1 until arr.size).joinToString().replace(", ", " ")
            )
        }
        return newArr
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(partlist(arrayOf("a", "b", "c")).contentDeepToString())
    }
}