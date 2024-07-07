//todo РАЗБЕРИСЬ
//return str.length() == str.toLowerCase().chars().distinct().count();
public class CodeWars_186_string_distinct_count {
    public static boolean isIsogram(String str) {
        str = str.toLowerCase();
        boolean result = true;
        for (int i = 0;i<str.length();i++){
            for (int j = 0; j < str.length(); j++) {
                if(i!=j&&str.charAt(i)==str.charAt(j)){
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("isIsogram"));
    }
}
