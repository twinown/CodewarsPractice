public class CodeWars_171 {
     // return Long.valueOf(value.replaceAll("\\D", ""));
    public static long filterString(final String value) {
        String newValue = "";
        for(int i = 0;i<value.length();i++){
            if(Character.isDigit(value.charAt(i))){
                newValue+=value.charAt(i);
            }
        }
        return Long.parseLong(newValue);
    }
}
