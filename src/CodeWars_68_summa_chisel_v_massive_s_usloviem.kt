class CodeWars_68_summa_chisel_v_massive_s_usloviem {
    fun sum(numbers: IntArray) = numbers.sumOf { if (it>=0) it
    else 0}

    //можно так еще
    //тут внимательно на цикл for !!!!!!!!
    fun summ (numbers: IntArray): Int {
        var sum = 0
        for (number in numbers){
            if (number>=0)
               sum +=number
        }
        return if (sum<0) 0 else sum
    }
}