package java_explanations.dip_soliD_di;

// само действие включения через устройство
interface Switchable {
    void turnOn();
}

//сам свет
class Light implements Switchable {
    public void turnOn() {
        System.out.println("turned");
    }
}

//сам включатель
class Switch {
    private final Switchable device;

    public Switch(Switchable device) { // Зависимость от абстракции (интерфейса)
        //агрегация
        //в класс приходит интрефейс !!!
        this.device = device;
    }

    public void operate() {
        //видишь,как тут вызывается у интерфейса метод
        device.turnOn();

    }
}
