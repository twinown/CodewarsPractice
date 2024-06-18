package java_explanations.dip_soliD_servicelocator;

public class Main {
    public static void main(String[] args) {
        // Регистрация зависимости
        ServiceLocator.registerService(Engine.class, new Engine());
        Car car = new Car();
        car.startEngine(); // ----> ("Engine started")
    }
}
