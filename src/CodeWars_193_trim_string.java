public class CodeWars_193_trim_string {

    public static String spacify(String str) {
       /* String nString = "";
        for (int i = 0; i < str.length(); i++) {
            if (i!=str.length()-1) {
                nString += str.charAt(i) + " ";
            } else nString += str.charAt(i) + "";
            }*/
       /* Returns:
        a string whose value is this string, with all leading and trailing
        space removed, or this string if it has no leading or trailing space.*/
        return str.replace("", " ").trim();
   //     return nString;
    }

    public static void main(String[] args) {
        System.out.println(spacify("hello word"));
    }
}
