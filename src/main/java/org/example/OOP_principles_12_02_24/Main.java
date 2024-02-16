package org.example.OOP_principles_12_02_24;

public class Main {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle(2, 30.0, "Mountain");
        Car car = new Car(4, 200, "Petrol", "Volvo", "XC90");
        Truck truck = new Truck(8, 100, "Diesel", 10_000);
        visitServiceStation(bike);
        System.out.println();
        visitServiceStation(car);
        System.out.println();
        visitServiceStation(truck);
    }

    public static void visitServiceStation(WheeledTransport transport) {
        transport.service();
    }
}
