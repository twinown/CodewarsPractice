public class CodeWars_220 {
    //можно и так
 //   return s.toUpperCase().equals(s);
    public static boolean isUpperCase(String s) {
        boolean flag = true;
        for(int i = 0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                flag = false;
            }
        }
        return flag;
    }
}
