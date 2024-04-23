object CodeWars_135_poschitat_zifri_v_slove {
    fun persistence(num: Int) : Int {
        var copyNum = num
        var count = 0
        while (copyNum.toString().length!=1){
            count++
            var  m = 1;
            val list = copyNum.toString().map { it }
            for (i in list){
                m *= Integer.valueOf(i.toString())
            }
            copyNum = m
       }
        return count
    }

    //kotlin style__pizdec kak vsegda
/*    fun persistence(num: Int) = generateSequence(num) {
        it.toString().map(Character::getNumericValue).reduce { mult, element -> mult * element }
    }.takeWhile { it > 9 }.count()*/

    @JvmStatic
    fun main(args: Array<String>) {
        println(persistence(4))
    }
}