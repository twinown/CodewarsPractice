public class CodeWars_52 {
    public static boolean solution(String str, String ending) {
        //return str.endsWith(ending);
        return str.length() - ending.length() >= 0 && ending.equals(str.substring(str.length() - ending.length()));
    }
}
