public class CodeWars_232 {
    public static int findSmallest(int[] numbers, String mode) {
        int min  = numbers[0];
        int index = 0;
        for (int i = 1;i<numbers.length;i++){
            if(numbers[i]<min){
                min = numbers[i];
                index  = i;
            }
        }
        return mode.equals("value")?min:index;
    }
}
