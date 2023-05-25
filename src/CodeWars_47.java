import java.util.Arrays;

public class CodeWars_47 {
    public static boolean isAnagram(String test, String original) {
        char[] charsTest = test.toLowerCase().toCharArray();
        char[] charsOriginal = original.toLowerCase().toCharArray();
        Arrays.sort(charsTest);
        Arrays.sort(charsOriginal);
        return  Arrays.equals(charsTest, charsOriginal);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("foefet", "toffee"));
    }
}
