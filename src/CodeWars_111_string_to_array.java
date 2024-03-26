public class CodeWars_111_string_to_array {


    //топ-решение
/*    public static String accum(String s) {
        String[] subStr = s.split("");
        String result = subStr[0].toUpperCase();
        for(int i =1; i<subStr.length; i++){
        result += "-" + subStr[i].toUpperCase() + subStr[i].toLowerCase().repeat(i);
        }
        return result;
    }*/
    public static String accum(String s) {
        s=s.toLowerCase();
        String ns = "";
        String nns ="";
        for(int i = 1;i<=s.length();i++){
            ns+= Character.toString(s.charAt(i-1)).repeat(i)+"-";
        }
        for(int i = 0;i<ns.length()-1;i++){
            if (ns.charAt(i)=='-'){
                nns += Character.toString(ns.charAt(i+1)).toUpperCase();
                i++;
            } else if (ns.charAt(i+1)!='-') {
                nns += Character.toString(ns.charAt(i));
            } else  nns += ns.charAt(i) + "-";
        }
        nns = nns.substring(0,1).toUpperCase()+nns.substring(1,nns.length()-1);
        return nns;
    }

    public static void main(String[] args) {
        System.out.println(accum("done"));
    }
}
