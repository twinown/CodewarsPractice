import java.util.Arrays;

public class CodeWars_71_copyofrange_java {
    public static int[] take(int[] arr, int n) {

        return Arrays.copyOfRange(arr,0,Math.min(n, arr.length));
    }

    public static void main(String[] args) {

        String mm = "done";

        System.out.println(Arrays.toString(take(new int[]{0}, 2)));
    }
}
