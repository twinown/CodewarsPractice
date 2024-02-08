public class CodeWars_81 {
    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]","");
    }

    public static void main(String[] args) {
        System.out.println(shortcut("abcde"));
    }
}
