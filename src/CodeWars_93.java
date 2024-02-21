public class CodeWars_93 {
    public static long[] powersOfTwo(int n){
            long[] num = new long[n+1];
            for(int i = 0;i<n+1;i++){
                num[i] = (long) Math.pow(2, i);
            }
            return num;
    }
}
