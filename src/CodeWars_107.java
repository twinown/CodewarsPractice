import java.util.Arrays;

public class CodeWars_107 {
    public static String sayHello(String [] name, String city, String state){
        String str = Arrays.toString(name).replaceAll("[\\[\\],]","");
        return "Hello, " + str + "!" +
                " Welcome to " + city + ", "+  state + "!";
    }

    public static void main(String[] args) {
        System.out.println(sayHello(new String[]{"n","n"}, "Mos","Mos"));
    }
}
