public class CodeWars_172 {
    public static boolean isLockNessMonster(String s){
    return s.contains("3.50")||s.contains("three fifty")||s.contains("tree fiddy");
    }

    public static void main(String[] args) {
        System.out.println(isLockNessMonster("gdaedgaega tree fiddy"));
    }
}
