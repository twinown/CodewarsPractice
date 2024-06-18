package java_explanations.dip_soliD_di;

public class Main {
    public static void main(String[] args) {
        Light l = new Light();
        Switch s  = new Switch(l);
        s.operate();
    }
}
