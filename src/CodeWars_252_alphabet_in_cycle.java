public class CodeWars_252_alphabet_in_cycle {
    public static boolean check(String sentence){
        sentence = sentence.toLowerCase();
        int alph = 0;
        for (int i = 0; i < sentence.length(); i++) {
            for(int j = 97;j<=122;j++){
                if((int)sentence.charAt(i)==j){
                    sentence = sentence.replace(Character.toString(sentence.charAt(i))," ");
                    alph++;
                    break;
                }
            }
        }
        return alph==26;
        //крутое решение  for (char c = 'a'; c<='z'; c++)
        //            if (!sentence.toLowerCase().contains("" + c))
        //                return false;
        //        return true;
    }

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
    }
}
