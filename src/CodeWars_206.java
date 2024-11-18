public class CodeWars_206 {
    public static int[] rowWeights (final int[] weights){
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0;i<weights.length;i++){
            if (i%2==0){
                sumEven+=weights[i];
            }else sumOdd+=weights[i];
        }
        return new int[]{sumEven, sumOdd};
    }
}
