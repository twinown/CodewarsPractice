import java.util.UUID;

public class CodeWars_59 {
    public static String bmi(double weight, double height) {
        double tot =  weight / (height*height);
        return tot<=18.5?"Underweight":tot <= 25.0?"Normal":tot <= 30.0?"Overweight":"Obese";
    }

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
    }
}
