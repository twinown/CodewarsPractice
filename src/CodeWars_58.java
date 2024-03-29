import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeWars_58 {
    public static long nextBiggerNumber(long n){
        long newN = -1L;
        boolean mainFlag = false;
        boolean minusOneFlag = false;
        String str  = Long.toString(n);
        long [] arr = new long[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            arr[i] = Character.getNumericValue(str.charAt(i));
        }
        for (int i = 0; i < str.length()-1; i++) {
            minusOneFlag = arr[i] > arr[i + 1] || arr[i] == arr[i + 1];
        }
        List<String> chars = new ArrayList<>();
        while (!minusOneFlag&&!mainFlag&&str.length()>1){
            for (char ch:str.toCharArray()) {
                chars.add(Character.toString(ch));
            }
            n++;
            String newStr = Long.toString(n);
            for(int i = 0;i<newStr.length();i++){
                chars.remove(Character.toString(newStr.charAt(i)));
            }
            if (chars.size()==0) {
                mainFlag = true;
                newN = Long.parseLong(newStr);
            } else chars.clear();
        }
        return newN;
    }

    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(1234567908));
    }
}
