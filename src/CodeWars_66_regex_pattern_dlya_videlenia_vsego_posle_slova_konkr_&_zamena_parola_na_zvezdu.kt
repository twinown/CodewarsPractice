object CodeWars_66 {

    //  сам паттерн "(?<=нужное слово).*$"

    //тут другое уже ----оч тяжелая хрень
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
