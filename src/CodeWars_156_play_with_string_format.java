public class CodeWars_156_play_with_string_format {
    public static String CalculateAge(int birth, int yearTo) {
        //крутое решение
     /*   final int age = year - birth;
        return age == 0 ? "You were born this very year!" :
                age > 0 ? String.format("You are %d year%s old.", age, age == 1 ? "" : "s") :
                 String.format("You will be born in %d year%s.", -age, -age == 1 ? "" : "s");*/
        return yearTo>birth&&yearTo-birth!=1?
                "You are "+ (yearTo-birth + "") + " years old." :
                yearTo>birth&&yearTo-birth==1?
                        "You are "+ (yearTo-birth + "")+ " year old." :
                        yearTo<birth&&birth-yearTo!=1?
                                "You will be born in" +  (birth-yearTo + "") + " years." :
                                yearTo<birth&&birth-yearTo==1?
                                        "You will be born in" +  (birth-yearTo + "") + " year.":
                                        "You were born this very year!";
    }

    public static void main(String[] args) {
        System.out.println(CalculateAge(2012,2016));
    }
}
