public class CodeWars_168_check_string_isDigit {

    //можно было просто так
   /*    try{
        Double.parseDouble(s);
        return true;
    }catch(Exception e){
        return false;
    }*/
    //или так
    // return s.matches("[+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)");


    public static boolean isDigit(String s) {
        boolean digit = false;
        for (int i = 0; i < s.length()-1; i++) {
            if ((Character.isDigit(s.charAt(i))&&
                    s.charAt(i+1)!=' '
                    )||(s.charAt(i)=='-')||s.charAt(i)=='.'){
                    digit = true;
            }
        }
        return s.length()==1?Character.isDigit(s.charAt(0)):
                (s.length() <= 1 || s.charAt(1) != '-') && s.length() != 0
                        && !Character.isLetter(s.charAt(0)) && digit;
    }

    public static void main(String[] args) {
        System.out.println(isDigit("3-4"));
    }
}
