public class CodeWars_49 {
    public static boolean validatePin(String pin) {
        //можно решить в одну строчку вот так
        //ТОП
      //  return pin.matches("\\d{4}|\\d{6}");

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
