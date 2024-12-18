public class SsTask {
    public static int bacteries(int start,int end){
        int min = 0;
       while (start<end){
           start*=2;
           min+=2;
       }
       return min;
    }

    public static void main(String[] args) {
        System.out.println(bacteries(1000,500000));
    }
}
