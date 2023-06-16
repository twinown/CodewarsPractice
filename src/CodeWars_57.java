import java.util.ArrayList;
import java.util.List;

public class CodeWars_57 {
    public static int countSmileys(List<String> arr) {
        int count = 0;
        for(String str:arr){
                boolean b = str.charAt(0) == ':' || str.charAt(0) == ';';
                if(str.length()==2){
                    if(b && (str.charAt(1)==')'||str.charAt(1)=='D')){
                        count++;
                    }
                } else if(str.length()==3){
                    if(b && (str.charAt(1)=='-'||str.charAt(1)=='~')&&
                            (str.charAt(2)==')'||str.charAt(2)=='D')
                          ){
                        count++;
                    }
                }
        }
        return count;
    }





    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        System.out.println(countSmileys(a));
    }
}
