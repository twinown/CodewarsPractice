class CodeWars_105_zikl_for {

    fun calculateYears(years: Int): Array<Int> {
        var catYears = 0
        var dogYears = 0
        for (i in 1..years) {
            when (i) {
                1 -> {
                    catYears += 15
                    dogYears += 15
                }
                2 -> {
                    catYears += 9
                    dogYears += 9
                }
                else -> {
                    catYears += 4
                    dogYears += 5
                }
            }
        }
        return arrayOf(years, catYears, dogYears);
        //крутое рещение
        //if (years == 1) arrayOf(years, 15, 15) else arrayOf(years, 16 + 4 * years, 14 + 5 * years)
    }
}