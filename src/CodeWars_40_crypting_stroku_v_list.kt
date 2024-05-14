object CodeWars_40_crypting_stroku_v_list {
    fun encryptThis(text: String): String {

        val l :Long = "42".toLong()

        val test = 32 to 40
        var i :Int
        val ll:List<Int> = listOf(1,2,3)



        var allN = ""
        val list = listOf(*text.split(" ").toTypedArray())
        for (n in list.indices) {
            var crypted = ""
            val ss = list[n][0].code.toString()
            if (list[n].length>1){
                val secondChar = list[n][list[n].length - 1]
                val lastChar = list[n][1]
                for (i in list[n].indices) {
                    when (i) {
                        0 -> crypted += ss
                        1 -> crypted += secondChar
                        list[n].length - 1 -> crypted += lastChar
                        else -> crypted += list[n][i]
                    }
                }
            } else crypted += ss
            if (n != list.size - 1) {
                allN += "$crypted "
            } else allN += crypted
        }
        return allN
    }
//simple sol
  /*  text.split(" ").map { it.first().toInt().toString() + it.drop(2).takeLast(1)
         + it.drop(2).dropLast(1) + it.drop(1).take(1) }.joinToString(" ")*/
    @JvmStatic
    fun main(args: Array<String>) {
        println(encryptThis("A wise old owl lived in an oak"))
    }
}