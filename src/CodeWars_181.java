public class CodeWars_181 {
    public static String multiTable(int num) {
        String str = "";
        for (int i = 1;i<11;i++){
            str += i+" * " + num + " = " + i*num;
            if (i!=10){
                str+="\n";
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(multiTable(5));
    }
}
