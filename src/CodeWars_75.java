public class CodeWars_75 {
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[1-4]","0")
                .replaceAll("[5-9]","1");
    }

    public static void main(String[] args) {
        System.out.println(fakeBin("456789"));
        System.out.println('3'<'5');
    }
}
