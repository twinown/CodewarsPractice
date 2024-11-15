public class CodeWars_204 {
    public static int cubeOdd(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                sum += j * j * j;
            }
        }
        return sum;
    }
}
