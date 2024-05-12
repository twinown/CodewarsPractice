public class CodeWars_146 {
    //можно так
   //  return stream(array).average().getAsDouble();
    public static double find_average(int[] array){
        double sum = 0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum/array.length;
    }
}
