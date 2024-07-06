public class CodeWars_185_String_to_int {
    public static int squareDigits(int n) {
        String str = "";
        String nStr = Integer.valueOf(n).toString();
        for(int i = 0;i<nStr.length();i++){
            str += (int)Math.pow(Character.getNumericValue(nStr.charAt(i)),2);
        }
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }
}
