public class CodeWars_262 {
    public int factorial(int n) {
        if (n<0||n>12){
            throw new IllegalArgumentException();
        }
        return n==0||n==1?1:factorial(n-1)*n;
    }
}
