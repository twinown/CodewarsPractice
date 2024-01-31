object CodeWars_74_simvol_v_chislo_NO_v_kotlin_mozhno_srav_string_sumBy_escho {

    //в ебанутом котле ты можешь сравнивать числа,записанные как стринг
    //так ,как будто они инт...пример ниже
    /////ля, прикинь..в джаве та же тема,но только с чарсами
    fun points(games: List<String>): Int {
        var totalScore = 0
        for (element in games) {
            if (element[0] > element[2]
            ) { totalScore += 3
            } else if (element[0] == element[2]) {
                totalScore += 1
            }
        }
        return totalScore
    }
    //можно так решить
    /*fun points(games: List<String>) =
        games.sumBy {
            val (x, y) = it.split(":")
            when {
                x > y -> 3
                x < y -> 0
                else -> 1
            }
        }*/

    @JvmStatic
    fun main(args: Array<String>) {
        println("3"<"5") // true
    }
}