/*
Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
invert([]) == []*/
class CodeWars_10 {
fun inv(arr:IntArray):IntArray{
    for (i in arr.indices ){
        arr[i] *= -1
    }
    return arr
}
    //alternative//who knows
//fun invert(arr: IntArray) = arr.map { -it }.toIntArray()
}