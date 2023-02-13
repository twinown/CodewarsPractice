import kotlin.math.sqrt

object CodeWars_13_round_to_integer {
    //(exmp_75.35_or_75.55_to_75)
    fun predictAge(age1: Int, age2: Int, age3: Int,
                   age4: Int, age5: Int, age6: Int, age7: Int, age8: Int)=
        (sqrt((age1 * age1 + age2 * age2 + age3 * age3 + age4 * age4 + age5 * age5 + age6 * age6 +
                age7 * age7 + age8 * age8).toDouble())/2).toInt()
//просто решение fun predictAge(vararg age:Int) = (Math.sqrt((age.map{it*it}.sum().toDouble()))/2).toInt()
    //vararg  - это типо передаёшь множество аргументов(для укорочения записи)
    @JvmStatic
    fun main(args: Array<String>) {
        println(predictAge(65, 60, 75, 55, 60, 63, 64, 45))
    }
}
