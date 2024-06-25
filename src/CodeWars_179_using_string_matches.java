public class CodeWars_179_using_string_matches {
    public static boolean isDigit(String s) {
       // return s.matches("[0-9]");
        return s.length() == 1 && Character.isDigit(s.charAt(0));
    }
}
