public class CodeWars_84 {

    public static double sum(double[] numbers) {
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        return numbers.length==0?0.0:sum;
    }
}

