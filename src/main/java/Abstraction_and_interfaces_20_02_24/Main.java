package Abstraction_and_interfaces_20_02_24;

import javax.sound.midi.Track;
import java.util.List;
import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        Car car = new Car(4, 200, "Petrol", "Volvo", "XC90");
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
