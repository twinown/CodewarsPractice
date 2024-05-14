import java.text.DecimalFormat;

public class CodeWars_116_point_formatting_double {
    public static double squareArea(double A){
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(Math.pow(2*A/Math.PI,2)));
    }


}
