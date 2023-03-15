object CodeWars_38_rabota_s_listami_lambda_and_take_last {
    fun evenNumbers(array: List<Int>, number: Int): List<Int> {
        var nList = array
        nList = nList.toMutableList()
        val nArr = IntArray(number)
        nList.removeAll { it % 2 != 0 }
        var l = nList.size - 1
        for (i in nArr.size - 1 downTo 0) {
            nArr[i] = nList[l--]
        }
        return nArr.toList()
    }

    //simple sol
    // array.filter { it%2!=0 }.takeLast(number)

    @JvmStatic
    fun main(args: Array<String>) {
        println(evenNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 3).joinToString())
    }
}