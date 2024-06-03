import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//чутка попроще
/*public static Object[] removeEveryOther(Object[] arr) {
        List<Object> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
        if(i%2==0){
        list.add(arr[i]);
        }
        }
        return list.toArray();
        }*/

public class CodeWars_163_list_to_Array {
    public static Object[] removeEveryOther(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i%2!=0){
                arr[i] = null;
            }
        }
        //короче, таким образом создание только для чтения!!!
       // List<Object> list = Arrays.asList(arr);
        //тут можно изменять твой лист
        List<Object> list = new ArrayList<>(Arrays.asList(arr));
        list.removeAll(Collections.singleton(null));
        return list.toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
    }
}
