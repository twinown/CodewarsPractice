import java.util.Arrays;

//топ решение
 /*
 java.util.Arrays.sort(s);
 return String.join("***",s[0].split(""));
 */


public class CodeWars_165_String_join_split_berem_slovo_dobavlyaem_simvol_posle_bukvi_kazhdoi {
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        String ns = "";
        for (int i = 0; i < s[0].length(); i++) {
            if (Character.isLetter(s[0].charAt(i)) && i != s[0].length() - 1) {
                ns += s[0].charAt(i) + "***";
            } else ns += s[0].charAt(i);
        }
        return ns;
    }

    public static void main(String[] args) {
        System.out.println(twoSort(new String[]{"turns", "out", "random",
                "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }
}
