import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeWars_164 {
    public static String toJadenCase(String phrase) {
        String ns = null;
        if (phrase!=null&&phrase.length()>0) {
        String[] arr = phrase.split(" ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
            }
            ns = Arrays.toString(arr).replaceAll("[,\\[\\]]", "");
        }
        return ns;
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase(null));
    }
}
