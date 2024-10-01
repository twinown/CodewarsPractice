import java.util.*;

public class CodeWars_195_bubble_sort_for_concrete_numbers {
    public static int[] sortArray(int[] array) {
        for(int i=0 ; i<array.length-1 ; i++){
            for(int j=i+1; j<array.length ; j++){
                if(array[i]>array[j] && array[i]%2 == 1 && array[j]%2 == 1){
                    int aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
        }
        return array;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{2, 4, 7, 8, 3, 1})));
    }
    }




