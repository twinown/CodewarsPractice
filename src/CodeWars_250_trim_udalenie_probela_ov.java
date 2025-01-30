public class CodeWars_250_trim_udalenie_probela_ov {
    public static final String generateShape(int n) {
        String res = "";
        String start = "+".repeat(n);
        for(int i = 1;i<=n;i++){
            if(n!=1&&i!=n){
                res += start+"\n";
            } else res += start;
        }
        return res;
        //simplesol
        //return  ("+".repeat(n) + "\n").repeat(n).trim();
    }

    public static void main(String[] args) {
        System.out.println(generateShape(10));
    }
}
