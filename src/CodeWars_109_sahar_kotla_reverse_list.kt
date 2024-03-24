object CodeWars_109_sahar_kotla_reverse_list {


    //joinToString("") - можно вместо replace местами

    //внизу твой код. но с сахаром котла
   /* fun reverse(a: List<String>): List<String> {
        var string = a.joinToString("").reversed()
        val list = mutableListOf<String>()
        for (str in a){
            list.add(string.take(str.length))
            string = string.drop(str.length)
        }
        return list
    }*/

    //и ещё суперсахар

    /*fun reverse(a: List<String>): List<String> {
        val str = a.joinToString("").reversed().iterator()
        return a.map { Array(it.length) { str.nextChar() }.joinToString("") }
    }*/



    fun reverse(a: List<String>):List<String> {
        var newStr = a.toString().replace( "[,\\[\\] ]".toRegex(),"").reversed()
        val newList = mutableListOf<String>()
        for (i in a){
            newList.add(newStr.substring(0,i.length))
            newStr = newStr.substring(i.length)
        }
        return newList
    }


    @JvmStatic
    fun main(args: Array<String>) {
        println(reverse(listOf("I", "like", "big", "butts", "and", "I", "cannot", "lie!")))
    }


}