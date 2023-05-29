import java.util.HashMap;
import java.util.Objects;

public class CodeWars_48_summa_ot_1_do_n {
    private final String age;

    public CodeWars_48_summa_ot_1_do_n(String age) {
        this.age = age;
    }

    public static int summation(int n) {
        return  n*(n+1)/2;
    }

    public static void main(String[] args) {
        HashMap<CodeWars_48_summa_ot_1_do_n,Integer> map = new HashMap<>();

        CodeWars_48_summa_ot_1_do_n first  = new CodeWars_48_summa_ot_1_do_n("0");
      //  System.out.println(first.hashCode());
        map.put(first,1);

        CodeWars_48_summa_ot_1_do_n second  = new CodeWars_48_summa_ot_1_do_n("1");
     //   System.out.println(second.hashCode());
        map.put(second,2);

       // System.out.println(first.equals(second));
        System.out.println(map.get(new CodeWars_48_summa_ot_1_do_n("0")));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CodeWars_48_summa_ot_1_do_n that = (CodeWars_48_summa_ot_1_do_n) o;

        return Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return age != null ? age.hashCode() : 0;
    }
}
