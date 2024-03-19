public class CodeWars_99 {
    public static String solution(String str) {
        String st = "";
        for (int i =str.length()-1;i>=0;i--){
            st  += str.charAt(i);
        }
        return st;
    }

    public static void main(String[] args) {
        System.out.println(solution("cat"));
    }
}
