public class CodeWars_59 {
    public static String bmi(double weight, double height) {
        double tot =  weight / (height*height);
        return tot<=18.5?"Underweight":tot <= 25.0?"Normal":tot <= 30.0?"Overweight":"Obese";
    }
}
