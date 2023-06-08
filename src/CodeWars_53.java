import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeWars_53 {
    public static String reverseWords(final String original) {
        String s = "";
        List<String> myList = new ArrayList<>(Arrays.asList(original.split(" ")));
        for (String str: myList) {
            StringBuilder stringBuilder = new StringBuilder(str);
            s += stringBuilder.reverse()+" ";
        }
        return s;
    }

    public static void main(String[] args) {
   System.out.println(reverseWords("j... over the lazy []dog."));
    }
}
