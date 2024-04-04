import kotlin.math.roundToInt

object CodeWars_124 {
    fun dutyFree(normPrice: Int, discount:Int, hol:Int) =
      hol*100/(normPrice*discount)








    @JvmStatic
    fun main(args: Array<String>) {
        println(dutyFree(2479, 51, 13390))
    }
}