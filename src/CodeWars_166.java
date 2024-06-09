public class CodeWars_166 {
    public static String shortenToDate(String longDate) {
        return longDate.substring(0,longDate.indexOf(","));
    }

    public static void main(String[] args) {
        System.out.println(shortenToDate("efjiwkodwk,10 pm"));
    }
}
