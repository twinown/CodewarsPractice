public class CodeWars_240_double_okruglenie_chisel_do_dvuh {
    public static String seriesSum(int n) {
        double res = 0.00;
        double denominator = 1.00;
        double numerator = 1.00;
        for(int i = 1;i<=n;i++){
                res+=numerator/denominator;
                denominator+=3;
        }
        return String.format("%.2f", res).replace(",",".");
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(5));
      //  System.out.println((double) 1/7);
    }
}
