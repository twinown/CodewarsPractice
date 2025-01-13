public class CodeWars_236 {
    public static int mxdiflg(String[] a1, String[] a2) {
        int max = 0;
        for (String s : a1) {
            for (String string : a2) {
                if (Math.abs(s.length() - string.length()) > max) {
                    max = Math.abs(s.length() - string.length());
                }
            }
        }
        return a1.length == 0 || a2.length == 0?-1:max;
    }

    public static void main(String[] args) {
        System.out.println(mxdiflg(new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"},
                new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"}));
    }
}
