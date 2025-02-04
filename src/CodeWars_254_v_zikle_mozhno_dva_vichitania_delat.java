import java.util.Arrays;

public class CodeWars_254_v_zikle_mozhno_dva_vichitania_delat {
    public static long maxProduct(int[] numbers, int sub_size) {
        int res = 1;
        Arrays.sort(numbers);
        for (int i = numbers.length-1; i >= 0; sub_size--,i--) {
            if (sub_size>0){
                res*=numbers[i];
            //    sub_size--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{14,29,-28,39,-16,-48},4));
    }
}
