
//можно было через массив
public class CodeWars_130_using_switch_lambda {
    public static String switchItUp(int number) {
        return switch (number) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
           default -> "";
       };
    }
}

