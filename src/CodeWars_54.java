public class CodeWars_54 {
    public static boolean getXO (String str) {
        int xs = 0;
        int os = 0;
        for (int i  = 0; i<str.length();i++){
            if(Character.toString(str.charAt(i)).equalsIgnoreCase("x")){
                xs++;
            } else if (Character.toString(str.charAt(i)).equalsIgnoreCase("o")){
                os++;
            }
        }
        return os == xs;
    }
}
