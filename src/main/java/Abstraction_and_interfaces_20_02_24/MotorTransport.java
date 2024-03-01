package Abstraction_and_interfaces_20_02_24;

public abstract class MotorTransport extends WheeledTransport {
    private String engineType;

    public MotorTransport(int wheelCount, double maxSpeed, String engineType) {
        super(wheelCount, maxSpeed);
        this.engineType = engineType;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обслужен двигатель тепа " + engineType);
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }
}
