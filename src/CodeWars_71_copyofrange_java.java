import java.util.Arrays;

public class CodeWars_71_copyofrange_java {
    public static int[] take(int[] arr, int n) {

        return Arrays.copyOfRange(arr,0,Math.min(n, arr.length));
    }

    public static void main(String[] args) {
        try {
            System.out.print("1");
            int a = 2 / 0;
            System.out.print("2");
        } catch (IllegalArgumentException e) {
            System.out.print("3");
        } catch (NullPointerException e) {
            System.out.print("4");
        } catch (Exception e) {
            System.out.print("5");
        } finally {
            System.out.print("6");
        }
    }
}
