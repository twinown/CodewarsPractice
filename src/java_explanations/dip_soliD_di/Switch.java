package java_explanations.dip_soliD_di;

interface Switchable {
    void turnOn();
}

class Light implements Switchable {
    public void turnOn() {
        // Логика включения света
    }
}

class Switch {
    private final Switchable device;

    public Switch(Switchable device) { // Зависимость от абстракции (интерфейса)
        this.device = device;
    }

    public void operate() {
        device.turnOn();
        System.out.println("turned");
    }
}
