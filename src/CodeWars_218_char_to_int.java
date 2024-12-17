import java.util.Arrays;

public class CodeWars_218_char_to_int {
    //или
    /*for (int i = 0; i < numbers.length; i++) {
        numbers[i] = (numbers[i] + i + 1) % 10;
    }*/
    public static int[] incrementer(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] + i + 1 >= 10) {
                numbers[i] = Character.getNumericValue(Integer.toString(numbers[i] + i + 1).charAt(1));
            } else numbers[i] = numbers[i] + i + 1;
        }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(incrementer(new int[]{1, 20, 3})));
        System.out.println(1%10);
    }
}
