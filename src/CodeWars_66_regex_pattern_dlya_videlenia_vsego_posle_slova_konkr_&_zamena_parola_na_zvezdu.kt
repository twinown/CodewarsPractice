object CodeWars_66 {

    //  сам паттерн "(?<=нужное слово).*$" - для тупо замены после слова на один символ исп. replace


    // Regex("(?<=password=).*\$").replace(urlString)
    //        { "*".repeat(it.value.length) } - заменятся КАЖДЫЙ символ после регулярки



    fun hidePasswordFromConnection(urlString: String): String {
        return Regex("(?<=password=)[^&]*").replace(urlString)
        { "*".repeat(it.value.length) }
    }


    @JvmStatic
    fun main(args: Array<String>) {
        println(hidePasswordFromConnection(
            "jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345"))
    }
}


