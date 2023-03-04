object CodeWars_28_peremestit_bukvi_po_alfavitu {
    fun moveTen(s: String) = s.map { 'a' + (((it - 'a') + 10) % 26) }.joinToString("")
    @JvmStatic
    fun main(args: Array<String>) {
        println(moveTen("docdmkco"))
    }
}