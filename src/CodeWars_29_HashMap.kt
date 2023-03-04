object CodeWars_29_HashMap {
    fun nameValue(arr: Array<String>): IntArray {
        var sum: Int?
        var i = 1
        val array = IntArray(arr.size)
        val mapss: HashMap<String, Int> = HashMap()
        for (char in 'a'..'z') {
            mapss[char.toString()] = i
            i++
        }
        for (i in arr.indices) {
            sum = 0
            for (j in 0 until arr[i].length) {
                val k = mapss.get(arr[i].get(j).toString())
                if (k != null) {
                    sum += k
                }
            }
            array[i] = sum * (i + 1)
        }
        return array
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(nameValue(arrayOf("abc", "abc abc")).contentToString())
    }
}
