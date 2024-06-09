public class CodeWars_167 {
    public static int GetSum(int a, int b){
        int sum = 0;
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        for(int i = min;i<=max;i++){
            sum+= i;
        }
        return a==b?a:sum;
    }

    public static void main(String[] args) {
        System.out.println(GetSum(-12,-5));
    }
}
