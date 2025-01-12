import java.util.Arrays;

public class CodeWars_235_array_to_String_regex {
    public static String sortGiftCode(String code){
            char[] chars = code.toCharArray();
        Arrays.sort(chars);
        //string to array
        //return new String(chars);
        //return String.valueOf(chars);
        return Arrays.toString(chars).replaceAll("[\\]\\[\\, ]","");
    }

    public static void main(String[] args) {
        System.out.println(sortGiftCode("cba"));
    }
}
