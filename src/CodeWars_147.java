public class CodeWars_147 {
    //simple solution
      // return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    public static String findNeedle(Object[] haystack) {
        int pos = 0;
        for(int i = 0;i<haystack.length;i++){
            if(haystack[i]!=null&&haystack[i].equals("needle")){
                pos = i;
            }
        }
        return "found the needle at position " + pos;
    }
}
