public class CodeWars_207 {
    public static int findLongest(int[] numbers) {
        int max = Integer.toString(numbers[0]).replace("-","").length();
        boolean flag = false;
        int res = 0;
        for(int i = 1;i<numbers.length;i++){
            if(max<Integer.toString(numbers[i]).replace("-","").length()){
                max = Integer.toString(numbers[i]).replace("-","").length();
                res = numbers[i];
                flag = true;
            }
        }
        return flag?res:numbers[0];
    }

    public static void main(String[] args) {
        System.out.println(findLongest(new int[]{1126731458,10,30,0,-1251494068}));
    }
}
