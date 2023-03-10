

object CodeWars_34 {
    fun capitalize(text: String): List<String> {
        val list = mutableListOf<String>()
        var strev = ""
        var strod = ""
        for(i in text.indices){
            if(i%2==0){
                strev += text[i].uppercase()
            } else strev += text[i]
            if(i%2!=0){
                strod += text[i].uppercase()
            } else strod += text[i]
        }
        list.add(strev)
        list.add(strod)
        return list
    }


    //short solution
  /*  fun capitalize(text: String): List<String> =
        listOf(
            text.mapIndexed { index, c -> if (index % 2 == 0) c.toUpperCase() else c }.joinToString(""),
            text.mapIndexed { index, c -> if (index % 2 == 1) c.toUpperCase() else c }.joinToString("")
        )*/
    @JvmStatic
    fun main(args: Array<String>) {
        println(capitalize("abcdef"))
    }
}