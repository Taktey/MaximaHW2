package org.example.OOP_principles_12_02_24;

public class MotorTransport extends WheeledTransport{
    private String engineType;

    public MotorTransport(int wheelCount, double maxSpeed, String engineType) {
        super(wheelCount, maxSpeed);
        this.engineType = engineType;
    }

    @Override
    public void service(){
        super.service();
        System.out.println("Обслужен двигатель тепа "+engineType);
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }
}
