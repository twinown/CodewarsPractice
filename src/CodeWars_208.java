public class CodeWars_208 {
    public static double guessBlue(int blueStart, int redStart,
                                   int bluePulled, int redPulled) {
        return (double)(blueStart-bluePulled)/(blueStart+redStart-bluePulled-redPulled);
    }
}
