package Project_patterns_01_03_24;

public final class Truck extends MotorTransport {
    private int cargoLimit;

    @Override
    public void service() {
        super.service();
        cargoTransportService();
        useTruckKlaxon();
    }

    private void cargoTransportService() {
        System.out.println("Обслужен грузовик, вместимостью " + cargoLimit + " килограмм");
    }

    public Truck(int wheelCount, double maxSpeed, String engineType, int cargoLimit) {
        super(wheelCount, maxSpeed, engineType);
        this.cargoLimit = cargoLimit;
    }

    private void useTruckKlaxon() {
        System.out.println("Choo-Choo");
    }

    public void setCargoLimit(int cargoLimit) {
        this.cargoLimit = cargoLimit;
    }

    public int getCargoLimit() {
        return cargoLimit;
    }
}
