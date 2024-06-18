package java_explanations.dip_soliD_servicelocator;

import java.util.HashMap;
import java.util.Map;

class Engine {
    void startEngine(){
        System.out.println("Engine started");
    }
}

class ServiceLocator {
    private final static Map<Class<?>, Object> services = new HashMap<>();

    // Регистрация сервиса
    public static void registerService(Class<?> serviceClass, Object serviceInstance) {
        services.put(serviceClass, serviceInstance);
    }

    // Получение сервиса
    public static <T> T getService(Class<T> serviceClass) {
        return serviceClass.cast(services.get(serviceClass));
    }
}

class Car {
    private final Engine engine;

    // Получение зависимости через Service Locator
    public Car() {
        engine = ServiceLocator.getService(Engine.class);
    }

    void startEngine(){
        engine.startEngine();
    }
}


