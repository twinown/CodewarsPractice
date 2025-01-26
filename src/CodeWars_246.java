public class CodeWars_246 {
    public static int findDifference(final int[] firstCuboid,
                                     final int[] secondCuboid) {

        return Math.abs(firstCuboid[0]*firstCuboid[1]*firstCuboid[2]-
                secondCuboid[0]*secondCuboid[1]*secondCuboid[2]);
    }
}
