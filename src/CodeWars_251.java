import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CodeWars_251 {
    public static int longestPalindrome(final String s) {
        List<Integer> list = new ArrayList<>();
        int res;
        for (int i = 1;i<=s.length();i++){
            for (int j = i; j <=s.length(); j++) {
                String polStr =s.substring(i-1,j);
                if(polStr.contentEquals(new StringBuilder(polStr).reverse())){
                    res = polStr.length();
                    list.add(res);
            }
            }
        }
        return s.isEmpty()?0:Collections.max(list);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome(""));
    }
}
