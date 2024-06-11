
//можно было сделать вот так !!!!!!
/*  return x.replace("a","-").replace("b","a")
               .replace("-","b");*/

public class CodeWars_169_zamena_bukv_v_slove_tri_replace_a {
    public static String switcheroo(String x) {
        String newWord = "";
        for (int i = 0;i<x.length();i++){
            if(x.charAt(i)=='a'){
                newWord += 'b';
            } else if(x.charAt(i)=='b'){
                newWord += 'a';
            } else newWord += x.charAt(i);
        }

        return newWord;
    }
}
