object CodeWars_20 {
    fun nbYear(p0: Int, percent: Double, aug: Int, p: Int): Int {
        var anothP = p0;
        var count = 0
        var tot = 0;
        while (tot < p) {
            tot = (anothP + (anothP * (percent / 100)) + aug).toInt()
                anothP = tot
            count++
        }
        return count
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(nbYear(1500, 5.0, 100, 5000))
    }

}

