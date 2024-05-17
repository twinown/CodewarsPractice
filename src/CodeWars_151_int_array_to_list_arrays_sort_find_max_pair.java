import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CodeWars_151_int_array_to_list_arrays_sort_find_max_pair {

    public static int largestPairSum(int[] numbers) {
        //идеальное решение, Нияз, ты чё!!!!!!!
      /*  Arrays.sort(numbers);
        return numbers[numbers.length-1]+numbers[numbers.length-2];*/
        List<Integer> list = new ArrayList<>();
        for (int num : numbers) {
            list.add(num);
        }
        int firstMax = Collections.max(list);
        list.remove(Collections.max(list));
         int secondMax = Collections.max(list);
        return firstMax+secondMax;
    }

    public static void main(String[] args) {
        System.out.println(largestPairSum(new int[]{-10, -8, -16, -18, -19}));
    }
}
