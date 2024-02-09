import java.util.*

object CodeWars_82 {
    fun babyCount(x: String): Int? {
        val nx = x.lowercase(Locale.getDefault())
        var count = 0
        var countA = nx.count { it == 'a' }
        var countB = nx.count { it == 'b' }
        var countY = nx.count { it == 'y' }
        while (countA > 0 && countB > 1 && countY > 0) {
            countA -= 1
            countB -= 2
            countY -= 1
            count++
        }
        return if (count>0) count else null
    }

    // можно было так
    /*val a = minOf(
        x.toLowerCase().count { it == 'b' }/2,
        x.toLowerCase().count { it == 'a' },
        x.toLowerCase().count { it == 'y' }
    )
    return if(a == 0) null else a*/

    @JvmStatic
    fun main(args: Array<String>) {
        println(babyCount("Anyone remember life before babies?"))
    }
}