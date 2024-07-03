public class CodeWars_183 {
    public static String warnTheSheep(String[] array) {
        int count = 0;
        for(int i = array.length-1;i>=0;i--){
            count++;
            if(array[i].equals("wolf")){
                break;
            }
        }
        return array[array.length-1].equals("wolf")?"Pls go away and stop eating my sheep":
                "Oi! Sheep number " +  count + "! "+ "You are about to be eaten by a wolf!"
                ;
    }
}
