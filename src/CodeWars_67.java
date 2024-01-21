public class CodeWars_67 {
    public static int findAverage(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum/nums.length;
    }
}
