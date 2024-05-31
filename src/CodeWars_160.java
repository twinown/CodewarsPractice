import java.util.Arrays;

public class CodeWars_160 {
    public static String isSortedAndHow(int[] array) {
        String res = "";
            if( array[0]<array[1]){
                res = "yes, ascending";
            } else res ="yes, descending";
        return (array.length>=3&&res.equals("yes, ascending")&&array[2]<array[1])||
                (array.length>=3&&res.equals("yes, descending")&&array[2]>array[1])?"no": res;
    }

    public static void main(String[] args) {
        System.out.println(isSortedAndHow(new int[]{4,2,30}));
    }
}
