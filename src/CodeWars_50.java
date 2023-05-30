public class CodeWars_50 {
    public static String rps(String p1, String p2) {
        String str = "";
        if(p1.equals(p2)){
            str = "Draw!";
        } else if(p1.equals("scissors")&&p2.equals("paper")||
                p1.equals("rock")&&p2.equals("scissors")||
                p1.equals("paper")&&p2.equals("rock"))
        {
            str = "Player 1 won!";
        } else str = "Player 2 won!";
        return str;
    }
}
