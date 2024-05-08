public class CodeWars_144 {
    public static int Digits(long n) {
        return Long.toString(n).length();
    }

    public static void main(String[] args) {
        System.out.println(Digits(12345L));
    }
}
