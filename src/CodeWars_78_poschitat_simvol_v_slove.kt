object CodeWars_78_poschitat_simvol_v_slove {
    fun catMouse(s: String): String {
        val count = s.count { it == '.' }
        return if (count<=3)"Caught!" else "Escaped!"
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(catMouse("C....m"))
    }
}