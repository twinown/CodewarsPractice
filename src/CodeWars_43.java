import java.util.Arrays;

public class CodeWars_43 {
    public static int[] countBy(int x, int n){
        int arrElem = 0;
        int[] arr = new int[n];
        for(int i = x;i<=n*x;i+=x){
            arr[arrElem++] = i;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(2,5)));
    }
}
