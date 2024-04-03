import java.util.Arrays;

public class CodeWars_122_regex_kvadrat_skobki_i_probel {
    public static String printArray(Object[] array) {
        return Arrays.toString(array).replaceAll("[\\]\\[ ]","");
    }
}
