package java_explanations.dip_soliD_servicelocator;

public class Main  {
    public static void main(String[] args) {
        // Регистрация зависимости
        //видишь, та же агрегации, но через сервис локатор
        //новый класс создаётся снаружи, вызвав метод регистрлокатор у сервис локатора
        //объект не нужен,тк метод статический
        ServiceLocator.registerService(Engine.class, new Engine());
        Car car = new Car();
        car.startEngine(); // ----> ("Engine started")
    }
}
