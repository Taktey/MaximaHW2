package Project_patterns_01_03_24;

import java.util.List;

public final class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .maxSpeed(100)
                .wheelCount(4)
                .engineType("Diesel")
                .brand("Audi")
                .model("a4")
                .build();
        Bicycle bicycle = new Bicycle(2, 30.0, "Mountain");
        Truck truck = new Truck(8, 100, "Diesel", 10_000);
        List<Transport> list = List.of(car, bicycle, truck);
        ServiceStation station = new ServiceStation();
        for (Transport transport : list) {
            station.visitServiceStation(transport);
        }
    }

    public static void visitServiceStation(WheeledTransport transport) {
        transport.service();
    }
}
