public class CodeWars_153_easy_way_to_count_char_in_string {
    //короче решение
    // return road.chars().filter(ch -> ch =='n').count()>15? "Car Dead" : "Woohoo!";
    public static String bumps(final String road) {
        int count = 0;
        for (int i = 0; i <road.length() ; i++) {
            if (road.charAt(i)=='n'){
                count++;
            }
        }
        return count<=15?"Woohoo!":"Car Dead";
    }
}
