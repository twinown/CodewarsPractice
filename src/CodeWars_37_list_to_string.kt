object CodeWars_37_list_to_string {
    fun longest(s1:String, s2:String) = (s1+s2).toList().sorted().distinct().joinToString(separator = "")

    @JvmStatic
    fun main(args: Array<String>) {
        println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"))
    }
}