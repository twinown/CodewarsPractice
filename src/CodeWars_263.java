public class CodeWars_263 {
    public static Object meeting(char[] x) {
        int res = -1;
        for(int i = 0;i<x.length;i++){
            if(x[i]=='O'){
                res = i;
                break;
            }
        }
        return res==-1?"None available!":res;
    }
}
