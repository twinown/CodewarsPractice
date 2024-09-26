import java.util.HashMap;
import java.util.Map;

public class CodeWars_194 {
    public static Map<Character, Integer> count(String str) {
        int count;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            map.put(str.charAt(i), count);
            str = str.replace(str.charAt(i--) + "", "");
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(count("abc"));
    }
}
