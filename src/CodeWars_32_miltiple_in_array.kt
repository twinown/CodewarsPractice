class CodeWars_32_miltiple_in_array {
    fun grow(arr: IntArray) :Int{
        var  tot = 1;
        for (i in arr.indices-1){
            tot *= arr[i]
        }
        return tot
    }
    //simple sol
    //fun grow(arr: IntArray): Int = arr.reduce { a, b -> a * b }
}