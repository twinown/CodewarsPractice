public class CodeWars_219_arrays_to_String_zamena_odinakovih_bukv_v_slove {

    static String encode(String word){
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            result +=  word.indexOf(c)== word.lastIndexOf(c) ? "(" : ")";

        }
        return result;
    }


   /* static String encode(String word){
        word = word.toLowerCase();
        String newWord;
        List<Integer> list = new ArrayList<>();
        char[] mass = new char[word.length()];
        for (int i = 0; i < word.length()+1; i++) {
            if (list.size()>=2){
                mass[list.get(0)] = ')';
                mass[list.get(1)] = ')';
            }
            list.clear();
            if (i!=word.length()) {
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j) && i != j) {
                        list.add(i);
                        list.add(j);
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]!=')'){
                mass[i]= '(';
            }
        }
        newWord = Arrays.toString(mass);
        return newWord.replaceAll("[,\\]\\[ ]","");
    }*/

    public static void main(String[] args) {
       // System.out.println(encode("12341"));
        //System.out.println(encode("Prespecialized"));
        //System.out.println(encode("recede"));
        System.out.println(encode("Success")); //-> ))))())))
      //  System.out.println(encode("(( @"));
    }
}
