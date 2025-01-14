public class CodeWars_237 {
    public static boolean isCube(int volume, int side) {
        return volume > 0 && side > 0 && Math.pow(side, 3) == volume;
    }
}
