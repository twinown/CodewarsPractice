object CodeWars_29 {
    fun nameValue(arr: Array<String>): HashMap<Int, String> {
        var array = IntArray(arr.size)
        var i = 1
        var mapss: HashMap<Int, String> = HashMap()
        for (char in 'a'..'z') {
            mapss[i] = char.toString()
            i++
        }
        for (i in arr.indices) {
            if (arr[i].)

        }
        return mapss
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(nameValue())
    }
}
