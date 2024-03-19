public class CodeWars_100 {
    public static int sequenceSum(int start, int end, int step) {
        int res = 0;
        for (int i = start;i<=end;i+=step){
            res+=i;
        }
        return res;
    }
}
