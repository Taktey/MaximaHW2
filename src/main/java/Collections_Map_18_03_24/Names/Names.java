package Collections_Map_18_03_24.Names;

import java.util.HashSet;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        HashSet<String> namesInLowerCase = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите имя: ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("stop")) {
                break;
            } else if (!namesInLowerCase.contains(name.toLowerCase())) {
                names.add(name);
                namesInLowerCase.add(name.toLowerCase());
            }
        }
        System.out.println(names);
    }
}
