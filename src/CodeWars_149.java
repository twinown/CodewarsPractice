public class CodeWars_149 {
    public static long sumCubes(long n){
        long sum = 0;
        for (long i = 1;i<=Math.abs(n);i++){
            sum+=i*i*i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumCubes(3));
    }
}
