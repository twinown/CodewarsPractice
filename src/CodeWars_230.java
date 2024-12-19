public class CodeWars_230 {
    public static String grader(double score){
        return score > 1.0 || score < 0.6 ? "F" :
                score >= 0.9 ? "A" :
                        score >= 0.8 ? "B" :
                                score >= 0.7 ? "C" :"D";
    }

    public static void main(String[] args) {
        System.out.println(grader(0.85));
    }
}
