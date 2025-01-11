import java.util.Arrays;

public class CodeWars_234 {
    public static int[] minMax(int[] arr) {
        int min = arr[0];
        int max= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min  = arr[i];
            } else if (arr[i]>max){
                max  = arr[i];
            }
        }
        //easier
      /*  Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};*/
        return new int[]{min,max};
    }
}
