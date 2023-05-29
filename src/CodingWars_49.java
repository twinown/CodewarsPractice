public class CodingWars_49 {
    public static boolean validatePin(String pin) {
        pin = pin.replaceAll("\\d","`");
        int count = 0;
        for (int i = 0;i<pin.length();i++){
            if (pin.charAt(i)!='`'){
                count = 0;
                break;
            } else count++;
        }
        return count == 4 || count == 6;
    }

    public static void main(String[] args) {
        System.out.println(validatePin("1234x"));
    }
}
