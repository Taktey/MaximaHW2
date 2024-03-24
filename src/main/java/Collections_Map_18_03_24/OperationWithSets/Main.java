package Collections_Map_18_03_24.OperationWithSets;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> oneToTen = new HashSet<>();
        HashSet<Integer> fiveToFifteen = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            oneToTen.add(i);
        }
        for (int i = 5; i <= 15; i++) {
            fiveToFifteen.add(i);
        }
        System.out.println("oneToTen: " + oneToTen);
        System.out.println("fiveToFifteen: " + fiveToFifteen);
        System.out.println("\nretainAll(), пересечение множеств");
        HashSet<Integer> oneToTenCopy = new HashSet<>(oneToTen);
        HashSet<Integer> fiveToFifteenCopy = new HashSet<>(fiveToFifteen);
        System.out.println(oneToTenCopy.retainAll(fiveToFifteen));//Удаляет из коллекции элементы, не содержащиеся в целевой коллекции
        System.out.println(fiveToFifteenCopy.retainAll(oneToTen));
        System.out.println("Пересечение " + oneToTenCopy);
        System.out.println("Пересечение " + fiveToFifteenCopy);
        System.out.println("oneToTen: " + oneToTen);
        System.out.println("fiveToFifteen: " + fiveToFifteen);

        System.out.println("\naddAll(), объединение множеств");
        oneToTenCopy = new HashSet<>(oneToTen);
        fiveToFifteenCopy = new HashSet<>(fiveToFifteen);
        oneToTenCopy.addAll(fiveToFifteen); // Добавляет элементы целевого множества в то, для которого был вызван метод
        fiveToFifteenCopy.addAll(oneToTen);
        oneToTenCopy.addAll(fiveToFifteen);
        System.out.println(fiveToFifteenCopy);
        System.out.println(oneToTenCopy);

        System.out.println("\nremoveAll(), разность множеств");
        oneToTenCopy = oneToTen;
        oneToTenCopy = new HashSet<>(oneToTen);
        fiveToFifteenCopy = new HashSet<>(fiveToFifteen);
        fiveToFifteenCopy.removeAll(oneToTenCopy);
        oneToTenCopy.removeAll(fiveToFifteen);
        System.out.println(oneToTenCopy);
        System.out.println(fiveToFifteenCopy);
    }
}
