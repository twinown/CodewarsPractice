public class CodeWars_60 {
    public static int solution(int start, int finish){
        return (finish-start)/3 + (finish-start)%3;
    }

    public static void main(String[] args) {
        System.out.println(solution(604,749));
    }
}
