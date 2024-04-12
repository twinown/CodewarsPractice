import java.util.Arrays;

public class CodeWars_132_dvumernii_massiv_v_odin_sort {
    public static int[] flattenAndSort(int[][] array) {
         return Arrays.stream(array).flatMapToInt(Arrays::stream).sorted().toArray();
    }
}
