object CodeWars_41 {
    fun removeChar(str: String) = str.substring(1, str.length-1)


    fun main(args: Array<String>) {
        println(removeChar("qtolds"))
    }
}