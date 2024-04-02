class CodeWars_121_initialazing_array_and_full_it {
    fun expressionsMatter(a: Int, b: Int, c: Int) = intArrayOf(a*b*c,a*(b+c),a+b*c,(a+b)*c,a+b+c).max()
}