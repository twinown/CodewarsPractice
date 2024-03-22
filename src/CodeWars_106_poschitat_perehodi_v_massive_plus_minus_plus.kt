object CodeWars_106_poschitat_perehodi_v_massive_plus_minus_plus {
    fun catchSignChange(arr: Array<Int>): Int {
        var count = 0
        for(i in 0..arr.size-2){
             if((arr[i]>=0&&arr[i+1]<0)||(arr[i]<0&&arr[i+1]>=0)) {
                count++
            }
        }
        return count
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(catchSignChange(arrayOf(1, -3, -4, 0, 5)))
    }
}

