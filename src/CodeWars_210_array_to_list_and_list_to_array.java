import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CodeWars_210_array_to_list_and_list_to_array {
    public static int[] removeSmallest(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int num : numbers) {
            list.add(num);
        }
        if (!list.isEmpty()) {
            list.remove(Collections.min(list));
        }
            int[] c = new int[list.size()];
            for (int i = 0; i < c.length; i++) {
                c[i] = list.get(i);
            }
        return c ;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeSmallest(new int[]{})));
    }
}



