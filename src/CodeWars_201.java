public class CodeWars_201 {
    public static void _if(Boolean bool, Runnable func1, Runnable func2) {
        (bool != null && bool ? func1 : func2).run();
    }
}
