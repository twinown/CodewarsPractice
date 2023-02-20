object CodeWars_21_comparing_char_in_two_strings {
    fun getCount(str : String) : Int {
        val vowels = "aeiou"
        var count = 0
        for (i in str.indices){
            for (j in vowels.indices){
                if (str[i] == vowels[j]){
                    count++
                }
            }
        }
        return count
    }

//simple solving
    //fun getCount(str : String) = str.count { it in "aeiou" }


    @JvmStatic
    fun main(args: Array<String>) {
        println(getCount("abracadabra"))
    }
}