public class CodeWars_142 {
    public long numberOfDivisors(int n) {
        int num = 0;
        for(int i=1;i<=n;i++){
            if (n%i==0)num++;
        }
                return num;
    }
}
