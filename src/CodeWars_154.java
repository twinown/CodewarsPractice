public class CodeWars_154 {
    public static int enough(int cap, int on, int wait){
        return cap>on+wait?0:on+wait-cap;
    }
}
