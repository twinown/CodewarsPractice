object CodeWars_24 {
    fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {
        // TODO: 24.02.2023 think of
        var day = 0
        var left:Double  = content - (evap_per_day/100.0)
        while (left >= threshold/100.0 ){
            day++
            left = (left - (evap_per_day/100.0))
        }
        return day
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(evaporator(10.0,10.0,5.0))
    }
}