package Transformations_16_02_24;

import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        WheeledTransport transport = null;
        System.out.println("Выберете тип транспорта (1-3):");
        System.out.println("1- Car");
        System.out.println("2- Bicycle");
        System.out.println("3- Track");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                transport = new Car(4, 200, "Petrol", "Volvo", "XC90");
                break;
            case 2:
                transport = new Bicycle(2, 30.0, "Mountain");
                break;
            case 3:
                transport = new Truck(8, 100, "Diesel", 10_000);
        }
        try {
            visitServiceStation(transport);
        } catch (NullPointerException e) {
            System.out.println("Транспорт не выбран, попробуйте еще раз\n" + e);
        }

        if (transport instanceof Bicycle) {
            ((Bicycle) transport).useBikeKlaxon();
        } else if (transport instanceof Car) {
            ((Car) transport).useCarKlaxon();
        } else if (transport instanceof Truck) {
            ((Truck) transport).useTruckKlaxon();
        }
    }

    public static void visitServiceStation(WheeledTransport transport) {
        transport.service();
    }
}
