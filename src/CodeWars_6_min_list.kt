object CodeWars_6_min_list {


        @JvmStatic
        fun findSmallestInt(nums: List<Int>)= nums.minOrNull()

    @JvmStatic
    fun main(args: Array<String>) {
        println(findSmallestInt(listOf(5,-1,0,15)))
    }
}