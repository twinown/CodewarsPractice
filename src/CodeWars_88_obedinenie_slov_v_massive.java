import java.util.Arrays;

public class CodeWars_88_obedinenie_slov_v_massive {
    public static String smash(String... words) {
        return Arrays.toString(words).replaceAll("[\\[\\],]","");
        //можно и так
       // return String.join(" ", words);
    }

    public static void main(String[] args) {
        System.out.println(smash("dog", "cat"));
    }
}
