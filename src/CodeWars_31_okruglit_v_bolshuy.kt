import java.lang.IllegalArgumentException
import kotlin.math.ceil

object CodeWars_31_okruglit_v_bolshuy {
    fun newAvg(a:DoubleArray, navg:Double):Long {
        val n  = (a.size+1)*navg - a.sum()
        return  if (n<=0) throw IllegalArgumentException() else  ceil(n).toLong()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(newAvg(doubleArrayOf(14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 15.0), 30.0))
    }
}