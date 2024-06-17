import java.util.*;
import java.util.List;

public class CodeWars_174_esli_vse_odinakovie_a_odno_net_ego_poluchit_ {
    static int stray(int[] numbers) {

        //решение норм чувака
       /* Arrays.sort(numbers);
        return numbers[0] == numbers[1] ? numbers[numbers.length-1] : numbers[0];*/

//решение тупорылейшее
        int n;
        if (numbers[0]==numbers[1]){
            n = numbers[0];
        } else n = numbers[2];
        List<Integer> list = new ArrayList<>();
        for (int num:
             numbers) {
            list.add(num);
        }
        Set<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        list.remove((Integer) n);
        return list.get(0);
    }

    public static void main(String[] args) {
        System.out.println(stray(new int[]{17, 17, 3, 17, 17, 17, 17}));
    }
}
