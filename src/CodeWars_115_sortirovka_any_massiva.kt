class CodeWars_115_sortirovka_any_massiva {
    fun dbSort(a:Array<Any>):Array<Any>  = (a.filterIsInstance<Int>().sortedBy { it } + a.filterIsInstance<String>().sorted()).toTypedArray()
}