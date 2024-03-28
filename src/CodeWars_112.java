import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CodeWars_112 {

    public static int sum(int[] numbers){
        int sum=0,min = 0,max =0;
        if(numbers!=null&&numbers.length!=0&&numbers.length!=1){
             min = numbers[0];
             max= numbers[0];
            for (int i = 0;i<numbers.length;i++){
                if(min<numbers[i]) min = numbers[i];
                 else if(max>numbers[i]) max = numbers[i];
                sum += numbers[i];
            }
        }
        return sum-min-max;
    }
    public static void main(String[] args) {
        System.out.println(sum(new int[]{4}));
    }
}
