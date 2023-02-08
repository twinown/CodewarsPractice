/*Clock shows h hours, m minutes and s seconds after midnight.
Your task is to write a function which returns the time since midnight in milliseconds.
Example:
h = 0
m = 1
s = 1*/

/*result = 61000*/
class CodeWars_9 {
    fun mS (h:Int, m:Int, s:Int) = (3600*h + 60 * m + s)*1000
}