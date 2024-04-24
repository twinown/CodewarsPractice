public class CodeWars_137 {
    public static String remove(String s, int n){
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if (s.charAt(i)=='!'&&count<n){
                s =  s.replaceFirst(String.valueOf(s.charAt(i)),"");
                count++;
                i--;
            }
        }
        return s;
    }
    //идиот, это можно было решить вот так просто
    /* for(int i = 0; i<n;i++)
    s = s.replaceFirst("!","");
    return s;
*/

    public static void main(String[] args) {
        System.out.println(remove("Hi!!!",100));
    }
}
