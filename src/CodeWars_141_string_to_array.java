import java.util.Arrays;

public class CodeWars_141_string_to_array {
    public static String[] stringToArray(String s) {
        return s.split(" ");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("dog likes")));
    }
}
