public class CodeWars_155 {
    public static int multiply(int number) {
   //     return  number * (int)Math.pow(5, (Math.abs(number) + "").length());
        return (int)(number*Math.pow(5,Integer.valueOf(Math.abs(number))
                .toString().length()));
    }
}
