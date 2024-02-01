object CodeWars_77_geom_progressia_array_to_string {
    fun geometricSequenceElements(a: Int, r: Int, n: Int): String {
        val list = IntArray(n)
        list[0] = a
        for (i in 1..n - 1) {
            list[i] = list[i-1] * r
        }
        return list.joinToString()
    }
//можно так решить
/*fun geometricSequenceElements(a: Int, r: Int, n: Int) =
    generateSequence(a) { it * r }
        .take(n)
        .joinToString(", ")*/

    @JvmStatic
    fun main(args: Array<String>) {
        println(geometricSequenceElements(2,3,5))
    }
}


