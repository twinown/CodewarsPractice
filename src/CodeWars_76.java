public class CodeWars_76 {
    public static boolean hero(int bullets, int dragons) {
        return (long)dragons*2<=(long) bullets;
    }

    public static void main(String[] args) {
        System.out.println(hero(1906796147,1777220158));
    }
}
