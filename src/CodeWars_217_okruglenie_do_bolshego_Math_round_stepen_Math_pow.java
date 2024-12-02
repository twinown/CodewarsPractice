public class CodeWars_217_okruglenie_do_bolshego_Math_round_stepen_Math_pow {
    public static int nearestSq(final int n) {
        return (int) Math.pow(Math.round(Math.sqrt(n)), 2);
//или
              /*(int)Double.parseDouble(String.format("%.0f", Math.sqrt(n)))*
                (int)Double.parseDouble(String.format("%.0f", Math.sqrt(n)));*/
    }

    public static void main(String[] args) {
        System.out.println(nearestSq(144));
    }
}
