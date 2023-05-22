public class CodeWars_46 {
    public static String doubleChar(String s){
        String ss ="";
        for (int i = 0;i<s.length();i++){
            ss += s.charAt(i)+""+s.charAt(i);
        }
        return ss;
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("go"));
    }
}



