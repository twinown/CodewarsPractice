public class CodeWars_253 {
    public int adjacentElementsProduct(int[] array) {
        int max = array[0]*array[1];
        for(int i = 1;i<array.length-1;i++){
            int local = array[i]*array[i+1];
            if(local>max)max = local;
        }
        return max;
    }
}
