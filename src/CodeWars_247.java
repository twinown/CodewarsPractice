public class CodeWars_247 {
    public static String updateLight(String current) {

        return current.equals("green")?"yellow":current.equals("red")?"green":
                "red";
    }
}
