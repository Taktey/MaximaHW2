package org.example.OOP_principles_12_02_24;

public class Car extends MotorTransport {
    private String brand;
    private String model;

    public Car(int wheelCount, double maxSpeed, String engineType, String brand, String model) {
        super(wheelCount, maxSpeed, engineType);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обслужен автомобиль, марка: " + brand + " модель: " + model);
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
