package java_explanations.dip_soliD_di;

public class Main {
    public static void main(String[] args) {
        Light l = new Light();
        //ты здесь передаёшь в конструктор объект лайт, который имплементируют функциональный интерфейс
        //метод operate() вызывает метод turnOn() который как раз переопределён в классе Light
        //здесь в свитч у тебя приходит лайт, но в конструкторе приходит ИНТЕРФЕЙС свитчабл,
        // который имплементируют лайтом
        Switch s  = new Switch(l);
        s.operate();
    }
}
