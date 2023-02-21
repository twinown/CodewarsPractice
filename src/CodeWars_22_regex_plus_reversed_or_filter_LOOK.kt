/*DESCRIPTION:
Task
Given a string str, reverse it and omit all non-alphabetic characters.
Example
For str = "krishan", the output should be "nahsirk".
For str = "ultr53o?n", the output should be "nortlu".
Input/Output
[input] string str
A string consists of lowercase latin letters, digits and symbols.
[output] a string*/
object CodeWars_22_regex_plus_reversed_or_filter_LOOK {
    fun reverseLetter(str: String) = str.replace(Regex("[^a-zA-Z]"), "").reversed()

    //фильтр котлин
    //fun reverseLetter(str: String) = str.filter { it.isLetter() }.reversed()

    @JvmStatic
    fun main(args: Array<String>) {
        println(reverseLetter("kri&&&!&shan"))
    }
}