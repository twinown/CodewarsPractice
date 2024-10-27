import java.util.Arrays;

public class CodeWars_200 {
    public static int maxDiff(int[] lst) {
        for (int i = 0;i < lst.length;i++){
            for (int j = 1;j < lst.length;j++){
                if (lst[j]<lst[j-1]){
                    int temp =lst [j];
                    lst[j] = lst[j-1];
                    lst[j-1] = temp;
                }
            }
        }
        return lst.length==1||lst.length==0?0:lst[lst.length-1]-lst[0];
    }

    public static void main(String[] args) {
        System.out.println(maxDiff(new int[]{4, 2, 9, 7, 6, -5, -8}));
    }
}
