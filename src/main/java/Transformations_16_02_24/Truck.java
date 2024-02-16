package Transformations_16_02_24;

public final class Truck extends MotorTransport {
    private int cargoLimit;

    @Override
    public void service() {
        super.service();
        System.out.println("Обслужен грузовик, вместимостью " + cargoLimit + " килограмм");
    }

    public Truck(int wheelCount, double maxSpeed, String engineType, int cargoLimit) {
        super(wheelCount, maxSpeed, engineType);
        this.cargoLimit = cargoLimit;
    }
    public void useTruckKlaxon(){
        System.out.println("Choo-Choo");
    }

    public void setCargoLimit(int cargoLimit) {
        this.cargoLimit = cargoLimit;
    }

    public int getCargoLimit() {
        return cargoLimit;
    }
}
