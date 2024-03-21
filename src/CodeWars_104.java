import java.util.Arrays;

public class CodeWars_104 {
    public static boolean check(Object[] a, Object x) {
        //можно так
       // return Arrays.asList(a).contains(x);
        boolean is = false;
        for(Object m:a){
            if (m.toString().equals(x.toString())){
                is = true;
            }
        }
        return is;
    }
}
