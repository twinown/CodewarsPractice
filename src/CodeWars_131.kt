import javax.xml.stream.events.Characters

/*Given a string that includes alphanumeric characters ("3a4B2d") return
the expansion of that string: The numeric values represent the occurrence
of each letter preceding that numeric value. There should be no numeric
characters in the final string.

Notes
The first occurrence of a numeric value should be the number of times each
character behind it is repeated, until the next numeric value appears
If there are multiple consecutive numeric characters, only the last one
should be used (ignore the previous ones)
Empty strings should return an empty string.
Your code should be able to work for both lower and capital case letters.*/
object CodeWars_131 {


    fun stringExpansion(s: String): String {
        var ns = "";
        for (i in 0..s.length-1){
            if (s[i].isLetter()&&i!=0){
                if (s[i-1].isDigit()){
                    ns+=s[i].toString().repeat(s[i-1].digitToInt())
                } else {
                    ns+=s[i]
                }
            }else if (s[i].isLetter()){
                ns+=s[i]}
        }
        TODO("finish")
        return if (s.count { it.isDigit() } ==1&&s[0].isDigit()) ""
              else ns
    }
    @JvmStatic
    fun main(args: Array<String>) {
        println(stringExpansion("3abc"))
    }
}