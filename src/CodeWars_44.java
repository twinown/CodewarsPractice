public class CodeWars_44 {
    public static String toAlternativeString(String string) {
        String s = "";
        for (int i = 0;i<string.length();i++){
            if(Character.isLowerCase(string.charAt(i))){
            s += Character.toUpperCase(string.charAt(i));
            } else s +=  Character.toLowerCase(string.charAt(i));
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(toAlternativeString("abc"));
    }
}
