object CodeWars_35 {
        fun solve(s: String): String {
            s.count()
            var lc = 0
            var uc = 0
            for(i in s.indices){
                if(s[i].isLowerCase()){
                    lc++
                } else uc++
            }
            return if (lc>uc||lc==uc) s.lowercase() else s.uppercase()
        }

    @JvmStatic
    fun main(args: Array<String>) {
        println(solve("CODe"))
    }
}