import java.text.DecimalFormat;

public class CodeWars_136_okruglenie_znakov_posle_zapyatoi {
    public static double TwoDecimalPlaces(double number) {
        String formattedDouble = new DecimalFormat("#0.00").format(number).replace(',', '.');
        return Double.parseDouble(formattedDouble);
    }
    //или так
    //return Double.parseDouble(String.format("%.2f", number));


    public static void main(String[] args) {
        System.out.println(TwoDecimalPlaces(5.5589));
    }
}
