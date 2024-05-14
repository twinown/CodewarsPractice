import java.util.ArrayList;
import java.util.List;

public class CodeWars_62 {
    public static char getGrade(int s1, int s2, int s3) {
        int av = (s1+s2+s3)/3;
        return av>=90&&av<=100?'A':
                av>=80&&av<90?'B':
                        av>=70&&av<80?'C':
                                av>=60&&av<70?'D':'F';

    }

    public static void main(String[] args) {

      /*  List<? extends  Number> numbers1 = new ArrayList<Object>();
        List<? extends  Number> numbers2 = new ArrayList<Number>();
        List<? extends  Number> numbers3 = new ArrayList<Double>();

        List<? super  Number> numbers4 = new ArrayList<Number>();
        List<? super  Number> numbers5 = new ArrayList<Object>();
        List<? super  Number> numbers6 = new ArrayList<Double>();
*/

    }
}
