import java.util.*

object CodeWars_94 {
    fun alphaSeq(str: String):List<Char> {
    var arr =  str.lowercase(Locale.getDefault()).toList().sorted()
        for (n in arr){
            
        }
        return arr
    }
    @JvmStatic
    fun main(args: Array<String>) {

        println(alphaSeq("dog"))
    }

}