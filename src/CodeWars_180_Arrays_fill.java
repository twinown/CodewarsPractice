public class CodeWars_180_Arrays_fill {
    public static String[] kataExampleTwist(){
        String[] websites = new String[1000];
        //можно просто так
        //Arrays.fill(websites,"websites");
        for(int i = 0;i<websites.length;i++){
            websites[i] = "codewars";
        }
        return websites;
    }
}
