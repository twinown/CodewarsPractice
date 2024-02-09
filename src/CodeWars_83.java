public class CodeWars_83 {
    public static String printerError(String s) {
        int all = s.length();
        s = s.replaceAll("[a-m]","");
        int left = s.length();
        return "" + left + "/" + all;
    }
    //можно так
    //НУЖНО
    // return "" + s.replaceAll("[a-m]","").length() + "/" + s.length();

    public static void main(String[] args) {
        System.out.println(printerError("aaaxbbbbyyhwawiwjjjwwm"));
    }
}
