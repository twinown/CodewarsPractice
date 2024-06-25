import java.util.*;

public class CodeWars_176_list_Integer_to_int_array {

    public static int [] arrayDiff(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        int goal;
        for (int k : a) {
            goal = 0;
            for (int i : b) {
                if (k != i) {
                    goal++;
                }
                if (goal == b.length) {
                    list.add(k);
                }
            }
        }
        int [] c  = new int[list.size()];
        for (int i = 0; i < c.length; i++) {
            c[i] = list.get(i);
        }
        return  b.length==0?a:c;
        //or
        //list.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
     //   System.out.println(arrayDiff(new int[]{5, 2, 2, 2, 1}, new int[]{2}));
        System.out.println(Arrays.toString(arrayDiff(new int[]{5, 2, 2, 2, 1}, new int[]{})));
    }
}
