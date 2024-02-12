package org.example.OOP_principles_12_02_24;

public class Bicycle extends WheeledTransport {
    private String type;

    public Bicycle(String type) {
        this.type = type;
    }

    public Bicycle(int wheelCount, double maxSpeed, String type) {
        super(wheelCount, maxSpeed);
        this.type = type;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обслужено навесное оборудование велосипеда типа " + type);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
