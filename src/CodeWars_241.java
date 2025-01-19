import java.util.Arrays;

public class CodeWars_241 {
    public static long sumTwoSmallestNumbers(long[] numbers) {
        Arrays.sort(numbers);
        return numbers[0]+numbers[1];
    }
}
