public class CodeWars_213_kakoho_kvartala_mesyaz {
    //  return (month+2)/3;
    public static int quarterOf(int month) {
        return month>=1&&month<=3?1:
                month>=4&&month<=6?2:
                        month>=7&&month<=9?3:4;
    }
}
