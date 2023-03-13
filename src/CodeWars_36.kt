object CodeWars_36 {
    fun makeComplement(dna: String): String {
        var ns = ""
        for (i in dna.indices) {
            if (dna[i] == 'A') {
              ns += 'T'
            } else if (dna[i] == 'T') {
                ns += 'A'
            } else if (dna[i] == 'C') {
                ns += 'G'
            } else ns += 'C'
        }
        return ns
    }
    //simple sol
/*    fun makeComplement(dna : String) = dna.map {
        if (it == 'A') 'T'
        else if (it == 'T') 'A'
        else if (it == 'G') 'C'
        else 'G'
    }.joinToString("")*/
    @JvmStatic
    fun main(args: Array<String>) {
        println(makeComplement("GTAT"))
    }
}