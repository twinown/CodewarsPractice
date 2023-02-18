class CodeWars_18 {
  fun century(number: Int)= if(number%100==0) number/100 else number/100+1
}

fun main() {
    val  cd:CodeWars_18 = CodeWars_18()
    println(cd.century(1954))
}