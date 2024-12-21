import java.util.*;

public class CodeWars_231_find_uniq_in_array {
    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        return arr[0]==arr[1]?arr[arr.length-1]:arr[0];
    }
    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{0, 0, 1}));
    }
}
