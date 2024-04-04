public class CodeWars_125 {
    public static int sumOfDifferences(int[] arr) {
        int sum = 0;
        int local;
        for(int i = 0;i<arr.length;i++){
            for (int j = 1;j<arr.length;j++){
                 local = arr[j-1];
                if(arr[j-1]<arr[j]){
                    arr[j-1] = arr[j];
                    arr[j] = local;
                }
            }
        }
        for(int i = 0;i<arr.length-1;i++){
            sum+=arr[i] - arr[i+1];
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(sumOfDifferences(new int[]{1, 2, 10}));
    }
}
