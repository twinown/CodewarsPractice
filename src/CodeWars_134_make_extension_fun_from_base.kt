class CodeWars_134_make_extension_fun_from_base {
    operator fun kotlin.Int.Companion.invoke(s: String): Int = s.toInt()
    operator fun kotlin.Long.Companion.invoke(s: String): Long = s.toLong()
    operator fun kotlin.Double.Companion.invoke(s: String): Double = s.toDouble()
}