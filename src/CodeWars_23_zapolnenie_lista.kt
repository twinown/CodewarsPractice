object CodeWars_23_zapolnenie_lista {
    fun reverseSeq(n: Int): List<Int> {
        val ll = mutableListOf<Int>()
        for (m in n downTo 1) {
            ll.add(m)
        }
        return ll
    }

//простое решение
//fun reverseSeq(n: Int) = (n downTo 1).toList()

    @JvmStatic
    fun main(args: Array<String>) {
        println(reverseSeq(10).toString())
    }
}