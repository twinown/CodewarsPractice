object CodeWars_5_tipo_ternarnii {
    fun makeNegative(x: Int) = if (x < 0) x else x * (-1)

    //easier way
 //   fun makeNegative(x:Int) = -abs(x)

    @JvmStatic
    fun main(args: Array<String>) {
        println(makeNegative(0))
    }
}