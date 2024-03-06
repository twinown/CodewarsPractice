public class CodeWars_97   {
    public  int j = 0;
  
    public static long sumMul(int n, int m) {
        if (n <=0 || m<= 0) throw new IllegalStateException();
        int total = 0;
        for (int i = n;i<=m-1;i+=n){
            total+=i;
        }


        return   total;
    }

    public void doSmth(){
        System.out.println(sumMul(4,5));
        System.out.println();
    }
}
