import java.util.ArrayList;
import java.util.List;

public class CodeWars_229 {
    public static List<String> friend(List<String> x){
        List<String> list = new ArrayList<>();
        for (String s : x) {
            if (s.length() == 4) {
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(friend(List.of("Ryan", "Kieran", "Jason", "Yous")));
    }
}
