/*There is a bus moving in the city which takes and drops some people at each bus stop.
You are provided with a list (or array) of integer pairs. Elements of each pair represent
the number of people that get on the bus (the first item) and the number of people that get
off the bus (the second item) at a bus stop.
Your task is to return the number of people who are still on the bus after the last bus
stop (after the last array). Even though it is the last bus stop, the bus might not be empty and
some people might still be inside the bus, they are probably sleeping there :D
Take a look on the test cases.
Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0.
So the returned integer can't be negative.
The second value in the first pair in the array is 0, since the bus is empty in the first bus stop.
 assertEquals(17, people(arrayOf(3 to 0,9 to 1,4 to 10,12 to 2,6 to 1,7 to 10)))
    assertEquals(21, people(arrayOf(3 to 0,9 to 1,4 to 8,12 to 2,6 to 1,7 to 8)))
    assertEquals(5, people(arrayOf(10 to 0,3 to 5,5 to 8)))*/
class CodeWars_16_summa_elementov_v_parnom_massive {
   /* public data class Pair<out A, out B>(
        public val first: A,
        public val second: B*/
    fun people(busStops: Array<Pair<Int, Int>>) = busStops.sumOf { it.first - it.second }
}