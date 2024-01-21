object CodeWars_66 {

        fun hidePasswordFromConnection(urlString: String): String {
            val replace = urlString.replace(Regex("^password=(.*?)\"]"), "*")
            return replace
        }

    @JvmStatic
    fun main(args: Array<String>) {
        println(hidePasswordFromConnection(
            "jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345"))
    }
    }


