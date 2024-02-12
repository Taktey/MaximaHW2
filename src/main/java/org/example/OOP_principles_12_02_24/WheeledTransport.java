package org.example.OOP_principles_12_02_24;

public class WheeledTransport {
    private int wheelCount;
    private double maxSpeed;

    public WheeledTransport() {
    }

    public void service(){
        System.out.println("Обслужено колёс - " + wheelCount);
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public WheeledTransport(int wheelCount, double maxSpeed) {
        this.wheelCount = wheelCount;
        this.maxSpeed = maxSpeed;
    }
}
