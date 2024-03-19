public class CodeWars_96 {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int res = 0;
        for(int i : classPoints){
            res +=i;
        }
        res = res/classPoints.length;
        return yourPoints>res;
    }

    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[]{3,2,5}, 6));
    }
}
