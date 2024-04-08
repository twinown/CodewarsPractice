public class CodeWars_126_binary_to_int {
    public static int binToDecimal(String inp){
        return Integer.parseInt(inp,2);
    }

    public static void main(String[] args) {
        System.out.println(binToDecimal("0010100"));
    }
}
