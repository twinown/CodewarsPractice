public class CodeWars_225 {
    //просто   return Math.max(0, n * (n + 1) * (n + 2) / 6);
    public static int sumTriangularNumbers(int n){
        int sum = 0;
        if (n>0) {
            int[] arr = new int[n];
            arr[0] = 1;
            int addNum = 2;
            for (int i = 1; i < n; i++) {
                arr[i] = arr[i - 1] + addNum;
                addNum++;
            }
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
        }
        return n<0?0:sum;
    }

    public static void main(String[] args) {
        System.out.println(sumTriangularNumbers(-4));
    }
}
