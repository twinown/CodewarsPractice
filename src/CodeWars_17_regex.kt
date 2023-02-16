object CodeWars_17_regex {
 fun replace(s: String): String {
        var ssss = s;
       val vowels = "aeiouAEIOU"
                for (i in s.indices){
            for (j in vowels.indices){
            if(s[i] == vowels[j]){
               ssss = ssss.replace(s[i] +"","!" )
                break
            }
        }
        }
        return ssss
    }
//просто решение
// fun replace(s: String) = s.replace(Regex("[aeiouAEIOU]"), "!")


    @JvmStatic
    fun main(args: Array<String>) {
        println(replace("aeiou"))
    }
}
