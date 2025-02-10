public class CodeWars_260 {
    public static String jumpingNumber(int number){
        String numberS = Integer.toString(number);
        boolean res = true;
        if(numberS.length()>1){
            for(int i = 0;i<numberS.length()-1;i++){
                if(Math.abs(numberS.charAt(i)-numberS.charAt(i+1))!=1){
                    res = false;
                    break;
                }
            }
        }
        return res?"Jumping!!":"Not!!";
    }
}
