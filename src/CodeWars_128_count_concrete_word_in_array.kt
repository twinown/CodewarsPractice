object CodeWars_128_count_concrete_word_in_array {
    fun well(x: Array<String>): String = if (x.count { it == "good" } ==2||
        x.count { it == "good" } ==1) "Publish!" else if (x.count { it == "good" } >2) "I smell a series!"
    else "Fail!"

    @JvmStatic
    fun main(args: Array<String>) {
        println(well(arrayOf("good", "bad", "bad")))
    }
}