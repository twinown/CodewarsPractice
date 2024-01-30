import java.util.Arrays;

public class CodeWars_72_StringTOArray_metod_split {
    public static int findShort(String s) {
        String[] arr = s.split(" ");
        int min = arr[0].length();
        for(int i=1;i<arr.length;i++){
            if(arr[i].length()<min){
                min = arr[i].length();
            }
        }
        return min;
    }

    public static void main(String[] args) {
        findShort("want go");
    }
}
