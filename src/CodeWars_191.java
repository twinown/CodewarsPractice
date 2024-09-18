public class CodeWars_191 {
    public static String showSequence(int value){
        int newVal = 0;
        String s = "";
        for(int i = 0;i<=value;i++){
            newVal+=i;
            s += i+"+";
        }
        return value<0?value + "<0":value==0?value + "=0":
                s.substring(0,s.length()-1) + " = " + newVal;
    }

    public static void main(String[] args) {
        System.out.println(showSequence(5));
    }
}
