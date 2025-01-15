public class CodeWars_238 {
    static Integer find(final int[] array) {
        Integer res = null;
        for(int i = 0;i<array.length-1;i++){
            if(array[i+1]-array[i]!=1){
                res = array[i+1];
                break;
            }
        }
        return res;
    }
}
