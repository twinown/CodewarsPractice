//Returns the smallest (closest to negative infinity) double value that is greater
// than or equal to the argument and is equal to a mathematical integer. Special cases:
public class CodeWars_196_double_to_int_to_Integer_Math_ceil {
    public static Integer calculateTip(double amount, String rating) {
        return switch (rating.toLowerCase()) {
            case "terrible" -> 0;
            case "poor" -> (int) Math.ceil(amount * 0.05);
            case "good" -> (int) Math.ceil(amount * 0.1);
            case "great" -> (int) Math.ceil(amount * 0.15);
            case "excellent" -> (int) Math.ceil(amount * 0.2);
            default -> null;
        };
    }
        public static void main(String[] args) {
            System.out.println(calculateTip(20d, "Excellent"));
        }
    }


