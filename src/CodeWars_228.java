import java.util.Arrays;

public class CodeWars_228 {
    public static int[] upArray(final int[] arr) {
        String arrr = Arrays.toString(arr).replaceAll("[,\\]\\[ ]","");
        int num = Integer.parseInt(Arrays.toString(arr).replaceAll("[,\\]\\[ ]",""))+1;
        String numString = String.valueOf(num);
        int[] newArr = new int[numString.length()];
        for (int i = 0; i < numString.length(); i++) {
            newArr[i] = Character.getNumericValue(numString.charAt(i));
        }
        return newArr ;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(upArray(new int[]{9, 9})));
    }
}
