
//find number bigger than limit
class CodeWars_64 {
    fun smallEnough(a : IntArray, limit : Int) : Boolean {
        var goal = true
        for (number in a){
            if (number > limit){
                goal = false
            }
        }
        return goal
    }
}