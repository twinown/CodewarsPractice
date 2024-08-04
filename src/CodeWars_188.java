import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class CodeWars_188 {

    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        int greatCount = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = i+1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    text = text.replace(Character.toString(text.charAt(i)),"");
                    greatCount++;
                    i--;
                    break;

                }
            }
        }
        return greatCount;
    }


    public static void main(String[] args) {
        System.out.println(duplicateCount("Indivisibilities"));
    }
}
