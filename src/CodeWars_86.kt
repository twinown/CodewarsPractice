
object CodeWars_86 {

    fun prevMultOfThree(n: Int): Int? {
        //var real = false
        var numm = n
        var st = numm.toString()
        while (numm%3!=0&&st.length>1){
            st = st.substring(0,st.length-1)
            numm = st.toInt()
        }
        return if (numm%3==0) numm else null
     }


    @JvmStatic
    fun main(args: Array<String>) {
        println(prevMultOfThree(25))
    }

}