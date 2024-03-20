public class CodeWars_103_factorial_recursion {
        public static long factorial(int n) {
            return n==0||n==1?1:factorial(n-1)*n;
        }
}
