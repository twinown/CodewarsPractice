public class CodeWars_261 {
    public static String datingRange(int age) {
        return age<=14?(int)(age - 0.10 * age)+"-"+(int)(age + 0.10 * age) :  age/2+7+"-"+(age-7)*2;
    }

    public static void main(String[] args) {
        System.out.println(datingRange(10));
    }
}
