/*This program tests the life of an evaporator containing a gas.
We know the content of the evaporator (content in ml), the percentage of foam or
gas lost every day (evap_per_day) and the threshold (threshold) in percentage
beyond which the evaporator is no longer useful. All numbers are strictly positive.
The program reports the nth day (as an integer) on which the evaporator will be out of use.
Example:
evaporator(10, 10, 5) -> 29
*/
object CodeWars_24 {
    fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {
        var day = 0
        var tot  = 100.0
        while (tot > threshold){
            day++
            tot -= (evap_per_day / 100.0) * tot
        }
        return day
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(evaporator(100.0,5.0,5.0))
    }
}