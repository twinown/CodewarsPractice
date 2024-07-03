import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeWars_182 {
    public static int[] multipleOfIndex(int[] array) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i<array.length;i++){
            if(array[i]%i==0){
               list.add(array[i]);
            }
        }
        if (array[0]==0){
            list.add(0,0);
        }
        int [] c  = new int[list.size()];
        for (int i = 0; i < c.length; i++) {
            c[i] = list.get(i);
        }
        return c;
    }

    public static void main(String[] args) {
      //  System.out.println(multipleOfIndex(new int[]{5,1,1}));
        System.out.println(Arrays.toString(multipleOfIndex(new int[]{0, 2, 3, 6, 9})));
    }
}
