package Abstraction_and_interfaces_20_02_24;

public abstract class WheeledTransport implements Transport {
    private int wheelCount;
    private double maxSpeed;

    public WheeledTransport() {
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

    @Override
    public void service() {
        System.out.println("Обслужено колёс - " + wheelCount);
    }
}
