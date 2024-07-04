public class CodeWars_184_char_from_ASCII {
    public static char getChar(int c) {
        return Character.toChars(c)[0];
    }

    public static void main(String[] args) {
        System.out.println(getChar(55));
    }
}
