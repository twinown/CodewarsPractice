import java.awt.*;

public class CodeWars_199 {
    public String getColor(){
        String[] strings = new String[]{"white","yellow","purple","red"};
        return strings[(int)(Math.random() * strings.length)];
    }

    public static void main(String[] args) {
        System.out.println(new CodeWars_199().getColor());
    }
}

