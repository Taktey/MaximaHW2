package Abstraction_and_interfaces_20_02_24;

public final class Car extends MotorTransport {
    private String brand;
    private String model;

    public Car(int wheelCount, double maxSpeed, String engineType, String brand, String model) {
        super(wheelCount, maxSpeed, engineType);
        this.brand = brand;
        this.model = model;
    }

    private void useCarKlaxon() {
        System.out.println("beep-beep");
    }

    private void carService() {
        System.out.println("Обслужен автомобиль, марка: " + brand + " модель: " + model);
    }

    @Override
    public void service() {
        super.service();
        carService();
        useCarKlaxon();
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
