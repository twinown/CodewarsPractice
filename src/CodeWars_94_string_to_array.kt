/*In this kata you will be given a random string of letters and tasked with returning them
as a string of comma-separated sequences sorted alphabetically, with each sequence starting
with an uppercase character followed by n-1 lowercase characters, where n is the letter's
alphabet position 1-26.

Example
alphaSeq("ZpglnRxqenU") -> "Eeeee,Ggggggg,Llllllllllll,Nnnnnnnnnnnnnn,Nnnnnnnnnnnnnn,
Pppppppppppppppp,Qqqqqqqqqqqqqqqqq,Rrrrrrrrrrrrrrrrrr,Uuuuuuuuuuuuuuuuuuuuu,
Xxxxxxxxxxxxxxxxxxxxxxxx,Zzzzzzzzzzzzzzzzzzzzzzzzzz"*/

object CodeWars_94_string_to_array {
    fun alphaSeq(str: String) = str.lowercase().toCharArray().sorted().joinToString(",") {
        it.toString().repeat(it.code-96).capitalize()
    }


    @JvmStatic
    fun main(args: Array<String>) {

        println(alphaSeq("aog"))
    }

}