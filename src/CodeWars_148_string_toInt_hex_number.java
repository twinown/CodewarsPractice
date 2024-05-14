public class CodeWars_148_string_toInt_hex_number {
    //Данный метод преобразует параметр s в int. В параметре radix указывается,
    //в какой системе счисления изначально записано число в s, которое необходимо преобразовать в int
    public static int hexToDec(final String hexString) {
        return Integer.parseInt(hexString, 16);
    }

    public static void main(String[] args) {
        System.out.println(hexToDec("a"));
    }
}
